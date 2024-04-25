package com.funkypickle.devices.repository;

import com.funkypickle.devices.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
