package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl infoService;

    @Test
    public void findById() {
        ProductInfo productInfo = infoService.findById("1");
        Assert.assertNotEquals(null, productInfo);
    }

    @Test
    public void findAll() {
        Sort sort = Sort.by(Sort.Direction.ASC, "productId");
        Page<ProductInfo> productInfos = infoService.findAll(PageRequest.of(0, 2, sort));
        System.out.println(productInfos.getSize());
        Assert.assertNotEquals(0, productInfos.getSize());
    }

    public void findUpAll() {
        List<ProductInfo> productInfoList = infoService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }


    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("曾国藩大传1");
        productInfo.setProductPrice(new BigDecimal(41.5));
        productInfo.setProductStock(900);
        productInfo.setProductDescription("讲述曾国藩宏图伟志，推荐指数五颗星");
        productInfo.setProductIcon("http://www.zgf.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(0);
        infoService.save(productInfo);
        Assert.assertNotEquals(null, productInfo);
    }
}