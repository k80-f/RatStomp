/*
*
* Class containing the story, calls all other classes except Main.
* 
* @authors Ellis Schmidt, Joshua Johnson, Katharine Frechette
*
*/

public class Story {
    public Title title = new Title();
    public Window window = new Window();
    public int inputInt;
    public String inputString;
    public String heroName;
    
    public void rollSceneOne(){
        title.printGameTitle();
        window.cont();

        System.out.println("Welcome, Adventurer!");
        window.cont();

        System.out.println("Your story begins...");
        window.cont();

        System.out.println("Thunder claps above you. A thick wall of rain blocks all but \n" +
        "the few feet in front of your horse as you charge down what you can only hope is a road.");

        System.out.println("");

        System.out.println("It has been several days of no rest, little water, \n" +
        "and only a few crumbs of food rations left from the last town.");
        window.cont();

        System.out.println("Thunder claps again, and the next lightning strike briefly illuminates \n" + 
        "the top of a hill nearby. The silhouette of a rickety building flashes there, and you \n" +
        "point your trusty exhausted companion in its direction.");
        System.out.println("");

        System.out.println("As you grow closer, the building takes shape in the dark. \n" +
        "Lanterns in the front windows cast a soft glow over a sign above the door...");
        window.cont();

        title.printTavernSign();
        window.cont();

        System.out.println("Adventurer: Sounds...cozy? I think I'll...");
        System.out.println("");
        System.out.println("##This is a text adventure RPG! Choose a number and learn your fate!##");
        System.out.println("");
        System.out.println("1. Stable my horse and see if they room and drink for a weary traveler");
        System.out.println("2. Take my chances and set up camp outside for the night. Who knows who or what is inside this place.");
        System.out.println("");
        System.out.println("Choose a number:");
        inputInt = window.inputInt();
        if (inputInt == 1 ){
            System.out.println("");
            System.out.println("");
            System.out.println("You set your horse up in the stable, and head to the front door. \n" +
            "\n" +
            "There's a doormat that says, \"Wipe Yer Feet Or They'll Get Eat\" so you oblige before \n" +
            "turning the knob.");
        }
        else if (inputInt == 2){
            System.out.println("");
            System.out.println("");
            System.out.println("Sadly, climate change is real and the resulting extreme weather causes a flash flood \n"+
            "that kills you in your sleep. Your horse lives though, because this isn't that kind of game.");
            title.printGameOver();

            // TODO: Maybe add in option to go back here?
        }
    }

    public void rollSceneTwo(){
        //enter tavern
        //meet barkeep or stranger
        //accept quest
    }

    public void rollSceneThree(){
        //go down to basement
        //choose weapon
        //generate number of rats & stats
        //battle
    }

    public void rollSceneFour(){
        //collect reward
        //ride into sunset
    }
}
