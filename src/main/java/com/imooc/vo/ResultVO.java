package com.imooc.vo;

import lombok.Data;

/**
 * @Description http请求返回的最外层对象
 * @Author Owen Zhao
 * @Date 2020/5/6
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //错误信息
    private T data;
}
