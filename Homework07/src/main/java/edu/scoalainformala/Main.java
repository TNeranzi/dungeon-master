package edu.scoalainformala;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Athlete> athletes = new ArrayList<>();
        MyFileReader csv = new MyFileReader();
        csv.readFromCSV("biathlon_athletes.csv", athletes);

        TimeConvertor timeConverter = new TimeConvertor();
        PenaltyCalculator penalty = new PenaltyCalculator();

        List<CompetitionResults> competitionResults = new ArrayList<>();

        for (Athlete athlete : athletes) {
            int skiingTimeInSeconds = timeConverter.skiingTimeConversionToSeconds(athlete);

            int penaltyTime = penalty.timePenaltyInSeconds(athlete);

            int totalTime = timeConverter.totalTimeInSeconds(timeConverter.skiingTimeInSeconds, penalty.penalty);

            competitionResults.add(new CompetitionResults(athlete, skiingTimeInSeconds, penaltyTime, totalTime));
        }

        competitionResults.sort(new Ranking());

        for (CompetitionResults results : competitionResults) {
            System.out.println(results.printResults(competitionResults.indexOf(results)));
        }
    }
}