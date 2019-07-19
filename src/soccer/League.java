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
        Team team2 = new Team();

        //set teamName
        team1.teamName = "The Greens";
        team2.teamName = "The Reds";

        //set the playerArray attribute of the Team to thePlayers
        team1.playerArray = thePlayers;

        //Creating 3 element array and assigning it to playeyerArray
        team2.playerArray = new Player[3];

        //Add player to the 1st element
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";


        //Adding two players to the second and third element
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";



        for (Player thePlayer: team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }




        // Creating and populating  home and away team attributes
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;

        // Creating goal object
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        //putting goal object to the array
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        //Printing the Score
        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);


        //Testing whether a match is found for "Sab"
        for (Player thePlayer: team2.playerArray) {
            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last name is " +
                        thePlayer.playerName.split(" ")[1]);
            }
        }




    }
}
