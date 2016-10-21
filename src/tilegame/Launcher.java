package tilegame;

import display.Display;

/**
 * Created by handris on 21.10.16..
 */
public class Launcher {
    public static void main(String[] args){
        Game game = new Game("Title", 400, 400);
        game.start();
    }
}
