package com.company;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportsClub implements Comparable<FootballClub>, Serializable {  //bitecode widiyata save krnnanm aniwa serializable wenna oni clz eka
    private static final long seralVersionUID = 6433858223774886977L;    //(deshan sir's video) //serialization id

    private int wins;
    private int draws;
    private int defeats;
    private int numberOfGoalsScore;
    private int getNumberOfGoalsDefeats;
    private int numberOfPoints;
    private int numberOfMatchesPlayed;
    private String manager;
    private String stadium;
    private int goalDifference;

    public int getGoalDifference() {
        return goalDifference=numberOfGoalsScore-getNumberOfGoalsDefeats;
    }

    public FootballClub(String nameOfTheClub, String location, String currentPresident , int wins, int draws, int defeats, int numberOfGoalsScore, int getNumberOfGoalsDefeats, int numberOfPoints, int numberOfMatchesPlayed, String manager, String stadium) {
        super(nameOfTheClub, location,  currentPresident);

        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.numberOfGoalsScore = numberOfGoalsScore;
        this.getNumberOfGoalsDefeats = getNumberOfGoalsDefeats;
        this.numberOfPoints = numberOfPoints;
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
        this.manager = manager;
        this.stadium = stadium;

    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getNumberOfGoalsScore() {
        return numberOfGoalsScore;
    }

    public void setNumberOfGoalsScore(int numberOfGoalsScore) {
        this.numberOfGoalsScore = numberOfGoalsScore;
    }

    public int getGetNumberOfGoalsDefeats() {
        return getNumberOfGoalsDefeats;
    }

    public void setGetNumberOfGoalsDefeats(int getNumberOfGoalsDefeats) {
        this.getNumberOfGoalsDefeats = getNumberOfGoalsDefeats;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfMatchesPlayed() {
        return numberOfMatchesPlayed;
    }

    public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
        this.numberOfMatchesPlayed = numberOfMatchesPlayed;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballClub that = (FootballClub) o;
        return wins == that.wins &&
                draws == that.draws &&
                defeats == that.defeats &&
                numberOfGoalsScore == that.numberOfGoalsScore &&
                getNumberOfGoalsDefeats == that.getNumberOfGoalsDefeats &&
                numberOfPoints == that.numberOfPoints &&
                numberOfMatchesPlayed == that.numberOfMatchesPlayed &&
                Objects.equals(manager, that.manager) &&
                Objects.equals(stadium, that.stadium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCode(), wins, draws, defeats, numberOfGoalsScore, getNumberOfGoalsDefeats, numberOfPoints, numberOfMatchesPlayed, manager, stadium);
    }


    @Override
    public int compareTo(FootballClub clubG) {
        //When the both clubs earned same Number of points objects are gone to compare with there goal difference
        if(numberOfPoints==clubG.numberOfPoints){
            int GD1 = numberOfGoalsScore-getGetNumberOfGoalsDefeats();
            int GD2 = clubG.numberOfGoalsScore-clubG.getGetNumberOfGoalsDefeats();
            return GD2-GD1;
        }

        //For descending order
        return clubG.numberOfPoints-numberOfPoints;

    }
}
