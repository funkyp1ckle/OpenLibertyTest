package com.funkypickle.devices.resources;

import com.funkypickle.devices.model.Device;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceResource {
    @RequestMapping("/{userId}")
    public List<Device> getDevices(@PathParam("userId") String userId) {
        return new ArrayList<>();
    }
}
