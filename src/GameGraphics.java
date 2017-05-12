import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameGraphics
{

    JLabel nameLabel, nameLabel2;
    JSlider angleSlider;
    JButton fireButton;
    JButton b2;
    
    static final int ANGLE_MAX = 180;
    static final int ANGLE_MIN = 0;
    static final int ANGLE_INIT = 45;
    static final int INIT_POSX = 0, INIT_POSY = 0;
    
    
    
    public static void main(String[] args)
    {
        //fill in later

    }

    public void Game()
    {
        
       

        JSlider angle = new JSlider(JSlider.HORIZONTAL, ANGLE_MIN, ANGLE_MAX, ANGLE_INIT);

        b2 = new JButton("Fire!");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);

        angle.addChangeListener(this);

        //Turn on labels at major tick marks.
        angle.setMajorTickSpacing(10);
        angle.setMinorTickSpacing(1);
        angle.setPaintTicks(true);
        angle.setPaintLabels(true);

        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GameLayout());
        nameLabel = new JLabel("Player: ");
        nameLabel2 = new JLabel("Player: ");
        angleSlider = new JSlider();
        this.add(thePanel);
        
        this.setVisible(true);

    }
}
