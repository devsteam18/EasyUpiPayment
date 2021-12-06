package com.example.easyupipayment.model

import java.io.Serializable

data class Payment(
    val currency:String,
    val name:String,
    val vpa:String,
    val amount:String,
  //  val tnxId:String,
    val tnxRefId:String,
    val description:String,
    val defaultPackage:String?,
    val payeeMerchantCode:String

):Serializable
