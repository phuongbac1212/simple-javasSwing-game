package GameObject.GameMonster;

import GameTools.Point;

import javax.swing.*;

public class LittleMonster extends Monster{

    public LittleMonster(Point pos) {
        super(pos);
        this.im = new ImageIcon(
                "res/mons/littlemons.png").getImage();
    }

    @Override
    public String toString() {
        return "LittleMonster{" +
                "pos=" + this.getPos().toString() +
                '}';
    }

}
