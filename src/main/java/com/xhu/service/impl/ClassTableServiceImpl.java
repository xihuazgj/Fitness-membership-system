package com.xhu.service.impl;

import com.xhu.mapper.ClassTableMapper;
import com.xhu.domain.entity.ClassTable;
import com.xhu.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClassTableServiceImpl implements ClassTableService {

    @Autowired
    private ClassTableMapper classTableMapper;

    @Override
    public List<ClassTable> findAll() {
        return classTableMapper.findAll();
    }

    @Override
    public Boolean deleteClassByClassId(Integer classId) {
        return classTableMapper.deleteClassByClassId(classId);
    }

    @Override
    public Boolean insertClass(ClassTable classTable) {
        return classTableMapper.insertClass(classTable);
    }

    @Override
    public ClassTable selectByClassId(Integer classId) {
        return classTableMapper.selectByClassId(classId);
    }

    @Override
    public Boolean deleteOrderByClassId(Integer classId) {
        return classTableMapper.deleteOrderByClassId(classId);
    }
}
