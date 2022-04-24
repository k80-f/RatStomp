/*
Name: Joshua Johnson
date: 4/20/22
Program Name: Rat Stomp - Public Class Character
Program Purpose: To set up, initialize, and allow user to update information for player characters and rat characters.  
*/

public class Character {  
    private String name;  
    private int healthPoints; //health points
    private int attackPoints; //attack points
    private boolean alive; 
    
   public Character() {  // initialize private fields
      this.name = "Randy the Rat"; 
      this.healthPoints = 100; 
      this.attackPoints = 20; 
      this.alive = true;  
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
    public void setHP(int health){        //dmg name can be anything? Correct? 
       this.healthPoints = health;
   }
    public int getAP(){
       return attackPoints; 
   }
    public void setAP(int aP){
       this.attackPoints = aP;
    }
    public boolean isAlive() {
       return alive; 
   }   
}