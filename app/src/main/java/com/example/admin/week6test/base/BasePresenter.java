package com.example.admin.week6test.base;

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
