/*
Ellis Schmidt
04/20/22 
Rat Stomp
Methods that create and allow user to interact with Inventory
*/

//Inventory Class
public class Inventory {
  
  private String inv[] = new String[] {"empty", "empty", "empty", "empty", "empty"};
  
  //Adds item to inventory  
  public void addItemToInv(String name) {
    for (int i = 0; i < inv.length; ++i) {
      if (inv[i] == "empty") {
        inv[i] = name;
        
        System.out.println("You added " + name + " to your inventory.");
        return;
      }
    }
   System.out.println("You have no room in your inventory.");
 }
 
 //Prints out all items in inventory
 public void printInv() {
   for (String x: inv) {
    System.out.print("[" + x + "] ");
   }
 }
 
 //Removes Item from Inventory
 public void removeItemFromInv(String name) {
   for (int i = 0; i < inv.length; i++) {
     if (inv[i].equals(name)) {
       inv[i] = "empty";
     }
   }
   System.out.println("You removed " + name + " from your inventory.");
 }
  
}