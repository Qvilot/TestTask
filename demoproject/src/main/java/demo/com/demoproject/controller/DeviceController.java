package demo.com.demoproject.controller;

import demo.com.demoproject.entity.*;
import demo.com.demoproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/device-types")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public List<DeviceType> getAllDeviceTypes() {
        return deviceService.getAllDeviceTypes();
    }

    @GetMapping("/{id}")
    public DeviceType getDeviceTypeById(@PathVariable Long id) {
        return deviceService.getDeviceTypeById(id);
    }

    @PostMapping
    public DeviceType createDeviceType(@RequestBody DeviceType deviceType) {
        return deviceService.saveDeviceType(deviceType);
    }

    @DeleteMapping("/{id}")
    public void deleteDeviceType(@PathVariable Long id) {
        deviceService.deleteDeviceType(id);
    }
}
