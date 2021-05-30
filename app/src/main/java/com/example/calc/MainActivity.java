package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String arg1;
    private String arg2;
    private MathAction action;
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
    }
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onBtnClick(View view){
        int btnId = view.getId();
        switch (btnId){
            case R.id.btn_0: case R.id.btn_1: case R.id.btn_2: case R.id.btn_3: case R.id.btn_4:
            case R.id.btn_5: case R.id.btn_7: case R.id.btn_8: case R.id.btn_6: case R.id.btn_9:
            case R.id.btn_dot:{
                if(action == null) {
                    arg1 = BtnSymbolClick(arg1, btnId);
                    display.setText(arg1);
                }
                else {
                    arg2 = BtnSymbolClick(arg2, btnId);
                    display.setText(arg1 + action.getString() + arg2);
                }
                break;
            }
            case R.id.btn_c:{
                arg1=null;
                arg2=null;
                action=null;
                display.setText("");
                break;
            }
            case R.id.btn_p_m:{
                if(arg1!=null && action==null){
                    double d = Double.parseDouble(arg1);
                    d*=-1;
                    arg1= DoubleOrInteger(d);
                    display.setText(arg1);
                }
                else if (arg2!=null && action!=null){
                    double d = Double.parseDouble(arg2);
                    d*=-1;
                    arg2= DoubleOrInteger(d);
                    display.setText(arg1 + action.getString() + arg2);
                }
                break;
            }
            case R.id.btn_divide: case R.id.btn_minus: case R.id.btn_mult: case R.id.btn_plus:{
                if(arg1!=null && arg2==null) {
                    BtnActionClick(btnId);
                    display.setText(arg1+action.getString());
                }
                else if(arg1 != null){
                    arg1=BtnResult();
                    BtnActionClick(btnId);
                    arg2=null;
                    display.setText(arg1+action.getString());
                }
                break;
            }
            case R.id.btn_perc:{
                if(arg2!=null){
                    double d = Double.parseDouble(arg2);
                    d/=100;
                    arg2= DoubleOrInteger(d);
                    display.setText(arg1 + action.getString() + arg2);
                }
                break;
            }
            case R.id.btn_result:{
                arg1=BtnResult();
                arg2=null;
                action=null;
                display.setText(arg1);
                break;
            }
        }
    }
    @SuppressLint("NonConstantResourceId")
    private String BtnSymbolClick(String prev, Integer btnId){
        String symb;
        switch (btnId){
            case R.id.btn_0: symb = "0"; break;
            case R.id.btn_1: symb = "1"; break;
            case R.id.btn_2: symb = "2"; break;
            case R.id.btn_3: symb = "3"; break;
            case R.id.btn_4: symb = "4"; break;
            case R.id.btn_5: symb = "5"; break;
            case R.id.btn_6: symb = "6"; break;
            case R.id.btn_7: symb = "7"; break;
            case R.id.btn_8: symb = "8"; break;
            case R.id.btn_9: symb = "9"; break;
            case R.id.btn_dot: {
                if(!prev.contains(".")) symb = ".";
                else symb = "";
                break;
            }
            default: symb = "";
        }
        if(prev==null) return symb;
        return prev + symb;
    }
    @SuppressLint("NonConstantResourceId")
    private void BtnActionClick(Integer btnId){
        switch (btnId){
            case R.id.btn_divide:{
                action = MathAction.DIVISION;
                break;
            }
            case R.id.btn_minus:{
                action = MathAction.SUBTRACTION;
                break;
            }
            case R.id.btn_mult:{
                action = MathAction.MULTIPLICATION;
                break;
            }
            case R.id.btn_plus:{
                action = MathAction.ADDITION;
                break;
            }
        }
    }
    private String BtnResult(){
        try {
            double d1 = Double.parseDouble(arg1);
            double d2 = Double.parseDouble(arg2);
            Double r = null;
            switch (action) {
                case ADDITION:
                    r = d1 + d2;
                    break;
                case DIVISION:
                    r = d1 / d2;
                    break;
                case SUBTRACTION:
                    r = d1 - d2;
                    break;
                case MULTIPLICATION:
                    r = d1 * d2;
                    break;
            }
            return DoubleOrInteger(r);
        }catch (Exception e){
            return e.getMessage();
        }
    }
    private String DoubleOrInteger(double d){
        if(Math.floor(d)==Math.ceil(d) && (d < (double)Long.MAX_VALUE && d > (double)Long.MIN_VALUE))
            return Long.toString((long) d);
        return Double.toString(d);
    }
}