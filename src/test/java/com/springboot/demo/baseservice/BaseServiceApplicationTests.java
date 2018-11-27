package com.springboot.demo.baseservice;

import com.springboot.demo.baseservice.entity.Department;
import com.springboot.demo.baseservice.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan(basePackages = "com.springboot.demo.commonmapper.entity")
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseServiceApplicationTests {
    @Autowired
    private DeptService deptService;

    @Test
    public void contextLoads() {
        List<Department> departments = deptService.queryAll();
        System.out.println(departments);
    }

}
