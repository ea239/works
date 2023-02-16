package Problem_Set_1;/*
    name: Evan Zhang
    Date: 2022.09.11
    Program: Guess Number
 */



import java.util.*;

public class ProblemSet_01 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        //Generate a random number from 1 to 100
        int num = (int)(Math.random()*100) + 1;
        int guess = 0;

        //keep running until user guess right number
        while(guess != num){
            boolean cons = true;
            while(cons){
                System.out.print("Guess a number (1 - 100): ");
                try{
                    guess = input.nextInt();
                    cons = false;
                }catch(Exception Ex){
                    System.out.println("Wrong type");
                    input.next();
                }
            }

            //compare the number with the guess of user
            if(guess == num){
                System.out.println("You got right!");
            }else if(guess < num && guess > 0){
                System.out.println("The number is greater than your guess.");
            }else if(guess > num && guess <= 100){
                System.out.println("The number is smaller than your guess.");
            }else{
                System.out.println("You input a wrong number.");
            }
        }
    }
}
