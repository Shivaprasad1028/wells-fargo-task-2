package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Id;
@Entity
public class Security {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    private String name;
    private String category;
    private LocalDate purchaseDate;
    private double purchasePrice;
    private int quantity;

    public Security() {}

    public Security(Portfolio portfolio, String name, String category, LocalDate purchaseDate, double purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
}
