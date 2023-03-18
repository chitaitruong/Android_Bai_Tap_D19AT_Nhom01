package com.example.androidappd19cqat01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class SettingFragment extends Fragment {

    SeekBar seekBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        setControl(view);
        setEvent();
        return view;
    }

    private void setEvent() {
    }

    private void setControl(View view) {
        seekBar = view.findViewById(R.id.seekbar1);
    }
}