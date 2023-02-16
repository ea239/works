package Unit_1;

import java.util.*;
public class Review_1 {
    public static void main(String[] arg){
        int ten;
        int five;
        int loonies;
        int quarters;
        int dime;
        int nickel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double money = input.nextFloat() + 0.0001;

        ten = (int)(money / 10);
        money  = money - ten * 10;


        five = (int)(money / 5);
        money = money - five * 5;

        loonies = (int)money;
        money = money - loonies * 1;

        quarters = (int)(money / 0.25);
        money = money - quarters * 0.25;


        dime = (int)(money / 0.1);
        money = money - dime * 0.1;


        nickel = (int)(money / 0.05);


        System.out.println(ten + " ten dollar bills");
        System.out.println(five + " five dollar bills");
        System.out.println(loonies + " loonies");
        System.out.println(quarters + " quarters");
        System.out.println(dime + " dime");
        System.out.println(nickel + " nickel");

    }
}
