package com.example.regestordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    RadioGroup radioGroup;
    SeekBar seekBar;
    TextView textView;
    Switch aSwitch;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        radioGroup = findViewById(R.id.radioGroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.male_id:
                        Toast.makeText(MainActivity3.this, "Male selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.female_id:
                        Toast.makeText(MainActivity3.this, "Female", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        seekBar = findViewById(R.id.seekbar_id);
        textView = findViewById(R.id.text_id);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText("Percenteage : "+String.valueOf(i)+" %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        aSwitch = findViewById(R.id.switch_id);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity3.this, "Switch ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity3.this, "Switch OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ratingBar = findViewById(R.id.rating_id);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(MainActivity3.this, String.valueOf(v), Toast.LENGTH_SHORT).show();
            }
        });
    }
}