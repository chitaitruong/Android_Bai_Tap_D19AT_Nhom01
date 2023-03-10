package com.example.androidappd19cqat01;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapterSV extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<SinhVien> data;
    ArrayList<SinhVien> data_temp = new ArrayList<>();
    public CustomAdapterSV(@NonNull Context context, int resource, @NonNull ArrayList<SinhVien> data) {
        super(context,resource,data);
        this.context = context;
        this.resource = resource;
        this.data = data;
        data_temp.addAll(data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, null);
            viewHolder.ivGioiTinh = convertView.findViewById(R.id.ivGioiTinh);
            viewHolder.tvHoTen = convertView.findViewById(R.id.tvHT);
            viewHolder.cbChon = convertView.findViewById(R.id.cbGioiTinh);
            viewHolder.btnInfo = convertView.findViewById(R.id.btnInfo);
            viewHolder.btnCall = convertView.findViewById(R.id.btnCall);
            viewHolder.btnMessage = convertView.findViewById(R.id.btnMessage);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SinhVien sv = data.get(position);
        viewHolder.tvHoTen.setText(sv.getName());
        if (sv.getSex()) {
            viewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_man_50);
            //viewHolder.cbChon.setChecked(true);
        } else {
            viewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_woman_50);
            //viewHolder.cbChon.setChecked(false);
        }
        if (sv.getSelected()) {
            viewHolder.cbChon.setChecked(true);
            viewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_man_50);
        } else {
            viewHolder.cbChon.setChecked(false);
            viewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_woman_50);
        }
        ViewHolder finalViewHolder = viewHolder;
        viewHolder.cbChon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (finalViewHolder.cbChon.isChecked()) {
                    sv.setSelected(true);
                    finalViewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_man_50);
                } else {
                    sv.setSelected(false);
                    finalViewHolder.ivGioiTinh.setImageResource(R.drawable.baseline_woman_50);
                }
            }
        });
        viewHolder.btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainDetail.class);
                intent.putExtra("msg", sv);
                context.startActivity(intent);
            }
        });
        viewHolder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0965221516"));
                context.startActivity(intent);
            }
        });
        viewHolder.btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.putExtra("sms_body", "Chao ban");
                intent.setData(Uri.parse("sms:0965221516"));
                context.startActivity(intent);
            }
        });
        return convertView;
    }
    private class ViewHolder {
        ImageView ivGioiTinh;
        TextView tvHoTen;
        CheckBox cbChon;
        ImageButton btnCall, btnInfo, btnMessage;

    }
    public void search(String msg) {
        data_temp.addAll(data);
        data.clear();
        if (msg.isEmpty()) {
            data.addAll(data_temp);
        } else {
            for( SinhVien sv : data_temp){
                if (sv.getName().contains(msg)) {
                    data.add(sv);
                }
            }
        }
        notifyDataSetChanged();
    }
    public void chonTatCa() {
        for (SinhVien sv:
             data) {
            sv.setSelected(true);
        }
        notifyDataSetChanged();
    }
    public void boChonTatCa() {
        for (SinhVien sv:
                data) {
            sv.setSelected(false);
        }
        notifyDataSetChanged();
    }
    public void xoaDL() {
        data.clear();
        for (SinhVien sv: data_temp) {
            if (!sv.getSelected()) {
                data.add(sv);
            }
        }
        notifyDataSetChanged();
    }
}
