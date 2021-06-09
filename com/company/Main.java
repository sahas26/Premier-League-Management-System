package com.company;

import javafx.application.Application;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static PremierLeagueManager sss = new PremierLeagueManager();

    public static void main(String[] args) throws IOException {

            try {
                sss.fileRead();

            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                sss.fileRead1();

            } catch (IOException e2) {
                e2.printStackTrace();
            }


            int userInput;


            while (true) {


                try {
                    Scanner see = new Scanner(System.in);


                    System.out.println("\n");

                    System.out.println(" <<<<<<<< PREMIER LEAGUE >>>>>>>>\n");

                    System.out.println(" 1 - add the football club to premier league\n ");
                    System.out.println(" 2 - delete the football club  \n");
                    System.out.println(" 3 - display a choose club \n");
                    System.out.println(" 4 - view premier league table \n");
                    System.out.println(" 5 - start a match \n");
                    System.out.println(" 6 - Open Premier_UserI \n");
                    System.out.println(" 7 - quite \n");


                    System.out.println("choose what do you want to do : ");

                    userInput = see.nextInt();


                    if (userInput == 1) {
                        sss.addYourClub();
                    } else if (userInput == 2) {
                        sss.removeClubFromPremierLeague();

                    } else if (userInput == 3) {
                        sss.DisplayStatClub();
                    } else if (userInput == 4) {
                        sss.matchDayTable();
                    } else if (userInput == 5) {
                        sss.startMatch();
                    } else if (userInput == 6) {
                        Application.launch(Premier_UserI.class,args);  //premier league class eke launch method ekata call karano

                    } else if (userInput == 7) {
                        sss.fileWrite();
                        sss.fileWrite1();
                        System.exit(0);
                    } else {
                        System.out.println(" your input is not in your range ");
                    }
                } catch (Exception e3) {
                    System.out.println(" invalid inputs");
                }
            }
        }
}



