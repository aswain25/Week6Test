package com.example.admin.week6test.view.first_activity;

import android.os.Message;

import com.example.admin.week6test.base.BaseView;

public class FirstActivityPresenter  implements FirstActivityContract.Presenter{
    FirstActivityContract.View view;

    @Override
    public void getData() {
        view.getData();
    }

    @Override
    public void attachView(FirstActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
