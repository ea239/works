package Unit_1;

import java.util.*;

public class Arrays {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int number = 0;
        boolean cons = true;
        while(cons){
            try{
                number = input.nextInt();
                if(number > 0){
                    cons = false;
                }else{
                    System.out.println("Wrong, try again.");
                }
            }catch(Exception ex){
                input.next();
                System.out.println("Wrong, try again.");
            }
        }

        int[] numArray = new int[number];
        for(int i = 0; i < numArray.length; i++){
            cons = true;
            System.out.println("Enter " + (i + 1) + ": ");
            while(cons){
                try{
                    numArray[i] = input.nextInt();
                    cons = false;
                }catch(Exception ex){
                    System.out.println("Wrong, try again");
                    input.next();
                }
            }
        }

        for(int i = numArray.length - 1; i >= 0; i--){
            System.out.print(numArray[i] + " ");
        }

    }
}
