package com.smtel.sample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.smtel.sample.model.DetailTrx;
import com.smtel.sample.model.OrderDetail;
import com.smtel.sample.model.Payment;
import com.smtel.sample.model.ResponseOrder;

import java.util.Date;

public class PaymentViewModel extends AndroidViewModel {

    private Payment payment;

    public PaymentViewModel(@NonNull Application application) {
        super(application);
        payment = new Payment();


        payment.setId(2497);
        payment.setStatus("ordered");
        payment.setInvoiceId("MKS22497");
        payment.setMcc(1);
        payment.setMnc(2);
        payment.setLac(2);
        payment.setCid(2);
        payment.setProductId(1344);
        payment.setUserId(31);
        payment.setPhoneNumber("081249000808");
        payment.setAmount("6200");
    }

    public Payment getPayment() {
        return payment;
    }

}
