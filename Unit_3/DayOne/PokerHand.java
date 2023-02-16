package Unit_3.DayOne;

import java.util.ArrayList;
import java.util.Scanner;

public class PokerHand {
    public static void main(String[] arg){
        Scanner input  = new Scanner(System.in);
        String cards = input.nextLine();
        String[] card = cards.split(" ");

        int[] rank = new int[13];
        for(String currCard : card){
            if(currCard.charAt(0) == 'T'){
                rank[9]++;
            }else if(currCard.charAt(0) == 'J'){
                rank[10]++;
            }else if(currCard.charAt(0) == 'Q'){
                rank[11]++;
            }else if(currCard.charAt(0) == 'K'){
                rank[12]++;
            }else if(currCard.charAt(0) == 'A'){
                rank[0]++;
            }else{
                rank[Integer.parseInt(String.valueOf(currCard.charAt(0)))]++;
            }
        }
        int biggest = rank[0];
        for(int i = 1; i < 13; i++){
            if(rank[i] > biggest){
                biggest = rank[i];
            }
        }

        System.out.println(biggest);
    }
}
