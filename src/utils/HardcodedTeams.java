package utils;
import models.Player;
import models.Team;

import java.util.ArrayList;
import java.util.List;

public class HardcodedTeams {


    public static List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();

        teams.add(new Team("Lions", List.of(
                new Player("Alex", Generator.randomRating(), Generator.randomRating()),
                new Player("Brad", Generator.randomRating(), Generator.randomRating()),
                new Player("Chris", Generator.randomRating(), Generator.randomRating()),
                new Player("Kobe", Generator.randomRating(), Generator.randomRating()),
                new Player("Evan", Generator.randomRating(), Generator.randomRating())
        )));

        teams.add(new Team("Tigers", List.of(
                new Player("Frank", Generator.randomRating(), Generator.randomRating()),
                new Player("Gabe", Generator.randomRating(), Generator.randomRating()),
                new Player("Hank", Generator.randomRating(), Generator.randomRating()),
                new Player("Ivan", Generator.randomRating(), Generator.randomRating()),
                new Player("Jake", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Sharks", List.of(
                new Player("Kyle", Generator.randomRating(), Generator.randomRating()),
                new Player("Liam", Generator.randomRating(), Generator.randomRating()),
                new Player("Max", Generator.randomRating(), Generator.randomRating()),
                new Player("Nate", Generator.randomRating(), Generator.randomRating()),
                new Player("Owen", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Wolves", List.of(
                new Player("Paul", Generator.randomRating(), Generator.randomRating()),
                new Player("Quinn", Generator.randomRating(), Generator.randomRating()),
                new Player("Ryan", Generator.randomRating(), Generator.randomRating()),
                new Player("Sean", Generator.randomRating(), Generator.randomRating()),
                new Player("Tom", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Panthers", List.of(
                new Player("Joel", Generator.randomRating(), Generator.randomRating()),
                new Player("Rahn", Generator.randomRating(), Generator.randomRating()),
                new Player("Troy", Generator.randomRating(), Generator.randomRating()),
                new Player("Dean", Generator.randomRating(), Generator.randomRating()),
                new Player("Bob", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Bobcats", List.of(
                new Player("Dave", Generator.randomRating(), Generator.randomRating()),
                new Player("Larry", Generator.randomRating(), Generator.randomRating()),
                new Player("Kevin", Generator.randomRating(), Generator.randomRating()),
                new Player("Mike", Generator.randomRating(), Generator.randomRating()),
                new Player("Terry", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Longhorns", List.of(
                new Player("Trevor", Generator.randomRating(), Generator.randomRating()),
                new Player("Nathan", Generator.randomRating(), Generator.randomRating()),
                new Player("Kasey", Generator.randomRating(), Generator.randomRating()),
                new Player("Bill", Generator.randomRating(), Generator.randomRating()),
                new Player("Steven", Generator.randomRating(), Generator.randomRating())
        )));
        teams.add(new Team("Dragons", List.of(
                new Player("Rand", Generator.randomRating(), Generator.randomRating()),
                new Player("Wil", Generator.randomRating(), Generator.randomRating()),
                new Player("Perrin", Generator.randomRating(), Generator.randomRating()),
                new Player("Lan", Generator.randomRating(), Generator.randomRating()),
                new Player("Loail", Generator.randomRating(), Generator.randomRating())
        )));

        return teams;
    }
}
