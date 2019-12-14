package com.qfedu.phone.dao;

import com.qfedu.phone.dto.PhoneQueryDto;
import com.qfedu.phone.entity.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneMapper {
    //添加方法
    int insert(Phone phone);
    //查看所有
    List<Phone> findAll(PhoneQueryDto queryDto);
    //修改方法
    int update(Phone phone);
    void del(int id);
}
