package com.company;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;


public class MatchDay implements Serializable,Comparable<MatchDay> {
    private static final long seralVersionUID = 6433858223774886977L;     //(deshan sir's video)


    String firstClub;
    String secondClub;
    int year;
    int month;
    int day;
    int firstTeamResult;
    int secondTeamResult;



    @Override
    public String toString() {
        return "MatchDay{" +
                "firstClub='" + firstClub + '\'' +
                ", secondClub='" + secondClub + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", firstTeamResult=" + firstTeamResult +
                ", secondTeamResult=" + secondTeamResult +
                '}';
    }



    public MatchDay(String firstClub, String secondClub, int year, int month, int day, int firstTeamResult, int secondTeamResult) {
        this.firstClub = firstClub;
        this.secondClub = secondClub;
        this.year = year;
        this.month = month;
        this.day = day;
        this.firstTeamResult = firstTeamResult;
        this.secondTeamResult = secondTeamResult;
    }


    public String getFirstClub() {
        return firstClub;
    }

    public void setFirstClub(String firstClub) {
        this.firstClub = firstClub;
    }

    public String getSecondClub() {
        return secondClub;
    }

    public void setSecondClub(String secondClub) {
        this.secondClub = secondClub;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getFirstTeamResult() {
        return firstTeamResult;
    }

    public void setFirstTeamResult(int firstTeamResult) {
        this.firstTeamResult = firstTeamResult;
    }

    public int getSecondTeamResult() {
        return secondTeamResult;
    }

    public void setSecondTeamResult(int secondTeamResult) {
        this.secondTeamResult = secondTeamResult;
    }


    @Override
    public int compareTo(MatchDay o) {
        if (year==o.year){
            if (month==o.month){
                return day-o.day;
            }
           return month-o.month;
        }

        return year-o.year;
    }


//    public static void valiDate(String date){
//        DateTimeFormatter SwipingDate = DateTimeFormatter.ofPattern("dd/mm/uuuu");
//        try {
//            Formatter.parse(date);
//            System.out.println("valid Date");
//
//        }
//        catch (Exception e){
//            System.out.println("invalid");
//        }
//    }
}
