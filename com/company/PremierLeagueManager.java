package com.company;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PremierLeagueManager implements LeagueManager{

    public static List<FootballClub> ArrayPremierLeague= new ArrayList<FootballClub>();
    public static List<MatchDay> matchList= new ArrayList<MatchDay>();

//

   // public static final int =20

    public static MatchDay matchRandom (){
        Random random = new Random();
        int club1Goal=random.nextInt(8);   //random match method
        int club2Goal=random.nextInt(8);
        int indexNumberOfClub1=0;
        int indexNumberOfClub2=0;
        while (true) {                  //random match validate
            indexNumberOfClub1=random.nextInt(ArrayPremierLeague.size());
            indexNumberOfClub2=random.nextInt(ArrayPremierLeague.size());
           if (!(indexNumberOfClub1 == indexNumberOfClub2)){
               break;
           }
        }
        String club1name=ArrayPremierLeague.get(indexNumberOfClub1).getNameOfTheClub();
        String club2name=ArrayPremierLeague.get(indexNumberOfClub2).getNameOfTheClub();
        LocalDate date =LocalDate.now();
        MatchDay randomlyGenerateClub = new MatchDay(club1name,club2name,date.getYear(),date.getMonthValue(),date.getDayOfMonth(),club1Goal,club2Goal);
        matchList.add(randomlyGenerateClub);



            if (club1Goal >club2Goal){

                for (int i = 0; i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club1name)) {
                        ArrayPremierLeague.get(i).setWins(ArrayPremierLeague.get(i).getWins()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club1Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club2Goal);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+3);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }

                }

            }


            else if(club1Goal == club2Goal){
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club1name)) {
                        ArrayPremierLeague.get(i).setDraws(ArrayPremierLeague.get(i).getDraws()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club1Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club2Goal);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+1);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }
                }
            }


            else if(club1Goal < club2Goal) {
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club1name)) {
                        ArrayPremierLeague.get(i).setDefeats(ArrayPremierLeague.get(i).getDefeats()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club1Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club2Goal);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);

                    }

                }
            }




            if (club2Goal > club1Goal){

                for (int i = 0; i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club2name)) {
                        ArrayPremierLeague.get(i).setWins(ArrayPremierLeague.get(i).getWins()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club2Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club1Goal);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+3);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }
                }
            }


            else if(club2Goal == club1Goal){
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club2name)) {
                        ArrayPremierLeague.get(i).setDraws(ArrayPremierLeague.get(i).getDraws()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club2Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club1Goal);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+1);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);

                    }


                }

            }

            else if(club2Goal < club1Goal) {
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(club2name)) {
                        ArrayPremierLeague.get(i).setDefeats(ArrayPremierLeague.get(i).getDefeats()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+club2Goal);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+club1Goal);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }

                }

            }
        return randomlyGenerateClub;

        }



    Scanner src=new Scanner(System.in);


    @Override
    public void addYourClub() {


        String nameOfTheClub,location,currentPresident,manager,stadium;
        src.nextLine();


        nameOfTheClub=getValidString("Please enter your club name : ");


        location=getValidString("please enter your location of the club : ");

        currentPresident=getValidString("please enter your current president of the club : ");

        manager=getValidString("please enter your manager of the club : ");


        stadium=getValidString("please enter the name of your stadium : ");

        FootballClub cr7 = new FootballClub(nameOfTheClub,location,currentPresident,0,0,0,0,0,0,0,manager,stadium);
        ArrayPremierLeague.add(cr7);
        System.out.println(ArrayPremierLeague);






    }

    @Override
    public void removeClubFromPremierLeague() {
        String nameOfTheClubDelete;
        nameOfTheClubDelete=getValidString("please enter your club name for remove : ");

        for (int i = 0; i < ArrayPremierLeague.size(); i++){
            if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(nameOfTheClubDelete)){
                ArrayPremierLeague.remove(i);
                System.out.println(ArrayPremierLeague);
            }



        }
    }

    @Override
    public void DisplayStatClub() {
        String clubNameSearch;


        clubNameSearch=getValidString("please enter your club name : ");

        for (int i = 0; i < ArrayPremierLeague.size(); i++) {
            if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(clubNameSearch))  {
                System.out.println(ArrayPremierLeague.get(i).getNameOfTheClub());
                System.out.println("wins -" + ArrayPremierLeague.get(i).getWins());
                System.out.println("draws -" + ArrayPremierLeague.get(i).getDraws());
                System.out.println("Defeats -" +ArrayPremierLeague.get(i).getDefeats());
                System.out.println("matches -" +ArrayPremierLeague.get(i).getNumberOfMatchesPlayed());
                System.out.println("goal for -" +ArrayPremierLeague.get(i).getNumberOfGoalsScore());
                System.out.println("goal again -" +ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats());
                System.out.println("points -" +ArrayPremierLeague.get(i).getNumberOfPoints());

            }
        }
    }

    @Override
    public void matchDayTable() {

       ArrayPremierLeague.sort(FootballClub::compareTo);   //sorting the table by points

        String leftAlignFormat = "|  %-15s  |  %-4d  | %-4d | %-4d| %-4d| %-4d | %-4d | %-4d|%-4d |%n";
        System.out.format("+-------------------+--------+------+-----+-----+------+------+-----+-----+%n");
        System.out.format("| Club name         |  MP    |  W   |  D  |  L  |  GF  |  GA  | GD  | Pts |%n");
        System.out.format("+-------------------+--------+------+-----+-----+------+------+-----+-----+%n");


 //       }
        for (FootballClub items : ArrayPremierLeague) {
            System.out.format(leftAlignFormat,
                    items.getNameOfTheClub(),
                    items.getNumberOfMatchesPlayed(),
                    items.getWins(),
                    items.getDraws(),
                    items.getDefeats(),
                    items.getNumberOfGoalsScore(),
                    items.getGetNumberOfGoalsDefeats(),
                    (items.getNumberOfGoalsScore() - items.getGetNumberOfGoalsDefeats()),
                    items.getNumberOfPoints()

            );
        }
        System.out.format("+-------------------+--------+------+-----+-----+------+------+-----+-----+%n");

    }

    @Override
    public void startMatch() {

        String firstName,secondName;
        int year,month,day,firstResult,secondResult,pass1,pass2;



        pass1=0;
        pass2=0;

        System.out.println("\n");
        System.out.println("please fill this for start a match \n");

        firstName=getValidString(" please enter your  first team name : \n");

        secondName=getValidString(" please enter your  second team name : \n");

        while (true){
            year=getValidIntegerInput(" please enter your match date (year) : \n");

            month=getValidIntegerInput(" please enter your match date (month) : \n");


           day=getValidIntegerInput(" please enter your match date (day) : \n");
            src.nextLine();
            if (dateValidatePrem(year,month,day)){
                break;
            }
        }


        firstResult=getValidIntegerInput(" please enter your first team final result after the match : \n");
        src.nextLine();

        secondResult=getValidIntegerInput(" please enter your second team final result after the match : \n");
        src.nextLine();



        MatchDay LM10 = new MatchDay(firstName,secondName,year,month,day,firstResult,secondResult);
        matchList.add(LM10);
        System.out.println(matchList);



        boolean club1Found=false;                                                           //this boolean will check if club is there
        for (int i = 0; i < ArrayPremierLeague.size(); i++) {
            if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(firstName)) {
                pass1=1;
                club1Found=true;
            }
        }
        if (!club1Found){
            System.out.println("this "+ firstName +"club is not found in premier League");
        }

        boolean club2Found=false;
        for (int i = 0; i < ArrayPremierLeague.size(); i++) {
            if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(secondName)) {
                pass2=1;
                club2Found=true;
            }
        }
        if (!club2Found){
            System.out.println("this "+ secondName +" club is not found in premier League ");
        }

        if(pass1==1 && pass2==1){
            if (firstResult >secondResult){

                for (int i = 0; i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(firstName)) {
                        ArrayPremierLeague.get(i).setWins(ArrayPremierLeague.get(i).getWins()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+firstResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+secondResult);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+3);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }

                }

            }


            else if(firstResult == secondResult){
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(firstName)) {
                        ArrayPremierLeague.get(i).setDraws(ArrayPremierLeague.get(i).getDraws()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+firstResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+secondResult);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+1);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }
                }
            }


            else if(firstResult < secondResult) {
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(firstName)) {
                        ArrayPremierLeague.get(i).setDefeats(ArrayPremierLeague.get(i).getDefeats()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+firstResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+secondResult);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);

                    }

                }
            }


        }

        if(pass1==1 && pass2==1){
            if (secondResult > firstResult){

                for (int i = 0; i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(secondName)) {
                        ArrayPremierLeague.get(i).setWins(ArrayPremierLeague.get(i).getWins()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+secondResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+firstResult);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+3);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);
                    }
                }
            }


            else if(secondResult == firstResult){
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(secondName)) {
                        ArrayPremierLeague.get(i).setDraws(ArrayPremierLeague.get(i).getDraws()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+secondResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+firstResult);
                        ArrayPremierLeague.get(i).setNumberOfPoints(ArrayPremierLeague.get(i).getNumberOfPoints()+1);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);



                    }




                }



            }


            else if(secondResult < firstResult) {
                for (int i = 0;i < ArrayPremierLeague.size(); i++) {
                    if (ArrayPremierLeague.get(i).getNameOfTheClub().equals(secondName)) {
                        ArrayPremierLeague.get(i).setDefeats(ArrayPremierLeague.get(i).getDefeats()+1);
                        ArrayPremierLeague.get(i).setNumberOfGoalsScore(ArrayPremierLeague.get(i).getNumberOfGoalsScore()+secondResult);
                        ArrayPremierLeague.get(i).setGetNumberOfGoalsDefeats(ArrayPremierLeague.get(i).getGetNumberOfGoalsDefeats()+firstResult);
                        ArrayPremierLeague.get(i).setNumberOfMatchesPlayed(ArrayPremierLeague.get(i).getNumberOfMatchesPlayed()+1);



                    }


                }

            }


        }



    }

    @Override
    public ArrayList<MatchDay> searchDate(String year ,String month , String day) {      //
        ArrayList<MatchDay> searchResultList = new ArrayList<>();
        int year1 = 0, month1 = 0, day1 = 0;


        try {
            year1 = Integer.parseInt(year);
            month1 = Integer.parseInt(month);
            day1 = Integer.parseInt(day);

        } catch (Exception e) {
            return searchResultList;
        }


        for (MatchDay match : matchList) {
            if (match.getYear() == (year1) && match.getMonth() == (month1) && match.getDay() == (day1)) {
                searchResultList.add(match);


            }

        }
        return searchResultList;


    }


    @Override
    public void fileWrite() throws IOException {
        File premierLeagueFile = new File("leagueFile.txt");
        PrintWriter writer = new PrintWriter("leagueFile.txt");
        writer.print("");                                                   //


        FileOutputStream premierFile = new FileOutputStream(premierLeagueFile,true);
        ObjectOutputStream fileInfoSoccer = new ObjectOutputStream(premierFile);


        Iterator iterator = ArrayPremierLeague.iterator();
        while (iterator.hasNext()) {
            FootballClub football_obj=(FootballClub) iterator.next();
            fileInfoSoccer.writeObject(football_obj);
            writer.close();


        }


    }

    @Override
    public void fileRead() throws IOException{
        FileInputStream fileIn= new  FileInputStream("leagueFile.txt");
        ObjectInputStream objectInP= new ObjectInputStream(fileIn);
        List<FootballClub> footballRead= new ArrayList<FootballClub>();


        while (true) {
            try {
                FootballClub scoreBook = (FootballClub) objectInP.readObject();
                footballRead.add(scoreBook);



            } catch (IOException | ClassNotFoundException e) {
                break;
            }
        }
            ArrayPremierLeague.addAll(footballRead);

    }


    @Override
    public void fileWrite1() throws IOException {
        File premierLeagueFile = new File("leagueFile2.txt");
        PrintWriter writer = new PrintWriter("leagueFile2.txt");
        writer.print("");


        FileOutputStream premierFile = new FileOutputStream(premierLeagueFile,true);
        ObjectOutputStream fileInfoSoccer = new ObjectOutputStream(premierFile);

        Iterator iterator = matchList.iterator();
        while (iterator.hasNext()) {
            MatchDay matchObj=(MatchDay) iterator.next();
            fileInfoSoccer.writeObject(matchObj);
            writer.close();
        }



    }

    @Override
    public void fileRead1() throws IOException {
        FileInputStream fileIn= new  FileInputStream("leagueFile2.txt");
        ObjectInputStream objectInP= new ObjectInputStream(fileIn);
        List<MatchDay> matchFileList= new ArrayList<MatchDay>();

        while (true) {
            try {
                MatchDay matchDay_scoreBook = (MatchDay) objectInP.readObject();
                matchFileList.add(matchDay_scoreBook);


            } catch (IOException | ClassNotFoundException e) {
                break;
            }
        }
        matchList.addAll(matchFileList);
    }

    public boolean dateValidatePrem (int year,int month , int day){
        boolean passYear;
        boolean passMonth;
        if (year<=2019 || year>2022){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  your input in out of range  >>>>>>>>>>>>>>>>>>>>>>");
            passYear=false;
        }
        else {
            passYear=true;

        }
        if (month>12 || month<0){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  your input in out of range  >>>>>>>>>>>>>>>>>>>>>>");
            passMonth=false;
        }
        else {
            passMonth=true;
        }
        if ((month==1 || month==3 || month==5 || month== 7 || month==8 || month==10  || month==12) && day>31 || day<0){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  your input in out of range  >>>>>>>>>>>>>>>>>>>>>>");
            passMonth=false;
        }
        else if(month==2 && day>28){
            System.out.println("not in the range");
            passMonth=false;
        }
        else if ((month==4 || month==6 || month==9 ||month==11 )&& day>30 || day<0){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<   your input is not in the range >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            passMonth=false;
        }
        else {
            passMonth=true;

        }

        if (passYear && passMonth){
            return true;
        }
        else {
            return false;
        }


    }

    public int getValidIntegerInput(String displayLabel){
        while (true){
            System.out.print(displayLabel);
            String uncheckedValue =src.nextLine();
            try {
             int parsstValueInt =Integer.parseInt(uncheckedValue);
             if (parsstValueInt>0){
                 return parsstValueInt;

             }
                System.out.println("not in range");

            }
            catch (Exception e){
                System.out.println("not Integer ...!! check your input and Try again");
            }

        }
    }

    public String getValidString(String displayString){
        while (true) {
            String resour = "^[a-zA-Z0-9_ ]*$";
            System.out.println(displayString);
            String unCheckedString = src.nextLine();
            if (unCheckedString.matches(resour)) {
                return unCheckedString;
            }
            System.out.println("not a String..please re check");
        }

    }


//
//    public int getValidgoalInput(String displayLabel,int range){
//        while (true){
//            System.out.print(displayLabel);
//            String uncheckedValue =src.nextLine();
//            try {
//                int parsstValueInt =Integer.parseInt(uncheckedValue);
//                if (parsstValueInt>0){
//                    if (parsstValueInt<range){
//                        return parsstValueInt;
//
//                    }
//                    System.out.println("goal is not in the range ");
//
//
//                }
//                System.out.println("not in range");
//
//            }
//            catch (Exception e){
//                System.out.println("not Integer ...!! check your input and Try again");
//            }
//
//        }
//    }

}


