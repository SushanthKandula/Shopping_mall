package com.example.sushanth.shopping_mall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class sub extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Bundle b=getIntent().getExtras();
        t1=findViewById(R.id.textview);
        String sub=b.getString("sublist");
        t1.setText(sub);

    }
}
