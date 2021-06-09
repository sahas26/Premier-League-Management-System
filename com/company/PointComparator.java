package com.company;

import java.util.Comparator;

public class PointComparator implements Comparator<FootballClub> {

    @Override
    public int compare (FootballClub firstClub , FootballClub secondClub){
        if (firstClub.getNumberOfPoints() > secondClub.getNumberOfPoints())
            return -1;
        else
            if (firstClub.getNumberOfPoints() < secondClub.getNumberOfPoints())
                return 1;
            else {
                int GoalDifferent = firstClub.getNumberOfGoalsScore() - firstClub.getGetNumberOfGoalsDefeats();
                int GoalDifferent1= firstClub.getNumberOfGoalsScore() - firstClub.getGetNumberOfGoalsDefeats();
                if (GoalDifferent < GoalDifferent1)
                    return -1;
                else
                    if (GoalDifferent1 <GoalDifferent)
                        return 1;
                    else return 0;
            }

    }



}
