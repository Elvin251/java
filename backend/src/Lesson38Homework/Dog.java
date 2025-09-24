package Lesson38Homework;

class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) { this.name = name; }
    void setBreed(String breed) { this.breed = breed; }

    void printInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }
}

 class Main2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rex", "Shepherd");
        Dog d2 = new Dog("Max", "Bulldog");

        d1.setName("Buddy");
        d2.setBreed("Labrador");

        d1.printInfo();
        d2.printInfo();
    }
}
