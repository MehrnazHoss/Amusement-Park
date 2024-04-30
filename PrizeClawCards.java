import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class PrizeClawCards extends JFrame {
    public static JButton[] buttonPC = new JButton[3];
    static Border borderPC = BorderFactory.createLineBorder(Color.BLACK,3);
    static int i;
    static final int countOfPrizeClawCards = 3;
    public static ImageIcon icon4 = new ImageIcon("icon4.png");
    public static int[] prizeClawCardScore = new int[3];
    public static int[] discountCoin4 = new int[3];
    public static int[] paidCoinRandom4 = new int[3];
    public static Coins_Score[] label4 = new Coins_Score[countOfPrizeClawCards];

    public PrizeClawCards(){

    }
    public static void createPrizeClawCards(){
        Random random = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        for ( i = 0 ; i < countOfPrizeClawCards ; i++) {
            buttonPC[i] = new JButton();
            buttonPC[i].setLayout(new BorderLayout());
            prizeClawCardScore[i] = random.nextInt(2)+3;
            discountCoin4[i] = random1.nextInt(5) + 1;
            paidCoinRandom4[i] = random2.nextInt(3) + 16;
            label4[i] = new Coins_Score(4,i,discountCoin4[i],paidCoinRandom4[i]);
            buttonPC[i].add(label4[i], BorderLayout.CENTER);
            buttonPC[i].setOpaque(true);
            buttonPC[i].setPreferredSize(new Dimension(87, 96));
            buttonPC[i].setHorizontalAlignment(SwingConstants.CENTER);
            buttonPC[i].setBorder(borderPC);
            buttonPC[i].setBackground(Color.PINK);
            buttonPC[i].setIcon(icon4);
            buttonPC[i].setHorizontalTextPosition(JLabel.CENTER);
            buttonPC[i].setVerticalTextPosition(JLabel.NORTH);
            buttonPC[i].setFocusable(false);
            Main.panel41.add(buttonPC[i]);
        }
    }
}
