package com.example.OnlineSalesBooks.Repository;

import com.example.OnlineSalesBooks.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
