package com.example.admin.week6test.view.first_activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.week6test.NativeClient;
import com.example.admin.week6test.R;
import com.example.admin.week6test.view.second_activity.SecondActivity;
import com.example.admin.week6test.model.ItemsItem;
import com.example.admin.week6test.model.WalmartResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback, FirstActivityContract.View
{
    FirstActivityPresenter pressenter;
    public static final String BASE_URL = "http://api.walmartlabs.com/";

    ListView lvItems;
    ArrayAdapter<String> adatper;
    List<ItemsItem> items = new ArrayList<>();

    String nextPage = "v1/paginated/items?format=json&apiKey=cq5ahnuwgs9a4erxqvjmu43r";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressenter = new FirstActivityPresenter();
        lvItems = findViewById(R.id.lvItems);
        adatper = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lvItems.setAdapter(adatper);
        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                ItemsItem item = items.get(position);
                intent.putExtra("item", item);
                startActivity(intent);
            }
        });

        new NativeClient(BASE_URL + nextPage, new Handler(this)).start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        pressenter.attachView(this);
        pressenter.getData();
    }

    @Override
    public boolean handleMessage(Message msg)
    {
        Gson gson = new Gson();
        WalmartResponse results = gson.fromJson(msg.getData().getString("content"), WalmartResponse.class);
        nextPage = results.getNextPage();
        for (ItemsItem item : results.getItems())
        {
            adatper.add(item.toString());
            items.add(item);
        }
        adatper.notifyDataSetChanged();
        return false;
    }

    public void btnLoad_Clicked(View view) {
        pressenter.getData();
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void getData() {
        new NativeClient(BASE_URL + nextPage, new Handler(this)).start();
    }
}
