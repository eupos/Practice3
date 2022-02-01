package ru.geekbrains.eupos.android1.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultField, operationField;
    private  EditText numberField;
    private Button btnNull;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEigh;
    private Button btnNine;
    private Button btnAdd;
    private Button btnSub;
    private Button btnMulti;
    private Button btnDiv;
    private Button btnPercent;
    private Button btnResult;
    private Button btnComma;
    private Button btnBspace;
    private Button btnClear;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}