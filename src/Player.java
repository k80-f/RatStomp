/*Name: Joshua Johnson
  Date: 4/20/22
  Program Name: Rat Stomp - Public Class Player
  Program date: Allows the user to create a characrter with trails from class Character. 
*/

import java.util.Random; 

public class Player extends Character {
   
    private Character player;
    Random dice = new Random(); 
    
    public Player() { 
       player = new Character(); 
    }

    public Character generatePlayer(String name, int healthPoints, int attackPoints) {
        this.name = name;
        player.healthPoints = 1 + dice.nextInt(100); 
        player.attackPoints = 1 + dice.nextInt(50); 
        return player;
     }
   
 }
    