package com.realestate.service;

import com.realestate.model.Billing;
import com.realestate.repository.BillingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService implements ManagementService<Billing> {

    private final BillingRepository billingRepository;

    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    @Override
    public Billing create(Billing billing) {
        return billingRepository.save(billing);
    }

    @Override
    public List<Billing> getAll() {
        return billingRepository.findAll();
    }

    @Override
    public Billing getById(Long id) {
        return billingRepository.findById(id).orElse(null);
    }

    @Override
    public Billing update(Long id, Billing newBilling) {
        Billing oldBilling = billingRepository.findById(id).orElse(null);

        if (oldBilling != null) {
            oldBilling.setBillingDate(newBilling.getBillingDate());
            oldBilling.setCustomerName(newBilling.getCustomerName());
            oldBilling.setEmail(newBilling.getEmail());
            oldBilling.setPaymentMethod(newBilling.getPaymentMethod());
            oldBilling.setPaymentStatus(newBilling.getPaymentStatus());
            oldBilling.setPropertyName(newBilling.getPropertyName());
            oldBilling.setServiceCharge(newBilling.getServiceCharge());
            oldBilling.setTaxAmount(newBilling.getTaxAmount());
            oldBilling.setTotalAmount(newBilling.getTotalAmount());
            oldBilling.setAppointmentId(newBilling.getAppointmentId());
            oldBilling.setCreatedBy(newBilling.getCreatedBy());

            return billingRepository.save(oldBilling);
        }

        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (billingRepository.existsById(id)) {
            billingRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
