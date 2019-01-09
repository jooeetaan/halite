//baseline bot to beat
//PITA to beat, refuses to move
import hlt.*;
import java.util.ArrayList;

public class MyBot
{
  public static void main (String [] args)
  {
    Game game = new Game();

    game.ready("NotAI");

    Player me = game.me;
    GameMap gameMap = game.gameMap;


    for(int i = 0; i > -1; i++)
    {
      game.updateFrame();
      ArrayList<Command> commandQueue = new ArrayList<>();

      EntityId[] ships  = new EntityId[4];
      if (i == 5)
      {
        int counter = 0;
        for (Ship ship : me.ships.values())
        {
          ships[counter] = ship.id;
          counter++;
        }
      }
      if(i < 5)
      {
          if (i < 4) commandQueue.add(me.shipyard.spawn());
          for (Ship ship : me.ships.values())
          {
            if (gameMap.at(ship.position) == gameMap.at(me.shipyard))
            {
              if (i == 1) commandQueue.add(ship.move(Direction.NORTH));
              if (i == 2) commandQueue.add(ship.move(Direction.EAST));
              if (i == 3) commandQueue.add(ship.move(Direction.SOUTH));
              if (i == 4) commandQueue.add(ship.move(Direction.WEST));
            }
          }
      }
      else
      {
        for(int j = 0; j < 4; j++)
        {
          for(Ship ship : me.ships.values())
          {
            if (ship.id.equals(ships[j]))
            {
              if (j == 1) commandQueue.add(ship.move(Direction.NORTH));
              if (j == 2) commandQueue.add(ship.move(Direction.EAST));
              if (j == 3) commandQueue.add(ship.move(Direction.SOUTH));
              if (j == 4) commandQueue.add(ship.move(Direction.WEST));
            }
          }

        }
      }

      game.endTurn(commandQueue);
    }
  }
}
