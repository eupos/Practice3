package ru.geekbrains.eupos.android1.practice3;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
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

    /**Ввод первого числа */
    private double valueOne;
    /**Для второго числа */
    private double valueTwo;
    /**Хранение знака операции*/
    private String op;
    private DecimalFormat decimalFormat = new DecimalFormat("#.#######");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Калькулятор");
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


        btnNull.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEigh.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnComma.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnSubtrac.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnBspace.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNull:
            case R.id.btnOne:
            case R.id.btnTwo:
            case R.id.btnThree:
            case R.id.btnFour:
            case R.id.btnFive:
            case R.id.btnSix:
            case R.id.btnSeven:
            case R.id.btnEigh:
            case R.id.btnNine:
            case R.id.btnComma:
                Button button = findViewById(view.getId());
                numberField.append(button.getText().toString());
                break;
            case R.id.btnAdd:
                op = "+";
                inputNumb();
                break;
            case R.id.btnSubtrac:
                op = "-";
                inputNumb();
                break;
            case R.id.btnMulti:
                op = "*";
                inputNumb();
                break;
            case R.id.btnDiv:
                op = "/";
                inputNumb();
                break;
            case R.id.btnResult:
                compute();
                resultField.setText(decimalFormat.format(valueOne));
                numberField.setText("");
                operationField.setText("");
                break;
            case R.id.btnClear:
                resultField.setText("");
                numberField.setText("");
                operationField.setText("");
                valueOne = Double.NaN;
                valueTwo = Double.NaN;
                break;
            case R.id.btnBspace:
                if(numberField.getText().length()>0)
                    numberField.setText(numberField.getText().subSequence(0,numberField.getText().length()-1));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

    private void inputNumb(){
        valueOne = Double.parseDouble(numberField.getText().toString());
        operationField.setText(op);
        resultField.setText(decimalFormat.format(valueOne));
        numberField.setText("");
    }


    private void compute() {
        try {
            valueTwo = Double.parseDouble(numberField.getText().toString());
            switch (op) {
                case "-":
                    valueOne = valueOne - valueTwo;
                    break;
                case "+":
                    valueOne = valueOne + valueTwo;
                    break;
                case "*":
                    valueOne = valueOne * valueTwo;
                    break;
                case "/":
                    valueOne = valueOne / valueTwo;
                    break;
                default:
                    valueOne = Double.parseDouble(numberField.getText().toString());
                    break;
            }
        } catch (Exception ignored) {}
    }
}