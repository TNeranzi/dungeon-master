package edu.scoalainformala;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MyFileReader {

    Athlete athlete;

    public void readFromCSV(String fileName, List<Athlete> athlete) throws IOException {
        BufferedReader fromCSV = new BufferedReader(new FileReader(fileName));

        String line = fromCSV.readLine(); // Skips the header

        while ((line = fromCSV.readLine()) != null) {
            String[] fields = line.split(";");
            int athleteNumber = Integer.parseInt(fields[0]);
            String athleteName = fields[1];
            String country = fields[2];
            String skiingTime = fields[3];
            String firstShootingRound = fields[4];
            String secondShootingRound = fields[5];
            String thirdShootingRound = fields[6];

            athlete.add(new Athlete(athleteNumber, athleteName, country, skiingTime, firstShootingRound, secondShootingRound, thirdShootingRound));
        }
    }


}
