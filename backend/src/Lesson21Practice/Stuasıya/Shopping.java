package Lesson21Practice.Stuasıya;

public class Shopping {
    private Toy[] boysToys;
    private Toy[] girlsToys;

    public Shopping(Toy[] boysToys, Toy[] girlsToys) {
        this.boysToys = boysToys;
        this.girlsToys = girlsToys;
    }

    public double calculateTotalPrice() {
        double boysTotal = 0;
        for (Toy t : boysToys) {
            boysTotal += t.getPrice();
        }

        double girlsTotal = 0;
        for (Toy t : girlsToys) {
            girlsTotal += t.getPrice();
        }

        double total = boysTotal + girlsTotal;

        // Əgər 500 manatdan çoxdursa 25% endirim
        if (total > 500) {
            total *= 0.75;
        }

        // Uşaqlar günü endirimləri
        total -= boysTotal * 0.08;
        total -= girlsTotal * 0.10;

        return total;
    }
}
