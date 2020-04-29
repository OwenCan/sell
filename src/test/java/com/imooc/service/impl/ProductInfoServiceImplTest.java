package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
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
        List<ProductInfo> productInfos = infoService.findAll();
        Assert.assertNotEquals(0, productInfos.size());
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfos = infoService.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfos.size());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("曾国藩大传");
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