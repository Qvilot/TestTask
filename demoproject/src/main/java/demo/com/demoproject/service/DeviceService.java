package demo.com.demoproject.service;

import demo.com.demoproject.entity.*;
import demo.com.demoproject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceTypeRepository deviceTypeRepository;

    public List<DeviceType> getAllDeviceTypes() {
        return deviceTypeRepository.findAll();
    }

    public DeviceType getDeviceTypeById(Long id) {
        return deviceTypeRepository.findById(id).orElse(null);
    }

    public DeviceType saveDeviceType(DeviceType deviceType) {
        return deviceTypeRepository.save(deviceType);
    }

    public void deleteDeviceType(Long id) {
        deviceTypeRepository.deleteById(id);
    }
}
