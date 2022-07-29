package com.example.regestordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.name_TV);
        t2 = findViewById(R.id.con_TV);
        t3 = findViewById(R.id.email_TV);
        t4 = findViewById(R.id.pass_TV);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String con = i.getStringExtra("contact");
        String email = i.getStringExtra("email");
        String pass = i.getStringExtra("password");

        t1.setText(name);
        t2.setText(con);
        t3.setText(email);
        t4.setText(pass);

        btn1=findViewById(R.id.btnsubmit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

    }
}