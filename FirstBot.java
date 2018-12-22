import hlt.*; //java helper code for interacting witht he API
import java.util.ArrayList; //array list for commands

public class FirstBot
{
  public static void main(String [] args)
  {
    Game game = new Game(); //The game variable has map data. Do any processing here.

    game.ready("BotNameHere"); //Once this is called, there is a 2 second timer started.

    for(;;) //infinite game loop
    {
      game.updateFrame(); //gets new Frame
      ArrayList<Command> commandQueue = new ArrayList<>();
    }
  }
}
