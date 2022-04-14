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