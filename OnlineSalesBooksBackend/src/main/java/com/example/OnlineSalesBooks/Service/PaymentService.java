package com.example.OnlineSalesBooks.Service;

import com.example.OnlineSalesBooks.Model.Payment;
import com.example.OnlineSalesBooks.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }

    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepo.findById(id);
    }

    public Payment savePayment(Payment payment) {
        return paymentRepo.save(payment);
    }

    public void deletePayment(Long id) {
        paymentRepo.deleteById(id);
    }
}
