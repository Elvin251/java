package Lesson19Practice.Stuasiya1;

public class Rating {
     Order order;
     double stars;
  Customer customer;

    public Rating(Order order, Customer customer) {
        if (!order.getStatus().name().equals("COMPLETED")) {
            throw new IllegalArgumentException("Only COMPLETED orders can be rated!");
        }
        this.order = order;
        this.customer = customer;
    }

    public void addRating(double stars) {
        if (stars >= 1 && stars <= 5) {
            this.stars = stars;
            System.out.println("Rating added: " + stars + " stars.");
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
    }
}
