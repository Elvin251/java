package Lesson38Homework;

class Building {
    String address;
    int floors;
    double area;

    Building(String address, int floors, double area) {
        this.address = address; this.floors = floors; this.area = area;
    }
}

class ResidentialBuilding extends Building {
    int apartments;

    ResidentialBuilding(String address, int floors, double area, int apartments) {
        super(address, floors, area);
        this.apartments = apartments;
    }

    void printInfo() {
        System.out.println("Residential: " + address + ", Floors: " + floors + ", Apartments: " + apartments);
    }
}

class CommercialBuilding extends Building {
    double officeSpace;

    CommercialBuilding(String address, int floors, double area, double officeSpace) {
        super(address, floors, area);
        this.officeSpace = officeSpace;
    }

    void printInfo() {
        System.out.println("Commercial: " + address + ", Floors: " + floors + ", Office Space: " + officeSpace);
    }
}

class Main25 {
    public static void main(String[] args) {
        ResidentialBuilding res = new ResidentialBuilding("Street 1", 5, 1000, 20);
        CommercialBuilding com = new CommercialBuilding("Street 2", 10, 3000, 1500);
        res.printInfo();
        com.printInfo();
    }
}
