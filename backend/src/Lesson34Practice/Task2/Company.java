package Lesson34Practice.Task2;

class Company {
    int id;
    String name;
    double valueOfCompany;

    Company(int id, String name, double valueOfCompany) {
        this.id = id;
        this.name = name;
        this.valueOfCompany = valueOfCompany;
    }

    void printInfo() {
        System.out.println("Company ID: " + id + ", Name: " + name + ", Dəyəri: " + valueOfCompany);
    }
}

class Car extends Company {
    int carId;
    String brand;
    String model;
    double price;
    int companyId;

    Car(int companyId, String companyName, double valueOfCompany, int carId, String brand, String model, double price) {
        super(companyId, companyName, valueOfCompany); // Company konstruktorunu çağırır
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.companyId = companyId;
    }

    void calculate() {
        double result = super.valueOfCompany / price;
        System.out.println("Şirkətin dəyəri / maşının qiyməti = " + result);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Car ID: " + carId + ", Brand: " + brand + ", Model: " + model + ", Qiymət: " + price);
    }
}
