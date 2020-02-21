package com.atguigu.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 优惠券使用、领取历史表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("sms_coupon_history")
@ApiModel(value="CouponHistory对象", description="优惠券使用、领取历史表")
public class CouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("coupon_id")
    private Long couponId;

    @TableField("member_id")
    private Long memberId;

    @TableField("coupon_code")
    private String couponCode;

    @ApiModelProperty(value = "领取人昵称")
    @TableField("member_nickname")
    private String memberNickname;

    @ApiModelProperty(value = "获取类型：0->后台赠送；1->主动获取")
    @TableField("get_type")
    private Integer getType;

    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "使用状态：0->未使用；1->已使用；2->已过期")
    @TableField("use_status")
    private Integer useStatus;

    @ApiModelProperty(value = "使用时间")
    @TableField("use_time")
    private Date useTime;

    @ApiModelProperty(value = "订单编号")
    @TableField("order_id")
    private Long orderId;

    @ApiModelProperty(value = "订单号码")
    @TableField("order_sn")
    private String orderSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }
    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }
    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        return "CouponHistory{" +
        "id=" + id +
        ", couponId=" + couponId +
        ", memberId=" + memberId +
        ", couponCode=" + couponCode +
        ", memberNickname=" + memberNickname +
        ", getType=" + getType +
        ", createTime=" + createTime +
        ", useStatus=" + useStatus +
        ", useTime=" + useTime +
        ", orderId=" + orderId +
        ", orderSn=" + orderSn +
        "}";
    }
}
