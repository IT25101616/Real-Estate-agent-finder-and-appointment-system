package com.realestate.billing;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BillingService {

    // Dependency relationship: service depends on repository
    private final BillingRepository billingRepository;

    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    public Billing createBill(Billing billing) {
        billing.calculateTotalAmount();
        return billingRepository.save(billing);
    }

    public List<Billing> getAllBills() {
        return billingRepository.findAll();
    }

    public Billing getBillById(int id) {
        return billingRepository.findById(id).orElse(null);
    }

    public List<Billing> getBillsByEmail(String email) {
        return billingRepository.findByEmail(email);
    }

    public List<Billing> getBillsByStatus(String status) {
        return billingRepository.findByPaymentStatus(status);
    }

    public Billing updateBill(int id, Billing newBilling) {
        Billing oldBilling = getBillById(id);

        if (oldBilling != null) {
            oldBilling.setCustomerName(newBilling.getCustomerName());
            oldBilling.setEmail(newBilling.getEmail());
            oldBilling.setPropertyName(newBilling.getPropertyName());
            oldBilling.setServiceCharge(newBilling.getServiceCharge());
            oldBilling.setTaxAmount(newBilling.getTaxAmount());
            oldBilling.setPaymentMethod(newBilling.getPaymentMethod());
            oldBilling.setPaymentStatus(newBilling.getPaymentStatus());
            oldBilling.setBillingDate(newBilling.getBillingDate());
            oldBilling.setAppointment(newBilling.getAppointment());
            oldBilling.calculateTotalAmount();
            return billingRepository.save(oldBilling);
        }

        return null;
    }

    public boolean deleteBill(int id) {
        Billing billing = getBillById(id);

        if (billing != null) {
            billingRepository.delete(billing);
            return true;
        }

        return false;
    }
}
