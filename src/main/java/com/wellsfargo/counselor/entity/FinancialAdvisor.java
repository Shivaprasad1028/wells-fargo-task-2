package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String businessHours;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String firstName, String lastName, String email, String phoneNumber, String businessHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.businessHours = businessHours;
    }
    
}
