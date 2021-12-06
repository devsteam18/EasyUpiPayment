package com.example.easyupipayment

import com.example.easyupipayment.listener.PaymentStatusListener

internal object Singleton {

    @get:JvmSynthetic

    internal var listener : PaymentStatusListener? = null
}