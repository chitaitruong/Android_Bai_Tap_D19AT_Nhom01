package com.example.androidappd19cqat01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainDetail extends AppCompatActivity {

    ImageView ivHinh;
    EditText edtHoTen, edtNgaySinh, edtMaSV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detail);
        setControl();
        setEvent();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setControl() {
        ivHinh = findViewById(R.id.ivHinh);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtMaSV = findViewById(R.id.edtMaSV);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
    }
    private void setEvent() {
        SinhVien sv = (SinhVien) getIntent().getSerializableExtra("msg");
        if (sv.getSex()) {
            ivHinh.setImageResource(R.drawable.baseline_man_50);
        } else {
            ivHinh.setImageResource(R.drawable.baseline_woman_50);
        }
        edtMaSV.setText(sv.getId());
        edtHoTen.setText(sv.getName());
        edtNgaySinh.setText(sv.getBirthDate());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                break;
            case R.id.mnThongBao:
                Toast.makeText(this, "Thong bao", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnPrint:
                Toast.makeText(this, "In", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail,menu);
        return super.onCreateOptionsMenu(menu);
    }
}