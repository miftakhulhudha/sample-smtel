package com.smtel.sample.ui.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.smtel.sample.R;
import com.smtel.sample.core.BaseActivity;
import com.smtel.sample.databinding.OrderResponseActivityBinding;
import com.smtel.sample.model.OrderDetail;
import com.smtel.sample.viewmodel.OrderResponseViewModel;

public class OrderResponseActivity extends BaseActivity {

    private OrderResponseActivityBinding binding;
    private OrderResponseViewModel orderResponseViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.order_response_activity);
        orderResponseViewModel = ViewModelProviders.of(this).get(OrderResponseViewModel.class);

        setupToolbar(binding.toolbar, "Detail Pesanan");

        OrderDetail orderDetail = (OrderDetail) getIntent().getSerializableExtra("orderDetail");
        orderResponseViewModel.setOrderDetail(orderDetail);

        binding.setResOrder(orderResponseViewModel.getOrderResponse());
    }


    public void confirmOrder(View view) {
        startActivity(new Intent(this, PaymentActivity.class));
    }
}
