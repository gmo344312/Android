package com.example.buuton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Khai báo biến
    TextView textView;
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ Tên biên - kiểu dl- Mục tiêu (ID)
        textView = (TextView) findViewById(R.id.textView);
        btnclick = (Button) findViewById(R.id.button);

        //Code (Xử lí)
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Bạn đã đổi chữ thành công");
            }
        });

    }
}