package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        Product p = productService.getById(1);
//        System.out.println(p.getName());

        //测试增删改在主库，查询在从库
        Brand brand = new Brand();
        brand.setName("哈哈哈");
        brandService.save(brand);

        System.out.println("保存成功");
    }

}
