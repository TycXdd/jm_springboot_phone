package com.qfedu.phone.controller;

import com.qfedu.phone.dto.PhoneQueryDto;
import com.qfedu.phone.entity.Phone;
import com.qfedu.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @RequestMapping("/insert")
    public int insert(Phone phone) {
        return phoneService.insert(phone);
    }

    @RequestMapping("/findAll")
    public List<Phone> findAll(PhoneQueryDto phoneQueryDto) {
        List<Phone> phones = phoneService.findAll(phoneQueryDto);
        return phones;
    }

    @RequestMapping("/update")
    public String update(Phone phone) {
       phoneService.update(phone);
       return "list";
    }

    @RequestMapping("/del")
    public String del(int id) {
        phoneService.del(id);
        return "list";
    }
}
