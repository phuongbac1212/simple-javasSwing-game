package GamePlay;

import GameObject.GameMap.MapManager;
import GameObject.GameMonster.LittleMonster;
import GameObject.GameMonster.Monster;
import GameObject.GameObject;
import GameTools.Point;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Player extends JPanel implements Runnable {
    Thread thread;
    public static ArrayList<GameObject> mapObject;
    public static ArrayList<Monster> monster = new ArrayList<Monster>();

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Player() throws IOException, InterruptedException {
        mapObject = new ArrayList<GameObject>();
        MapManager.loadMapObj();
        monster.add(new LittleMonster(new Point(0,0)));
        for (GameObject m: monster)
            System.out.println(m.toString());
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        for (GameObject x: mapObject)
            x.paint(g);
        for (Monster m: monster) {
            m.paint(g);
            m.toString();
        }

    }
}
