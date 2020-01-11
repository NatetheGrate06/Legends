package GUI.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {

    private static final Dimension LOCAL_GAME_DIMENSION = new Dimension(50, 100);
    private final JFrame gameFrame;
    private final static Dimension OUTER_FRAME_DIMENSION = new Dimension(600, 600);

    public menu() {
        this.gameFrame = new JFrame("Castle Crashers 2");
        this.gameFrame.setLayout(new BorderLayout());
        this.gameFrame.setSize(OUTER_FRAME_DIMENSION);
        LocalGamePanel.localGamePanel = new LocalGamePanel();
        this.gameFrame.add(LocalGamePanel.localGamePanel, BorderLayout.CENTER);
        this.gameFrame.setVisible(true);
    }

    private JMenu createFileMenu() {
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

}