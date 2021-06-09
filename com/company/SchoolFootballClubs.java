package com.company;

import java.util.Objects;

public class SchoolFootballClubs extends FootballClub {
    private String nameOfTheSchool;



    public SchoolFootballClubs(String nameOfTheClub, String location, String currentPresident ,int wins, int draws, int defeats, int numberOfGoalsScore, int getNumberOfGoalsDefeats, int numberOfPoints, int numberOfMatchesPlayed, String manager, String stadium ,String nameOfTheSchool) {
        super(nameOfTheClub, location, currentPresident , wins,  draws,defeats, numberOfGoalsScore, getNumberOfGoalsDefeats,numberOfPoints,numberOfMatchesPlayed, manager,  stadium);

        this.nameOfTheSchool = nameOfTheSchool;
    }

    public String getNameOfTheSchool() {
        return nameOfTheSchool;
    }

    public void setNameOfTheSchool(String nameOfTheSchool) {
        this.nameOfTheSchool = nameOfTheSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolFootballClubs that = (SchoolFootballClubs) o;
        return Objects.equals(nameOfTheSchool, that.nameOfTheSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCode(), nameOfTheSchool);
    }
}
