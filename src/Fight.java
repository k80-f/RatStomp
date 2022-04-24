/* ***************************
   Authors: Joshua Johnson & Katharine Frechette
   Date: 4/20/22
   Project Name: Rat Stomp - public class Fight
   Project Purpose: Determines the outcome of player vs. rat confrontations.
******************************/

import java.util.Scanner;
import java.util.Random;

public class Fight {

   Scanner scnr = new Scanner(System.in);

   // Private fields
   private int playerHP;
   private int ratHP;

   // Constructor
   public Fight() {
      this.playerHP = -1;
      this.ratHP = -1;
   }

   // Print player's hit points
   public void printPlayerHP() {
      int x = getPlayerHP();
      System.out.println("Your HP: " + x); // prints player health points.
   }

   // Getter and setter for player's hit points
   public void setPlayerHP(int playerHP) {
      this.playerHP = playerHP;
   }

   public int getPlayerHP() {
      return playerHP;
   }

   // Print rat's hit points
   public void printRatHP() {
      int y = getRatHO();
      System.out.println("Rat HP: " + y); // prints Rat Health points.
   }

   // Getter and setter for rat's hit points
   public void setRatHP(int ratHealth) {
      this.ratHP = ratHealth;
   }

   public int getRatHO() {
      return ratHP;
   }

   // Print methods for formatting console
   public void printDashLine() {
      System.out.println("-----------------------------------------------");
   }

   public void printXLine() {
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
   }

   // Battle loop
   public int fightLoop(String n, int h, String ratN, int ratH, int ratA) {
      Random rand = new Random();
      int playerHealth = h;
      String playerName = n;
      int ratHealth = ratH;
      String ratName = ratN;
      int ratDmg = ratA;
      int choice = 0;
      int sword;
      int arrow;
      int num1 = 1;
      int num2 = 2;
      int num3 = 3;

      // Loop through battle, prompt user to enter option until existing one is entered
      while (true) {
         printDashLine();
         setPlayerHP(playerHealth);
         printPlayerHP();
         setRatHP(ratHealth);
         printRatHP();

         // Fight options
         System.out.println("");
         System.out.println("\t1 Swing Sword (Aim for his big gross face)");
         System.out.println("\t2 Shoot Arrow (BEWARE!! Chance of recoil damage!)");
         System.out.println("\t3 Run (Like a weenie)");
         System.out.println("");
         System.out.println("Enter Your Choice, Quick!");
         choice = scnr.nextInt();

         // Outcomes of each option
         // Sword attack
         if (choice == 1) {
            // Generate sword damage amount
            sword = 1 + rand.nextInt(25);
            ratHealth = ratHealth - sword;
            playerHealth = playerHealth - ratDmg;
            setPlayerHP(playerHealth);
            setRatHP(ratHealth);
            printDashLine();
            
            // Display attack outcome
            System.out.println("\t>You dealt " + sword + " damage to " + ratName + ".");
            System.out.println("\t>You received " + ratDmg + " damage in retaliation.");
            
            // Player death check
            if (playerHealth <= 0) {
               printXLine();
               printPlayerHP();
               System.out.println("\tYou've been slain!");
               printXLine();
               return num1;
            }
            // Rat death check
            if (ratHealth <= 0) {
               printDashLine();
               System.out.println("\t" + ratName + ": " + playerName + ", I don't feel so good!");
               printDashLine();
               return num2;
            }
         } 
         // Arrow attack
         else if (choice == 2) {
            // Generate arrow damage amount. Rat not in range to attack player if arrow is chosen.
            arrow = 1 + rand.nextInt(40);
            
            if (arrow > 10) {
               ratHealth = ratHealth - arrow;
               setRatHP(ratHealth);
               printDashLine();

               // Display attack outcome
               System.out.println("\t>You dealt " + arrow + " damage to " + ratName + ".");
               System.out.println("\t>You received 0 damage in retaliation.");
            }
            // Check to see if arrow afflicts recoil damage
            if (arrow <= 10) {
               playerHealth = playerHealth - arrow;
               setPlayerHP(playerHealth);
               printDashLine();
               System.out.println("\tYou dealt 0 damage to " + ratName + ".");
               System.out.println("\tOUCH!! You dealt " + arrow + " recoil damage to " + playerName + ".");
            }

            // Player death check
            if (playerHealth <= 0) {
               printXLine();
               printPlayerHP();
               System.out.println("\tYou've been slain!");
               printXLine();
               return num1;
            }
            // Rat death check
            if (ratHealth <= 0) {
               printDashLine();
               System.out.println("\t" + ratName + ": " + playerName + ", I don't feel so good!");
               printDashLine();
               return num2;
            }
         } 
         // Run away
         else if (choice == 3) {
            return num3;
         }
      } // End of loop
   } // End of method
}
