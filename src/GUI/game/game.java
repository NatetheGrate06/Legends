package GUI.game;

import GUI.menu.menu;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class game {

    public ArrayList<renderable> renderables = new ArrayList<>();
    private ArrayList<updatable> updatables = new ArrayList<>();
    private input input;
    private Canvas game = new Canvas();

    public void render(float interpolation) {
        BufferStrategy b = game.getBufferStrategy();
        if (b == null) {
            game.createBufferStrategy(2);
            return;
        }

        Graphics2D bufferGraphics = (Graphics2D) b.getDrawGraphics();
        bufferGraphics.clearRect(0, 0, menu.gameFrame.getWidth(), menu.gameFrame.getHeight());
        for(renderable r : renderables) {
            r.render(bufferGraphics, interpolation);
        }
        bufferGraphics.dispose();
        b.show();
    }

    public void update() {
        for (updatable u : updatables) {
            u.update(input);
        }
    }

    public void start() {
        menu.openMenu();
        boolean isRunning = true;
        input = new input();

        while (isRunning) {
            render(1.0f);
            update();
        }
    }
}
