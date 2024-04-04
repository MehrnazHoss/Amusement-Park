import javax.swing.*;
import java.awt.*;

public class SlotMachine extends JFrame {
    public JLabel label31; //green
    public JLabel label32; //white
    public JLabel label33; //black
    public JLabel label34; //blue
    public JLabel label35; //red
    public JLabel label36; //gold

    int counterOfGreenCoins = 4;
    int counterOfWhiteCoins = 4;
    int counterOfBlackCoins = 4;
    int counterOfBlueCoins = 4;
    int counterOfRedCoins = 4;
    int counterOfGoldCoins = 5;

    public SlotMachine(){
        label31 = new JLabel();
        label31.setText("Green coins: " + counterOfGreenCoins);
        label31.setOpaque(true);
        label31.setPreferredSize(new Dimension(150,200));
        label31.setHorizontalAlignment(SwingConstants.CENTER);
        label31.setBackground(Color.GREEN);
        Main.panel3.add(label31);
        label32 = new JLabel();
        label32.setText("White coins: " + counterOfWhiteCoins);
        label32.setOpaque(true);
        label32.setPreferredSize(new Dimension(150,200));
        label32.setHorizontalAlignment(SwingConstants.CENTER);
        label32.setBackground(Color.WHITE);
        Main.panel3.add(label32);
        label33 = new JLabel();
        label33.setText("Black coins: " + counterOfBlackCoins);
        label33.setOpaque(true);
        label33.setPreferredSize(new Dimension(150,200));
        label33.setHorizontalAlignment(SwingConstants.CENTER);
        label33.setBackground(Color.BLACK);
        Main.panel3.add(label33);
        label34 = new JLabel();
        label34.setText("Blue coins: " + counterOfBlueCoins);
        label34.setOpaque(true);
        label34.setPreferredSize(new Dimension(150,200));
        label34.setHorizontalAlignment(SwingConstants.CENTER);
        label34.setBackground(Color.BLUE);
        Main.panel4.add(label34);
        label35 = new JLabel();
        label35.setText("Red coins: " + counterOfRedCoins);
        label35.setOpaque(true);
        label35.setPreferredSize(new Dimension(150,200));
        label35.setHorizontalAlignment(SwingConstants.CENTER);
        label35.setBackground(Color.RED);
        Main.panel4.add(label35);
        label36 = new JLabel();
        label36.setText("Gold coins: " + counterOfGoldCoins);
        label36.setOpaque(true);
        label36.setPreferredSize(new Dimension(150,200));
        label36.setHorizontalAlignment(SwingConstants.CENTER);
        label36.setBackground(Color.YELLOW);
        Main.panel4.add(label36);
    }
    
}