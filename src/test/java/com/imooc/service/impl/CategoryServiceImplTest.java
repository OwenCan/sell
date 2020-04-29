package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 类目层
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findById() {
        ProductCategory category = categoryService.findById(1);
        Assert.assertNotEquals(null, category);
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategories = categoryService.findAll();
        Assert.assertEquals(2, productCategories.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> ids = Arrays.asList(2, 3, 4);
        List<ProductCategory> productCategory = categoryService.findByCategoryTypeIn(ids);
        Assert.assertNotEquals(0, productCategory.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("热销榜", 0);
        categoryService.save(productCategory);
        Assert.assertNotEquals(null, productCategory);
    }
}