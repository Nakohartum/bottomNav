package com.example.firstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_calculator, container, false);
        Button button = view.findViewById(R.id.btnCalc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    private void Calculate(){
        TextView resText = (TextView)view.findViewById(R.id.txtRes);
        EditText operation = (EditText) view.findViewById(R.id.editTextSign);
        EditText value = (EditText) view.findViewById(R.id.editTextNumberSigned);
        double res = Double.valueOf(resText.getText().toString());
        double valueNumber = Double.valueOf(value.getText().toString());
        String operationString = operation.getText().toString();
        if (operationString.equals("+")){
            res += valueNumber;
        }
        else if (operationString.equals("-")){
            res -= valueNumber;
        }
        else if (operationString.equals("*")){
            res *= valueNumber;
        }
        else if (operationString.equals("/")){
            if (valueNumber == 0){
                res = 0;
            }
            else{
                res /= valueNumber;
            }
        }

        resText.setText(""+res);
    }


}