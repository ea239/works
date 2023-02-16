/*
name: Evan Zhang
Date: 2022. 11。 20
Program name: record a rational number or do addition, subtraction, multiplication and division
 */
package Problem_Set_3;

import java.util.Scanner;

public class RationalNumber {
    //two initial variables
    private int numerator;
    private int denominator;

    //constructor to create the instance of the class, also simplify the two number
    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator/getCommon(numerator, denominator);
        this.denominator = denominator/getCommon(numerator, denominator);
    }


    //a method to get the biggest common divisor of two number. Fist to check if b is 0, it will return a. because the biggest common divisor of a number and 0 is the number.
    // If not, it will doing the method again, but in this time the two numbers are b and the remainder of a/b. if a/b is zero, it will return b.
    //Because a%b=0 means a is a multiple of b,so the biggest common divisor is b.
    //if will run the method continuously until a%b = 0;
    private int getCommon(int num1, int num2){
        if(num2 == 0){
           return num1;
        }
        return getCommon(num2, num1 % num2);
    }

    //the accessor and the mutator and the accessor
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //the method to create a new RationalNumber reciprocal.
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator, numerator);
    }

    //Four method doing add, subtract, multiply and divide
    public String add(RationalNumber number2){
        int newNumerator = numerator * number2.getDenominator() + number2.getNumerator() * denominator;
        int newDenominator = denominator * number2.getDenominator();
        RationalNumber newRN = new RationalNumber(newNumerator, newDenominator);
        if(toString().equals("denominator cannot be 0")){
            return toString();
        }
        return ("the answer for two number add is " + newRN.toString());
    }

    public String subtract(RationalNumber number2){
        int newNumerator = numerator * number2.getDenominator() - number2.getNumerator() * denominator;
        int newDenominator = denominator * number2.getDenominator();
        RationalNumber newRN = new RationalNumber(newNumerator, newDenominator);
        if(toString().equals("denominator cannot be 0")){
            return toString();
        }
        return ("the answer for two number add is " + newRN.toString());
    }

    public String multiply(RationalNumber number2){
        int newNumerator = numerator * number2.getNumerator();
        int newDenominator = denominator * number2.getDenominator();
        RationalNumber newRN = new RationalNumber(newNumerator, newDenominator);
        if(toString().equals("denominator cannot be 0")){
            return toString();
        }
        return ("the answer for two number add is " + newRN.toString());
    }

    public String divide(RationalNumber number2){
        int newNumerator = numerator * number2.getDenominator();
        int newDenominator = denominator * number2.getNumerator();
        RationalNumber newRN = new RationalNumber(newNumerator, newDenominator);
        if(toString().equals("denominator cannot be 0")){
            return toString();
        }
        return ("the answer for two number add is " + newRN.toString());
    }

    //toString method to show the number, if numerator equal to denominator, it will return 1, and if denominator is 0, it will return wrong. and if numerator is 0, return 0
    public String toString() {
        if(numerator == denominator){
            return "1";
        }else if(denominator == 0){
            return ("denominator cannot be 0");
        }else if(numerator == 0){
            return ("0");
        }
        return (numerator + "/" + denominator);
    }

}
