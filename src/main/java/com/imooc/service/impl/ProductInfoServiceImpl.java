package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Description 产品信息
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findById(String productInfoId) {
        Optional<ProductInfo> productInfoOptional = repository.findById(productInfoId);
        return productInfoOptional.orElse(null);
    }

    @Override
    public List<ProductInfo> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        return findByProductStatus(productStatus);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
