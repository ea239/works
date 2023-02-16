package Unit_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class URL_Dissector {
    public static void main(String[] arg) throws FileNotFoundException {
        Scanner file = new Scanner(new File("/C://Users//zzh33//IdeaProjects//School work//src//Unit_1//URLDissectorInput.txt/"));
        file.useDelimiter("/");

        while(file.hasNext()){
            System.out.println(file.next());
        }


    }
}
