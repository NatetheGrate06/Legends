package tests;
import Controls.block_controls;
import GUI.game.game;
import GUI.game.renderable;
import GUI.menu.menu;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.*;

import static GUI.menu.menu.menuImage;
import static java.awt.Color.RED;

public class wholeProjectTest {

    public static void main(String[] args) {

        game g = new game();
        g.renderables.add(new renderable() {
            @Override
            public void render(Graphics2D g2d, float interpolation) {
                g2d.drawRenderedImage((RenderedImage) menuImage, AffineTransform.getScaleInstance(4.5, 5));
                g2d.drawRect(300, 250, 50, 100);
                g2d.setColor(RED);
            }
        });

        System.out.println(block_controls.blockControls);
        menu menu = new menu();
    }
}