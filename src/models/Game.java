package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Game {
    private Team teamA;
    private Team teamB;
    private int scoreA;
    private int scoreB;
    private Team winner;
    private Random rand = new Random();
    private List<PlayerStat> statLinesA = new ArrayList<>();
    private List<PlayerStat> statLinesB = new ArrayList<>();

    public Game(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Team getWinner() {
        return winner;
    }

    public void simulate() {
        do {
            List<Player> playersA = teamA.getPlayers();
            List<Player> playersB = teamB.getPlayers();


            double randomFactorA = 0.9 + rand.nextDouble() * 0.2;
            double randomFactorB = 0.9 + rand.nextDouble() * 0.2;

            int strengthA = teamA.calculateTeamStrength();
            int strengthB = teamB.calculateTeamStrength();
            scoreA = (int)(strengthA * randomFactorA);
            scoreB = (int)(strengthB * randomFactorB);
            int totalOffenseA = playersA.stream().mapToInt(Player::getOffenseRating).sum();
            int totalOffenseB = playersB.stream().mapToInt(Player::getOffenseRating).sum();

            for (Player p : playersA) {
                double scoringWeight = (double)p.getOffenseRating() / totalOffenseA;
                int playerPoints = (int)Math.round(scoringWeight * scoreA);
                int rebounds = rand.nextInt(p.getDefenseRating() / 10 + 1);
                int assists = rand.nextInt(p.getOffenseRating() / 12 + 1);
                int steals = rand.nextInt(p.getDefenseRating() / 20 + 1);
                int blocks = rand.nextInt(p.getDefenseRating() / 18 + 1);

                statLinesA.add(new PlayerStat(p, playerPoints, rebounds, assists, steals, blocks));
            }
            for (Player p : playersB) {
                double scoringWeight = (double)p.getOffenseRating() / totalOffenseB;
                int playerPoints = (int)Math.round(scoringWeight * scoreB);

                int rebounds = rand.nextInt(p.getDefenseRating() / 10 + 1);
                int assists = rand.nextInt(p.getOffenseRating() / 12 + 1);
                int steals = rand.nextInt(p.getDefenseRating() / 20 + 1);
                int blocks = rand.nextInt(p.getDefenseRating() / 18 + 1);

                statLinesB.add(new PlayerStat(p, playerPoints, rebounds, assists, steals, blocks));
            }

        } while (scoreA == scoreB);


        winner = scoreA > scoreB ? teamA : teamB;


    }

    public void displayResults() {
        System.out.println("Game Result:");
        System.out.println(teamA.getTeamName() + " " + scoreA + " - " + scoreB + " " + teamB.getTeamName());
        System.out.println("Winner: " + winner.getTeamName());
        System.out.println("---------------------");
        System.out.println();

        printBoxScore(teamA.getTeamName(), statLinesA);
        printBoxScore(teamB.getTeamName(), statLinesB);
    }

    private void printBoxScore(String teamName, List<PlayerStat> stats) {
        System.out.println("=== Box Score: " + teamName + " ===");
        System.out.printf("%-15s %5s %5s %5s %5s %5s%n", "Player", "PTS", "REB", "AST", "STL", "BLK");
        for (int i = 0; i < 45; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (PlayerStat stat : stats) {
            Player p = stat.getPlayer();


                System.out.printf("%-15s %5d %5d %5d %5d %5d%n",
                p.getPlayerName(),
                stat.getPointsThisGame(),
                stat.getReboundsThisGame(),
                stat.getAssistsThisGame(),
                stat.getStealsThisGame(),
                stat.getBlocksThisGame()
                );

            }


        System.out.println();
    }

    public void pauseForUser() {
        System.out.println("Press Enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}


