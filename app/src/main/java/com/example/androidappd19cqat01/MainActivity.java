package com.example.androidappd19cqat01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //main
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5;
    //Bai 3
    Button btnCong, btnTru, btnNhan, btnChia;
    EditText edtSo1, edtSo2;
    TextView tv1;
    //Bai 4
    Button btnDK;
    EditText edtTK, edtMK, edtNS, edtEmail;
    TextView tvTT;
    //Bai 5
    Button btnGuiTT;
    EditText edtHT, edtQQ, edtTTK;
    RadioGroup rgBC;
    CheckBox cbTT, cbDS, cbXP, cbK;
    TextView tvTTCN;
    RadioButton rbDH, rbCD, rbTC;
    //RadioButton rbBC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.frame_layout_bai1);
        //setContentView(R.layout.linear_layout_bai2);
        //setContentView(R.layout.linear_layout_bai3);
        setControl();
        setEvent();
        //setControlBai3();
        //setEventBai3();
        //setContentView(R.layout.linear_layout_bai4);
        //setControlBai4();
        //setEventBai4();
        //setContentView(R.layout.linear_layout_bai5);
        //setControlBai5();
        //setEventBai5();
    }
    private void setControl() {
        btnBai1 = findViewById(R.id.btnBai1);
        btnBai2 = findViewById(R.id.btnBai2);
        btnBai3 = findViewById(R.id.btnBai3);
        btnBai4 = findViewById(R.id.btnBai4);
        btnBai5 = findViewById(R.id.btnBai5);
    }
    private void setEvent() {
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.frame_layout_bai1);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_layout_bai2);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_layout_bai3);
                setControlBai3();
                setEventBai3();
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_layout_bai4);
                setControlBai4();
                setEventBai4();
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.linear_layout_bai5);
                setControlBai5();
                setEventBai5();
            }
        });
    }
    private void setControlBai3() {
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        tv1 = findViewById(R.id.tv1);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
    }
    private void setEventBai3() {
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
    private void setControlBai4() {
        edtTK = findViewById(R.id.edtTK);
        edtMK = findViewById(R.id.edtMK);
        edtNS = findViewById(R.id.edtNS);
        edtEmail = findViewById(R.id.edtEmail);
        btnDK = findViewById(R.id.btnDK);
        tvTT = findViewById(R.id.tvTT);
    }
    private void setEventBai4() {
        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tk = edtTK.getText().toString();
                String mk = edtMK.getText().toString();
                String ns = edtNS.getText().toString();
                String email = edtEmail.getText().toString();
                String tt = tk + "\n" + mk + "\n" + ns + "\n" + email;
                tvTT.setText(tt);
                tvTT.setBackgroundColor(Color.GREEN);
                tvTT.setTextSize(30);
            }
        });
    }
    private void setControlBai5() {
        edtHT = findViewById(R.id.edtHT);
        edtQQ = findViewById(R.id.edtQQ);
        edtTTK = findViewById(R.id.edtTTK);
        rgBC = findViewById(R.id.rgBC);
        rbDH = findViewById(R.id.rbDH);
        rbCD = findViewById(R.id.rbCD);
        rbTC = findViewById(R.id.rbTC);
        cbTT = findViewById(R.id.cbTT);
        cbDS = findViewById(R.id.cbDS);
        cbXP = findViewById(R.id.cbXP);
        cbK = findViewById(R.id.cbK);
        btnGuiTT = findViewById(R.id.btnGuiTT);
        tvTTCN = findViewById(R.id.tvTTCN);
    }
    private void setEventBai5() {
        btnGuiTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ht = edtHT.getText().toString();
                String qq = edtQQ.getText().toString();
                /*int selectedId = rgBC.getCheckedRadioButtonId();
                rbBC = (RadioButton) findViewById(selectedId);
                String bc = rbBC.getText().toString();*/
                String bc="";
                if (rbDH.isChecked())
                    bc = rbDH.getText().toString();
                if (rbCD.isChecked())
                    bc = rbCD.getText().toString();
                if (rbTC.isChecked())
                    bc = rbTC.getText().toString();
                String st="So thich: \n";
                if (cbTT.isChecked())
                    st += "+ " + cbTT.getText().toString() + "\n";
                if (cbDS.isChecked())
                    st += "+ " + cbDS.getText().toString() + "\n";
                if (cbXP.isChecked())
                    st += "+ " + cbXP.getText().toString() + "\n";
                if (cbK.isChecked())
                    st += "+ " + cbK.getText().toString() + "\n";
                String ttk = edtTTK.getText().toString();
                String tt = "Ho va ten: "+ ht + "\n" + "Que quan: " + qq + "\n" + "Bang cap: " + bc + "\n" + st + "Thong tin khac: "+ttk;
                tvTTCN.setText(tt);
                tvTTCN.setBackgroundColor(Color.GREEN);
                tvTTCN.setTextSize(15);
            }
        });
    }
}