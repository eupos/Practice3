package ru.geekbrains.eupos.android1.practice3;

import android.os.Parcel;

import androidx.annotation.NonNull;

public class Compute {
    /**Ввод первого числа */
    private double valueOne;
    /**Для второго числа */
    private double valueTwo;
    /**Хранение знака операции*/
    private  String op;
    /**ввод значений для метода*/
    private String nField;

    Compute () {}

    public void  setOp (String op) {
        this.op = op;
    }

    public void  setValueOne (double valueOne) {
        this.valueOne = valueOne;
    }

    public void  setValueTwo (double valueTwo) {
        this.valueTwo = valueTwo;
    }

    public String getOp (){
        return op;
    }

   public double getValueOne (){
        return valueOne;
   }

   public double getValueTwo (){
        return  valueTwo;
   }

    public void calculation (double valueTwo) {
        try {
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

            }
        } catch (Exception ignored) {}
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void writeToParcel(Parcel parcel, double i) {
        parcel.writeDouble(valueOne);
        parcel.writeDouble(valueTwo);
        parcel.writeString(op);
    }
}
