package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Description
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
public interface ProductInfoService {

    ProductInfo findById(String productInfoId);

    Page<ProductInfo> findAll(Pageable findAll);

    List<ProductInfo> findUpAll();

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
