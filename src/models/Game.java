package models;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Team teamA;
    private Team teamB;
    private int scoreA;
    private int scoreB;
    private Team winner;
    private Random rand = new Random();

    public Game(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Team getWinner() {
        return winner;
    }

    public void simulate() {
        do {
            double randomFactorA = 0.9 + rand.nextDouble() * 0.2;
            double randomFactorB = 0.9 + rand.nextDouble() * 0.2;

            int strengthA = teamA.calculateTeamStrength();
            int strengthB = teamB.calculateTeamStrength();
            scoreA = (int)(strengthA * randomFactorA);
            scoreB = (int)(strengthB * randomFactorB);
        } while (scoreA == scoreB);


        winner = scoreA > scoreB ? teamA : teamB;


    }

    public void displayResults() {
        System.out.println("Game Result:");
        System.out.println(teamA.getTeamName() + " " + scoreA + " - " + scoreB + " " + teamB.getTeamName());
        System.out.println("Winner: " + winner.getTeamName());
        System.out.println("---------------------");
    }

    public void pauseForUser() {
        System.out.println("Press Enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}


