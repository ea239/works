package Unit_1;

import java.util.Scanner;

public class Line_Them_Up {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        boolean cons = true;
        int runs = 0;

        while(cons){
            try{
                runs = input.nextInt();
                cons = false;
            }catch(Exception ex){
                System.out.println("Wrong Type, do again.");
                input.next();
            }
        }

        char[] letters = new char[runs];
        for(int i = 0; i < runs; i++){
            letters[i] = input.next().charAt(0);;

        }

        int in = 0;
        int de = 0;

        for(int i = 1; i < runs; i++){
            if(letters[i-1] < letters[i]){
                in++;
            }else if(letters[i-1] > letters[i]){
                de++;
            }
        }

        if(de == 0){
            System.out.println("INCREASING");
        }else if(in == 0){
            System.out.println("DECREASING");
        }else{
            System.out.println("NEITHER");
        }


    }
}
