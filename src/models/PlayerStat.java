package models;

public class PlayerStat {
    private Player player;
    private int pointsThisGame;
    private int reboundsThisGame;
    private int assistsThisGame;
    private int blocksThisGame;
    private int stealsThisGame;

    public PlayerStat(Player player,
                      int pointsThisGame,
                      int reboundsThisGame,
                      int assistsThisGame,
                      int blocksThisGame,
                      int stealsThisGame) {
        this.player = player;
        this.pointsThisGame = pointsThisGame;
        this.reboundsThisGame = reboundsThisGame;
        this.assistsThisGame = assistsThisGame;
        this.blocksThisGame = blocksThisGame;
        this.stealsThisGame = stealsThisGame;

    }

    public Player getPlayer() {
        return player;
    }

    public int getPointsThisGame() {
        return pointsThisGame;
    }

    public int getReboundsThisGame() {
        return reboundsThisGame;
    }


    public int getAssistsThisGame() {
        return assistsThisGame;
    }

    public int getBlocksThisGame() {
        return blocksThisGame;
    }

    public int getStealsThisGame() {
        return stealsThisGame;
    }
}
