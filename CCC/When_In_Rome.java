package CCC;

import java.util.Scanner;

public class When_In_Rome {

    public static final char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    public static final int[] num = {1, 5, 10, 50, 100, 500, 1000};

    public static int RtoN(String r) {
        int[] indexes = new int[r.length()];
        for (int i = 0; i < r.length(); i++) {
            for (int place = 0; place < roman.length; place++) {
                if (r.charAt(i) == roman[place]) {
                    indexes[i] = place;
                }
            }
        }
        int numA = num[indexes[indexes.length-1]];
        for(int i = indexes.length - 2; i >= 0; i--){
            if(indexes[i] == 0 && indexes[i + 1] == 1){
                numA -= num[indexes[i]];
            }else if(indexes[i] == 0 && indexes[i + 1] == 2){
                numA -= num[indexes[i]];
            }
            else if(indexes[i] == 2 && indexes[i + 1] == 3){
                numA -= num[indexes[i]];
            }
            else if(indexes[i] == 2 && indexes[i + 1] == 4){
                numA -= num[indexes[i]];
            }
            else if(indexes[i] == 4 && indexes[i + 1] == 5){
                numA -= num[indexes[i]];
            }
            else if(indexes[i] == 4 && indexes[i + 1] == 6){
                numA -= num[indexes[i]];
            }
            else{
                numA += num[indexes[i]];
            }
        }
        return numA;
    }

    public static String NtoR(int n){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String newR = "";
        if(n > 1000){
            newR = "CONCORDIA CUM VERITATE";
        }else{
            for(int i = 0; i < values.length; i++){
                while(n >= values[i]) {
                    n -= values[i];
                    newR += romanLetters[i];
                }
            }
        }
        return newR;
    }


    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String times = input.nextLine();
        String[][] nums = new String[Integer.parseInt(times)][2];
        for(int i = 0; i < Integer.parseInt(times); i++){
            String equation = input.nextLine();
            equation= equation.substring(0, equation.length() - 1);
            String[] numbers = equation.split("\\+");
            nums[i][0] = numbers[0];
            nums[i][1] = numbers[1];
        }

        for (String[] strings : nums) {
            System.out.print(strings[0] + "+" + strings[1] + "=");
            System.out.println(NtoR(RtoN(strings[0]) + RtoN(strings[1])));
            //System.out.println(NtoR(RtoN(nums[i][0]) + RtoN(nums[i][1])));
        }

    }
}
