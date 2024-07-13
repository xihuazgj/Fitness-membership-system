package com.xhu.mapper;

import com.xhu.domain.entity.ClassTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ClassTableMapper {

    //查询所有课程
    List<ClassTable> findAll();

    //根据 id 删除课程
    Boolean deleteClassByClassId(Integer classId);

    //添加课程
    Boolean insertClass(ClassTable classTable);

    //根据 id 查询课表
    ClassTable selectByClassId(Integer classId);

    //根据 id 删除已预约的课程
    Boolean deleteOrderByClassId(Integer classId);

}
