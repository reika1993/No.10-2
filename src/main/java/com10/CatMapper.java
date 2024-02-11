//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com10;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatMapper {
    @Select({"SELECT * FROM cats"})
    List<Cat> findAll();

    @Select({"SELECT * FROM cats WHERE name = #{name}"})
    List<Cat> findByName(String name);

    @Select({"SELECT * FROM cats WHERE age = #{age}"})
    List<Cat> findByAge(int age);


}
