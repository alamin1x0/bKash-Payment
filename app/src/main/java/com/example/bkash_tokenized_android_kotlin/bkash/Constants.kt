package com.example.bkash_tokenized_android_kotlin.bkash

import android.app.ProgressDialog
import androidx.lifecycle.MutableLiveData

object Constants {
    var bkashSandboxUsername = "01300587256"
    var bkashSandboxPassword = "5]D3f-fA[D{"
    var bkashSandboxAppKey = "llYZSzu6ZJb71QN3dPBGVpbOtc"
    var bkashSandboxAppSecret = "EY6Lt0XRZiJiArJ2PwlpmMK14OqrjBxB08WjQIXfY49JmuK2yHd8"
    var mode = "0011"
    var payerReference = "number"
    var callbackURL = "https://mtsbdtelecom.xyz/callback"
    var merchantAssociationInfo = ""
    var amount = "10"
    var currency = "BDT"
    var intents = "sale"
    var merchantInvoiceNumber = "Inv0124"

    var sessionIdToken = ""
    var paymentIDBkash = ""
    var searchTextInput = ""
    var pd: ProgressDialog?= null
    val liveData = MutableLiveData<Boolean>()
}
