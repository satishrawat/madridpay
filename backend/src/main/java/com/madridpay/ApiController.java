package com.madridpay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/connection-status")
    public String checkConnection() {
        // This could be extended to check the DB connection
        boolean isDbConnected = DatabaseConnection.testConnection();
        if (isDbConnected) {
            return "MadridPay Backend API is connected to the DB successfully!";
        } else {
            return "Failed to connect to the database in MadridPay.";
        }
    }
}

