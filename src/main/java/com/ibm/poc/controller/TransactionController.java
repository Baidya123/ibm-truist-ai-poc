package com.ibm.poc.controller;

import com.ibm.poc.entity.Transaction;
import com.ibm.poc.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/processedTransactions")
    public List<Transaction> getProcessedTransactions() {
        return transactionService.getProcessedTransactions();
    }

    @GetMapping("/allTransactions")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
