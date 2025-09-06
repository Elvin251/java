package Lesson33.Task5;

public class Tempurator {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        }
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}
