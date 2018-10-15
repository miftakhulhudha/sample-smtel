package com.smtel.sample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.View;

import com.smtel.sample.AppAplication;
import com.smtel.sample.R;
import com.smtel.sample.core.model.Response;
import com.smtel.sample.model.DetailTrx;
import com.smtel.sample.model.OrderDetail;
import com.smtel.sample.model.ResponseOrder;

import java.util.Date;

public class OrderResponseViewModel extends AndroidViewModel {

    private ResponseOrder orderResponse;

    public OrderResponseViewModel(@NonNull Application application) {
        super(application);
        orderResponse = new ResponseOrder();
    }

    public void setOrderDetail (OrderDetail orderDetail) {
        ResponseOrder resOrder = new ResponseOrder();
        resOrder.setId(2497);
        resOrder.setStatus("ordered");
        resOrder.setInvoiceId("MKS22497");
        resOrder.setMcc(1);
        resOrder.setMnc(2);
        resOrder.setLac(2);
        resOrder.setCid(2);
        resOrder.setProductId(1344);
        resOrder.setUserId(31);
        resOrder.setPhoneNumber("081249000808");
        resOrder.setClientId(2);
        resOrder.setMkiosOrderDetail(orderDetail);
        resOrder.setUpdatedAt(new Date());
        resOrder.setCreatedAt(new Date());
        resOrder.setServerTrxId(140);
        resOrder.setSrcMessage("Transaction succesfully");
        resOrder.setHpp(0);
        resOrder.setAdminFee(0);

        DetailTrx detailTrx = new DetailTrx();
        detailTrx.setReffId(140);
        detailTrx.setK1(1200);
        detailTrx.setK5(5000);
        detailTrx.setK10(0);
        detailTrx.setK15(0);
        detailTrx.setK20(0);
        detailTrx.setK25(0);
        detailTrx.setK50(0);
        detailTrx.setK100(0);
        detailTrx.setAmount(6200);

        resOrder.setAmount(6200);
        resOrder.setMkiosDetailTrx(detailTrx);

        orderResponse = resOrder;
    }

    public ResponseOrder getOrderResponse() {
        return orderResponse;
    }
}
