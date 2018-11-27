package com.springboot.demo.baseservice.service.impl;

import com.springboot.demo.baseservice.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @program: base-service
 * @description:
 * @author: 谢庆香
 * @create: 2018-11-07 15:18
 **/
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private Mapper<T> mapper;
    private Class<T> clazz;

    public BaseServiceImpl() {
        /*//获取父类的type
        Type type = this.getClass().getGenericSuperclass();
        //强转为ParameterizedType类型，以使用泛型的方法
        ParameterizedType parameterizedType = (ParameterizedType)type ;
        //获取泛型的class
        this.clazz = (Class<T>)parameterizedType.getActualTypeArguments()[0] ;*/
    }

    @Override
    public List<T> queryAll() {
        return this.mapper.selectAll();
    }
}