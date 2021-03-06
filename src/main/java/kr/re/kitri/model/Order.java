package kr.re.kitri.model;

import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class Order {

    // 필드
    private int custID;
    private String username;
    private String address;
    private String email;
    private LocalDate orderDate;
    private String productName;

    // 생성자
    public Order() {
    }

    public Order(int custID, String username, String address, String email, LocalDate orderDate, String productName) {
        this.custID = custID;
        this.username = username;
        this.address = address;
        this.email = email;
        this.orderDate = orderDate;
        this.productName = productName;
    }

    // 메소드
    public int getCustID() {
        return custID;
    }
    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "custID='" + custID + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
