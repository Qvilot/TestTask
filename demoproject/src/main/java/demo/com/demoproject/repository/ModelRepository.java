package demo.com.demoproject.repository;

import demo.com.demoproject.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long>{

    List<Model> findByDeviceTypeNameIgnoreCase(String deviceTypeName);
    List<Model> findByColor(String color);
    List<Model> findByPriceBetween(Double minPrice, Double maxPrice);
    
}
