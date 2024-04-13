import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class PrizeClawCards extends JFrame {
    public JButton[][] buttonPC = new JButton[3][1];
    Border borderPC = BorderFactory.createLineBorder(Color.BLACK,3);
    int i;
    final int countOfPrizeClawCards = 3;
    Random random = new Random();
    int prizeClawCardScore;

    public PrizeClawCards(){
        ImageIcon icon4 = new ImageIcon("icon4.png");
        for ( i = 0 ; i < countOfPrizeClawCards ; i++) {
            buttonPC[i][0] = new JButton("Children");
            buttonPC[i][0].setBorder(borderPC);
            prizeClawCardScore = random.nextInt(5)+3;
            buttonPC[i][0].setText("Score: " + prizeClawCardScore);
            buttonPC[i][0].setOpaque(true);
            buttonPC[i][0].setPreferredSize(new Dimension(87, 96));
            buttonPC[i][0].setHorizontalAlignment(SwingConstants.CENTER);
            buttonPC[i][0].setBackground(Color.PINK);
            buttonPC[i][0].setIcon(icon4);
            buttonPC[i][0].setHorizontalTextPosition(JLabel.CENTER);
            buttonPC[i][0].setVerticalTextPosition(JLabel.NORTH);
            buttonPC[i][0].setFocusable(false);
            Main.panel41.add(buttonPC[i][0]);
        }
    }
}
