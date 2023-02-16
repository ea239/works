package CCC;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern_Generator {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String rows = input.nextLine();
        int[][] inputs = new int[Integer.parseInt(rows)][2];
        for(int i = 0; i < inputs.length; i++){
            String userInput = input.nextLine();
            String[] newInput = userInput.split(" ");
            inputs[i][0] = Integer.parseInt(newInput[0]);
            inputs[i][1] = Integer.parseInt(newInput[1]);
        }

        for(int i = 0; i < inputs.length; i++){
            ArrayList<String> patterns = new ArrayList<>();
            String pattern = "";
            int numberOne = inputs[i][1];
            for(int lengthNum = 0; lengthNum < inputs[i][0]; lengthNum++){
                if(numberOne == 0){
                    pattern += "0";
                }else{
                    pattern += "1";
                    numberOne --;
                }
            }
            patterns.add(pattern);

            int numberZero = inputs[i][0] - inputs[i][1] + 1;
            int times = 0;
            while(pattern.lastIndexOf("10") > -1){
                int position10 = pattern.lastIndexOf("10");
                pattern = pattern.substring(0, position10) + "01" + pattern.substring(position10 + 2);
                times ++;
                if(times == numberZero){
                    String newS = pattern.substring(position10 + 2);
                    String rev = "";
                    for(int r = newS.length() - 1; r >= 0 ; r--){
                        rev += newS.charAt(r);
                    }
                    pattern = pattern.substring(0, position10 + 2) + rev;
                    times = 0;
                }
                patterns.add(pattern);
            }
            System.out.println("The bit patterns are");
            for(String currP : patterns){
                System.out.println(currP);
            }

            System.out.println();
        }
    }
}
