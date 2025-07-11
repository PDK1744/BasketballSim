import models.Team;
import tournament.Tournament;
import utils.HardcodedTeams;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Team> teams = HardcodedTeams.getAllTeams();
        
        Tournament tournament = new Tournament(teams);
        tournament.runTournament();
    }
}