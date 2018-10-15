package com.smtel.sample.ui.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.smtel.sample.R;
import com.smtel.sample.core.BaseActivity;
import com.smtel.sample.databinding.PaymentConfirmActivityBinding;
import com.smtel.sample.viewmodel.PaymentViewModel;

public class PaymentActivity extends BaseActivity {

    private PaymentConfirmActivityBinding binding;
    private PaymentViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.payment_confirm_activity);
        viewModel = ViewModelProviders.of(this).get(PaymentViewModel.class);

        setupToolbar(binding.toolbar, "Pembayaran");

        binding.setPayment(viewModel.getPayment());
    }
}
