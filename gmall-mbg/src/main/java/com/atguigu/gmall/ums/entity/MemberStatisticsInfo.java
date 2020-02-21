package com.atguigu.gmall.ums.entity;

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
 * 会员统计信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("ums_member_statistics_info")
@ApiModel(value="MemberStatisticsInfo对象", description="会员统计信息")
public class MemberStatisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @ApiModelProperty(value = "累计消费金额")
    @TableField("consume_amount")
    private BigDecimal consumeAmount;

    @ApiModelProperty(value = "订单数量")
    @TableField("order_count")
    private Integer orderCount;

    @ApiModelProperty(value = "优惠券数量")
    @TableField("coupon_count")
    private Integer couponCount;

    @ApiModelProperty(value = "评价数")
    @TableField("comment_count")
    private Integer commentCount;

    @ApiModelProperty(value = "退货数量")
    @TableField("return_order_count")
    private Integer returnOrderCount;

    @ApiModelProperty(value = "登录次数")
    @TableField("login_count")
    private Integer loginCount;

    @ApiModelProperty(value = "关注数量")
    @TableField("attend_count")
    private Integer attendCount;

    @ApiModelProperty(value = "粉丝数量")
    @TableField("fans_count")
    private Integer fansCount;

    @TableField("collect_product_count")
    private Integer collectProductCount;

    @TableField("collect_subject_count")
    private Integer collectSubjectCount;

    @TableField("collect_topic_count")
    private Integer collectTopicCount;

    @TableField("collect_comment_count")
    private Integer collectCommentCount;

    @TableField("invite_friend_count")
    private Integer inviteFriendCount;

    @ApiModelProperty(value = "最后一次下订单时间")
    @TableField("recent_order_time")
    private Date recentOrderTime;

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
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }
    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }
    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }
    public Date getRecentOrderTime() {
        return recentOrderTime;
    }

    public void setRecentOrderTime(Date recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
    }

    @Override
    public String toString() {
        return "MemberStatisticsInfo{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", consumeAmount=" + consumeAmount +
        ", orderCount=" + orderCount +
        ", couponCount=" + couponCount +
        ", commentCount=" + commentCount +
        ", returnOrderCount=" + returnOrderCount +
        ", loginCount=" + loginCount +
        ", attendCount=" + attendCount +
        ", fansCount=" + fansCount +
        ", collectProductCount=" + collectProductCount +
        ", collectSubjectCount=" + collectSubjectCount +
        ", collectTopicCount=" + collectTopicCount +
        ", collectCommentCount=" + collectCommentCount +
        ", inviteFriendCount=" + inviteFriendCount +
        ", recentOrderTime=" + recentOrderTime +
        "}";
    }
}
