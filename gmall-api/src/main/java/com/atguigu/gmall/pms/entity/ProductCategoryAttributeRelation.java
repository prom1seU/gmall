package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("pms_product_category_attribute_relation")
@ApiModel(value="ProductCategoryAttributeRelation对象", description="产品的分类和属性的关系表，用于设置分类筛选条件")
public class ProductCategoryAttributeRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_category_id")
    private Long productCategoryId;

    @TableField("product_attribute_id")
    private Long productAttributeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    @Override
    public String toString() {
        return "ProductCategoryAttributeRelation{" +
        "id=" + id +
        ", productCategoryId=" + productCategoryId +
        ", productAttributeId=" + productAttributeId +
        "}";
    }
}
