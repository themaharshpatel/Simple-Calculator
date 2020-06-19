package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String inputText, resultText;
    String operator, operand;
    TextView resultTextView;
    List<String> operators = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.textView);
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
    }

    public void onBtnClicked(View view){
        inputText = view.getTag().toString();
        resultText = resultTextView.getText().toString();

        if(inputText.equals("AC"))
        {
            resultTextView.setText("0");
        }

        else if(operators.contains(inputText))
        {
            operand = resultText;
            String randomoper = inputText;
            resultTextView.setText(inputText);
        }
        else if(inputText.matches("[0-9]+"))
        {
            if(resultText.equals("0") || operators.contains(resultText))
            {
                resultTextView.setText(inputText);
            }
            else
            {
                resultTextView.setText(resultText+inputText);
            }
        }
        else if(inputText.equals("="))
        {
            int num1 = Integer.parseInt(operand);
            int num2 = Integer.parseInt(resultText);

            if(operator.equals("+"))
            {
                int ans = num1 + num2;
                resultTextView.setText(String.valueOf(ans));
            }
            else if(operator.equals("-"))
            {
                int ans = num1 - num2;
                resultTextView.setText(String.valueOf(ans));
            }
            else if(operator.equals("*"))
            {
                int ans = num1 * num2;
                resultTextView.setText(String.valueOf(ans));
            }
            else if(operator.equals("/"))
            {
                int ans = num1 / num2;
                resultTextView.setText(String.valueOf(ans));
            }
        }

//its a test for vcs
    }
}