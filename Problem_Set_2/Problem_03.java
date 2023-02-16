/*
name: Evan Zhang
Date: 2022. 10. 4
Program name: people in an emergency room
 */

package Problem_Set_2;

import java.io.*;

public class Problem_03 {
    public static void main(String[] arg) throws IOException {
        //create a 3d array and read the file
        int[][][] patients = new int[4][7][24];
        FileReader fr = new FileReader("/C://Users//zzh33//IdeaProjects//School work//src//Problem_Set_2//Number_Of_Patients.txt/");
        BufferedReader br = new BufferedReader(fr);

        //split the number of people each day and put them in the array
        for(int week = 0; week < 4; week++){
            for(int day = 0; day < 7; day++){
                String[] numbers = br.readLine().split(" ");
                for(int hour = 0; hour < 24; hour++){
                    patients[week][day][hour] = Integer.parseInt(numbers[hour]);
                }
            }
        }

        int[][] peopleHour = new int[4][7];
        int[] peopleDay = new int[4];
        int peopleWeek = 0;

        //Start to compare people per week, day and hour, highWeek means that the number of people in a week
        int highWeek = 0;
        for(int week = 0; week < 4; week++){
            /*nowWeek is the number of people for this week calculating
            highDay is the number of people that is the highest in the week
             */
            int nowWeek = 0;
            int highDay = 0;
            //use for loop to compare number people each day
            for(int day = 0; day < 7; day++){
                //nowDay is the number of people during a day
                int nowDay = patients[week][day][0];
                for(int hour = 1; hour < 24; hour++){
                    /*compare the number of people in the hour to the highest hour in the day, if the number is higher than the number recorded in the array,  it will
                    replace the people in the array
                     */
                    if(patients[week][day][hour] > patients[week][day][peopleHour[week][day]]){
                        peopleHour[week][day] = hour;
                    }
                    //add the people to nowDay
                    nowDay += patients[week][day][hour];
                }
                //if the total people in the day is higher than the people recorded in the highDay, replace the day to the high day. And change the day in the peopleDay
                if(nowDay > highDay){
                    peopleDay[week] = day + 1;
                    highDay = nowDay;
                }
                //add the total people in the day to nowWeek
                nowWeek += nowDay;
            }
            //if the total number of people is higher than the people recorded in highWeek, change it and also record the peopleWeek
            if(nowWeek > highWeek){
                peopleWeek = week + 1;
                highWeek = nowWeek;
            }
        }

        //use for loop print all compare result
        for(int r = 0; r < 4; r++){
            for(int n = 0; n < 7; n++){
                System.out.println("In the week " + (r + 1) + ", day" + (n + 1) + ": " + (peopleHour[r][n] + 1) + " hour is the highest");
            }
            System.out.println("\n" + "In the " + (r + 1) + " week: " + peopleDay[r] + " day is the highest" + "\n");
        }
        System.out.println("\n" + "In the four week: " + peopleWeek + " week is the highest");
    }
}
