//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.scoalainformala;

import java.util.Comparator;

public class Ranking implements Comparator<CompetitionResults> {
    public Ranking() {
    }

    public int compare(CompetitionResults firstTime, CompetitionResults secondTime) {
        int timeRank = firstTime.getAthleteTotalTime() - secondTime.getAthleteTotalTime();
        int compareTime = firstTime.getAthleteTotalTime().compareTo(secondTime.getAthleteTotalTime());
        return compareTime != 0 ? timeRank : compareTime;
    }
}
