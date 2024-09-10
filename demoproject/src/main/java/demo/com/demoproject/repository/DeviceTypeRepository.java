package demo.com.demoproject.repository;

import demo.com.demoproject.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceTypeRepository extends JpaRepository<DeviceType, Long> {
    
}
