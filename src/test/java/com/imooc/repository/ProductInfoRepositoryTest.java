package com.imooc.repository;

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
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("百年孤独");
        productInfo.setProductPrice(new BigDecimal(48.5));
        productInfo.setProductStock(1000);
        productInfo.setProductDescription("非常文艺的一本书，推荐指数五颗星");
        productInfo.setProductIcon("http://www.bngd.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(0);
        repository.save(productInfo);
        Assert.assertNotEquals(null, productInfo);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductInfo> productInfos = repository.findByProductStatus(0);
        Assert.assertEquals(1, productInfos.size());
    }
}