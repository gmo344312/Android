package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName;
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        btnclick = (Button) findViewById(R.id.button);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noidung = editTextTextPersonName.getText().toString();
                Toast.makeText(MainActivity.this, noidung, Toast.LENGTH_LONG).show();
            }
        });

    }
}