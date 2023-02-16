/*
name: Evan Zhang
Date: 2022. 9. 28
Program name: the times of 0 - 50 appearance
 */

package Problem_Set_2;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] arg){
        //create an array to store the times a number appear
        int[] times = new int[51];
        Scanner input = new Scanner(System.in);

        //Let user enter the arbitrary number of integers
        System.out.println("Enter numbers:");
        String enter = input.nextLine();

        //split the user input to each single number
        String[] number = enter.split(" ");
        for(String num : number){
            int integer = Integer.parseInt(num);
            times[integer]++;
        }

        //print the times of each number user input
        for(int i = 0; i < times.length; i++){
            System.out.println("number " + i + ": " + times[i]);
        }
    }
}
