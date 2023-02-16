package CCC;

import java.util.Scanner;

public class GoodGroup {
    public static int check(String[] a, String[] b, String[] c){
        int ans = 0;

        int times1 = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < c.length; j++){
                if(c[j].indexOf(a[i]) >= 0){
                    times1 ++;
                }
            }
        }
        ans -= times1;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < c.length; j++){
                if(c[j].indexOf(a[i]) >= 0){
                    ans ++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
/*
        String X = input.nextLine();
        String[][] toge = new String[Integer.parseInt(X)][2];
        for(int i = 0; i < toge.length; i++){

            String name = input.nextLine();
            toge[i] = name.split(" ");
        }

        String Y = input.nextLine();
        String[][] notToge = new String[Integer.parseInt(Y)][2];
        for(int i = 0; i < notToge.length; i++){

            String name = input.nextLine();
            notToge[i] = name.split(" ");
        }

        String G = input.nextLine();
        String[][] teams = new String[Integer.parseInt(G)][3];
        for(int i = 0; i < teams.length; i++){

            String name = input.nextLine();
            teams[i] = name.split(" ");
        }

 */
        int X = Integer.parseInt(input.nextLine());
        String[] yes = new String[X];
        for(int i = 0; i < X; i++){
            yes[i] = input.nextLine();
        }

        int Y = Integer.parseInt(input.nextLine());
        String[] no = new String[Y];
        for(int i = 0; i < Y; i++){
            no[i] = input.nextLine();
        }

        int G = Integer.parseInt(input.nextLine());
        String[] teams = new String[G];
        for(int i = 0; i < G; i++){
            teams[i] = input.nextLine();
        }

        System.out.println(check(yes, no, teams));
    }
}
