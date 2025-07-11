package tournament;

import models.Game;
import models.Team;


import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private List<Team> teams;

    public Tournament(List<Team> teams) {
        this.teams = teams;
    }

    public void runTournament() {
        while (teams.size() > 1) {
            System.out.println("Starting new round with " + teams.size() + " teams");
            teams = playRound(teams);
        }
        System.out.println("Tournament champion is: " + teams.get(0).getTeamName());
    }

    public List<Team> playRound(List<Team> currentTeams) {
        List<Team> winners = new ArrayList<>();

        for (int i = 0; i < currentTeams.size(); i += 2) {
            Team teamA = currentTeams.get(i);
            Team teamB = currentTeams.get(i + 1);

            Game game = new Game(teamA, teamB);
            game.simulate();
            game.displayResults();
            game.pauseForUser();

            winners.add(game.getWinner());
        }

        return winners;
    }
}
