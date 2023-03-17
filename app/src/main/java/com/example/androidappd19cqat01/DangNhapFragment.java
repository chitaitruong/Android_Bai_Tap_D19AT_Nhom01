package com.example.androidappd19cqat01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhapFragment extends Fragment {
    EditText edtUsername;
    EditText edtPassword;
    Button btnLogin;
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
                if (edtPassword.getText().toString().equals("270901") && edtUsername.getText().toString().equals("admin")) {
                    Toast.makeText(getContext(), "Login successes", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Username or password is incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setControl(View view) {
        edtUsername = view.findViewById(R.id.edtUsername);
        edtPassword = view.findViewById(R.id.edtPassword);
        btnLogin = view.findViewById(R.id.btnLogin);
    }

}