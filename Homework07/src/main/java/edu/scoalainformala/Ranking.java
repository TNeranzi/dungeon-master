package edu.scoalainformala;

import java.util.Comparator;

public class Ranking extends PenaltyCalculator implements Comparator<Integer> {

    @Override
    public int compare(Integer firstTime, Integer secondTime) {

        int timeRank = firstTime - secondTime;
        int compareTime = firstTime.compareTo(secondTime);

        return (compareTime != 0) ? timeRank : compareTime;
    }

    public void displayRanking(Integer seconds, int skiingTimeInSeconds, int penaltyInSeconds) {

        int matchTimes = Integer.compare(seconds, totalTimeInSeconds(skiingTimeInSeconds, penaltyInSeconds));

        if (matchTimes == 0)
            System.out.println(reverseConvertor());

    }
}