# Guide to Halite Rules and API

## Rules

* Start with 5,000 Stored Halite
* 1 Shipyard
* Knowledge of the game map
* Each turn, the game sends positions of all the ships and dropoffs, and an updated map
* Players have 2 seconds to issue commands


* Players play in groups of 2/4 on a 32, 40, 48, 56, or 64 x itself sqaure map with a symmetric halite position.

* Ship actions
  * Move
    * If a ship moves into another ship, they collide and drop their halite
    * If 2+ ships belong to an opponent within a 4 cell radius, the ship is inspired and receives 200% collection bonus
  * Collect Halite
  * Convert into a dropoff
  
* Spending halite (Cost)
  * Spawn (1000)
  * Convert into dropoff (4000) - Halite dropped off adds to this amount
  * Move N/S/E/W - (10% of current halite at cell deducted from ship)
    * Moving over a shipyard/dropoff deposits the cargo
  * Stay still - gain 25% of halite in cell. Ships carry up to 1000 halite.
  
* Win Conditions
  * After 400 to 500 turns, player with most halite stored wins.
  * If a player can not construct a ship or have enough energy to, they are dead.
## API
