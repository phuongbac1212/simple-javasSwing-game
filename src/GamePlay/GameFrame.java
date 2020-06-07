package GamePlay;

import GameObject.GameMonster.Monster;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import static GameObject.GameMonster.Monster.DIRECTION.*;

public class GameFrame extends JFrame implements KeyListener {
    public static GameFrame gameFrame;
    public static final int WIN_H= 640;
    public static final int WIN_W=1200;
    private Player player;

    public GameFrame() throws IOException, InterruptedException {
        setSize(WIN_W, WIN_H);
        setTitle("Move");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addKeyListener(this);
        player = new Player();
        add(player);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        gameFrame = new GameFrame();
        gameFrame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            for (Monster m : Player.monster)
                m.move(RIGHT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            for (Monster m : Player.monster)
                m.move(LEFT);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            for (Monster m : Player.monster)
                m.move(UP);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            for (Monster m : Player.monster)
                m.move(DOWN);
        }
    }
    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}