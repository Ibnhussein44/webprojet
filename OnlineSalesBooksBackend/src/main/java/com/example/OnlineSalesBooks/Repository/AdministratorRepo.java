package com.example.OnlineSalesBooks.Repository;

import com.example.OnlineSalesBooks.Model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepo extends JpaRepository<Administrator, Long> {
    Administrator findByUsername(String username);
}
