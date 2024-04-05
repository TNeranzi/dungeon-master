//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.scoalainformala;

import java.util.Arrays;
import java.util.List;

public class TimeConvertor {
    Integer skiingTimeInSeconds;
    int totalSeconds;
    int totalMinutes;
    int totalHours;

    public TimeConvertor() {
    }

    public Integer getSkiingTimeInSeconds() {
        return this.skiingTimeInSeconds;
    }

    public Integer skiingTimeConversionToSeconds(Athlete athlete) {
        List<String> sectionedTime = Arrays.asList(athlete.getSkiingTime().trim().split(":"));

        this.skiingTimeInSeconds = 0;
        if (sectionedTime.size() == 3) {
            this.skiingTimeInSeconds = this.skiingTimeInSeconds + Integer.parseInt((String)sectionedTime.get(0)) * TimeUnits.HOUR.value + Integer.parseInt((String)sectionedTime.get(1)) * TimeUnits.MINUTE.value + Integer.parseInt((String)sectionedTime.get(2)) * TimeUnits.SECOND.value;
        } else if (sectionedTime.size() == 2) {
            this.skiingTimeInSeconds = this.skiingTimeInSeconds + Integer.parseInt((String)sectionedTime.get(0)) * TimeUnits.MINUTE.value + Integer.parseInt((String)sectionedTime.get(1)) * TimeUnits.SECOND.value;
        } else if (sectionedTime.size() == 1) {
            this.skiingTimeInSeconds = Integer.parseInt((String)sectionedTime.get(0));
        }

        return this.skiingTimeInSeconds;
    }

    public Integer totalTimeInSeconds(int skiingTimeInSeconds, int penaltyInSeconds) {
        return this.totalSeconds = skiingTimeInSeconds + penaltyInSeconds;
    }

    public String reverseConvertor(int totalSeconds) {
        if (totalSeconds % TimeUnits.MINUTE.value == 0) {
            if (totalSeconds / TimeUnits.MINUTE.value < 60) {
                this.totalMinutes = totalSeconds / TimeUnits.MINUTE.value;
            } else {
                this.totalHours = totalSeconds / TimeUnits.HOUR.value;
                this.totalMinutes = totalSeconds % TimeUnits.HOUR.value;
            }
        } else if (totalSeconds % TimeUnits.MINUTE.value != 0) {
            if (totalSeconds / TimeUnits.MINUTE.value < 60) {
                this.totalMinutes = totalSeconds / TimeUnits.MINUTE.value;
                totalSeconds %= TimeUnits.MINUTE.value;
            } else {
                this.totalHours = totalSeconds / TimeUnits.HOUR.value;
                this.totalMinutes = totalSeconds % TimeUnits.HOUR.value / TimeUnits.MINUTE.value;
                totalSeconds = totalSeconds % TimeUnits.HOUR.value % TimeUnits.MINUTE.value;
            }
        }

        return this.totalHours + ":" + this.totalMinutes + ":" + totalSeconds;
    }

    public String toString() {
        return "The total time for  is: " + this.skiingTimeInSeconds + " which converts to: " + this.totalHours + " : " + this.totalMinutes + " : " + this.totalSeconds;
    }
}
