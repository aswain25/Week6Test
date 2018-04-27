package com.example.admin.week6test.view.second_activity;

import com.example.admin.week6test.base.BasePresenter;
import com.example.admin.week6test.base.BaseView;
import com.example.admin.week6test.view.first_activity.FirstActivityContract;

public interface SceondActivityContract {
    //interfaec to communicate from presenter to view
    interface View extends BaseView {
        //specific methods for each view
        void getData();
    }

    interface  Presenter extends BasePresenter<FirstActivityContract.View>
            //specific method for each view's presenter
    {
        void getData();

    }
}
