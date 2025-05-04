import java.util.Scanner;
public class Lesson6practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1)
        System.out.println("Birinci ededi daxil edin:");
        int a = scanner.nextInt();
        System.out.println("Ikinci ededi daxil edin:");
        int b = scanner.nextInt();

        System.out.println("Toplama: " + (a + b));
        System.out.println("Cixma: " + (a - b));
        System.out.println("Vurma: " + (a * b));
        System.out.println("Bolme: " + (a / b));
        System.out.println("Qaliq: " + (a % b));

        scanner.nextLine();

        // 2)
        System.out.println("Adinizi daxil edin:");
        String name = scanner.nextLine();
        System.out.println("Soyadinizi daxil edin:");
        String surname = scanner.nextLine();
        System.out.println("Salam " + name + " " + surname + ", xos geldiniz!");

        // 3)
        System.out.println("Duzbucaqlinin uzunlugunu daxil edin:");
        int uzunluq = scanner.nextInt();
        System.out.println("Duzbucaqlinin enini daxil edin:");
        int en = scanner.nextInt();

        int sahe = uzunluq * en;
        int perimetr = 2 * (uzunluq + en);

        System.out.println("Sahe: " + sahe);
        System.out.println("Perimetr: " + perimetr);

        // 4)
        System.out.println("Dəqiqəni daxil edin:");
        int deqiqe = scanner.nextInt();

        int saat = deqiqe / 60;
        int qalanDeqiqe = deqiqe % 60;

        System.out.println(deqiqe + " minutes is " + saat + " hour and " + qalanDeqiqe + " minutes");
    }
}
