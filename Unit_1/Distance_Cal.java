package Unit_1;

import java.text.DecimalFormat;

public class Distance_Cal {
    public static int distance(int... list){
        int total = 0;
        for(int length : list){
            total += length;
        }
        return total;
    }

    public static String travelTime(int aveSpeed, int... list){
        DecimalFormat df = new DecimalFormat("0.00");
        int total = 0;
        for(int length : list){
            total += length;
        }
        return df.format((double)total/aveSpeed);
    }

    public static void main(String[] args){
        System.out.println(travelTime(27,150,257,300,59,5,58,580,1000));
    }
}
