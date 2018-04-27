package com.example.admin.week6test.view.second_activity;

import com.example.admin.week6test.view.first_activity.FirstActivityContract;

public class SecondActivityPresenter implements SceondActivityContract.Presenter{
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
