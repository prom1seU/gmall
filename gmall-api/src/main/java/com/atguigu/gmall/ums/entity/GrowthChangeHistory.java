package com.atguigu.gmall.ums.entity;

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
 * 成长值变化历史记录表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("ums_growth_change_history")
@ApiModel(value="GrowthChangeHistory对象", description="成长值变化历史记录表")
public class GrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "改变类型：0->增加；1->减少")
    @TableField("change_type")
    private Integer changeType;

    @ApiModelProperty(value = "积分改变数量")
    @TableField("change_count")
    private Integer changeCount;

    @ApiModelProperty(value = "操作人员")
    @TableField("operate_man")
    private String operateMan;

    @ApiModelProperty(value = "操作备注")
    @TableField("operate_note")
    private String operateNote;

    @ApiModelProperty(value = "积分来源：0->购物；1->管理员修改")
    @TableField("source_type")
    private Integer sourceType;

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
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }
    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }
    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }
    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        return "GrowthChangeHistory{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", createTime=" + createTime +
        ", changeType=" + changeType +
        ", changeCount=" + changeCount +
        ", operateMan=" + operateMan +
        ", operateNote=" + operateNote +
        ", sourceType=" + sourceType +
        "}";
    }
}
