package GameObject;

import GameTools.Point;

import javax.swing.*;
import java.awt.*;

public abstract class GameObject extends JPanel {
    protected Point pos;
    protected Image im;

    public GameObject(Point pos) {
        this.pos = pos;
    }
    public Point getPos() {
        return pos;
    }
    public void setPos(Point pos) {
        this.pos = pos;
    }
    public void setPos(int x, int y) {
        this.pos.setX(x);
        this.pos.setY(y);
    }
    public Point getCentre() {
        return new Point(pos.getX()+32, pos.getY()+32);
    }

    public void paint(Graphics g) {
        g.drawImage(this.im, this.pos.getX(),
                this.pos.getY(),64,64, this);
    }

}
