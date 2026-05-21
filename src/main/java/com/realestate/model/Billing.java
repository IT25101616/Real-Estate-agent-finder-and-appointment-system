package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "billings")
public class Billing extends ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    private String billingDate;
    private String customerName;
    private String email;
    private String paymentMethod;
    private String paymentStatus;
    private String propertyName;
    private double serviceCharge;
    private double taxAmount;
    private double totalAmount;
    private Long appointmentId;

    public Billing() {
    }

    public Billing(String createdBy, String billingDate, String customerName, String email,
                   String paymentMethod, String paymentStatus, String propertyName,
                   double serviceCharge, double taxAmount, double totalAmount,
                   Long appointmentId) {
        super(createdBy);
        this.billingDate = billingDate;
        this.customerName = customerName;
        this.email = email;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.propertyName = propertyName;
        this.serviceCharge = serviceCharge;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.appointmentId = appointmentId;
    }

    @Override
    public String getRecordType() {
        return "Billing Record";
    }

    public Long getBillId() {
        return billId;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }
}
