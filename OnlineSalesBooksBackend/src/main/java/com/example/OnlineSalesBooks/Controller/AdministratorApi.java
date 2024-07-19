package com.example.OnlineSalesBooks.Controller;

import com.example.OnlineSalesBooks.Model.Administrator;
import com.example.OnlineSalesBooks.Service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrators")
public class AdministratorApi {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping
    public List<Administrator> getAllAdministrators() {
        return administratorService.getAllAdministrators();
    }

    @GetMapping("/{id}")
    public Administrator getAdministratorById(@PathVariable Long id) {
        return administratorService.getAdministratorById(id);
    }

    @PostMapping
    public Administrator createAdministrator(@RequestBody Administrator administrator) {
        return administratorService.saveAdministrator(administrator);
    }

    @PutMapping("/{id}")
    public Administrator updateAdministrator(@PathVariable Long id, @RequestBody Administrator administrator) {
        administrator.setId(id);
        return administratorService.saveAdministrator(administrator);
    }

    @DeleteMapping("/{id}")
    public void deleteAdministrator(@PathVariable Long id) {
        administratorService.deleteAdministrator(id);
    }
}

