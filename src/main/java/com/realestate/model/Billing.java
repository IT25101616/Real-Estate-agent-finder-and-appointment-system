package com.realestate.billing;

import jakarta.persistence.*;

@Entity
@Table(name = "billings")
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;

    private String customerName;
    private String email;
    private String propertyName;
    private double serviceCharge;
    private double taxAmount;
    private double totalAmount;
    private String paymentMethod;
    private String paymentStatus;
    private String billingDate;

    // Association relationship: one bill can be connected with one appointment
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    public Billing() {
    }

    public Billing(String customerName, String email, String propertyName,
                   double serviceCharge, double taxAmount,
                   String paymentMethod, String paymentStatus, String billingDate) {
        this.customerName = customerName;
        this.email = email;
        this.propertyName = propertyName;
        this.serviceCharge = serviceCharge;
        this.taxAmount = taxAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.billingDate = billingDate;
        calculateTotalAmount();
    }

    // Basic method / behavior in OOP
    public void calculateTotalAmount() {
        this.totalAmount = this.serviceCharge + this.taxAmount;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
        calculateTotalAmount();
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
        calculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
