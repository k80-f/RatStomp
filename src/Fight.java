/* ***************************
   Name: Joshua Johnson
   Date: 4/20/22
   Project Name: Rat Stomp - publc class Fight
   Project Purpose: Determines the outcome of player vs. rat confrontations.
******************************/

import java.util.Scanner;
import java.util.Random;

public class Fight {

   Scanner scnr = new Scanner(System.in);

   private int playerHP;
   private int ratHP;

   public Fight() {
      this.playerHP = -1;
      this.ratHP = -1;
   }

   public void printPlayerHP() {
      int x = playerHPGetter();
      System.out.println("Your HP: " + x); // prints player health points.
   }

   public void playerHPSetter(int playerHP) {
      this.playerHP = playerHP;
   }

   public int playerHPGetter() {
      return playerHP;
   }

   public void printRatHP() {
      int y = ratHPGetter();
      System.out.println("Rat HP: " + y); // prints Rat Health points.
   }

   public void ratHPSetter(int ratHealth) {
      this.ratHP = ratHealth;
   }

   public int ratHPGetter() {
      return ratHP;
   }

   public void printDashLine() {
      System.out.println("-----------------------------------------------");
   }

   public void printXLine() {
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
   }

   public int fightLoop(String n, int h, String ratN, int ratH, int ratA) {
      Random rand = new Random();
      int playerHealth = h;
      String playerName = n;
      int ratHealth = ratH;
      String ratName = ratN;
      int ratDmg = ratA;
      int choice = 1;
      int sword;
      int arrow;
      int num1 = 1;
      int num2 = 2;
      int num3 = 3;
      int num4 = 0;

      while (choice != 3) {
         printDashLine();
         playerHPSetter(playerHealth);
         printPlayerHP();
         ratHPSetter(ratHealth);
         printRatHP();
         System.out.println("\t1. Swing Sword");
         System.out.println("\t2. Shoot Arrow");
         System.out.println("\t3. Run");
         choice = scnr.nextInt();
         if (choice == 1) {
            sword = 1 + rand.nextInt(25);
            ratHealth = ratHealth - sword;
            playerHealth = playerHealth - ratDmg;
            playerHPSetter(playerHealth);
            ratHPSetter(ratHealth);
            printDashLine();
            System.out.println("\t>You dealt " + sword + " damage to " + ratName + ".");
            System.out.println("\t>You received " + ratDmg + " damage in retaliation.");
            if (playerHealth <= 0) {
               printXLine();
               printPlayerHP();
               System.out.println("\tYou've been slain!");
               printXLine();
               return num1;

            }
            if (ratHealth <= 0) {
               printDashLine();
               System.out.println("\t" + ratName + ": " + playerName + ", " + "I don't feel so good!");
               printDashLine();
               return num2;

            }
         } else if (choice == 2) { // rat not in range to attack player if choice is arrow
            arrow = 1 + rand.nextInt(40);
            if (arrow > 10) {
               ratHealth = ratHealth - arrow;
               ratHPSetter(ratHealth);
               printDashLine();
               System.out.println("\t>You dealt " + arrow + " damage to " + ratName + ".");
               System.out.println("\t>You received 0 damage in retaliation.");
            }
            if (arrow <= 10) {
               playerHealth = playerHealth - arrow; // **player dmg's themselves**
               playerHPSetter(playerHealth);
               printDashLine();
               System.out.println("\tYou dealt 0 damage to " + ratName + ".");
               System.out.println("\tOUCH!! You dealt " + arrow + " damage to " + playerName + ".");
            }
            if (playerHealth <= 0) {
               printXLine();
               printPlayerHP();
               System.out.println("\tYou've been slain!");
               printXLine();
               return num1;

            }
            if (ratHealth <= 0) {
               printDashLine();
               System.out.println("\t" + ratName + ": " + playerName + ", " + "I don't feel so good!");
               printDashLine();
               return num2;

            }
         } else if (choice == 3) {// Ends loops if choice is 3
            return num3;

         } else { // Repeats loop if 1-3 is not entered
         }

      } // end of loop
      return num4;
   } // End of method
}
