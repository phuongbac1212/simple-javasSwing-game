package GameObject.GameMap;

import GameObject.GameObject;
import GameTools.Point;

import javax.swing.*;

public class Sand extends GameObject {
    public Sand(Point pos) {
        super(pos);
        this.im = new ImageIcon("res/map/Sand.png").getImage();
        this.pos = pos;
    }
    @Override
    public String toString() {
        return "Sand{}";
    }
}
