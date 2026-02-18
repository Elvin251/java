package az.developia.turbo_system_name.Project.requestresponse;

public class AdRequest {

    private int year;
    private double price;
    private String city;
    private String imageUrl;
    private String description;

    private Long sellerId;

    public AdRequest(){}

    public int getYear(){ return year; }
    public void setYear(int year){ this.year=year; }

    public double getPrice(){ return price; }
    public void setPrice(double price){ this.price=price; }

    public String getCity(){ return city; }
    public void setCity(String city){ this.city=city; }

    public String getImageUrl(){ return imageUrl; }
    public void setImageUrl(String imageUrl){ this.imageUrl=imageUrl; }

    public String getDescription(){ return description; }
    public void setDescription(String description){ this.description=description; }

    public Long getSellerId(){ return sellerId; }
    public void setSellerId(Long sellerId){ this.sellerId=sellerId; }
}