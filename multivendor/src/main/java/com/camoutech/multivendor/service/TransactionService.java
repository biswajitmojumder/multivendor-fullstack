package com.camoutech.multivendor.service;

import com.camoutech.multivendor.model.Order;
import com.camoutech.multivendor.model.Seller;
import com.camoutech.multivendor.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionsBySellerId(Seller seller);
    List<Transaction> getAllTransactions();
}
