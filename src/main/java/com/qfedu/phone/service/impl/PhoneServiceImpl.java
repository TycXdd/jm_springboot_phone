package com.qfedu.phone.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.phone.dto.PhoneQueryDto;
import com.qfedu.phone.entity.Phone;
import com.qfedu.phone.dao.PhoneMapper;
import com.qfedu.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public int insert(Phone phone) {
       return phoneMapper.insert(phone);
    }

    @Override
    public List<Phone> findAll(PhoneQueryDto queryDto) {
        List<Phone> all = phoneMapper.findAll(queryDto);
        return all;
    }

    @Override
    public PageInfo<Phone> query(PhoneQueryDto queryDto) {
        if (queryDto.getPhonename() != null) {
            queryDto.setPhonename("%"+queryDto.getPhonename()+"%");
        }
        PageHelper.startPage(queryDto.getPage(),queryDto.getSize());
        List<Phone> list = phoneMapper.findAll(queryDto);
        PageInfo<Phone> page = new PageInfo<>(list);

        return page;
    }

    @Override
    public void update(Phone phone) {
        phoneMapper.update(phone);
    }

    @Override
    public void del(int id) {
        phoneMapper.del(id);
    }
}
