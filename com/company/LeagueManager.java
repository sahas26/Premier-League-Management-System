package com.company;

import java.io.IOException;
import java.util.ArrayList;

public interface LeagueManager {

    public void addYourClub();

    public void removeClubFromPremierLeague();

    public void DisplayStatClub();

    public void matchDayTable();

    public void startMatch();

    public ArrayList<MatchDay> searchDate(String year , String month , String day);

    public void fileWrite() throws IOException;

    public void fileRead() throws IOException;

    public void fileWrite1() throws IOException;

    public void fileRead1() throws IOException;



}


