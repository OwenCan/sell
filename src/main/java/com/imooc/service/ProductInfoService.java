package com.imooc.service;

import com.imooc.dataobject.ProductInfo;

import java.util.List;

/**
 * @Description
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
public interface ProductInfoService {

    ProductInfo findById(String productInfoId);

    List<ProductInfo> findAll();

    List<ProductInfo> findByProductStatus(Integer productStatus);

    ProductInfo save(ProductInfo productInfo);
}
