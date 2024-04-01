package com.c174.services.abstraccion;

import com.c174.models.market.TransactionRequest;
import com.c174.models.market.TransactionResponse;

import java.util.List;

public interface TransactionService {
    TransactionResponse getTransactionById(Long id);
    List<TransactionResponse> getTransactionsByProfile(Long id);
    TransactionResponse saveTransaction(TransactionRequest transaction);
    String deleteTransaction(Long id);
}