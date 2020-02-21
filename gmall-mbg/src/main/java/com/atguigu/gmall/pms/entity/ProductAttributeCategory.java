package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 产品属性分类表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("pms_product_attribute_category")
@ApiModel(value="ProductAttributeCategory对象", description="产品属性分类表")
public class ProductAttributeCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "属性数量")
    @TableField("attribute_count")
    private Integer attributeCount;

    @ApiModelProperty(value = "参数数量")
    @TableField("param_count")
    private Integer paramCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }
    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    @Override
    public String toString() {
        return "ProductAttributeCategory{" +
        "id=" + id +
        ", name=" + name +
        ", attributeCount=" + attributeCount +
        ", paramCount=" + paramCount +
        "}";
    }
}
