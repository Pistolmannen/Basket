public class Player {

    private String name;
    private int playerNumber;

    public Player(String name, int playerNumber){
        this.name = name;
        this.playerNumber = playerNumber;
    }

    // get funtions for players
    public String getName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    // set funtions for players
    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
