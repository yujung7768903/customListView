package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] date = {"2017-01-03", "1965-02-23", "2016-04-13", "2010-01-01", "2017-06-20",
                "2012-07-08", "1980-04-14", "2016-09-26", "2014-10-11", "2010-12-24"};
        ArrayList<ItemData> item = new ArrayList<ItemData>();
        for (int i = 0; i < 10; i++) {
            ItemData data = new ItemData();
            data.title = "데이터" + (i);
            data.date = date[i];
            item.add(data);
        }
        listView = (ListView) findViewById(R.id.listView);
        ListAdapter listAdapter = new ListAdapter(item);
        listView.setAdapter(listAdapter);
    }
}