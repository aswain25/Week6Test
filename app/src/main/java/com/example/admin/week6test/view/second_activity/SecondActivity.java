package com.example.admin.week6test.view.second_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.week6test.R;
import com.example.admin.week6test.model.ItemsItem;

public class SecondActivity extends AppCompatActivity {
    TextView tvProductName;
    ImageView ivPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ItemsItem item = (ItemsItem) getIntent().getSerializableExtra("item");

        tvProductName = findViewById(R.id.tvProductName);
        ivPic = findViewById(R.id.ivPic);
        tvProductName.setText(item.toString());
        Glide.with(this).load(item.getMediumImage()).into(ivPic);


    }
}
