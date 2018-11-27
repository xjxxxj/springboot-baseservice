package com.springboot.demo.baseservice.mapper;

import com.springboot.demo.baseservice.entity.Department;
import com.springboot.demo.baseservice.mappers.MyMappers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DepartmentMapper extends MyMappers<Department> {
}
