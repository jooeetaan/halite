import hlt.*; //java helper code for interacting witht he API
import java.util.ArrayList; //array list for commands

//Do not use println...
public class MyBot
{
  public static void main(String [] args)
  {
    Game game = new Game(); //The game variable has map data. Do any processing here.
    //10 seconds to do any processing
    game.ready("BotNameHere"); //Once this is called, there is a 2 second timer started.

    Log.log("Player id is " + game.myId);

    //Player objects have id, shipyard, and halite amount.
    Player me = game.me;
    GameMap gameMap = game.gameMap;
    /* METHODS - substitute name of player object
    player.getship(ship_id);
    player.getships(); -> returns all ship IDS;
    player.has_ship(ship_id) -> does it exist
    player.get_dropoff(dropoff_id) -> returns dropoff
    player.get_dropoffs();
    */

    //game.players -> dictionary
    //iterate by using
      //for player in game.players



    for(;;) //infinite game loop
    //sends the game state to players and processes commands returns from players
    {
      game.updateFrame(); //gets new Frame
      ArrayList<Command> commandQueue = new ArrayList<>();

      for(Ship ship : me.ships.values())
      {
        commandQueue.add(ship.stayStill());
      }

      //end turns with the command that need to be sent.
      game.endTurn(commandQueue);
    }
  }
}
