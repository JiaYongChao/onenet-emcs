package com.onenet.emcs.system.domain;

import com.onenet.emcs.common.core.domain.BaseEntity;

/**
 * 设备上下线记录
 */
public class DeviceOnline extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Integer status;//设备上下线标识0：设备下线1：设备上线
    private Long at;//平台时间戳，单位ms
    private String deviceId;//设备id
    private Integer loginType;//设备登录协议类型 1-EDP, 6-MODBUS, 7-MQTT, 10-NB-IoT

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAt() {
        return at;
    }

    public void setAt(Long at) {
        this.at = at;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }
}
