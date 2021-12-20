package Pojo;

import org.apache.ibatis.type.Alias;

@Alias("ParkingSpace")
public class ParkingSpace {
    String id;
    String community;//小区
    String licenses;//车位证照信息
    String location;
    double price;
    String discount;
    String state;
    String url;
    String publisher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getLicenses() {
        return licenses;
    }

    public void setLicenses(String licenses) {
        this.licenses = licenses;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ParkingSpace() {
    }

    public ParkingSpace(String id, String community, String licenses, String location, double price, String discount, String state, String url, String publisher) {
        this.id = id;
        this.community = community;
        this.licenses = licenses;
        this.location = location;
        this.price = price;
        this.discount = discount;
        this.state = state;
        this.url = url;
        this.publisher = publisher;
    }
}
