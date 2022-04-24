/*
*
* This is a text-based adventure game!
* Main method that runs the game. Cycles through each story chapter,
* pulling from the Story class. Stops when user has won, dies, or quits.
*
* @author Katharine Frechette
*/

public class Main {
    public static void main(String[] args){
        Story story = new Story();

        // Go through each scene of story
        story.rollSceneOne();
        story.rollSceneTwo();
        story.rollSceneThree();
    }
}