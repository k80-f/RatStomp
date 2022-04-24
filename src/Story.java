
/*
*
* Class containing the story, calls all other classes except Main.
* 
* @authors Ellis Schmidt, Joshua Johnson, Katharine Frechette
*
*/
import java.util.Scanner;
import static java.lang.System.exit;
import java.util.Random;

public class Story {

    // Create objects from other classes and init variables
    public Title title = new Title();
    public Window window = new Window();
    public Character player = new Character();
    public Character rat = new Character();
    public Inventory inventory = new Inventory();
    public Scanner scnr = new Scanner(System.in);
    public int inputInt = -999;
    public String heroName;
    public String weapon;
    public Fight fight = new Fight();
    Random rand = new Random();

    // Scene one, find tavern
    public void rollSceneOne() {
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
        System.out.println("\t1 Stable my horse and see if they have room and drink for a weary traveler");
        System.out.println("\t2 Take my chances and set up camp outside for the night. Who knows who or what is inside this place.");
        System.out.println("");
        System.out.println("Choose A Number:");
        inputInt = scnr.nextInt();

        // Prompt player to pick an option until existing one is chosen
        while (true) {
            if (inputInt == 1) {
                window.clear();
                System.out.println("You set your horse up in the stable, and head to the front door. \n" +
                        "\n" +
                        "There's a doormat that says, \"Wipe Yer Feet Or They'll Get Eat\" so you oblige before \n" +
                        "turning the knob.");
                break;
            } else if (inputInt == 2) {
                window.clear();
                System.out.println( "Sadly, climate change is real and the resulting extreme weather causes a flash flood \n" +
                                "that kills you in your sleep. Your horse lives though, because this isn't that kind of game.");
                title.printGameOver();
                break;
            } else {
                System.out.println("Choose A Number:");
                inputInt = scnr.nextInt();
            }
        }
        window.cont();
    }

    // Scene two, learn of and accept quest
    public void rollSceneTwo() {
        System.out.println("Inside, surprisingly, is a beautiful warm tavern. Roaring cozy fireplaces, smiling servers \n" +
                        "carrying cartoonishly large and ornate beer tankardss, and comfortable patrons \n" +
                        "lounging around large wooden tables.");
        window.cont();

        System.out.println("Adventurer: Might be a dream but at least I'm not naked in this one.");
        System.out.println("");
        System.out.println("");
        System.out.println("\t1 Grab a drink from the bar");
        System.out.println("\t2 Grab a drink from someone’s hand");
        System.out.println("");
        System.out.println("Choose A Number:");
        System.out.println("");
        inputInt = scnr.nextInt();

        /*
         * Prompt player to pick an option until existing one is chosen
         * User will have to do option 1 no matter what, so loop immediately breaks if that's chosen
         */
        while (true) {
            if (inputInt == 1) {
                window.clear();
                break;
            } 
            else if (inputInt == 2) {
                window.clear();
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
                System.out.println("");
                inventory.addItemToInv("Copper Coins");
                window.cont();

                System.out.println("You turn back to the rest of the room. \n" +
                        "\n" +
                        "Adventurer: Guess I'll head to the bar.");
                System.out.println("");
                break;
            } 
            else {
                System.out.println("Choose A Number:");
                inputInt = scnr.nextInt();
            }
        }

        System.out.println("You mosey over to the bar, which is empty of patrons except for two old men slumped in their stools, \n" +
                        "snoring. Without looking up from polishing a glass, the barkeep, a small wiry man with gray hair and \n" +
                        "glasses says, \"What'll you have?\"");
        window.cont();

        System.out.println("But then he looks up and sees your weapons. He looks you in the eye and sets down the glass...");
        window.cont();

        System.out.println("Barkeep: You can have all the beer and food you want plus coin and a room to sleep in if \n" +
                        "you help me with a little problem. What's your name?");
        System.out.println("");
        System.out.println("Adventurer: Oh, uhh");
        System.out.println("");

        System.out.println("Enter Your Name:");
        player.setName(window.inputString());
        heroName = player.getName();
        window.clear();

        System.out.println("Barkeep: Well " + heroName + ", my name is Murray and this here tavern is cursed.");
        window.cont();

        System.out.println(heroName + ": I don't remember curses being part of this trope but go on.");
        window.cont();

        System.out.println( "Murray the Barkeep: Well, all you need to know is I might have served a bog witch a stale bit of bread \n" +
                        "and since we don't have Yelp in this universe, she put a gigantic demon rat in my basement. I need an adventurer \n" +
                        "such as yourself to clear it out.");
        System.out.println("");
        System.out.println("You examine your dirty clothes, empty stomach, and even emptier pockets and sigh.");
        window.cont();

        System.out.println(heroName + ": Let's get it over with!");
        window.cont();

        System.out.println("Murray points to the basement door and tries not to look too worried as you walk away.");
    }

