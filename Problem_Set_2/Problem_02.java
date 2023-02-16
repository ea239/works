/*
name: Evan Zhang
Date: 2022. 9. 28
Program name: histogram of times of each number appearance
 */
package Problem_Set_2;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        //Let user enter the arbitrary number of integers
        System.out.println("Enter numbers:");
        String enter = input.nextLine();

        //split the input of user to each number
        String[] numbers = enter.split(" ");

        //distinguish the number to each range, use the number minus 1 then divided by 10 can get the range of the number
        int[] times = new int[10];
        for(String num : numbers){
            int integer = Integer.parseInt(num);
            int range = (integer - 1) / 10;
            times[range]++;
        }


        //use for loop to print the histogram, using three print because I want those line align
        for(int i = 0; i < times.length; i++){
            int start = 10 * i + 1;
            int end = 10 * (i + 1);
            if(i == 0){
                System.out.print(start + " - " + end + "       |     ");
            }else if(i == 9){
                System.out.print(start + " - " + end + "     |     ");
            }else{
                System.out.print(start + " - " + end + "      |     ");
            }
            //using for loop to print the *
            for(int j = 0; j < times[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
