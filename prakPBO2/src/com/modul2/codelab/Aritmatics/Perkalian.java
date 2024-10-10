package com.modul2.codelab.Aritmatics;

import com.modul2.codelab.Operator;

public class Perkalian extends Operator {

    @Override
    public double operation (double a, double b, double c){

        return a * b * c;
    }

    @Override
    public double operation (double a, double b){

        return a * b;
    }

}
