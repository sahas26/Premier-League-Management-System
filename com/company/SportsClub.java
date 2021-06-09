package com.company;

import java.io.Serializable;
import java.util.Objects;

public class SportsClub implements Serializable {
    private static final long seralVersionUID = 6433858223774886977L;     //(deshan sir's video)

    private String nameOfTheClub;
    private String location;
    private String currentPresident;

    public SportsClub(){


    }
    public SportsClub(String nameOfTheClub, String location, String currentPresident) {
        super();

        this.nameOfTheClub = nameOfTheClub;
        this.location = location;
        this.currentPresident = currentPresident;
    }

    public String getNameOfTheClub() {
        return nameOfTheClub;
    }

    public void setNameOfTheClub(String nameOfTheClub) {
        this.nameOfTheClub = nameOfTheClub;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCurrentPresident() {
        return currentPresident;
    }

    public void setCurrentPresident(String currentPresident) {
        this.currentPresident = currentPresident;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportsClub that = (SportsClub) o;
        return Objects.equals(nameOfTheClub, that.nameOfTheClub) &&
                Objects.equals(location, that.location) &&
                Objects.equals(currentPresident, that.currentPresident);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheClub, location, currentPresident);
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "nameOfTheClub='" + nameOfTheClub + '\'' +
                ", location='" + location + '\'' +
                ", currentPresident='" + currentPresident + '\'' +
                '}';
    }
}
