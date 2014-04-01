## The Game
When the player first enters the game, they are greeted by [a tutorial](./Testee-Use-Case:-Tutorial:-Stage-1#waypoint-race). These slides explain the interface and controls for this part of the game.

After going through the tutorial, the player may start the game by pressing 'start game'.

The user will see a number of colored arrows on screen, pointing towards **waypoints** that have been placed throughout the environment. Also onscreen, the player sees how long they have been in the game. They are being timed! The player will use one of these on screen arrows to find its corresponding waypoint. When the player reaches a waypoint, it disappears, and so does its guiding arrow. A timestamp of when they reached the waypoint is placed on screen. The player then repeats this process with the remaining arrows and waypoints, until all waypoints have been reached.  

The game will then start again. The player will repeat the game a set number of times. Each time, the player will try to improve their times for reaching the waypoints.

### Notes
* The waypoints may be navigated to in _any_ order, this is to encourage the player to take multiple routes and learn the environment.
* The waypoints could either to abstract (glowing light pillars) or concrete (the player is a mailman/paperboy going on their daily route!)

## Second Phase: Testing
Having played the way point game, we suspect that the player will remember aspects of the environment.

[Optimizing Path Test](./Testee-Use-Case:-Test:-Optimizing-Path)

[Labyrinth/Lost Test](./Testee-Use-Case:-Test:-Labyrinth)