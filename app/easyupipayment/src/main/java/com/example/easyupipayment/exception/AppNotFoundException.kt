package com.example.easyupipayment.exception

import java.lang.Exception

class AppNotFoundException(appPackage:String?):Exception ("""NO UPI app${appPackage?.let { "with package name '$it'" }?:""} 
    exists on this device to perform this transaction """.trimMargin())