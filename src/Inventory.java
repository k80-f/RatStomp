public class Inventory {
  
    private String inv[] = new String[] {"empty", "empty", "empty", "empty", "empty"};
  
    public void addItemToInv(String name) {
      for (int i = 0; i < inv.length; ++i) {
        if (inv[i] == "empty") {
          inv[i] = name;
          
          System.out.println("You have added: " + name + ".");
          return;
        }
      }
     System.out.println("You have no room in your inventory.");
   }
   
   public void printInv() {
     for (String x: inv) {
      System.out.print("[" + x + "] ");
     }
   }
  
   public void removeItemFromInv(String name) {
     for (int i = 0; i < inv.length; i++) {
       if (inv[i].equals(name)) {
         inv[i] = "empty";
       }
     }
     System.out.println("You have removed: " + name + ".");
   }
  
  public void useItemFromInv(String name) {
    for (int i = 0; i < inv.length; i++) {
      if (inv[i].equals(name)) {
        //Uses item?
      }
    }
    System.out.println("You used " + name + ".");
  }
    
}