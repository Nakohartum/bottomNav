package com.example.firstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleSquare extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_triangle_square, container, false);
        Button button = view.findViewById(R.id.calcSquareButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate();
            }
        });
        return view;
    }

    private void Calculate(){
        EditText aText = view.findViewById(R.id.editTextA);
        EditText bText = view.findViewById(R.id.editTextB);
        EditText cText = view.findViewById(R.id.editTextC);
        double aValue = Double.valueOf(aText.getText().toString());
        double bValue = Double.valueOf(bText.getText().toString());
        double cValue = Double.valueOf(cText.getText().toString());
        double p = aValue + bValue + cValue;
        p /= 2;
        double res = Math.sqrt(p * (p - aValue) * (p - bValue) * (p - cValue));
        TextView textRes = view.findViewById(R.id.textRes);
        textRes.setText(""+res);
    }
}