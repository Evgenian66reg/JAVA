package ru.top.oop.models;

public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction(int numerator){
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator,int denominator )
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

}
