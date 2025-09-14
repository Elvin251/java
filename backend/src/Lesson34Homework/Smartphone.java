package Lesson34Homework;

class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getStorageCapacity() { return storageCapacity; }
    public void setStorageCapacity(int storageCapacity) { this.storageCapacity = storageCapacity; }

    public void increaseStorage(int value) {
        storageCapacity += value;
    }
}
