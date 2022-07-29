package com.example.regestordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameED,contactED,emailED,passED;
    Button submit;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameED = findViewById(R.id.name_id);
        contactED = findViewById(R.id.contact_id);
        emailED = findViewById(R.id.email_id);
        passED = findViewById(R.id.pass_is);
        submit = findViewById(R.id.BTNclick);
        check=findViewById(R.id.checkbox);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if(checked){
                    Toast.makeText(MainActivity.this, "checked", Toast.LENGTH_SHORT).show();
                }
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameED.getText().toString();
                String con = contactED.getText().toString();
                String email = emailED.getText().toString();
                String pass = passED.getText().toString();

                if(check.equals(""))
                {
                    check.setError("First Check Term And Condtion");
                }
               else  if(name.equals(""))
                {
                    nameED.setError("Pls Enter Name");
                }
                else if(con.equals(""))
                {
                    contactED.setError("Pls Enter contact number");
                }
                else if(email.equals(""))
                {
                    emailED.setError("Pls Enter email Address");
                }
                else if(pass.equals(""))
                {
                    passED.setError("Pls Enter passsword");
                }
                else {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("name", name);
                    i.putExtra("contact", con);
                    i.putExtra("email", email);
                    i.putExtra("password",pass);
                    startActivity(i);
                }
            }
        });
    }
}