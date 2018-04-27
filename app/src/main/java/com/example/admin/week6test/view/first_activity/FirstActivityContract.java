package com.example.admin.week6test.view.first_activity;

import android.os.Message;

import com.example.admin.week6test.base.BasePresenter;
import com.example.admin.week6test.base.BaseView;

public interface FirstActivityContract {
    //interfaec to communicate from presenter to view
    interface View extends BaseView {
        //specific methods for each view
        void getData();
    }

    interface  Presenter extends BasePresenter<View>
            //specific method for each view's presenter
    {
        void getData();

    }
}
