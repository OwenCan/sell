package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Description 商品
 * @Author Owen Zhao
 * @Date 2020/4/29
 */
@Entity
@Data
public class ProductInfo {

    /**
     * 产品Id
     */
    @Id
    private String productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private BigDecimal productPrice;

    /**
     * 产品库存
     */
    private Integer productStock;

    /**
     * 产品描述
     */
    private String productDescription;

    /**
     * 产品图片
     */
    private String productIcon;

    /**
     * 产品状态 0正常 1下架
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;


    public ProductInfo() {
    }

   /* public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer productStatus, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.productStatus = productStatus;
        this.categoryType = categoryType;
    }*/
}
