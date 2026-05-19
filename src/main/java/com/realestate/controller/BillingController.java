package com.realestate.billing;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/billings")
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    // CREATE
    @PostMapping
    public Billing createBill(@RequestBody Billing billing) {
        return billingService.createBill(billing);
    }

    // READ all
    @GetMapping
    public List<Billing> getAllBills() {
        return billingService.getAllBills();
    }

    // READ by id
    @GetMapping("/{id}")
    public Billing getBillById(@PathVariable int id) {
        return billingService.getBillById(id);
    }

    // READ by customer email
    @GetMapping("/email/{email}")
    public List<Billing> getBillsByEmail(@PathVariable String email) {
        return billingService.getBillsByEmail(email);
    }

    // READ by status
    @GetMapping("/status/{status}")
    public List<Billing> getBillsByStatus(@PathVariable String status) {
        return billingService.getBillsByStatus(status);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Billing updateBill(@PathVariable int id, @RequestBody Billing billing) {
        return billingService.updateBill(id, billing);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteBill(@PathVariable int id) {
        boolean deleted = billingService.deleteBill(id);
        return deleted ? "Bill deleted successfully" : "Bill not found";
    }
}
