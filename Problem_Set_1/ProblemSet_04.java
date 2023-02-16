package Problem_Set_1;/*
    name: Evan Zhang
    Date: 2022.09.18
    Program: difference between two document
 */


import java.io.*;
import java.util.ArrayList;

public class ProblemSet_04 {
    public static void main(String[] arg) throws IOException{

        //input two files
        FileReader document1 = new FileReader("/C://Users//zzh33//IdeaProjects//School work//src//document 1.txt/");
        FileReader document2 = new FileReader("/C://Users//zzh33//IdeaProjects//School work//src//document 2.txt/");
        BufferedReader br1 = new BufferedReader(document1);
        BufferedReader br2 = new BufferedReader(document2);

        String line1 = br1.readLine();
        String line2 = br2.readLine();
        int lines = 1;
        ArrayList<Integer> notEqual = new ArrayList<>();

        //compare two files line by line, and record which are different
        while(line1 != null && line2 != null){
            if(!line1.equals(line2)){
                notEqual.add(lines);
            }
            line1 = br1.readLine();
            line2 = br2.readLine();
            lines++;
        }

        //print the lines that not equal
        System.out.println("The lines that not equal are: ");
        for(int  i = 0; i < notEqual.size(); i++){
            System.out.print(notEqual.get(i) + " ");
        }


    }
}
