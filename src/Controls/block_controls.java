package Controls;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class block_controls extends JFrame {

  public block_controls blockControls; {

  int playerBlocking = KeyEvent.VK_CONTROL;

  {

    class BlockingKeyListener extends KeyAdapter {

      @Override
      public void keyPressed(KeyEvent e) {
        Object source = e.getSource();
        int action = e.getExtendedKeyCode();
        super.keyPressed(e);
      }

      @Override
      public void keyReleased(KeyEvent e) {
        Object source = e.getSource();
        int action = e.getExtendedKeyCode();
        super.keyReleased(e);
      }
    }
  }
}
}


