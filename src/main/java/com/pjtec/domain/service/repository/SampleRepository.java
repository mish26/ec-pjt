package com.pjtec.domain.service.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {

    @Select("SELECT 2")
    int select();

}
