package com.atguigu.gmall.pms.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 运费模版
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("pms_feight_template")
@ApiModel(value="FeightTemplate对象", description="运费模版")
public class FeightTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "计费类型:0->按重量；1->按件数")
    @TableField("charge_type")
    private Integer chargeType;

    @ApiModelProperty(value = "首重kg")
    @TableField("first_weight")
    private BigDecimal firstWeight;

    @ApiModelProperty(value = "首费（元）")
    @TableField("first_fee")
    private BigDecimal firstFee;

    @TableField("continue_weight")
    private BigDecimal continueWeight;

    @TableField("continme_fee")
    private BigDecimal continmeFee;

    @ApiModelProperty(value = "目的地（省、市）")
    @TableField("dest")
    private String dest;

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
    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        return "FeightTemplate{" +
        "id=" + id +
        ", name=" + name +
        ", chargeType=" + chargeType +
        ", firstWeight=" + firstWeight +
        ", firstFee=" + firstFee +
        ", continueWeight=" + continueWeight +
        ", continmeFee=" + continmeFee +
        ", dest=" + dest +
        "}";
    }
}
