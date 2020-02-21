package com.atguigu.gmall.ums.entity;

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
 * 后台用户登录日志表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-20
 */
@TableName("ums_admin_login_log")
@ApiModel(value="AdminLoginLog对象", description="后台用户登录日志表")
public class AdminLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("admin_id")
    private Long adminId;

    @TableField("create_time")
    private Date createTime;

    @TableField("ip")
    private String ip;

    @TableField("address")
    private String address;

    @ApiModelProperty(value = "浏览器登录类型")
    @TableField("user_agent")
    private String userAgent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        return "AdminLoginLog{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", createTime=" + createTime +
        ", ip=" + ip +
        ", address=" + address +
        ", userAgent=" + userAgent +
        "}";
    }
}
