package com.example.mothersday;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NameInput extends AppCompatActivity {
    private EditText nameInput;
    private String motherName;
    private Button buttonCon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_input);
        nameInput = (EditText)findViewById(R.id.name);
        buttonCon = (Button)findViewById(R.id.continue2);
        buttonCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                motherName = nameInput.getText().toString().toLowerCase();
                if (motherName.equals("mindy")) {
                    Intent a = new Intent(NameInput.this, MainMessage.class);
                    startActivity(a);
                } else {
                    Intent a = new Intent(NameInput.this, ErrorMessage.class);
                    startActivity(a);
                }
            }
        });
    }
}
