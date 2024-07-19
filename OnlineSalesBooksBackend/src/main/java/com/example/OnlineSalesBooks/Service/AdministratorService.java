package com.example.OnlineSalesBooks.Service;

import com.example.OnlineSalesBooks.Model.Administrator;
import com.example.OnlineSalesBooks.Repository.AdministratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepo administratorRepo;

    public List<Administrator> getAllAdministrators() {
        return administratorRepo.findAll();
    }

    public Administrator getAdministratorById(Long id) {
        return administratorRepo.findById(id).orElse(null);
    }

    public Administrator saveAdministrator(Administrator administrator) {
        return administratorRepo.save(administrator);
    }

    public void deleteAdministrator(Long id) {
        administratorRepo.deleteById(id);
    }
}
