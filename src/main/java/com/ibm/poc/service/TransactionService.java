package com.ibm.poc.service;

import com.ibm.poc.entity.Transaction;
import com.ibm.poc.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getProcessedTransactions() {
        return transactionRepository.findByStatus("processed");
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

}
