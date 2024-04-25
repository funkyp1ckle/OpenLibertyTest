package com.funkypickle.devices.resources;

import com.funkypickle.devices.model.Device;
import com.funkypickle.devices.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/device")
public class DeviceResource {

    @Autowired
    DeviceRepository deviceRepo;

    @PostMapping("")
    public ResponseEntity<Device> addDevice(@RequestBody Device device) {
        try {
            Device _device = deviceRepo.save(new Device(device.getDeviceName()));
            return new ResponseEntity<>(_device, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Device>> getDevices() {
        List<Device> devices = new ArrayList<>(deviceRepo.findAll());
        return new ResponseEntity<>(devices, HttpStatus.OK);
    }

    @GetMapping("/{deviceId}")
    public ResponseEntity<Device> getDevice(@PathVariable("deviceId") Long deviceId) {
        Optional<Device> prevDevice = deviceRepo.findById(deviceId);
        if(prevDevice.isPresent()) {
            Device _device = prevDevice.get();
            return new ResponseEntity<>(_device, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{deviceId}")
    public ResponseEntity<Device> updateDevice(@PathVariable("deviceId") Long deviceId, @RequestBody Device device) {
        Optional<Device> prevDevice = deviceRepo.findById(deviceId);
        if(prevDevice.isPresent()) {
            Device _device = prevDevice.get();
            _device.setDeviceName(device.getDeviceName());
            return new ResponseEntity<>(_device, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{deviceId}")
    public ResponseEntity<Device> deleteDevice(@PathVariable("deviceId") Long deviceId) {
        Optional<Device> prevDevice = deviceRepo.findById(deviceId);
        if(prevDevice.isPresent()) {
            Device _device = prevDevice.get();
            deviceRepo.delete(_device);
            return new ResponseEntity<>(_device, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
