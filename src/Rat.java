/*Name: Joshua Johnson
  Date: 4/20/22
  Program Name: Rat Stomp - Public Class Rat
  Program date: Auto generates rat characters with trails in class Character and assigns them random health points and attack points. 
*/
import java.util.Random;  
public class Rat extends Character {
    
    private Character rat; 
    Random dice = new Random();
    
    public Rat() {
       rat = new Character(); 
     }
    
    public Rat(int healthPoints, int attackPoints) {
       rat.healthPoints = 1 + dice.nextInt(40); 
       rat.attackPoints = 1 + dice.nextInt(20); 
    }
}
 
 