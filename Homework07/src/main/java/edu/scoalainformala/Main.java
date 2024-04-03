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

        for (int i = 0; i < athletes.size(); i++) {
            convertedTimes.add(timeConverter.skiingTimeConversionToSeconds(athletes.get(i)));
            penaltyTimes.add(penalty.timePenaltyInSeconds(athletes.get(i)));
            athleteTimes.add(timeConverter.totalTimeInSeconds(timeConverter.skiingTimeInSeconds, penalty.penalty));
            timeConverter.reverseConvertor();

        }

        athleteTimes.sort(new Ranking());
        for (Integer athleteTime : athleteTimes) {
            for (int i = 0; i < convertedTimes.size(); i++) {
                for (int j = 0; j < penaltyTimes.size(); j++) {
                    ranking.displayRanking(athleteTime, convertedTimes.get(i), penaltyTimes.get(j));
                }
            }
        }
    }
}
