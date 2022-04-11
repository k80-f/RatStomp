/*
*
* Class that prints title "graphics" throughout the game.
* 
* @authors Katharine Frechette, Ellis Schmidt, Joshua Johnson
*
*/

public class Title {

    // Strings storing the titles
    private String gameTitle =         
        "\n" +    
        "\n" +      
        "    ██████╗  █████╗ ████████╗    ███████╗████████╗ ██████╗ ███╗   ███╗██████╗ \n" +
        "    ██╔══██╗██╔══██╗╚══██╔══╝    ██╔════╝╚══██╔══╝██╔═══██╗████╗ ████║██╔══██╗\n" +
        "    ██████╔╝███████║   ██║       ███████╗   ██║   ██║   ██║██╔████╔██║██████╔╝\n" +
        "    ██╔══██╗██╔══██║   ██║       ╚════██║   ██║   ██║   ██║██║╚██╔╝██║██╔═══╝ \n" +
        "    ██║  ██║██║  ██║   ██║       ███████║   ██║   ╚██████╔╝██║ ╚═╝ ██║██║     \n" +
        "    ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚══════╝   ╚═╝    ╚═════╝ ╚═╝     ╚═╝╚═╝ \n" +
        "\n" +    
        "\n";

    private String tavernSign = 
        "\n" +  
        "\n" +  
        "   ▄▄▄▄▀ ▄  █ ▄███▄         ▄▀  █▄▄▄▄ ▄███▄   ██      ▄▄▄▄▄ ▀▄    ▄        ▄    ██   ▄█ █ \n" +
            "▀▀▀ █   █   █ █▀   ▀      ▄▀    █  ▄▀ █▀   ▀  █ █    █     ▀▄ █  █          █   █ █  ██ █     \n" +
            "    █   ██▀▀█ ██▄▄        █ ▀▄  █▀▀▌  ██▄▄    █▄▄█ ▄  ▀▀▀▀▄    ▀█       ██   █  █▄▄█ ██ █     \n" +
            "    █   █   █ █▄   ▄▀     █   █ █  █  █▄   ▄▀ █  █  ▀▄▄▄▄▀     █        █ █  █  █  █ ▐█ ███▄  \n" +
            "   ▀        █  ▀███▀       ███     █   ▀███▀      █           ▄▀        █  █ █     █  ▐     ▀ \n" +
            "            ▀                      ▀              █                     █   ██    █           \n" +
            "                                                  ▀                              ▀           \n" +
        "\n" +    
        "\n"  ;
    private String gameOver = 
        "\n" +  
        "\n" +  
        "     _____          __  __ ______    ______      ________ _____   \n" +
        "    / ____|   /\\   |  \\/  |  ____|  / __ \\ \\    / /  ____|  __ \\ \n" +
        "   | |  __   /  \\  | \\  / | |__    | |  | \\ \\  / /| |__  | |__) | \n" +
        "   | | |_ | / /\\ \\ | |\\/| |  __|   | |  | |\\ \\/ / |  __| |  _  / \n" +
        "   | |__| |/ ____ \\| |  | | |____  | |__| | \\  /  | |____| | \\ \\ \n" +
        "    \\_____/_/    \\_\\_|  |_|______|  \\____/   \\/   |______|_|  \\_\\ \n" +
        "\n" +    
        "\n" +
        "                    .:*feel free to try again*:. \n" +
        "";

    // Methods that print the titles
    public void printGameTitle(){
        System.out.println(gameTitle);
    }
    
    public void printTavernSign(){
        System.out.println(tavernSign);
    }

    public void printGameOver(){
        System.out.println(gameOver);
    }
}