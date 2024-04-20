package com.onenet.emcs.system.service;

public interface IDeviceService {

    /**
     * 设备数据处理
     */
    void deviceDataHandle();

    /**
     * 设备状态处理，上下线
     */
    void deviceStatusHandle();

}
