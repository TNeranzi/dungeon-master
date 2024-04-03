package edu.scoalainformala;

import java.util.List;

public class PenaltyCalculator extends TimeConvertor {

    int penalty;
    Character shotFired;

    public PenaltyCalculator() {
    }

    public int timePenaltyInSeconds(Athlete shotsPerRound) {

//        shotsPerRound = new Athlete(firstShootingRound, secondShootingRound, thirdShootingRound);
        List<String> shotsPerPerson;

        String shotsStatus = shotsPerRound.getFirstShootingRound() +
                shotsPerRound.getSecondShootingRound() +
                shotsPerRound.getThirdShootingRound();
        shotsPerPerson = List.of(shotsStatus);

        penalty = 0;
        shotFired = null;

        for (String perPerson : shotsPerPerson) {
            for (int i = 0; i < perPerson.length(); i++) {
                shotFired = perPerson.charAt(i);

                if (shotFired.equals('o')) {
                    penalty += 10;
                } else if (!shotFired.equals('x')) {
                    System.out.println("Invalid character.");
                }
            }
        }
        return penalty;
    }

    @Override
    public String toString() {
        return " penalty    : " + penalty;
    }
}
