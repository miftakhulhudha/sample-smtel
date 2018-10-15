package com.smtel.sample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.View;

import com.smtel.sample.AppAplication;
import com.smtel.sample.R;
import com.smtel.sample.model.OrderDetail;

public class OrderViewModel extends AndroidViewModel {

    public enum ItemType {
        K1, K5, K10, K15, K20, K25, K50, K100
    }

    private OrderDetail orderDetail;

    public OrderViewModel(@NonNull Application application) {
        super(application);
        orderDetail = new OrderDetail();
    }

    public void selectItem(View view, ItemType itemType) {
        switch (itemType) {
            case K1:
                int valk1 = orderDetail.getK1() == 0 ? 1 : 0;
                orderDetail.setK1(valk1);
                break;
            case K5:
                int valk5 = orderDetail.getK5() == 0 ? 1 : 0;
                orderDetail.setK5(valk5);
                break;
            case K10:
                int valk10 = orderDetail.getK10() == 0 ? 1 : 0;
                orderDetail.setK10(valk10);
                break;
            case K15:
                int valk15 = orderDetail.getK15() == 0 ? 1 : 0;
                orderDetail.setK15(valk15);
                break;
            case K20:
                int valk20 = orderDetail.getK20() == 0 ? 1 : 0;
                orderDetail.setK20(valk20);
                break;
            case K25:
                int valk25 = orderDetail.getK25() == 0 ? 1 : 0;
                orderDetail.setK25(valk25);
                break;
            case K50:
                int valk50 = orderDetail.getK50() == 0 ? 1 : 0;
                orderDetail.setK50(valk50);
                break;
            case K100:
                int valk100 = orderDetail.getK100() == 0 ? 1 : 0;
                orderDetail.setK100(valk100);
                break;
        }
        CardView card = (CardView) view;

        int currentColor = card.getCardBackgroundColor().getDefaultColor();
        int whiteColor = ContextCompat.getColor(AppAplication.getInstance(), R.color.colorWhite);
        int greyColor = ContextCompat.getColor(AppAplication.getInstance(), R.color.colorBlueGrey100);

        if (currentColor == whiteColor) {
            card.setCardBackgroundColor(greyColor);
        } else
            card.setCardBackgroundColor(whiteColor);
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }
}
