package com.springboot.demo.baseservice.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: common-mapper
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-07 12:04
 **/
@Table(name = "tb_department")
public class Department {

    @Id
    private Integer deptId;
    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}