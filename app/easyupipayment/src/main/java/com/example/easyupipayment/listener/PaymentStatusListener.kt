package com.example.easyupipayment.listener

import com.example.easyupipayment.model.TransactionDetails

interface PaymentStatusListener {

    fun onTransactionCompleted(transactionDetails : TransactionDetails)

    fun onTransactionCancelled()
}