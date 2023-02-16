package Unit_1;

import java.text.DecimalFormat;

public class Array_Traversal_Problem {
    public double getAverage(double[] array){
        //round the final answer to 2 decimals
        DecimalFormat df = new DecimalFormat("0.00");
        double sum = 0;

        //add all double elements together
        for(double num : array){
            sum += num;
        }

        //divide the sum by the length of array
        double average = Double.parseDouble(df.format(sum / array.length));
        return average;
    }

    public void printMinMax(double[] array){
        double max = 0;
        double min = 0;
        for(double num : array){
            if(max > num){
                max = num;
            }else{
                min = num;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
