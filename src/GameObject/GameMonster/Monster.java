package GameObject.GameMonster;

import GameObject.GameObject;
import GameTools.Point;

import java.awt.*;

public abstract class Monster extends GameObject {
    protected Image im;

    public enum DIRECTION {
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    public Monster(Point pos) {
        super(pos);
    }
    public void move(DIRECTION d) {
        switch (d) {

            case LEFT -> {
                this.moveLeft();
                break;
            }
            case RIGHT -> {
                this.moveRight();
                break;
            }
            case UP -> {
                this.moveUp();
                break;
            }
            case DOWN -> {
                this.moveDown();
                break;
            }
        }
    }
    protected  void moveLeft(){
        if (this.pos.getX() >= 64)
                this.pos.setX(this.pos.getX()-64);
    }

    protected  void moveRight() {
        if (this.pos.getX() < 64*7)
            this.pos.setX(this.pos.getX()+64);
    }


    protected  void moveUp() {
        if (this.pos.getY() >= 64)
            this.pos.setY(this.pos.getY()-64);
    }


    protected  void moveDown() {
        if (this.pos.getY() < 64*7)
            this.pos.setY(this.pos.getY()+64);
    }

    public void paint(Graphics g) {
        g.drawImage(this.im, this.pos.getX(),
                this.pos.getY(),64,64, this);
    }
}
