package src.Controls;

public class block_controls extends AbstractAction {

  public block_controls(String text, ImageIcon icon, String desc, Integer mnomonic) {
    super(text, icon);
    putValue(SHORT_DESCRIPTION, desc);
    putValue(MNEMONIC_KEY, mnemonic);
  }
  
  public void playerBlock(ActionEvent e) {
    displayResult("Blocking", e); 
  }
}
