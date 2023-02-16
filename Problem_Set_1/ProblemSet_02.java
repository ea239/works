package Problem_Set_1;/*
    name: Evan Zhang
    Date: 2022.09.11
    Program: Rock Paper Scissor
 */



import java.util.Scanner;

public class ProblemSet_02 {

    public static void main(String[] arg){
        Scanner input  = new Scanner(System.in);

        int wins = 0;
        int losses = 0;
        int ties = 0;
        boolean stop = false;

        String[] com = {"Rock", "Paper", "Scissor"};

        //keep running until users want to stop
        while(!stop){

            //get a random element from the com array
            int random = (int)(Math.random()*3);
            System.out.println("Which you want to chooes:  1-rock, 2-paper, 3-scissor");
            boolean cons = true;
            int users = 0;
            while(cons){
                try{
                    users = input.nextInt();
                    cons = false;
                }catch(Exception e){
                    input.next();
                    System.out.println("Enter a wrong type");
                }
                if(users <= 0 || users > 3){
                    cons = true;
                    System.out.println("Wrong answer");
                }
            }
            System.out.println("Computer: " + com[random]);

            //compare computer and user
            if(random == 0 && users == 1){
                ties++;
                System.out.println("Tie");
            }else if(random == 0 && users == 2){
                wins++;
                System.out.println("Win!");
            }else if (random == 0 && users == 3){
                losses++;
                System.out.println("loss :(");
            }else if (random == 1 && users == 1){
                losses++;
                System.out.println("loss :(");
            }else if (random == 1 && users == 2){
                ties++;
                System.out.println("Tie");
            }else if (random == 1 && users == 3){
                wins++;
                System.out.println("Win!");
            }else if (random == 2 && users == 1){
                wins++;
                System.out.println("Win!");
            }else if (random == 2 && users == 2){
                losses++;
                System.out.println("loss :(");
            }else{
                ties++;
                System.out.println("Tie");
            }

            //ask user if they still want to play
            System.out.println("Do you still want to play? Y or N");
            boolean loop = true;
            String ans = "0";
            while(loop){
                try{
                    ans = input.next();
                    if(ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("y")){
                        loop = false;
                    }else{
                        System.out.println("Wrong answer");
                    }
                }catch(Exception E){
                    input.next();
                    System.out.println("Wrong type, Please try again.");
                }
            }
            if(ans.equalsIgnoreCase("n")){
                stop = true;
            }

        }

        //print the winn loss and tie
        System.out.println("Win: " + wins);
        System.out.println("Loss: " + losses);
        System.out.println("Tie: " + ties);

    }
}