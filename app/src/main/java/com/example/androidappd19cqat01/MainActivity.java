package com.example.androidappd19cqat01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //main
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnBai7, btnBai8;
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
    //bai 6
    ImageView imgV1, imgV2;
    ToggleButton tgBtn1;
    Switch sw1;
    //bai 7
    EditText edtHvT, edtSDT;
    EditText edtNgay, edtGio;
    Spinner spnPhuongTien;
    ArrayList<String> dsPhuongTien = new ArrayList<>();
    ArrayAdapter adapterPhuongTien;
    AutoCompleteTextView actvTinh;
    String[] dsTinh = {"Hà Nội", "Hồ Chí Minh", "Tây Ninh"};
    ArrayAdapter adapterTinh;
    Button btnDangKy, btnThoat;
    //ngay_3_3
    ListView lvDanhSach;
    ArrayList<SinhVien> data_SV = new ArrayList<>();
    ArrayAdapter adapterDSSV;
    CustomAdapterSV customAdapterSV;
    EditText edtMSV,edtTSV,edtNSSV;
    RadioButton rbNam, rbNu;
    Button btnAdd, btnDelete, btnEdit, btnExit;
    SinhVien sv;
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
        btnBai6 = findViewById(R.id.btnBai6);
        btnBai7 = findViewById(R.id.btnBai7);
        btnBai8 = findViewById(R.id.btnBai8);
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
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.baitap);
                setControlBai6();
                setEventBai6();
            }
        });
        btnBai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.baitap7);
                setControlBai7();
                setEventBai7();
            }
        });
        btnBai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.ngay_3_3);
                setConTrolNgay33();
                setEventNgay33();
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
    private void setControlBai6() {
        tgBtn1 = findViewById(R.id.tgBtn1);
        imgV1 = findViewById(R.id.imgV1);
        sw1 = findViewById(R.id.sw1);
        imgV2 = findViewById(R.id.imgV2);
    }
    private void setEventBai6() {
        tgBtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (tgBtn1.isChecked()) {
                    imgV1.setImageResource(R.drawable.img);
                    Toast.makeText(MainActivity.this, tgBtn1.getTextOn().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    imgV1.setImageResource(R.drawable.img_1);
                    Toast.makeText(MainActivity.this, tgBtn1.getTextOff().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sw1.isChecked()) {
                    imgV2.setImageResource(R.drawable.img_3);
                    Toast.makeText(MainActivity.this, sw1.getTextOn().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    imgV2.setImageResource(R.drawable.img_2);
                    Toast.makeText(MainActivity.this, sw1.getTextOff().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void setControlBai7(){
        edtHvT = findViewById(R.id.edtHvT);
        edtSDT = findViewById(R.id.edtSDT);
        edtNgay = findViewById(R.id.edtNgay);
        edtGio = findViewById(R.id.edtGio);
        spnPhuongTien = findViewById(R.id.spnPhuongTien);
        actvTinh = findViewById(R.id.actvTinh);
        btnDangKy = findViewById(R.id.btnDangKy);
        btnThoat = findViewById(R.id.btnThoat);
    }
    private void setEventBai7(){
        khoiTaoDsPhuongTien();
        adapterPhuongTien = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dsPhuongTien);
        spnPhuongTien.setAdapter(adapterPhuongTien);
        adapterTinh = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dsTinh);
        actvTinh.setAdapter(adapterTinh);
        edtNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChonNgay();
            }
        });
        edtGio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChonGio();
            }
        });
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg += edtHvT.getText().toString() + "\n";
                msg += edtSDT.getText().toString() + "\n";
                msg += actvTinh.getText().toString() + "\n";
                msg += edtNgay.getText().toString() + "\n";
                msg += edtGio.getText().toString() + "\n";
                msg += (String)spnPhuongTien.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                DangKy(msg);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThongBaoThoat();
            }
        });
    }
    private void ChonNgay() {
        Calendar calendar = Calendar.getInstance();
        int nam = calendar.get(Calendar.YEAR);
        int thang = calendar.get(Calendar.MONTH);
        int ngay = calendar.get(Calendar.DATE);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                calendar.set(i,i1,i2);
                edtNgay.setText(simpleDateFormat.format(calendar.getTime()));
            }
        }, nam, thang, ngay);
        datePickerDialog.show();
    }
    private void ChonGio() {
        Calendar calendar = Calendar.getInstance();
        int gio = calendar.get(Calendar.HOUR);
        int phut = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                calendar.set(0,0,0, i, i1);
                edtGio.setText(simpleDateFormat.format(calendar.getTime()));
            }
        }, gio, phut, true);
        timePickerDialog.show();
    }
    private void DangKy(String msg) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dangky);
        TextView tv = dialog.findViewById(R.id.tvThongTin);
        Button btn = dialog.findViewById(R.id.btnDangKy);
        tv.setText(msg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    private void ThongBaoThoat() {
        AlertDialog.Builder thongBaoThoat = new AlertDialog.Builder(this);
        thongBaoThoat.setMessage("Bạn muốn thoát?");
        thongBaoThoat.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        thongBaoThoat.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        thongBaoThoat.show();
    }
    private void khoiTaoDsPhuongTien() {
        dsPhuongTien.add("Máy bay");
        dsPhuongTien.add("Xe máy");
        dsPhuongTien.add("Ô tô");
    }
    private void setConTrolNgay33() {
        lvDanhSach = findViewById(R.id.lvDanhSach);
        edtMSV = findViewById(R.id.edtMSV);
        edtTSV = findViewById(R.id.edtTSV);
        edtNSSV = findViewById(R.id.edtNSSV);
        rbNam = findViewById(R.id.rbNam);
        rbNu = findViewById(R.id.rbNu);
        btnAdd = findViewById(R.id.btnAdd);
        btnDelete = findViewById(R.id.btnDelete);
        btnEdit = findViewById(R.id.btnEdit);
        btnExit = findViewById(R.id.btnExit);
    }
    private void setEventNgay33() {
        khoitaoDSSV();
        customAdapterSV = new CustomAdapterSV(this, R.layout.layout_sinhvien, data_SV);
        lvDanhSach.setAdapter(customAdapterSV);
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                sv = data_SV.get(i);
                String msg = sv.toString();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                chonSV();
            }
        });
        lvDanhSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                data_SV.remove(i);
                customAdapterSV.notifyDataSetChanged();
                return false;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                themSinhVien();
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data_SV.remove(sv);
                customAdapterSV.notifyDataSetChanged();
            }
        });
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sv.setId(edtMSV.getText().toString());
                sv.setName(edtTSV.getText().toString());
                sv.setBirthDate(edtNSSV.getText().toString());
                sv.setSex(rbNam.isChecked());
                customAdapterSV.notifyDataSetChanged();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void khoitaoDSSV() {
        data_SV.add(new SinhVien("N19DCAT007","Nguyễn Thế Bảo", true, "27/09/2001"));
        data_SV.add(new SinhVien("N19DCAT067","Trương Chí Tài", true, "27/09/2001"));
        data_SV.add(new SinhVien("N19DCAT074","Tạ Đức Tiến", true, "27/09/2001"));
        data_SV.add(new SinhVien("N19DCAT008","Nguyễn Thành Băng", true, "27/09/2001"));
        data_SV.add(new SinhVien("N19DCAT086","Nguyễn Minh Thuận", true, "24/09/2001"));
        data_SV.add(new SinhVien("N19DCAT038","Từ Nguyễn Quốc Huy", true, "27/09/2001"));
    }
    private void themSinhVien() {
        SinhVien sv = new SinhVien();
        sv.setId(edtMSV.getText().toString());
        sv.setName(edtTSV.getText().toString());
        sv.setBirthDate(edtNSSV.getText().toString());
        sv.setSex(rbNam.isChecked());
        data_SV.add(sv);
        customAdapterSV.notifyDataSetChanged();
    }
    private void chonSV() {
        edtMSV.setText(sv.getId().toString());
        edtTSV.setText(sv.getName().toString());
        edtNSSV.setText(sv.getBirthDate().toString());
        if (sv.getSex()) {
            rbNam.setChecked(true);
        } else {
            rbNu.setChecked(true);
        }
    }
}