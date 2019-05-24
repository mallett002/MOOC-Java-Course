package week5.TeamAndPlayers;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();
    private int maxTeamSize;

    public Team(String name) {
        this.name = name;
        this.maxTeamSize = 16;
    }

    public void addPlayer(Player player) {
        if (this.players.size() < this.maxTeamSize) {
            this.players.add(player);
        }
    }

    public void setMaxSize(int number) {
        this.maxTeamSize = number;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int total = 0;
        for (Player player : this.players) {
            total += player.goals();
        }
        return total;
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public String getName() {
        return this.name;
    }
}
