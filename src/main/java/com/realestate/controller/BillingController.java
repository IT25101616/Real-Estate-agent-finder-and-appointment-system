package com.realestate.controller;

import com.realestate.model.Billing;
import com.realestate.service.BillingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billings")
@CrossOrigin(origins = "*")
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @PostMapping
    public Billing createBilling(@RequestBody Billing billing) {
        return billingService.create(billing);
    }

    @GetMapping
    public List<Billing> getAllBillings() {
        return billingService.getAll();
    }

    @GetMapping("/{id}")
    public Billing getBillingById(@PathVariable Long id) {
        return billingService.getById(id);
    }

    @PutMapping("/{id}")
    public Billing updateBilling(@PathVariable Long id,
                                 @RequestBody Billing billing) {
        return billingService.update(id, billing);
    }

    @DeleteMapping("/{id}")
    public String deleteBilling(@PathVariable Long id) {
        return billingService.delete(id) ? "Billing deleted successfully" : "Billing not found";
    }
}
