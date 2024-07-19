package com.example.OnlineSalesBooks.Repository;

import com.example.OnlineSalesBooks.Model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
