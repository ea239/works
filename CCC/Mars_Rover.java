package CCC;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Mars_Rover {
    public static void main(String[] arg) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\zzh33\\IdeaProjects\\School work\\src\\CCC\\Mars_Rover_Data"));
        ArrayList<Integer> steps = new ArrayList<>();
        int dir = 1;
        int yDistance = 0;
        int xDistance = 0;

        while(file.hasNext()){
            steps.add(Integer.parseInt(file.next()));
        }

        String[] dirs = {"left", "up", "right", "down"};

        for(int i = 0; i < steps.size(); i++){
            int lastStep = 10000000;
            if(i > 0){
                lastStep = steps.get(i-1);
            }
            int currStep = steps.get(i);
            if(currStep != 0){
                if(currStep == 2){
                    dir ++;
                }else if(currStep == 3){
                    dir --;
                }

                if(dir == 4){
                    dir = 0;
                }else if(dir == -1){
                    dir = 3;
                }

                if(lastStep == 1){
                    switch(dir){
                        case 0:
                            xDistance -= currStep;
                            break;
                        case 1:
                            yDistance += currStep;
                            break;
                        case 2:
                            xDistance += currStep;
                            break;
                        case 3:
                            yDistance -= currStep;
                            break;
                    }
                }
            } else{
                int distance = Math.abs(xDistance) + Math.abs(yDistance);
                System.out.println("Distance is " + distance);
                if(distance == 0){
                    continue;
                }
                else if(dir == 0){
                    if(xDistance > 0){
                        if(yDistance > 0){
                            System.out.println(2 + "\n" + 1 + "\n" + yDistance + 2 + "\n" + 1 + xDistance);

                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(yDistance)  + 3 + "\n" + 1 + xDistance);
                        }
                    }else{
                        System.out.println(1 + "\n" + Math.abs(xDistance));
                        if(yDistance > 0){
                            System.out.println(2 + "\n" + 1 + "\n" + yDistance);
                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(yDistance));
                        }
                    }
                }
                else if(dir == 1){
                    if(yDistance < 0){
                        if(xDistance > 0){
                            System.out.println(2 + "\n" + 1 + "\n" + xDistance + 2 + "\n" + 1 + Math.abs(yDistance));

                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(xDistance)  + 3 + "\n" + 1 + Math.abs(yDistance));
                        }
                    }else{
                        System.out.println(1 + "\n" + yDistance);
                        if(xDistance > 0){
                            System.out.println(2 + "\n" + 1 + "\n" + xDistance);
                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(xDistance));
                        }
                    }
                }
                else if(dir == 2){
                    if(xDistance < 0){
                        if(yDistance < 0){
                            System.out.println(2 + "\n" + 1 + "\n" + Math.abs(yDistance) + 2 + "\n" + 1 + Math.abs(xDistance));

                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(yDistance)  + 3 + "\n" + 1 + Math.abs(xDistance));
                        }
                    }else{
                        System.out.println(1 + "\n" + Math.abs(xDistance));
                        if(yDistance < 0){
                            System.out.println(2 + "\n" + 1 + "\n" + Math.abs(yDistance));
                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(yDistance));
                        }
                    }
                }
                else if(dir == 3){
                    if(yDistance > 0){
                        if(xDistance < 0){
                            System.out.println(2 + "\n" + 1 + "\n" + Math.abs(xDistance) + 2 + "\n" + 1 + Math.abs(yDistance));

                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(xDistance)  + 3 + "\n" + 1 + Math.abs(yDistance));
                        }
                    }else{
                        System.out.println(1 + "\n" + Math.abs(yDistance));
                        if(xDistance < 0){
                            System.out.println(2 + "\n" + 1 + "\n" + Math.abs(xDistance));
                        }else{
                            System.out.println(3 + "\n" + 1 + "\n" + Math.abs(xDistance));
                        }
                    }
                }

                dir = 1;
                xDistance = 0;
                yDistance = 0;
            }
        }
    }
}