    // Scene three, battle
    public void rollSceneThree() {
        System.out.println("The stairs creak as you descend into the darkness. \n" +
                "Towards the bottom is a lantern that you flip on, and it floods most of the small room with light.");
        window.cont();

        System.out.println("It is your standard tavern basement, with barrels and crates littered \n" +
                "around and a few dusty shelves full of old supplies. The not standard part is \n" +
                "the pair of glowing red eyes staring back at you from a corner the light can’t quite reach.");
        window.cont();

        System.out.println(heroName + ": Alrighty let’s see how bad my day is about to be.");
        window.cont();

        System.out.println("A rat leaps from the shadows, and you’re able to see it in all its glory. \n" +
                "\n" +
                "Giant, spooky, gross glory.");
        window.cont();

        // Start battle, return outcome 1-3
        int battle = fight.fightLoop(player.getName(), player.getHP(), rat.getName(), rat.getHP(), rat.getAP());

        // Generate ending based on battle outcome
        if (battle == 1) {
            title.printGameOver();
            exit(0);
        } else if (battle == 2) {
            rollSceneFour();
        } else if (battle == 3) {
            System.out.println("");
            System.out.println("You've run away! You collect no reward and everyone calls you a weenie for the rest of your life. How embarrassing.");

            title.printGameOver();
            exit(0);
        }
    }

    // Scene four, collect reward
    public void rollSceneFour() {
        // collect reward
        System.out.println("");
        System.out.println("");
        System.out.println(heroName + ": Oh wow I did it!");
        window.cont();
        System.out.println("As the rat crumbles into demon dust, you look down and see it dropped a sack!");
        window.cont();
        System.out.println("Like any good adventurer, you reach down and pick it up.");
        window.cont();

        System.out.println("As you lift the cloth sack into your hand and open it you see a large diamond  \n" +
                        "worth enough to pay for everything you will ever need! Sick.");
        System.out.println("");
        inventory.addItemToInv("Diamond");
        System.out.println("");
        System.out.println("You exit the basement and head back up to the tavern to collect your reward from Murray the Barkeep.");
        window.cont();

        System.out.println("Right as you walk through the door Murray the Barkeep has a look of disbelief.");
        System.out.println("");
        System.out.println("Murray the Barkeep: I... I... uh... didn't think you would actually make it!?");
        window.cont();

        System.out.println(heroName + ": It wouldn't make a good story if I died now would it?");
        System.out.println("");
        System.out.println("Murray the Barkeep: Well a deal is a deal. Here are your rewards!");
        window.cont();

        // ride into sunset
        System.out.println("Murray the Barkeep hands you a small sack of gold coins.");
        System.out.println("");
        inventory.addItemToInv("Gold Coins");
        System.out.println();
        System.out.println("He also offers you a night at the inn, if you'd like.");
        System.out.println("");
        System.out.println("");
        System.out.println("\t1 Stay the night at the inn");
        System.out.println("\t2 Leave and take your chances with the night");
        System.out.println("");
        System.out.println("Choose A Number:");
        System.out.println("");
        inputInt = scnr.nextInt();

        // Loop through options until user selects one that exists
        while (true) {
            if (inputInt == 1) {
                System.out.println("");
                System.out.println("You wash the demon rat out of your hair and party all night with the rest of the tavern folk. \n" +
                                "One of them even ends up being the love of your life, because we love a happy ending...");
                break;
            } else if (inputInt == 2) {
                System.out.println("");
                System.out.println("Murray the Barkeep wishes you well and you ride off into the sunset with your newfound fame and fortune...");
                break;
            } else {
                System.out.println("Choose A Number:");
                inputInt = scnr.nextInt();
            }
        }
        title.printYouWon();
    }
}
