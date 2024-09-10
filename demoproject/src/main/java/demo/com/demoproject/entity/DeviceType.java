package demo.com.demoproject.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "device_types")
public class DeviceType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Идентификатор

    private String name; //Название

    private String countryOfOrigin; // Страна-производитель
    private String manufacturer; // Производитель
    private boolean availableOnline; //Доступен онлайн заказ
    private boolean installmentOption; //Доступна рассрочка

    @OneToMany(mappedBy = "deviceType", cascade = CascadeType.ALL)
    private List<Model> models;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    public boolean isInstallmentOption() {
        return installmentOption;
    }

    public void setInstallmentOption(boolean installmentOption) {
        this.installmentOption = installmentOption;
    }

}
