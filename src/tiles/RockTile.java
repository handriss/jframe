package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

/**
 * Created by andris on 10/24/16.
 */
public class RockTile extends Tile {
    public RockTile(int id) {
        super(Assets.stone, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
