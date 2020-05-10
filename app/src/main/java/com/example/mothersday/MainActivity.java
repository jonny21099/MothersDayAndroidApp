package com.example.mothersday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView dateTimeDisplay;
    private TextView messageCon;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;
    private Button continuebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTimeDisplay = (TextView)findViewById(R.id.date);
        continuebutton = (Button)findViewById(R.id.button);
        messageCon = (TextView)findViewById(R.id.message);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("MM/dd");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
        if(date.equals("05/10")){
            continuebutton.setVisibility(View.VISIBLE);
            messageCon.setText("You may continue");
        }
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, NameInput.class);
                startActivity(a);
            }
        });
    }
}
