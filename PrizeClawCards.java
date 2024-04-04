import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PrizeClawCards extends JFrame {
    public JLabel label64;
    int countOfPrizeClawCards = 3;
    Random random = new Random();
    int prizeClawCardScore = random.nextInt(5)+3;

    public PrizeClawCards(){
        label64 = new JLabel("Children");
        label64.setText("Number: " + countOfPrizeClawCards + "Score: " + prizeClawCardScore);
        label64.setOpaque(true);
        label64.setPreferredSize(new Dimension(100,150));
        label64.setHorizontalAlignment(SwingConstants.CENTER);
        label64.setBackground(Color.PINK);
        Main.panel6.add(label64);
    }
}
