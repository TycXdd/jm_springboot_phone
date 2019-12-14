package com.qfedu.phone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    private Integer id;  //手机Id
    private String phonename; //手机品牌
    private String brand; //手机型号
    private String storage; //手机储存内存
    private String memory; //手机运行内存
    private String colour; //手机颜色
    private String quantity; //手机数量
    private Double price; //手机价格
    private String img;  //手机图片
}
