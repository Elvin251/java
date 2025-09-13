package Lesson34Practice.Task1;
class Company {
    String name;

    Company(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("Şirkət: " + name);
    }
}

class Food extends Company {
    String foodName;
    String description;
    double price;

    Food(String companyName, String foodName, String description, double price) {
        super(companyName);
        this.foodName = foodName;
        this.description = description;
        this.price = price;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Yemək: " + foodName + ", Təsvir: " + description + ", Qiymət: " + price);
    }
}
