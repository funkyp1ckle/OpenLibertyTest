package com.funkypickle.devices.model;

import jakarta.persistence.*;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long deviceId;

    String deviceName;

    protected Device() {}

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "Device[id=%d, deviceName='%s']";
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
