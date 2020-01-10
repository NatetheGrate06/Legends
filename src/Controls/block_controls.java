package src.Controls;

public class block_controls extends AbstractAction {

  Action playerBlock = new AbstractAction {
    public void actionPreformed(ActionEvent e) {
      
    }
  };
  component.getInputMap().put(Keystroke.getKeyStroke("CTRL"), 
                                                     "Blocking");
  
  public enum PlayerFaceDirection {
    LEFT {
    },
    
    RIGHT {
    };
  }
}
