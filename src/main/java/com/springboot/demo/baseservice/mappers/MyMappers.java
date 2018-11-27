package com.springboot.demo.baseservice.mappers;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: Mapper接口：基本的增、删、改、查方法
 * MySqlMapper：针对MySQL的额外补充接口，支持批量插入*
 * @Param:
 * @return:
 * @Author: 谢庆香
 * @Date: 2018\11\7 0007
 * @Time: 12:55
 */
public interface MyMappers<T> extends Mapper<T>, MySqlMapper<T> {
}
