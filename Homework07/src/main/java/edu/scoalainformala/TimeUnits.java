package edu.scoalainformala;

public enum TimeUnits {

    //Time units in seconds
    HOUR(3600),
    MINUTE(60),
    SECOND(1);

    final int value;

    public int getValue() {
        return value;
    }

    TimeUnits(int value) {

        this.value = value;
    }
}
