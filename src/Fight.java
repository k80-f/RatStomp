/*
Name: Joshua Johnson
Date: 4/20/22
Project Name: Rat Stomp - publc class Fight. 
Project Purpose: Determines the outcome of player vs. rat confrontations.
*/

import java.util.Scanner;
import java.util.Random;

public class Fight {

    private int choice;
    private int sword;
    private int arrow;
    private int dmg;

    public void fight(String playerHealth) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        // playerHP = playerHealth;
        Player player = new Player(); // No idea how to get player information from story or player outside of the
                                      // loop.
        Rat rat = new Rat();// Rat rat = new Rat should be fine as the rat will kill the player or die
                            // during the iteration of the while loop.

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("\tYour HP: " + player.getHP());
            System.out.println("\tRat HP: " + rat.getHP());
            System.out.println("\t1 Swing Sword");
            System.out.println("\t2 Shoot Arrow");
            choice = scnr.nextInt();
            if (choice == 1) {
                sword = 10 + rand.nextInt(40);
                rat.setHP(sword);
                dmg = rat.getAP();
                player.setHP(dmg);
                System.out.println("----------------------------------------");
                System.out.println("\t>You delt " + sword + " damage to " + rat.getName() + ".");
                System.out.println("\t>You recived " + dmg + " damge in retaliation.");
                if (player.getHP() <= 0) {
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("\tYour HP: " + player.getHP());
                    System.out.println("\tYou've been slain!");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    break;
                }
                if (rat.getHP() <= 0) {
                    System.out.println("----------------------------------------");
                    System.out.println("\t" + rat.getName() + ": " + player.getName() + ", " + "I don't feel so good!");
                    System.out.println("----------------------------------------");
                    break;
                }
            } else if (choice == 2) { // rat not in range to attack player if choice is arrow
                arrow = 1 + rand.nextInt(40);
                if (arrow > 10) {
                    rat.setHP(arrow);
                    System.out.println("----------------------------------------");
                    System.out.println("\t>You delt " + arrow + " damage to " + rat.getName() + ".");
                    System.out.println("\t>You received 0 damge in retaliation.");
                }
                if (arrow <= 10) {
                    player.setHP(arrow); // player dmg's themselves
                    System.out.println("----------------------------------------");
                    System.out.println("\tYou delt 0 damgage to " + rat.getName() + ".");
                    System.out.println("\tOUCH!! You delt " + arrow + "damage to" + player.getName() + ".");
                }
                if (player.getHP() <= 0) {
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    System.out.println("\tYour HP: " + player.getHP());
                    System.out.println("\tYou've been slain!");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    break;
                }
                if (rat.getHP() <= 0) {
                    System.out.println("----------------------------------------");
                    System.out.println("\t" + rat.getName() + ": " + player.getName() + ", " + "I don't feel so good!");
                    System.out.println("----------------------------------------");
                    break;
                }
            }
        }
    }
}
