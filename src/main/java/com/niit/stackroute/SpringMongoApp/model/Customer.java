package com.niit.stackroute.SpringMongoApp.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;
@Document
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Customer {

//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public Address getCustomerAddress() {
//        return customerAddress;
//    }
//
//    public void setCustomerAddress(Address customerAddress) {
//        this.customerAddress = customerAddress;
//    }
//
//    public long getCustomerPhoneNo() {
//        return customerPhoneNo;
//    }
//
//    public void setCustomerPhoneNo(long customerPhoneNo) {
//        this.customerPhoneNo = customerPhoneNo;
//    }
//
//    public Customer(int customerId, String customerName, Address customerAddress, long customerPhoneNo) {
//        this.customerId = customerId;
//        this.customerName = customerName;
//        this.customerAddress = customerAddress;
//        this.customerPhoneNo = customerPhoneNo;
//    }

    @Id
    private int customerId;
    private String customerName;
    private Address customerAddress;
    private long customerPhoneNo;
//
//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerId=" + customerId +
//                ", customerName='" + customerName + '\'' +
//                ", customerAddress=" + customerAddress +
//                ", customerPhoneNo=" + customerPhoneNo +
//                '}';
//    }
//
//    public Customer(){}

}
