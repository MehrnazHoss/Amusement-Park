import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SlotMachine extends JFrame {
    public JButton button31; //green
    public JButton button32; //white
    public JButton button33; //black
    public JButton button34; //blue
    public JButton button35; //red
    public JButton button36; //gold

    Border greenBorder = BorderFactory.createLineBorder(new Color(50, 150, 50), 5);
    Border whiteBorder = BorderFactory.createLineBorder(new Color(0, 0, 0), 5);
    Border blackBorder = BorderFactory.createLineBorder(new Color(255, 255, 255), 5);
    Border blueBorder = BorderFactory.createLineBorder(new Color(0, 0, 100), 5);
    Border redBorder = BorderFactory.createLineBorder(new Color(255, 100, 100), 5);
    Border goldBorder = BorderFactory.createLineBorder(new Color(200, 150, 50), 5);

    public static int counterOfGreenCoins = 4;
    public static int counterOfWhiteCoins = 4;
    public static int counterOfBlackCoins = 4;
    public static int counterOfBlueCoins = 4;
    public static int counterOfRedCoins = 4;
    public static int counterOfGoldCoins = 5;

    public SlotMachine() {
        button31 = new JButton();
        button31.setBorder(greenBorder);
        button31.setText("Green coins: " + counterOfGreenCoins);
        button31.setFont(new Font("MV Boli", Font.BOLD, 18));
        button31.setOpaque(true);
        button31.setPreferredSize(new Dimension(150, 200));
        button31.setHorizontalAlignment(SwingConstants.CENTER);
        button31.setBackground(Color.GREEN);
        button31.setFocusable(false);
        Main.panel3.add(button31);

        button32 = new JButton();
        button32.setBorder(whiteBorder);
        button32.setText("White coins: " + counterOfWhiteCoins);
        button32.setFont(new Font("MV Boli", Font.BOLD, 18));
        button32.setOpaque(true);
        button32.setPreferredSize(new Dimension(150, 200));
        button32.setHorizontalAlignment(SwingConstants.CENTER);
        button32.setBackground(Color.WHITE);
        button32.setFocusable(false);
        Main.panel3.add(button32);

        button33 = new JButton();
        button33.setBorder(blackBorder);
        button33.setText("Black coins: " + counterOfBlackCoins);
        button33.setForeground(new Color(255, 255, 255));
        button33.setFont(new Font("MV Boli", Font.BOLD, 18));
        button33.setOpaque(true);
        button33.setPreferredSize(new Dimension(150, 200));
        button33.setHorizontalAlignment(SwingConstants.CENTER);
        button33.setBackground(Color.BLACK);
        button33.setFocusable(false);
        Main.panel31.add(button33);

        button34 = new JButton();
        button34.setBorder(blueBorder);
        button34.setText("Blue coins: " + counterOfBlueCoins);
        button34.setFont(new Font("MV Boli", Font.BOLD, 18));
        button34.setOpaque(true);
        button34.setPreferredSize(new Dimension(150, 200));
        button34.setHorizontalAlignment(SwingConstants.CENTER);
        button34.setBackground(Color.CYAN);
        button34.setFocusable(false);
        Main.panel31.add(button34);

        button35 = new JButton();
        button35.setBorder(redBorder);
        button35.setText("Red coins: " + counterOfRedCoins);
        button35.setFont(new Font("MV Boli", Font.BOLD, 18));
        button35.setOpaque(true);
        button35.setPreferredSize(new Dimension(150, 200));
        button35.setHorizontalAlignment(SwingConstants.CENTER);
        button35.setBackground(Color.RED);
        button35.setFocusable(false);
        Main.panel32.add(button35);

        button36 = new JButton();
        button36.setBorder(goldBorder);
        button36.setText("Gold coins: " + counterOfGoldCoins);
        button36.setFont(new Font("MV Boli", Font.BOLD, 18));
        button36.setOpaque(true);
        button36.setPreferredSize(new Dimension(150, 200));
        button36.setHorizontalAlignment(SwingConstants.CENTER);
        button36.setBackground(Color.YELLOW);
        button36.setFocusable(false);
        Main.panel32.add(button36);
    }
}