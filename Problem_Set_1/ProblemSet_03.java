package Problem_Set_1;/*
    name: Evan Zhang
    Date: 2022.09.15
    Program: Golf Score and Winner
 */



import java.io.*;

public class ProblemSet_03 {
    public static void main(String[] arg) throws IOException{
        int lines = 0;
        int par = 0;
        FileReader fr = new FileReader("/C://Users//zzh33//IdeaProjects//School work//src//golf.txt/");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        int[][] scores = new int[4][18];
        //read the file until it is done
        while (line != null){

            //get the par and all four players' strokes
            par = Integer.parseInt(line.substring(0,1));
            int player1 = Integer.parseInt(line.substring(1,2));
            int player2 = Integer.parseInt(line.substring(2,3));
            int player3 = Integer.parseInt(line.substring(3,4));
            int player4 = Integer.parseInt(line.substring(4));


            //get players' scores
            scores[0][lines] = player1 - par;
            scores[1][lines] = player2 - par;
            scores[2][lines] = player3 - par;
            scores[3][lines] = player4 - par;
            line = br.readLine();
            lines++;
        }

        int[] playersScore = new int[4];

        //calculate the total score
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[0].length; j++){
                playersScore[i] += scores[i][j];
            }

        }
        int highest = 1;

        //compare the scores and get the highest one
        for(int i = 1 ; i < playersScore.length; i++){
            if(playersScore[i] > playersScore[i-1]){
                highest = i;
            }
        }

        //print all scores and the winner
        for(int i = 0; i < scores.length; i++){
            System.out.print("Player " + (i + 1) + ": ");
            for(int j = 0; j < scores[0].length; j++){
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("winner is " + (highest + 1) + "!");
    }
}
