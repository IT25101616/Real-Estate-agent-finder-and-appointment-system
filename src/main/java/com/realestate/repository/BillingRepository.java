package com.realestate.billing;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BillingRepository extends JpaRepository<Billing, Integer> {

    // Read bills by customer email
    List<Billing> findByEmail(String email);

    // Read bills by payment status. Example: PAID or PENDING
    List<Billing> findByPaymentStatus(String paymentStatus);
}
