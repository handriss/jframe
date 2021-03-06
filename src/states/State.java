package states;


import tilegame.Game;

import java.awt.*;

public abstract class State {

    protected Game game;

    public State(Game game){

    }

    public abstract void tick();

    public abstract void render(Graphics g);

    private static State currentState = null;

    public static void setState(State state){
        currentState = state;
    }

    public static State getState(){
        return currentState;
    }
}
