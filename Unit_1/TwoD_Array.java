package Unit_1;

import javax.swing.text.Highlighter;
import java.text.DecimalFormat;

public class TwoD_Array {
    public static void main(String[] arg){
        DecimalFormat df = new DecimalFormat("0.00");

        int[][] scores = {
                {3,4,5,2,1,4,3,2,4,4},
                {2,4,3,4,3,3,2,1,2,2},
                {3,5,4,5,5,3,2,5,5,5},
                {1,1,1,3,1,2,1,3,2,4}};

        final int SODAS = scores.length;
        final int PEOPLE = scores[0].length;
        //create an array to store the average of each flavours
        double[] flavour = new double[SODAS];
        //calculate the average of those flavour
        for(int r = 0; r < SODAS; r++){
            int soda = 0;
            for(int n = 0; n < PEOPLE; n++){
                soda = soda + scores[r][n];
            }
            flavour[r] =(double)soda/PEOPLE;
        }
        //print each flavour and get the highest one
        int highest = 0;
        System.out.println("flavour 1:" + flavour[0]);
        for(int i = 1; i < SODAS; i++){
            System.out.println("flavour " +(i + 1) + ": "+ flavour[i]);
            if(flavour[i] > flavour[i-1]){
                highest = i;
            }
        }
        System.out.println("The highest score is " + (highest + 1));
    }
}