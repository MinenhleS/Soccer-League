package soccer;

import java.util.*;

public class League {

    public static void main(String[] args) {


        Team[] theTeams = createTeams();

        Game[] theGames = createGames(theTeams);



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


        //set teamName
        theTeams[0].teamName = "The Greens";
        theTeams[1].teamName = "The Reds";

        //set the playerArray attribute of the Team to thePlayers
        theTeams[0].playerArray = thePlayers;

        //Creating 3 element array and assigning it to playeyerArray
        theTeams[1].playerArray = new Player[3];

        //Add player to the 1st element
        theTeams[1].playerArray[0] = new Player();
        theTeams[1].playerArray[0].playerName = "Robert Service";


        //Adding two players to the second and third element
        theTeams[1].playerArray[1] = new Player();
        theTeams[1].playerArray[1].playerName = "Robbie Burns";
        theTeams[1].playerArray[2] = new Player();
        theTeams[1].playerArray[2].playerName = "Rafael Sabatini";



        for (Player thePlayer: theTeams[1].playerArray) {
            System.out.println(thePlayer.playerName);
        }




        // Creating and populating  home and away team attributes
        Game currGame = theGames[0];

        int numberOfGoals = (int)(Math.random() * 7);
        Goal[] theGoals = new Goal[numberOfGoals];
        //System.out.println(theGoals.length);


        currGame.goals = theGoals;

        GameUtils.addGameGoals(currGame);

        // Creating goal object
//        Goal goal1 = new Goal();
//        goal1.thePlayer = currGame.homeTeam.playerArray[2];
//        goal1.theTeam = currGame.homeTeam;
//        goal1.theTime = 55;
//
//        //putting goal object to the array
//        Goal[] theGoals = {goal1};
//        currGame.goals = theGoals;

//        //Printing the Score
//        System.out.println("Goal scored after " +
//                currGame.goals[0].theTime + " mins by " +
//                currGame.goals[0].thePlayer.playerName + " of " +
//                currGame.goals[0].theTeam.teamName);


        //Testing whether a match is found for "Sab"
        for (Player thePlayer: theTeams[1].playerArray) {
            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found " + thePlayer.playerName);
                System.out.println("Last name is " +
                        thePlayer.playerName.split(" ")[1]);
            }
        }

        //Instatiating string builder
        StringBuilder familyNameFirst = new StringBuilder();

        for (Player thePlayer: theTeams[0].playerArray) {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);

            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }






    }


    public static Team[] createTeams() {
        Team team1 = new Team();
        Team team2 = new Team();

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams) {

        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];

        Game[] theGames = {theGame};
        return theGames;

    }

}
