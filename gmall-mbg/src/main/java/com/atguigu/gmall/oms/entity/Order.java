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
 * 订单表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("oms_order")
@ApiModel(value="Order对象", description="订单表")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("coupon_id")
    private Long couponId;

    @ApiModelProperty(value = "订单编号")
    @TableField("order_sn")
    private String orderSn;

    @ApiModelProperty(value = "提交时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "用户帐号")
    @TableField("member_username")
    private String memberUsername;

    @ApiModelProperty(value = "订单总金额")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "应付金额（实际支付金额）")
    @TableField("pay_amount")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "运费金额")
    @TableField("freight_amount")
    private BigDecimal freightAmount;

    @ApiModelProperty(value = "促销优化金额（促销价、满减、阶梯价）")
    @TableField("promotion_amount")
    private BigDecimal promotionAmount;

    @ApiModelProperty(value = "积分抵扣金额")
    @TableField("integration_amount")
    private BigDecimal integrationAmount;

    @ApiModelProperty(value = "优惠券抵扣金额")
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    @ApiModelProperty(value = "管理员后台调整订单使用的折扣金额")
    @TableField("discount_amount")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "支付方式：0->未支付；1->支付宝；2->微信")
    @TableField("pay_type")
    private Integer payType;

    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    @TableField("order_type")
    private Integer orderType;

    @ApiModelProperty(value = "物流公司(配送方式)")
    @TableField("delivery_company")
    private String deliveryCompany;

    @ApiModelProperty(value = "物流单号")
    @TableField("delivery_sn")
    private String deliverySn;

    @ApiModelProperty(value = "自动确认时间（天）")
    @TableField("auto_confirm_day")
    private Integer autoConfirmDay;

    @ApiModelProperty(value = "可以获得的积分")
    @TableField("integration")
    private Integer integration;

    @ApiModelProperty(value = "可以活动的成长值")
    @TableField("growth")
    private Integer growth;

    @ApiModelProperty(value = "活动信息")
    @TableField("promotion_info")
    private String promotionInfo;

    @ApiModelProperty(value = "发票类型：0->不开发票；1->电子发票；2->纸质发票")
    @TableField("bill_type")
    private Integer billType;

    @ApiModelProperty(value = "发票抬头")
    @TableField("bill_header")
    private String billHeader;

    @ApiModelProperty(value = "发票内容")
    @TableField("bill_content")
    private String billContent;

    @ApiModelProperty(value = "收票人电话")
    @TableField("bill_receiver_phone")
    private String billReceiverPhone;

    @ApiModelProperty(value = "收票人邮箱")
    @TableField("bill_receiver_email")
    private String billReceiverEmail;

    @ApiModelProperty(value = "收货人姓名")
    @TableField("receiver_name")
    private String receiverName;

    @ApiModelProperty(value = "收货人电话")
    @TableField("receiver_phone")
    private String receiverPhone;

    @ApiModelProperty(value = "收货人邮编")
    @TableField("receiver_post_code")
    private String receiverPostCode;

    @ApiModelProperty(value = "省份/直辖市")
    @TableField("receiver_province")
    private String receiverProvince;

    @ApiModelProperty(value = "城市")
    @TableField("receiver_city")
    private String receiverCity;

    @ApiModelProperty(value = "区")
    @TableField("receiver_region")
    private String receiverRegion;

    @ApiModelProperty(value = "详细地址")
    @TableField("receiver_detail_address")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "订单备注")
    @TableField("note")
    private String note;

    @ApiModelProperty(value = "确认收货状态：0->未确认；1->已确认")
    @TableField("confirm_status")
    private Integer confirmStatus;

    @ApiModelProperty(value = "删除状态：0->未删除；1->已删除")
    @TableField("delete_status")
    private Integer deleteStatus;

    @ApiModelProperty(value = "下单时使用的积分")
    @TableField("use_integration")
    private Integer useIntegration;

    @ApiModelProperty(value = "支付时间")
    @TableField("payment_time")
    private Date paymentTime;

    @ApiModelProperty(value = "发货时间")
    @TableField("delivery_time")
    private Date deliveryTime;

    @ApiModelProperty(value = "确认收货时间")
    @TableField("receive_time")
    private Date receiveTime;

    @ApiModelProperty(value = "评价时间")
    @TableField("comment_time")
    private Date commentTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("modify_time")
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }
    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }
    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }
    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }
    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }
    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }
    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }
    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }
    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", couponId=" + couponId +
        ", orderSn=" + orderSn +
        ", createTime=" + createTime +
        ", memberUsername=" + memberUsername +
        ", totalAmount=" + totalAmount +
        ", payAmount=" + payAmount +
        ", freightAmount=" + freightAmount +
        ", promotionAmount=" + promotionAmount +
        ", integrationAmount=" + integrationAmount +
        ", couponAmount=" + couponAmount +
        ", discountAmount=" + discountAmount +
        ", payType=" + payType +
        ", sourceType=" + sourceType +
        ", status=" + status +
        ", orderType=" + orderType +
        ", deliveryCompany=" + deliveryCompany +
        ", deliverySn=" + deliverySn +
        ", autoConfirmDay=" + autoConfirmDay +
        ", integration=" + integration +
        ", growth=" + growth +
        ", promotionInfo=" + promotionInfo +
        ", billType=" + billType +
        ", billHeader=" + billHeader +
        ", billContent=" + billContent +
        ", billReceiverPhone=" + billReceiverPhone +
        ", billReceiverEmail=" + billReceiverEmail +
        ", receiverName=" + receiverName +
        ", receiverPhone=" + receiverPhone +
        ", receiverPostCode=" + receiverPostCode +
        ", receiverProvince=" + receiverProvince +
        ", receiverCity=" + receiverCity +
        ", receiverRegion=" + receiverRegion +
        ", receiverDetailAddress=" + receiverDetailAddress +
        ", note=" + note +
        ", confirmStatus=" + confirmStatus +
        ", deleteStatus=" + deleteStatus +
        ", useIntegration=" + useIntegration +
        ", paymentTime=" + paymentTime +
        ", deliveryTime=" + deliveryTime +
        ", receiveTime=" + receiveTime +
        ", commentTime=" + commentTime +
        ", modifyTime=" + modifyTime +
        "}";
    }
}
