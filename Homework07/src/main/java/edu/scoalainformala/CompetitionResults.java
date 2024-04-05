//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package edu.scoalainformala;

public class CompetitionResults {
    protected Athlete athlete;
    protected Integer results;
    protected Integer totalPenalty;
    protected Integer athleteTotalTime;

    public CompetitionResults(Athlete athlete, Integer results, Integer totalPenalty, Integer athleteTotalTime) {
        this.athlete = athlete;
        this.results = results;
        this.totalPenalty = totalPenalty;
        this.athleteTotalTime = athleteTotalTime;
    }

    public Athlete getAthlete() {
        return this.athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Integer getResults() {
        return this.results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getTotalPenalty() {
        return this.totalPenalty;
    }

    public void setTotalPenalty(Integer totalPenalty) {
        this.totalPenalty = totalPenalty;
    }

    public Integer getAthleteTotalTime() {
        return this.athleteTotalTime;
    }

    public void setAthleteTotalTime(Integer athleteTotalTime) {
        this.athleteTotalTime = athleteTotalTime;
    }

    public String printResults(int index) {
        TimeConvertor timeConverter = new TimeConvertor();
        String athleteFullName = this.getAthlete().getAthleteName();


        while (index <3) {
            switch (index) {
                case 0:
                    return "Winner - " + athleteFullName + " "
                            + timeConverter.reverseConvertor(this.getAthleteTotalTime())
                            + " (" + timeConverter.reverseConvertor(this.getResults())
                            + " + " + this.getTotalPenalty() + ")";
                case 1:
                    return "Runner-up - " + athleteFullName + " "
                            + timeConverter.reverseConvertor(this.getAthleteTotalTime())
                            + " (" + timeConverter.reverseConvertor(this.getResults())
                            + " + " + this.getTotalPenalty() + ")";
                case 2:
                    return "Third Place - "
                            + athleteFullName + " "
                            + timeConverter.reverseConvertor(this.getAthleteTotalTime())
                            + " (" + timeConverter.reverseConvertor(this.getResults())
                            + " + " + this.getTotalPenalty() + ")";
            }
        }
        return (index + 1) + ". "
                + athleteFullName + " "
                + timeConverter.reverseConvertor(this.getAthleteTotalTime()) + " ("
                + timeConverter.reverseConvertor(this.getResults()) + " + "
                + this.getTotalPenalty() + ")";

    }
}
