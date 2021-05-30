package com.example.calc;

import androidx.annotation.NonNull;

public enum MathAction {
    ADDITION("+"),
    SUBTRACTION("-"),
    DIVISION("/"),
    MULTIPLICATION("*");
    private String str;
    MathAction(String s) {
        str = s;
    }
    public String getString(){
        return str;
    }
}
