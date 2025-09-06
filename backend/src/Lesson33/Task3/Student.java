package Lesson33.Task3;

public class Student {
    private String ad;
    private int qiymet;

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getQiymet() {
        return qiymet;
    }
    public void setQiymet(int qiymet) {
        if (qiymet >= 0 && qiymet <= 100) {
            this.qiymet = qiymet;
        }
    }

}
