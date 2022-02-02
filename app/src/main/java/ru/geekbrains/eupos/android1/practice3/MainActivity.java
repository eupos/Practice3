package ru.geekbrains.eupos.android1.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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
    private Button btnSubtrac;
    private Button btnMulti;
    private Button btnDiv;
    private Button btnPercent;
    private Button btnResult;
    private Button btnComma;
    private Button btnBspace;
    private Button btnClear;
    /**Первичный ввод данных */
    private double valueOne;
    /**Второе число*/
    private double valueTwo;
    /**хранение знака операции*/
    private String op;
    /**Р¤РѕСЂРјР°С‚ РІС‹РІРѕРґР° РґР°РЅРЅС‹С… */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Калькулятор");
        // РїРѕР»СѓС‡Р°РµРј РІСЃРµ РїРѕР»СЏ РїРѕ id РёР· activity_main.xml
        resultField =(TextView) findViewById(R.id.resultField);
        numberField = (EditText) findViewById(R.id.numberField);
        operationField = (TextView) findViewById(R.id.operationField);
        btnNull = (Button) findViewById(R.id.btnNull);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEigh = (Button) findViewById(R.id.btnEigh);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnComma = (Button) findViewById(R.id.btnComma);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnSubtrac= (Button) findViewById(R.id.btnSubtrac);
        btnBspace = (Button) findViewById(R.id.btnBspace);
        btnPercent = (Button) findViewById(R.id.btnPercent);
    }

    @Override
    public void onClick(View view) {
        
    }
}