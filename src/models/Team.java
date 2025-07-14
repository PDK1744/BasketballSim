package models;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int calculateTeamStrength() {
        int sum = 0;
        for (Player player : players) {
            int offense = player.getOffenseRating();
            int defense = player.getDefenseRating();
            sum += offense + defense;
        }
        int average = sum / players.size();
        return average;
    }




}
