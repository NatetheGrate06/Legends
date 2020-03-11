package GUI.menu;

import engine.Player.player;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class menu {

    private static final Dimension LOCAL_GAME_DIMENSION = new Dimension(50, 100);
    public static JFrame gameFrame;
    public static JFrame menu;
    private final static Dimension OUTER_FRAME_DIMENSION = new Dimension(1920, 1080);
    public static String defaultImagesPath = "Art/menu_screen.jpg";
    public static Image menuImage = new Image("https://steamuserimages-a.akamaihd.net/ugc/922555190803549215/3D1AAD17ADC49225DEA04BCFD95EAABDD29A9192/?imw=1024&imh=576&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=true");

    public menu() {
        this.gameFrame = new JFrame("Castle Crashers 2");
        this.gameFrame.setLayout(new BorderLayout());
        this.gameFrame.setSize(OUTER_FRAME_DIMENSION);
        LocalGamePanel.localGamePanel = new LocalGamePanel();
        this.gameFrame.add(LocalGamePanel.localGamePanel, BorderLayout.CENTER);
        this.gameFrame.setVisible(true);
    }

    public static void openMenu() {
        gameFrame.setSize(OUTER_FRAME_DIMENSION);
        gameFrame.setPreferredSize(OUTER_FRAME_DIMENSION);
        gameFrame.setMaximumSize(OUTER_FRAME_DIMENSION);
        gameFrame.setMinimumSize(OUTER_FRAME_DIMENSION);
        //set the quit button as the default close op
        gameFrame.setVisible(true);
        createFileMenu();
        drawMenu();
        gameFrame.add(menu, BorderLayout.CENTER);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setResizable(false);
    }

    private static JMenu createFileMenu() {
        final JMenu fileMenu = new JMenu("File");
        final JMenuItem openPGN = new JMenuItem("Load PGN File");
        openPGN.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent e) {
                System.out.println("Open up that PGN File!!");
            }
        });

    fileMenu.add(openPGN);
    final JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(final ActionEvent e) {
            System.exit(0);
        }
    });
        fileMenu.add(exitMenuItem);
        return fileMenu;
    }

    private static class LocalGamePanel extends JPanel {

        protected static JPanel localGamePanel;
        //This is the constructor for the board that will be displayed on table
        LocalGamePanel() {
            super();
            setPreferredSize(LOCAL_GAME_DIMENSION);
            validate();
        }

        public void drawLocalGame(final LocalGamePanel localGamePanel) {
            removeAll();
            validate();
            repaint();
        }
    }

    public static void drawMenu() {
        assignMenuIcon();
        gameFrame.validate();
        gameFrame.repaint();

    }

    private static void assignMenuIcon() {
        gameFrame.removeAll();
            try{
                final BufferedImage image = ImageIO.read(new File("Art/menu_screen.jpg"));
                gameFrame.add(new JLabel(new ImageIcon(image)));
            } catch (IOException e) {
                e.printStackTrace();

        }
    }

    public class local_Game_Option extends menu {

        public JButton localGameOption = new JButton("local game"); {
            localGameOption.setMnemonic(KeyEvent.VK_ENTER);
        }

    }
}