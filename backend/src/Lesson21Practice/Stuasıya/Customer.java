package Lesson21Practice.Stuasıya;

public class Customer {
     String name;
    Toy[] boysToys;
 Toy[] girlsToys;

    public Customer(String name, Toy[] boysToys, Toy[] girlsToys) {
        this.name = name;
        this.boysToys = boysToys;
        this.girlsToys = girlsToys;
    }

    public Toy[] getBoysToys() {
        return boysToys;
    }

    public Toy[] getGirlsToys() {
        return girlsToys;
    }

    public String getName() {
        return name;
    }
}
