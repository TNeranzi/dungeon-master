package edu.scoalainformala;

public class Athlete {

    protected int athleteNumber;
    protected String athleteName;
    protected String country;
    protected String skiingTime;
    protected String firstShootingRound;
    protected String secondShootingRound;
    protected String thirdShootingRound;
    protected int missedShots;
    protected int penaltyTime;


    public Athlete(int athleteNumber, String athleteName, String country, String skiingTime, String firstShootingRound, String secondShootingRound, String thirdShootingRound) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.country = country;
        this.skiingTime = skiingTime;
        this.firstShootingRound = firstShootingRound;
        this.secondShootingRound = secondShootingRound;
        this.thirdShootingRound = thirdShootingRound;
    }

    public Athlete(String firstShootingRound, String secondShootingRound, String thirdShootingRound) {
        this.firstShootingRound = firstShootingRound;
        this.secondShootingRound = secondShootingRound;
        this.thirdShootingRound = thirdShootingRound;
    }

    public Athlete(int missedShots, int penaltyTime) {
        this.missedShots = missedShots;
        this.penaltyTime = penaltyTime;
    }

    public Athlete(String skiingTime) {

        this.skiingTime = skiingTime;
    }

    public Athlete() {
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkiingTime() {
        return skiingTime;
    }

    public void setSkiingTime(String skiingTime) {
        this.skiingTime = skiingTime;
    }

    public String getFirstShootingRound() {
        return firstShootingRound;
    }

    public void setFirstShootingRound(String firstShootingRound) {
        this.firstShootingRound = firstShootingRound;
    }

    public String getSecondShootingRound() {
        return secondShootingRound;
    }

    public void setSecondShootingRound(String secondShootingRound) {
        this.secondShootingRound = secondShootingRound;
    }

    public String getThirdShootingRound() {
        return thirdShootingRound;
    }

    public void setThirdShootingRound(String thirdShootingRound) {
        this.thirdShootingRound = thirdShootingRound;
    }

    public int getMissedShots() {
        return missedShots;
    }

    public void setMissedShots(int missedShots) {
        this.missedShots = missedShots;
    }

    public int getPenaltyTime() {
        return penaltyTime;
    }

    public void setPenaltyTime(int penaltyTime) {
        this.penaltyTime = penaltyTime;
    }

    @Override
    public String toString() {
        return "edu.scoalainformala.Athlete{" +
                "atheleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", country='" + country + '\'' +
                ", skiingTime='" + skiingTime + '\'' +
                ", firstShootingRound='" + firstShootingRound + '\'' +
                ", secondShootingRound='" + secondShootingRound + '\'' +
                ", thirdShootingRound='" + thirdShootingRound + '\'' +
                ", missedShots=" + missedShots +
                ", penaltyTime=" + penaltyTime +
                '\n';
    }
}
