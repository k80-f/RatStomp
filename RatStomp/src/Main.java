/*
* Main method that runs the game. Cycles through each story chapter,
* pulling from the Story class. Stops when user has won or dies.
*
* @authors Ellis Schmidt, Joshua Johnson, Katharine Frechette
*/

public class Main {
    public static void main(String[] args){
        Story story = new Story();

        story.rollSceneOne();
        story.rollSceneTwo();
    }
}