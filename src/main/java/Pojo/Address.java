package Pojo;

import org.apache.ibatis.type.Alias;

@Alias("Address")
public class Address {
    String name;
    String address;
    String registered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Address() {
    }

    public Address(String name, String address, String registered) {
        this.name = name;
        this.address = address;
        this.registered = registered;
    }
}
