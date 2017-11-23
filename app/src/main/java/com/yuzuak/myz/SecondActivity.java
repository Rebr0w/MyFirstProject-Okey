package com.yuzuak.myz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by YUZUAK on 19.11.2017.
 */

public class SecondActivity extends AppCompatActivity {
    TextView takim1;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.second_layout);
        TextView takim1 = (TextView) findViewById(R.id.takim1);
        Intent intent = getIntent();
        takim1.setText(intent.getStringExtra("takimadi"));


    }
}
