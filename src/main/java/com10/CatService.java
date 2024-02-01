package com10;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatService {
    private final CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public Cat findAge(int age) {
        Optional<Cat> cat = this.catMapper.findByAge(age);
        return cat.orElseThrow(() -> new CatNotFoundException("age" + age + " not found"));
    }
}