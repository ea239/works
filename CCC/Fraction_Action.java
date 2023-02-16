package CCC;

import java.util.Scanner;

public class Fraction_Action {
    public static int getCommon(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return getCommon(num2, num1 % num2);
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Numerator");
        int nume = input.nextInt();
        System.out.println("Denominator");
        int deno = input.nextInt();

        System.out.print(nume / deno + " ");

        nume = nume % deno;
        int common = getCommon(nume, deno);

        if(nume != 0){
            System.out.println((nume/common) + "/" + (deno/common));
        }

    }
}
