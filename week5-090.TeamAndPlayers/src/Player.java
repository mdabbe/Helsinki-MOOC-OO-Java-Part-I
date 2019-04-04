public class Player {
    private String playerName;
    private int goals;

    public Player(String playerName, int goal) {
        this.playerName = playerName;
        this.goals = goal;
    }

    public Player(String playerName) {
        this.playerName = playerName;
        this.goals=0;
    }

    public int goals() {
        return goals;
    }

    public String getName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player: " + this.playerName + ", " + "goals " + this.goals;
    }
}
