package com.ibm.poc.entity;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private String amount;
    private String debitAcc;
    private String creditAcc;
    private String lob;
    private String txnType;
    private String txnFreqType;
    private String cifKey;
    private String status;
    private Date createDate;
    private Date settlementDate;

    // Getters and setters
}
