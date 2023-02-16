package Unit_1;

import java.util.Arrays;
import java.util.Scanner;

public class Cetiri {
    public static void main(String urg[]){
        Scanner input = new Scanner(System.in);
        boolean cons = true;
        String enter = input.nextLine();
        String[] num = enter.split(" ");
        int[] numbers = new int[num.length];
        for(int i = 0 ; i < num.length; i++){
            numbers[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(numbers);

        if(numbers[1] - numbers[0] == numbers[2] - numbers[1]){
            System.out.println(numbers[2] + (numbers[2] - numbers[1]));
        }else{
            int diff1 = numbers[1] - numbers[0];
            int diff2 = numbers[2] - numbers[1];
            if(numbers[2] - diff1 == numbers[1] + diff1){
                System.out.println(numbers[2] - diff1);
            }else if(numbers[1] - diff2 == numbers[0] + diff2){
                System.out.println(numbers[1] - diff2);
            }
        }

    }
}
