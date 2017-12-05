package com.vivarium;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AreaView {
    private BufferedImage texture;

    public AreaView(AreaType type) {
        assignTexture(type);
    }

    // TODO Hack passer coords pour des cases -> à corriger, créer class square
    public static void drawArea(Graphics g, Area area) {
        for (int i = 0; i < area.getCoords().size(); i++) {
            g.drawImage(area.getAreaView().texture, area.getCoords().get(i).getX(), area.getCoords().get(i).getY(), null);
        }
    }

    /**
     * Assign texture to this (Area)
     */
    private void assignTexture(AreaType type) {
        File imgFile = null;
        switch (type) {
            case Desert:
                imgFile = new File("resources/sand.jpg");
                break;
            case Plain:
                imgFile = new File("resources/grass.jpg");
                break;
            case Water:
                imgFile = new File("resources/water.jpg");
                break;
            case Mountain:
                imgFile = new File("resources/mountain.jpg");
                break;
        }
        try {
            this.texture = ImageIO.read(imgFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
