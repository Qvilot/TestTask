package demo.com.demoproject.entity;

import jakarta.persistence.*;

@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String serialNumber;
    private String color;
    private String size;
    private double price;
    private boolean inStock;

    @ManyToOne
    @JoinColumn(name = "device_type_id")
    private DeviceType deviceType;

    private String category;            // для телевизоров и ПК
    private String technology;          // для телевизоров
    private double dustCollectorVolume; // для пылесосов
    private int modesCount;             // для пылесосов
    private int doorCount;              // для холодильников
    private String compressorType;      // Для холодильников
    private String memory;              // Для смартфонов
    private Integer cameraCount;        // Для смартфонов
    private String processorType;       // Для ПК


    
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
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isInStock() {
        return inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public double getDustCollectorVolume() {
        return dustCollectorVolume;
    }
    public void setDustCollectorVolume(double dustCollectorVolume) {
        this.dustCollectorVolume = dustCollectorVolume;
    }
    public int getModesCount() {
        return modesCount;
    }
    public void setModesCount(int modesCount) {
        this.modesCount = modesCount;
    }
    public int getDoorCount() {
        return doorCount;
    }
    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
    public String getCompressorType() {
        return compressorType;
    }
    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }
    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public Integer getCameraCount() {
        return cameraCount;
    }
    public void setCameraCount(Integer cameraCount) {
        this.cameraCount = cameraCount;
    }
    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    
    
}
