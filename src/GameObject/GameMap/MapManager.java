package GameObject.GameMap;

import GamePlay.Player;
import GameTools.Point;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapManager {
    private static String[] mapper = new String[8];

    private static void read(int Nlines, String file) throws IOException, InterruptedException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader(file));

        } catch (Exception e) {
            Thread.sleep(1000);
        }

        for (int i = 0; i < Nlines; i++) {
            mapper[i] = reader.readLine();
        }
        reader.close();
    }

    public static void loadMapObj() throws IOException, InterruptedException {
        MapManager.read(8, "res/map/lv1");


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mapper[i].charAt(j) == '0') {
                    Player.mapObject.add(
                            (new Grass(
                            new Point(j*64, i*64))));
                }
                if (mapper[i].charAt(j) == '1') {
                    Player.mapObject.add(
                            (new Sand(
                             new Point(j*64, i*64))));
                }
            }
        }
    }
}
