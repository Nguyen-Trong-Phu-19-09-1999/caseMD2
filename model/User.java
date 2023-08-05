package model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialUID = 12345678;
    private int id;
    private double price;
    private String name;
    private int size;
    private String address;

    public User() {
    }

    public User(int id, double price, String name, int size, String address) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.size = size;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return
                "Mã Sân : " + id +
                ",   Giá : " + price +
                ",   Tên : " + name  +
                ",   Kích Thước : " + size +
                ",   Địa Chỉ : " + address ;
    }
}
