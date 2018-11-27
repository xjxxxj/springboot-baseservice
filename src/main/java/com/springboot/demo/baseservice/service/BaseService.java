package com.springboot.demo.baseservice.service;

import java.util.List;

/**
 * @Description: 所有service层的父接口
 * @Author: 谢庆香
 * @Date: 2018\11\7 0007
 * @Time: 15:18
 */
public interface BaseService<T> {
    /**
     * @Description: 查询所有数据
     * @Param:
     * @return:
     * @Author: 谢庆香
     * @Date: 2018\11\7 0007
     * @Time: 15:21
     */
    public List<T> queryAll();

}
