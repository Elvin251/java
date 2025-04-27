public class Lesson5Homework {
    public static void main(String[] args) {
        // 1
        String yas = "30";
        int yasInt = Integer.parseInt(yas);
        System.out.println(yasInt);

        // 2
        String qiymetStr = "49.99";
        double qiymetDouble = Double.parseDouble(qiymetStr);
        System.out.println(qiymetDouble);

        // 3
        char simvol = '#';
        int simvolAscii = (int) simvol;
        System.out.println(simvolAscii);

        // 4
        byte maxByte = Byte.MAX_VALUE;
        int yeniMaxByte = maxByte + 10;
        System.out.println("Maximum byte is: " + yeniMaxByte);

        // 5
        String kod = "A123";
        try {
            int kodInt = Integer.parseInt(kod);
            System.out.println(kodInt);
        } catch (NumberFormatException e) {
            System.out.println("Çevirilə bilmir: " + kod);
        }

        // 6
        String say = "1024";
        long sayLong = Long.parseLong(say);
        System.out.println(sayLong);

        // 7
        double cekideyisme = 5.75;
        float cekideyismeFloat = (float) cekideyisme;
        System.out.println(cekideyismeFloat);

        // 8
        char herf = 'Z';
        int herfAscii = (int) herf;
        System.out.println(herfAscii);

        // 9
        String ogrenciNumarasi = "123456";
        long ogrenciNumarasiLong = Long.parseLong(ogrenciNumarasi);
        System.out.println(ogrenciNumarasiLong);

        // 10
        String deyerStr = "3500.67";
            int deyerInt = (int) Double.parseDouble(deyerStr);
            System.out.println(deyerInt);

            System.out.println("Çevirilə bilmir: " + deyerStr);


        // 11
        String ad = "Aziz";
        char ilkSimvol = ad.charAt(0);
        System.out.println(ilkSimvol);

        // 12
        char verilen = 'D';
        String verilenStr = String.valueOf(verilen);
        System.out.println(verilenStr);

        // 13
        int x = 100;
        byte xByte = (byte) x;
        System.out.println(xByte);

        // 14
        double qiymet2 = 120.45;
        int qiymet2Int = (int) qiymet2;
        System.out.println(qiymet2Int);

        // 15
        float agirliq = 35.7f;
        int agirliqInt = (int) agirliq;
        System.out.println(agirliqInt);

        // 16
        int maxInt = Integer.MAX_VALUE;
        long yeniMaxInt = (long) maxInt + 100;
        System.out.println("Maximum int is: " + yeniMaxInt);

        // 17
        byte yasByte = Byte.MAX_VALUE;
        int yeniYas = yasByte + 10;
        System.out.println(yeniYas);

        // 18
        float pi = 3.14159f;
        double piDouble = (double) pi;
        System.out.println(piDouble);

        // 19
        String yazi = "456";
        int yaziInt = Integer.parseInt(yazi);
        System.out.println(yaziInt);

        // 20
        String telefon = "12345";
        long telefonLong = Long.parseLong(telefon);
        System.out.println(telefonLong);
    }
}
