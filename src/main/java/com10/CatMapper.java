package com10;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.Optional;

@Mapper
public interface CatMapper {
        @Select("SELECT * FROM cats WHERE age = #{age}")
        Optional<Cat> findByAge(int age);

    }

