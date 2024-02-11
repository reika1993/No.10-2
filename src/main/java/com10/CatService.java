package com10;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final CatMapper catMapper;

    public CatService(CatMapper catMapper) {
        this.catMapper = catMapper;
    }

    public List<Cat> findCats() {
        List<Cat> cats = catMapper.findAll();
        return cats;

    }

    public List<Cat> findCatName(String name) {
        List<Cat> cats = catMapper.findByName(name);
        return cats;
    }

    public List<Cat> findCatAge(int age) {
        List<Cat> cats = catMapper.findByAge(age);
        return cats;
    }


}