package com.company;

import java.util.Objects;

public class UniversityFootballClub extends FootballClub {
    private String nameOfTheUniversity;



    public UniversityFootballClub(String nameOfTheClub, String location, String currentPresident ,int wins, int draws, int defeats, int numberOfGoalsScore, int getNumberOfGoalsDefeats, int numberOfPoints, int numberOfMatchesPlayed, String manager, String stadium ,String nameOfTheUniversity) {
        super(nameOfTheClub, location, currentPresident , wins,  draws,defeats, numberOfGoalsScore, getNumberOfGoalsDefeats,numberOfPoints,numberOfMatchesPlayed, manager,  stadium);

        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityFootballClub that = (UniversityFootballClub) o;
        return Objects.equals(nameOfTheUniversity, that.nameOfTheUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheUniversity);
    }
}
