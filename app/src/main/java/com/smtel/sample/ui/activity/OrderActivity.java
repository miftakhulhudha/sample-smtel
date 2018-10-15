package com.smtel.sample.ui.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.smtel.sample.R;
import com.smtel.sample.databinding.OrderActivityBinding;
import com.smtel.sample.viewmodel.OrderViewModel;

public class OrderActivity extends AppCompatActivity {

    private OrderActivityBinding binding;
    private OrderViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.order_activity);
        viewModel = ViewModelProviders.of(this).get(OrderViewModel.class);

        binding.setViewModel(viewModel);
    }

    public void order(View view) {
        Intent intent = new Intent(this, OrderResponseActivity.class);
        intent.putExtra("orderDetail", viewModel.getOrderDetail());
        startActivity(intent);
    }
}
