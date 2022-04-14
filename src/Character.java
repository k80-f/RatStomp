import java.util.Random;

public class Character {  //Where does loop go when no one is looking?**

    String name;  // --Find data type to allow multiple words 
    int healthPoints; //health points
    int attackPoints; //attack points
    boolean alive; 

    //Random enemyHealth = new Random(); 
   //int i;

   public Character() {  // initialize private fields
      name = "Charlie"; 
      healthPoints = 100; 
      attackPoints = 20; 
      alive = true;  // check if this is correct way to initialize a boolean
   }

   public Character(String name, int healthPoints, int attackPoints, boolean alive) { // Allows set of private fields. 
      this.name = name; 
      this.healthPoints = healthPoints; 
      this.attackPoints = attackPoints; 
      this.alive = alive; //boolean may not be required
   }
    
   public String getName(){
       return name; 
   }
    
   public int getHP(){
       return healthPoints; 
   }
    
   public int getAP(){
       return attackPoints; 
   }
    
   public boolean isAlive() {
       return alive; 
   }

    
   // Rat rat1 = new Rat();
   // Player player1 = new Player(); 

//    while(userInput > 0){  // 1.Attack 2.shoot arrow 0.run!
//       if(userInput == 1){
//          rat1.healthPoints = rat1.healthPoints() - player1.getattackPoints();      //initialize in main code???***

//             If(rat1.HealthPoints <= 0){
//                userInput = 3;
//             }
//             else {
//                System.out.println("1. Continue the fight."); 
//                System.out.println("2. flee"); 
//                userInput = scnr.nextInt();
//             }
//   }
}