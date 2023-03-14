package com.example.firstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DepositCalculator extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_deposit_calculator, container, false);
        Button button = view.findViewById(R.id.calculateDepositBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate();
            }
        });
        return view;
    }

    private void Calculate(){
        EditText depositText = view.findViewById(R.id.startingDepositEditText);
        EditText percentText = view.findViewById(R.id.percentEditText);
        EditText yearsAmountText = view.findViewById(R.id.countYearsEditText);
        TextView moneyText = view.findViewById(R.id.moneyTextView);
        double depositNumber = Double.valueOf(depositText.getText().toString());
        double percentNumber = Double.valueOf(percentText.getText().toString());
        double yearsAmountNumber = Double.valueOf(yearsAmountText.getText().toString());
        double result = (((depositNumber * (percentNumber / 100) * 30) / 360) * 12) * yearsAmountNumber + depositNumber;
        moneyText.setText(""+result);
    }
}