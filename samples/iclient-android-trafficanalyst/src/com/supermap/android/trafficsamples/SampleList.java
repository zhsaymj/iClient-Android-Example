package com.supermap.android.trafficsamples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SampleList extends ListActivity {
    private Class<?>[] samples = { 
            TrafficTransferAnalystDemo.class, 
            NetworkAnalystDemo.class
            };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView lv = this.getListView();
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getStringArray()));
    }

    /**
     * 获取要显示的示范程序名列表
     */
    private String[] getStringArray() {
        return getResources().getStringArray(R.array.simple_names);
    }

    /**
     * 点击列表项时启动对应示范程序
     */
    public void onListItemClick(ListView parent, View v, int position, long id) {
        Intent myIntent = new Intent(SampleList.this, samples[position]);
        myIntent.putExtras(this.getIntent().getExtras());
        this.startActivity(myIntent);
    }
}
