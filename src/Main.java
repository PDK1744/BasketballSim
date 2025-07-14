import models.Team;
import tournament.Tournament;
import utils.HardcodedTeams;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Team> teams = HardcodedTeams.getAllTeams();
//        System.out.println(teams.get(0).getPlayers());
        Tournament tournament = new Tournament(teams);
        tournament.runTournament();
    }
}