package Lesson21Practice.Stuasıya;

public class Main {
    public static void main(String[] args) {

        Toy[] boysToys = {
                new Toy("Remote Control Maşın", 35),
                new Toy("Ninjago Lego", 105),
                new Toy("Robot Dinozavr", 70)
        };


        Toy[] girlsToys = {
                new Toy("Barbie Kukla", 20),
                new Toy("Frozen Lego", 150),
                new Toy("Spongebob Puzzle", 15)
        };


        Customer rauf = new Customer("Rauf", boysToys, girlsToys);
        Shopping shopping = new Shopping(rauf.getBoysToys(), rauf.getGirlsToys());

        double totalPrice = shopping.calculateTotalPrice();


        Bank bank = new Bank(1000);
        bank.pay(totalPrice);
    }
}
