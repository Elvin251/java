package Lesson33.Task1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAd("Elvin");
        p.setYas(20);
        p.setEmail("elvin@example.com");

        System.out.println("Ad: " + p.getAd());
        System.out.println("Yaş: " + p.getYas());
        System.out.println("E-poçt: " + p.getEmail());
    }
}
