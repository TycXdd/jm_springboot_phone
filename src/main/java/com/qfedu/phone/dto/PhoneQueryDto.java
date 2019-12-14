package com.qfedu.phone.dto;

import lombok.Data;

@Data
public class PhoneQueryDto {
    private int type;
    private String phonename;
    private int page;
    private int size;
}
