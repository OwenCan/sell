package com.imooc.controller;

import com.imooc.dataobject.ProductInfo;
import com.imooc.vo.ProductInfoVO;
import com.imooc.vo.ProductVO;
import com.imooc.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Description 买家controller
 * @Author Owen Zhao
 * @Date 2020/4/30
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO getList() {
        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(Arrays.asList(productVO));
//        productVO.setCategoryName("Nike");
//        productVO.setCategoryType(1);
//        productInfoVO.setProductId("001");
//        productInfoVO.setProductName("衣物");
//        productInfoVO.setProductPrice();
        return resultVO;
    }

}
