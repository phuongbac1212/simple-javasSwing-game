package GameObject.GameMap;

import GameObject.GameObject;
import GameTools.Point;

import javax.swing.*;

public class Grass extends GameObject {
    public Grass(Point pos) {
        super(pos);
        this.im = new ImageIcon("res/map/Grass.png").getImage();
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Grass{} " + this.getPos().toString();
    }
}
