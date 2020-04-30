package com.imooc.enums;

import lombok.Getter;

/**
 * @Description 商品状态
 * @Author Owen Zhao
 * @Date 2020/4/30
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
