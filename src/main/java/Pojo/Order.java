package Pojo;

import org.apache.ibatis.type.Alias;

@Alias("Order")
public class Order {
    String id;
    String username;
    String orderTime;
    ParkingSpace parkingSpace;
    String state;
    double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order() {
    }

    public Order(String id, String username, String orderTime, ParkingSpace parkingSpace, String state, double price) {
        this.id = id;
        this.username = username;
        this.orderTime = orderTime;
        this.parkingSpace = parkingSpace;
        this.state = state;
        this.price = price;
    }
}
