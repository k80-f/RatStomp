/*
Name: Joshua Johnson
date: 4/20/22
Program Name: Rat Stomp - Public Class Character
Program Purpose: To set up, initialize, and allow user to update information for player characters and rat characters. Additonally, houses the fight class which determines the outcome of player vs. rat confrontations. 
*/

public class Character {  
    String name;  
    int healthPoints; //health points
    int attackPoints; //attack points
    boolean alive; 
    
   public Character() {  // initialize private fields
      name = "Randy"; 
      healthPoints = 100; 
      attackPoints = 20; 
      alive = true;  
   }
   public Character(String name, int healthPoints, int attackPoints, boolean alive) { // Allows set of private fields. 
      this.name = name; 
      this.healthPoints = healthPoints; 
      this.attackPoints = attackPoints; 
      this.alive = alive;
   }
   public void setName(String inputName) {
      this.name = inputName;
   }
    public String getName(){
       return name; 
   }
    public int getHP(){
       return healthPoints; 
   }
    public void setHP(int dmg){ //dmg name can be anything? Correct? 
       this.healthPoints = this.healthPoints - dmg;
   }
    public int getAP(){
       return attackPoints; 
   }
    public boolean isAlive() {
       return alive; 
   }   
}
           
          
        
  
  
  
   


