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
 * 品牌表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("pms_brand")
@ApiModel(value="Brand对象", description="品牌表")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "首字母")
    @TableField("first_letter")
    private String firstLetter;

    @TableField("sort")
    private Integer sort;

    @ApiModelProperty(value = "是否为品牌制造商：0->不是；1->是")
    @TableField("factory_status")
    private Integer factoryStatus;

    @TableField("show_status")
    private Integer showStatus;

    @ApiModelProperty(value = "产品数量")
    @TableField("product_count")
    private Integer productCount;

    @ApiModelProperty(value = "产品评论数量")
    @TableField("product_comment_count")
    private Integer productCommentCount;

    @ApiModelProperty(value = "品牌logo")
    @TableField("logo")
    private String logo;

    @ApiModelProperty(value = "专区大图")
    @TableField("big_pic")
    private String bigPic;

    @ApiModelProperty(value = "品牌故事")
    @TableField("brand_story")
    private String brandStory;

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
    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }
    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "id=" + id +
        ", name=" + name +
        ", firstLetter=" + firstLetter +
        ", sort=" + sort +
        ", factoryStatus=" + factoryStatus +
        ", showStatus=" + showStatus +
        ", productCount=" + productCount +
        ", productCommentCount=" + productCommentCount +
        ", logo=" + logo +
        ", bigPic=" + bigPic +
        ", brandStory=" + brandStory +
        "}";
    }
}
