package com.example.randomkpt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText EditMin, EditMax;
    Button button;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AS();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get chuoi nhap vao
                String chuoi1 = EditMin.getText().toString().trim();
                String chuoi2 = EditMax.getText().toString().trim();
                //Ép chưởi to String -> Int
                int Min= Integer.parseInt(chuoi1);
                int Max= Integer.parseInt(chuoi2);
                //tạo hàm random
                if(chuoi1.isEmpty() && chuoi2.isEmpty() ){
                    Toast.makeText(MainActivity.this, "Vui long nhap du so", Toast.LENGTH_SHORT).show();
                }else {
                    Random random = new Random();
                    int number = random.nextInt(Max - Min + 1) + Min;
                    result.setText(String.valueOf(number));
                }

            }
        });
    }
    private void AS(){
        EditMin = (EditText) findViewById(R.id.EditMin);
        EditMax = (EditText) findViewById(R.id.EditMax);
        button = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.Result);
    }
}
