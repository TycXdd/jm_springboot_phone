package com.qfedu.phone.service;

import com.github.pagehelper.PageInfo;
import com.qfedu.phone.dto.PhoneQueryDto;
import com.qfedu.phone.entity.Phone;

import java.util.List;

public interface PhoneService {
    //添加方法
    int insert(Phone phone);
    //查看
    List<Phone> findAll(PhoneQueryDto queryDto);
    //分页查看
    PageInfo<Phone> query(PhoneQueryDto queryDto);
    //修改
    void update(Phone phone);
    //删除
    void del(int id);
}
