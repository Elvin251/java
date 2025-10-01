package Lesson40Practice.Evisi1;

public class Task3 {
    void B() throws Exception {
        throw new Exception("Xeta B metodunda bas verdi!");
    }

    void A() {
        try {
            B();
        } catch (Exception e) {
            System.out.println("Xeta A metodunda handle olundu: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Task3 obj = new Task3();
        obj.A();
    }
}
