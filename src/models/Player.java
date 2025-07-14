package models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int offenseRating;
    private int  defenseRating;
    private int overallRating;
    private Player player;




    public Player(String name, int offenseRating, int defenseRating) {
        this.name = name;
        this.offenseRating = offenseRating;
        this.defenseRating = defenseRating;
        this.overallRating = (offenseRating + defenseRating) / 2;
        //this.pointsThisGame = pointsThisGame;

    }

    public int getOffenseRating() {
        return offenseRating;
    }



    public int getDefenseRating() {
        return defenseRating;
    }

    public String getPlayerName() {
        return name;
    }

    public int getOverallRating() {
        return overallRating;
    }


    public void simulatePlayerStats(int teamScore) {
        // Randomly generate stats based on off. & def. rating.
        List<PlayerStat> statLines = new ArrayList<>();
//        int totalOffense = player.stream
    }

//    public void resetStats() {
//        pointsThisGame = 0;
//    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', offense=" + offenseRating + ", defense=" + defenseRating + "}";
    }
}
