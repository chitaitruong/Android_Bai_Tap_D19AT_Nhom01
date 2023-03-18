package com.example.androidappd19cqat01;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class DangNhapFragment extends Fragment {
    EditText edtUsername;
    EditText edtPassword;
    Button btnLogin;
    ProgressBar progressBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dang_nhap, container, false);
        setControl(view);
        setEvent();
        return view;
    }

    private void setEvent() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*ProgressDialog progressDialog = new ProgressDialog(getContext());
                progressDialog.setMessage("Kiem tra...");
                progressDialog.setTitle("Dang nhap");
                progressDialog.show();
                progressDialog.setCancelable(false);*/
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setMax(90);
                CountDownTimer countDownTimer = new CountDownTimer(5000, 500) {
                    @Override
                    public void onTick(long l) {
                        int value = progressBar.getProgress() + 10;
                        progressBar.setProgress(value);
                    }
                    @Override
                    public void onFinish() {
                        dangNhap();
                        progressBar.setVisibility(View.GONE);
                        progressBar.setProgress(0);
                    }
                }.start();
            }
        });
    }

    private void dangNhap() {
        if (edtPassword.getText().toString().equals("270901") && edtUsername.getText().toString().equals("admin")) {
            Toast.makeText(getContext(), "Login successes", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), "Username or password is incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    private void setControl(View view) {
        edtUsername = view.findViewById(R.id.edtUsername);
        edtPassword = view.findViewById(R.id.edtPassword);
        btnLogin = view.findViewById(R.id.btnLogin);
        progressBar = view.findViewById(R.id.pjb);
    }

}