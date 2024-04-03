package edu.scoalainformala;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        List<Athlete> athletes = new ArrayList<>();
        MyFileReader csv = new MyFileReader();
        csv.readFromCSV("biathlon_athletes.csv", athletes);

        Athlete athlete = new Athlete();
        TimeConvertor timeConverter = new TimeConvertor();
        List<Integer> convertedTimes = new ArrayList<>();
        PenaltyCalculator penalty = new PenaltyCalculator();
        List<Integer> penaltyTimes = new ArrayList<>();
        Ranking ranking = new Ranking();
        List<Integer> athleteTimes = new ArrayList<>();

        for (Athlete value : athletes) {
            convertedTimes.add(timeConverter.skiingTimeConversionToSeconds(value));
            penaltyTimes.add(penalty.timePenaltyInSeconds(value));
            athleteTimes.add(timeConverter.totalTimeInSeconds(timeConverter.skiingTimeInSeconds, penalty.penalty));
            timeConverter.reverseConvertor();

        }

        athleteTimes.sort(new Ranking());
        for (Integer athleteTime : athleteTimes) {
            for (Integer convertedTime : convertedTimes) {
                for (Integer penaltyTime : penaltyTimes) {
                    ranking.displayRanking(athleteTime, convertedTime, penaltyTime);
                }
            }
        }
    }
}
