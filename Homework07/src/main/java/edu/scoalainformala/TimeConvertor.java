package edu.scoalainformala;

import java.util.Arrays;
import java.util.List;

public class TimeConvertor extends Athlete {

    Integer skiingTimeInSeconds;
    int totalSeconds;
    int totalMinutes;
    int totalHours;

    public Integer getSkiingTimeInSeconds() {
        return skiingTimeInSeconds;
    }

    public Integer skiingTimeConversionToSeconds(Athlete athlete) {

        List<String> separatedTime = Arrays.asList(athlete.getSkiingTime().trim().split(":"));

        skiingTimeInSeconds = 0;

        if (separatedTime.size() == 3)
            skiingTimeInSeconds += (Integer.parseInt(separatedTime.get(0)) * TimeUnits.HOUR.value) +
                    (Integer.parseInt(separatedTime.get(1)) * TimeUnits.MINUTE.value) +
                    (Integer.parseInt(separatedTime.get(2)) * TimeUnits.SECOND.value);
        else if (separatedTime.size() == 2)
            skiingTimeInSeconds += (Integer.parseInt(separatedTime.get(0)) * TimeUnits.MINUTE.value) +
                    (Integer.parseInt(separatedTime.get(1)) * TimeUnits.SECOND.value);
        else if (separatedTime.size() == 1)
            skiingTimeInSeconds = Integer.parseInt(separatedTime.get(0));
        return skiingTimeInSeconds;
    }

    public Integer totalTimeInSeconds(int skiingTimeInSeconds, int penaltyInSeconds) {
        return totalSeconds = skiingTimeInSeconds + penaltyInSeconds;
    }

    public String reverseConvertor() {

        if (totalSeconds % TimeUnits.MINUTE.value == 0)
            if (totalSeconds / TimeUnits.MINUTE.value < 60)
                totalMinutes = totalSeconds / TimeUnits.MINUTE.value;
            else {
                totalHours = totalSeconds / TimeUnits.HOUR.value;
                totalMinutes = totalSeconds % TimeUnits.HOUR.value;
            }
        else if (totalSeconds % TimeUnits.MINUTE.value != 0)
            if (totalSeconds / TimeUnits.MINUTE.value < 60) {
                totalMinutes = totalSeconds / TimeUnits.MINUTE.value;
                totalSeconds = totalSeconds % TimeUnits.MINUTE.value;
            } else {
                totalHours = totalSeconds / TimeUnits.HOUR.value;
                totalMinutes = (totalSeconds % TimeUnits.HOUR.value) / TimeUnits.MINUTE.value;
                totalSeconds = (totalSeconds % TimeUnits.HOUR.value) % TimeUnits.MINUTE.value;
            }

        return totalHours + " : " + totalMinutes + " : " + totalSeconds;
    }

    @Override
    public String toString() {
        return "The total time for " + " is: " + skiingTimeInSeconds + " which converts to: " + totalHours + " : " + totalMinutes + " : " + totalSeconds;
    }
}
