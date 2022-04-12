import java.lang.ref.Cleaner;

import javax.swing.plaf.synth.SynthDesktopIconUI;

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
    public Player player = new Player();
    public int inputInt = -999;
    public String inputString = " ";
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
        System.out.println("1 Stable my horse and see if they room and drink for a weary traveler");
        System.out.println("2 Take my chances and set up camp outside for the night. Who knows who or what is inside this place.");
        System.out.println("");
        System.out.println("Choose a number:");
        inputInt = window.inputInt();

        // Prompt player to pick an option until existing one is chosen
        while (true) {
            if (inputInt == 1 ){
                System.out.println("");
                System.out.println("You set your horse up in the stable, and head to the front door. \n" +
                "\n" +
                "There's a doormat that says, \"Wipe Yer Feet Or They'll Get Eat\" so you oblige before \n" +
                "turning the knob.");
                break;
            }
            else if (inputInt == 2){
                System.out.println("");
                System.out.println("Sadly, climate change is real and the resulting extreme weather causes a flash flood \n"+
                "that kills you in your sleep. Your horse lives though, because this isn't that kind of game.");
                title.printGameOver();
                break;
            }
            else {
                System.out.println("Choose a number:");
                inputInt = window.inputInt();
            }
        }
        window.cont();
    }

    public void rollSceneTwo(){
        System.out.println("Inside, surprisingly, is a beautiful warm tavern. Roaring cozy fireplaces, smiling servers \n" +
        "carrying cartoonishly large and ornate beer tankardss, and comfortable patrons \n" +
        "lounging around large wooden tables.");
        window.cont();

        System.out.println("Adventurer: Might be a dream but at least I'm not naked in this one.");
        System.out.println("");
        System.out.println("");
        System.out.println("1 Grab a drink from the bar");
        System.out.println("2 Grab a drink from someone’s hand");
        System.out.println("");
        System.out.println("Choose a number:");
        System.out.println("");
        inputInt = window.inputInt();

        /* Prompt player to pick an option until existing one is chosen
        * User will have to do option 1 no matter what, so loop immediately breaks if that is chosen.
        */
        while (true) {
            if (inputInt == 1) {
                window.clear();
                break;
            }
            else if (inputInt == 2) {
                System.out.println("You march up to the biggest and meanest looking sonofa in the room and attempt \n" +
                "to snatch the tankard from his hand. The tankard, of course, does not budge an inch, and the man \n" +
                "stands up, peers down at you from several feet above your head, \n" +
                "and raises a closed fist…");
                window.cont();

                System.out.println("You flinch, but nothing happens. You open your eyes to see his fist now open \n" +
                "with a few copper coins in the middle of his palm. Deeply confused, you look up at the man.");
                window.cont();

                System.out.println("Man: I threw my youth away robbing strangers, child. Stole everything I could get my hands on,\n" +
                "but was only ever left with hate in my heart and no friends to call when I needed them. \n" +
                "This is not the way. Here, buy yourself a drink. Choose a different path next time.");
                window.cont();

                System.out.println("Adventurer: I thought this would be a fighting game.");
                window.cont();

                System.out.println("You turn back to the rest of the room. \n" +
                "\n" +
                "Adventurer: Guess I'll head to the bar.");
                System.out.println("");
                break;
            }
            else {
                System.out.println("Choose a number:");
                inputInt = window.inputInt();
            }
        }

        System.out.println("You mosey over to the bar, which is empty of patrons except for two old men slumped in their stools,  \n" +
        "snoring. Without looking up from polishing a glass, the barkeep, a small wiry man with gray hair and \n" +
        "glasses says, \"What'll you have?\"");
        window.cont();

        System.out.println("But then he looks up and sees your weapons. He looks you in the eye and sets down the glass...");
        window.cont();

        System.out.println("Barkeep: You can have all the beer and food you want plus coin and a room to sleep in if \n" +
        "you help me with a little problem. What's your name?");
        System.out.println("");
        System.out.println("Adventurer: Oh, uhh");
        window.cont();

        System.out.println("Enter Your Name:");
        // player.setName(window.inputString());
        // heroName = player.getName();
        window.cont();

        // TODO: add hero name
        System.out.println("Barkeep: Well {{name}}, my name is Murray and this here tavern is cursed.");
        window.cont();

        System.out.println("{{name}}: I don't remember curses being part of this trope but go on.");
        window.cont();

        System.out.println("Murray the Barkeep: Well, all you need to know is I might have served a bog witch a stale bit of bread \n" +
        "and since we don't have yelp in this universe, she filled my basement with gigantic demon rats. I need an adventurer \n" +
        "such as yourself to clear them out.");
        System.out.println("");
        System.out.println("You examine your dirty clothes, empty stomach, and even emptier pockets and sigh.");
        window.cont();

        System.out.println("{{name}}: Let's get it over with!");
        window.cont();

        System.out.println("Murray points to the basement door and tries not to look too worried as you walk away.");
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
