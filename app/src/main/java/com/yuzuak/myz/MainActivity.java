package com.yuzuak.myz;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText takimismi1, takimismi2, takimismi3, takimismi4;
    GridLayout gridtext;
    Button gonderbutton, temizlebutton;
    Switch oyunturu;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button temizlebutton = (Button) findViewById(R.id.temizlebutton);
        Button gonderbutton = (Button) findViewById(R.id.gonderbutton);
        final EditText takimismi1 = (EditText) findViewById(R.id.takimismi1);
        final EditText takimismi2 = (EditText) findViewById(R.id.takimismi2);
        final EditText takimismi3 = (EditText) findViewById(R.id.takimismi3);
        final EditText takimismi4 = (EditText) findViewById(R.id.takimismi4);
        final GridLayout gridtext = (GridLayout) findViewById(R.id.gridtext);
        Switch oyunturu = (Switch) findViewById(R.id.oyunturu);
        temizlebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takimismi1.setText("");
                takimismi2.setText("");
                takimismi3.setText("");
                takimismi4.setText("");
            }
        });

        gonderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("a", takimismi1.getText());
                startActivity(intent);
            }
        });


        gonderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (takimismi1.getText().toString().isEmpty() || takimismi2.getText().toString().isEmpty() || takimismi3.getText().toString().isEmpty() || takimismi4.getText().toString().isEmpty()) {
                    Toast.makeText(context, "LÜTFEN TAKIM İSMİ GİRİNİZ.", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(context, SecondActivity.class);
                    intent.putExtra("takimadi", takimismi1.getText());

                    startActivity(intent);
                }

            }
        });

        oyunturu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    gridtext.setVisibility(View.GONE);
                } else {
                    gridtext.setVisibility(View.VISIBLE);
                }
            }
        });
    }


}
