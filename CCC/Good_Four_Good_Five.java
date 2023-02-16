package CCC;
//2022 senior question 1


import java.util.Scanner;

public class Good_Four_Good_Five {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int times = 0;
/*
        for(int i = 0; i <= num/4; i++){
            for(int j = 0; j <= num/5; j++){
                if(i*4 + j*5 == num){
                    times ++;
                }
            }
        }

 */

        for(int i = 0; i <= 1000000; i++){
            int total = i * 5;
            int rem = num - total;
            if(rem >= 0 && rem % 4 == 0){
                times ++;
            }
        }

        System.out.println(times);
    }
}
