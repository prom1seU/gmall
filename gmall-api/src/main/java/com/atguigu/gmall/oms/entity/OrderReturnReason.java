package com.atguigu.gmall.oms.entity;

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
 * 退货原因表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("oms_order_return_reason")
@ApiModel(value="OrderReturnReason对象", description="退货原因表")
public class OrderReturnReason implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "退货类型")
    @TableField("name")
    private String name;

    @TableField("sort")
    private Integer sort;

    @ApiModelProperty(value = "状态：0->不启用；1->启用")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "添加时间")
    @TableField("create_time")
    private Date createTime;

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
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderReturnReason{" +
        "id=" + id +
        ", name=" + name +
        ", sort=" + sort +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
