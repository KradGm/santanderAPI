package com.santander.program.santanderapp.domain.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity(name = "tb_history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 13, scale = 2)
    private BigDecimal valueMoney;

    @Column(unique = false)
    private String userName;

    @Column(unique = false)
    private Date transactionDate;

    @Column(unique = false)
    private String description;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public BigDecimal getValue() {return valueMoney;}

    public void setValue(BigDecimal value) {this.valueMoney = value;}

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}

    public Date getTransactionDate() {return transactionDate;}

    public void setTransactionDate(Date transactionDate) {this.transactionDate = transactionDate;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
}
