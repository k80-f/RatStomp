/*
* Main method that runs the game. Cycles through each story chapter,
* pulling from the Story class. Stops when user has won or dies.
*
* @author Katharine Frechette
*/

public class Main {
    public static void main(String[] args){
        Story story = new Story();

        story.rollSceneOne();
        story.rollSceneTwo();
        story.rollSceneThree();
        story.rollSceneFour();
    }
}