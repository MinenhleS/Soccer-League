package soccer;

public class League {

    public static void main(String[] args) {

    // Declaring and instantiating a first player and set its playerName
        Player player1 = new Player();
        player1.playerName = "George Eliot";

    // Declaring and instantiating a second player..
        Player player2 = new Player();
        player2.playerName = "Graham Greene";


        // Declaring and instantiating a second player..
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";


        //Creating player array called the Players
        Player[] thePlayers = { player1, player2, player3 };

        //Declaring and instatiating Team object
        Team team1 = new Team();

        //set teamName to "The Greens"
        team1.teamName = "The Greens";

        //set the playerArray attribute of the Team to thePlayers
        team1.playerArray = thePlayers;

        player1.playerName = "Robert Service";

        for (Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }


    }
}
