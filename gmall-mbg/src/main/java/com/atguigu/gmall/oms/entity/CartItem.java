package com.atguigu.gmall.oms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("oms_cart_item")
@ApiModel(value="CartItem对象", description="购物车表")
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("product_sku_id")
    private Long productSkuId;

    @TableField("member_id")
    private Long memberId;

    @ApiModelProperty(value = "购买数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty(value = "添加到购物车的价格")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty(value = "销售属性1")
    @TableField("sp1")
    private String sp1;

    @ApiModelProperty(value = "销售属性2")
    @TableField("sp2")
    private String sp2;

    @ApiModelProperty(value = "销售属性3")
    @TableField("sp3")
    private String sp3;

    @ApiModelProperty(value = "商品主图")
    @TableField("product_pic")
    private String productPic;

    @ApiModelProperty(value = "商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty(value = "商品副标题（卖点）")
    @TableField("product_sub_title")
    private String productSubTitle;

    @ApiModelProperty(value = "商品sku条码")
    @TableField("product_sku_code")
    private String productSkuCode;

    @ApiModelProperty(value = "会员昵称")
    @TableField("member_nickname")
    private String memberNickname;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_date")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    @TableField("modify_date")
    private Date modifyDate;

    @ApiModelProperty(value = "是否删除")
    @TableField("delete_status")
    private Integer deleteStatus;

    @ApiModelProperty(value = "商品分类")
    @TableField("product_category_id")
    private Long productCategoryId;

    @TableField("product_brand")
    private String productBrand;

    @TableField("product_sn")
    private String productSn;

    //@ApiModelProperty(value = "商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]")
    @TableField("product_attr")
    private String productAttr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }
    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }
    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public String toString() {
        return "CartItem{" +
        "id=" + id +
        ", productId=" + productId +
        ", productSkuId=" + productSkuId +
        ", memberId=" + memberId +
        ", quantity=" + quantity +
        ", price=" + price +
        ", sp1=" + sp1 +
        ", sp2=" + sp2 +
        ", sp3=" + sp3 +
        ", productPic=" + productPic +
        ", productName=" + productName +
        ", productSubTitle=" + productSubTitle +
        ", productSkuCode=" + productSkuCode +
        ", memberNickname=" + memberNickname +
        ", createDate=" + createDate +
        ", modifyDate=" + modifyDate +
        ", deleteStatus=" + deleteStatus +
        ", productCategoryId=" + productCategoryId +
        ", productBrand=" + productBrand +
        ", productSn=" + productSn +
        ", productAttr=" + productAttr +
        "}";
    }
}
