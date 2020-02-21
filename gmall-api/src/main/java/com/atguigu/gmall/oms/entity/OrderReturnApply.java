package com.atguigu.gmall.oms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单退货申请
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("oms_order_return_apply")
@ApiModel(value="OrderReturnApply对象", description="订单退货申请")
public class OrderReturnApply implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单id")
    @TableField("order_id")
    private Long orderId;

    @ApiModelProperty(value = "收货地址表id")
    @TableField("company_address_id")
    private Long companyAddressId;

    @ApiModelProperty(value = "退货商品id")
    @TableField("product_id")
    private Long productId;

    @ApiModelProperty(value = "订单编号")
    @TableField("order_sn")
    private String orderSn;

    @ApiModelProperty(value = "申请时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "会员用户名")
    @TableField("member_username")
    private String memberUsername;

    @ApiModelProperty(value = "退款金额")
    @TableField("return_amount")
    private BigDecimal returnAmount;

    @ApiModelProperty(value = "退货人姓名")
    @TableField("return_name")
    private String returnName;

    @ApiModelProperty(value = "退货人电话")
    @TableField("return_phone")
    private String returnPhone;

    @ApiModelProperty(value = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "处理时间")
    @TableField("handle_time")
    private Date handleTime;

    @ApiModelProperty(value = "商品图片")
    @TableField("product_pic")
    private String productPic;

    @ApiModelProperty(value = "商品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty(value = "商品品牌")
    @TableField("product_brand")
    private String productBrand;

    @ApiModelProperty(value = "商品销售属性：颜色：红色；尺码：xl;")
    @TableField("product_attr")
    private String productAttr;

    @ApiModelProperty(value = "退货数量")
    @TableField("product_count")
    private Integer productCount;

    @ApiModelProperty(value = "商品单价")
    @TableField("product_price")
    private BigDecimal productPrice;

    @ApiModelProperty(value = "商品实际支付单价")
    @TableField("product_real_price")
    private BigDecimal productRealPrice;

    @ApiModelProperty(value = "原因")
    @TableField("reason")
    private String reason;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "凭证图片，以逗号隔开")
    @TableField("proof_pics")
    private String proofPics;

    @ApiModelProperty(value = "处理备注")
    @TableField("handle_note")
    private String handleNote;

    @ApiModelProperty(value = "处理人员")
    @TableField("handle_man")
    private String handleMan;

    @ApiModelProperty(value = "收货人")
    @TableField("receive_man")
    private String receiveMan;

    @ApiModelProperty(value = "收货时间")
    @TableField("receive_time")
    private Date receiveTime;

    @ApiModelProperty(value = "收货备注")
    @TableField("receive_note")
    private String receiveNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }
    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }
    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }
    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }
    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }
    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }
    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    @Override
    public String toString() {
        return "OrderReturnApply{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", companyAddressId=" + companyAddressId +
        ", productId=" + productId +
        ", orderSn=" + orderSn +
        ", createTime=" + createTime +
        ", memberUsername=" + memberUsername +
        ", returnAmount=" + returnAmount +
        ", returnName=" + returnName +
        ", returnPhone=" + returnPhone +
        ", status=" + status +
        ", handleTime=" + handleTime +
        ", productPic=" + productPic +
        ", productName=" + productName +
        ", productBrand=" + productBrand +
        ", productAttr=" + productAttr +
        ", productCount=" + productCount +
        ", productPrice=" + productPrice +
        ", productRealPrice=" + productRealPrice +
        ", reason=" + reason +
        ", description=" + description +
        ", proofPics=" + proofPics +
        ", handleNote=" + handleNote +
        ", handleMan=" + handleMan +
        ", receiveMan=" + receiveMan +
        ", receiveTime=" + receiveTime +
        ", receiveNote=" + receiveNote +
        "}";
    }
}
