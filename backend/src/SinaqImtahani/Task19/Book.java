package SinaqImtahani.Task19;

public class Book {
    String ad;
    int sehifeSayi;
    String muellif;
    public Book(String ad, int sehifeSayi, String muellif) {
        this.ad=ad;
        this.sehifeSayi=sehifeSayi;
        this.muellif=muellif;
    }
    public  void MelumatVer(){
        if (sehifeSayi < 100){
            System.out.println("Qisa  kitabdir");
        }else{
            System.out.println("Uzun  kitabdir");
        }
    }
}
