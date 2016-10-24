package states;


import entities.creatures.Player;
import gfx.Assets;
import tilegame.Game;
import tiles.Tile;

import java.awt.*;

public class GameState extends State {

    private Player player;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, 10, 10, null);
        player.render(g);
        Tile.tiles[0].render(g, 200, 200);
    }
}
