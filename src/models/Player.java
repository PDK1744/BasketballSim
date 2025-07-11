package models;

public class Player {
    private String name;
    private int offenseRating;
    private int  defenseRating;
    private int overallRating;
    private int pointsThisGame;

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

    public int getOverallRating() {
        return overallRating;
    }


    public void simulatePerformance() {
        // Randomly generate stats based on off. & def. rating.
    }

    public void resetStats() {
        pointsThisGame = 0;
    }
}
