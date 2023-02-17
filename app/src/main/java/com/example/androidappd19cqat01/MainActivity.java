package com.example.androidappd19cqat01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.frame_layout_bai1);
        //setContentView(R.layout.linear_layout_bai2);
        setContentView(R.layout.linear_layout_bai3);
        setControl();
        setEvent();
    }
    Button btnCong, btnTru, btnNhan, btnChia;
    EditText edtSo1, edtSo2;
    TextView tv1;
    private void setControl() {
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        tv1 = findViewById(R.id.tv1);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
    }
    private void setEvent() {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int so1 = Integer.parseInt(edtSo1.getText().toString());
                int so2 = Integer.parseInt(edtSo2.getText().toString());
                float kq = so1 + so2;
                tv1.setText(String.valueOf(kq));
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int so1 = Integer.parseInt(edtSo1.getText().toString());
                int so2 = Integer.parseInt(edtSo2.getText().toString());
                float kq = so1 - so2;
                tv1.setText(String.valueOf(kq));
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int so1 = Integer.parseInt(edtSo1.getText().toString());
                int so2 = Integer.parseInt(edtSo2.getText().toString());
                float kq = so1 * so2;
                tv1.setText(String.valueOf(kq));
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int so1 = Integer.parseInt(edtSo1.getText().toString());
                int so2 = Integer.parseInt(edtSo2.getText().toString());
                float kq = so1 / so2;
                tv1.setText(String.valueOf(kq));
            }
        });
    }
}