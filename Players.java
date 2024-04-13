import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players extends JButton {
    public static JButton[] buttons1 = new JButton[15];
    public static JButton[] buttons2 = new JButton[15];

    int row1,row2;

    public static int greenCoins1 = 0;
    public static int whiteCoins1 = 0;
    public static int blackCoins1 = 0;
    public static int blueCoins1 = 0;
    public static int redCoins1 = 0;
    public static int goldCoins1 = 0;

    public JButton button11; //green
    public JButton button12; //white
    public JButton button13; //black
    public JButton button14; //blue
    public JButton button15; //red
    public JButton button16; //gold

    public static int greenCoins2 = 0;
    public static int whiteCoins2 = 0;
    public static int blackCoins2 = 0;
    public static int blueCoins2 = 0;
    public static int redCoins2 = 0;
    public static int goldCoins2 = 0;

    public JButton button21; //green
    public JButton button22; //white
    public JButton button23; //black
    public JButton button24; //blue
    public JButton button25; //red
    public JButton button26; //gold

    static int i0 = 0,j0 = 0,i = 0,j = 0,i1,Card = 6,j1;
    public static JButton[] reserve1 = new JButton[3];
    public static JButton[] reserve2 = new JButton[3];

    public Players() {
        //...........player 1 coins...........

        button11 = new JButton();
        button11.setText(String.valueOf(greenCoins1));
        button11.setFont(new Font("MV Boli", Font.BOLD, 20));
        button11.setOpaque(true);
        button11.setPreferredSize(new Dimension(70, 70));
        button11.setHorizontalAlignment(SwingConstants.CENTER);
        button11.setBackground(Color.GREEN);
        button11.setFocusable(false);
        Main.panel11.add(button11);

        button12 = new JButton();
        button12.setText(String.valueOf(whiteCoins1));
        button12.setFont(new Font("MV Boli", Font.BOLD, 20));
        button12.setOpaque(true);
        button12.setPreferredSize(new Dimension(70, 70));
        button12.setHorizontalAlignment(SwingConstants.CENTER);
        button12.setBackground(Color.WHITE);
        button12.setFocusable(false);
        Main.panel11.add(button12);

        button13 = new JButton();
        button13.setText(String.valueOf(blackCoins1));
        button13.setForeground(new Color(255, 255, 255));
        button13.setFont(new Font("MV Boli", Font.BOLD, 20));
        button13.setOpaque(true);
        button13.setPreferredSize(new Dimension(70, 70));
        button13.setHorizontalAlignment(SwingConstants.CENTER);
        button13.setBackground(Color.BLACK);
        button13.setFocusable(false);
        Main.panel11.add(button13);

        button14 = new JButton();
        button14.setText(String.valueOf(blueCoins1));
        button14.setFont(new Font("MV Boli", Font.BOLD, 20));
        button14.setOpaque(true);
        button14.setPreferredSize(new Dimension(70, 70));
        button14.setHorizontalAlignment(SwingConstants.CENTER);
        button14.setBackground(Color.BLUE);
        button14.setFocusable(false);
        Main.panel11.add(button14);

        button15 = new JButton();
        button15.setText(String.valueOf(redCoins1));
        button15.setFont(new Font("MV Boli", Font.BOLD, 20));
        button15.setOpaque(true);
        button15.setPreferredSize(new Dimension(70, 70));
        button15.setHorizontalAlignment(SwingConstants.CENTER);
        button15.setBackground(Color.RED);
        button15.setFocusable(false);
        Main.panel11.add(button15);

        button16 = new JButton();
        button16.setText(String.valueOf(goldCoins1));
        button16.setFont(new Font("MV Boli", Font.BOLD, 20));
        button16.setOpaque(true);
        button16.setPreferredSize(new Dimension(70, 70));
        button16.setHorizontalAlignment(SwingConstants.CENTER);
        button16.setBackground(Color.YELLOW);
        button16.setFocusable(false);
        Main.panel11.add(button16);

        //...........purchased cards player 1...........

        Main.panel1.setLayout(new GridLayout(3, 5, 20, 5));
        for (row1 = 0; row1 < 15; row1++) {
            buttons1[row1] = new JButton();
            buttons1[row1].setPreferredSize(new Dimension(80, 90));
            buttons1[row1].setOpaque(true);
            buttons1[row1].setBackground(Color.LIGHT_GRAY);
            buttons1[row1].setFocusable(false);
            Main.panel1.add(buttons1[row1]);
        }

        //.............Reservation cards player 1..............

        for (i1 = 0; i1 < 3; i1++) {
            reserve1[i1] = new JButton();
            reserve1[i1].setOpaque(true);
            reserve1[i1].setPreferredSize(new Dimension(80, 90));
            reserve1[i1].setBackground(Color.WHITE);
            reserve1[i1].setFocusable(false);
            Main.panel11.add(reserve1[i1]);
        }

        //..............player 2 coins...............

        button21 = new JButton();
        button21.setText(String.valueOf(greenCoins2));
        button21.setFont(new Font("MV Boli", Font.BOLD, 20));
        button21.setOpaque(true);
        button21.setPreferredSize(new Dimension(70, 70));
        button21.setHorizontalAlignment(SwingConstants.CENTER);
        button21.setBackground(Color.GREEN);
        button21.setFocusable(false);
        Main.panel21.add(button21);

        button22 = new JButton();
        button22.setText(String.valueOf(whiteCoins2));
        button22.setFont(new Font("MV Boli", Font.BOLD, 20));
        button22.setOpaque(true);
        button22.setPreferredSize(new Dimension(70, 70));
        button22.setHorizontalAlignment(SwingConstants.CENTER);
        button22.setBackground(Color.WHITE);
        button22.setFocusable(false);
        Main.panel21.add(button22);

        button23 = new JButton();
        button23.setText(String.valueOf(blackCoins2));
        button23.setForeground(new Color(255, 255, 255));
        button23.setFont(new Font("MV Boli", Font.BOLD, 20));
        button23.setOpaque(true);
        button23.setPreferredSize(new Dimension(70, 70));
        button23.setHorizontalAlignment(SwingConstants.CENTER);
        button23.setBackground(Color.BLACK);
        button23.setFocusable(false);
        Main.panel21.add(button23);

        button24 = new JButton();
        button24.setText(String.valueOf(blueCoins2));
        button24.setFont(new Font("MV Boli", Font.BOLD, 20));
        button24.setOpaque(true);
        button24.setPreferredSize(new Dimension(70, 70));
        button24.setHorizontalAlignment(SwingConstants.CENTER);
        button24.setBackground(Color.BLUE);
        button24.setFocusable(false);
        Main.panel21.add(button24);

        button25 = new JButton();
        button25.setText(String.valueOf(redCoins2));
        button25.setFont(new Font("MV Boli", Font.BOLD, 20));
        button25.setOpaque(true);
        button25.setPreferredSize(new Dimension(70, 70));
        button25.setHorizontalAlignment(SwingConstants.CENTER);
        button25.setBackground(Color.RED);
        button25.setFocusable(false);
        Main.panel21.add(button25);

        button26 = new JButton();
        button26.setText(String.valueOf(goldCoins2));
        button26.setFont(new Font("MV Boli", Font.BOLD, 20));
        button26.setOpaque(true);
        button26.setPreferredSize(new Dimension(70, 70));
        button26.setHorizontalAlignment(SwingConstants.CENTER);
        button26.setBackground(Color.YELLOW);
        button26.setFocusable(false);
        Main.panel21.add(button26);

        //...........purchased cards player 2...........

        Main.panel2.setLayout(new GridLayout(3, 5, 20, 5));
        for (row2 = 0; row2 < 15; row2++) {
            buttons2[row2] = new JButton();
            buttons2[row2].setPreferredSize(new Dimension(80, 90));
            buttons2[row2].setOpaque(true);
            buttons2[row2].setBackground(Color.LIGHT_GRAY);
            buttons2[row2].setFocusable(false);
            Main.panel2.add(buttons2[row2]);
        }

        //.............Reservation cards player 2..............

        for (j1 = 0; j1 < 3; j1++) {
            reserve2[j1] = new JButton();
            reserve2[j1].setOpaque(true);
            reserve2[j1].setPreferredSize(new Dimension(80, 90));
            reserve2[j1].setBackground(Color.WHITE);
            reserve2[j1].setFocusable(false);
            Main.panel21.add(reserve2[j1]);
        }
    }
    public void player1(int h, int k){
        JRadioButton purchaseButton;
        JRadioButton reserveButton;
        purchaseButton = new JRadioButton("Buy a Card");
        reserveButton = new JRadioButton("Reserve a Card");

        ButtonGroup group = new ButtonGroup();
        group.add(purchaseButton);
        group.add(reserveButton);

        purchaseButton.addActionListener(e -> {
            buttons1[i0] = Cards.cardsButtons[h][k];
            i0++;
            if (Card >= 6 && Card <= 14) {
                if (k == 0) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][0];
                else if (k == 1) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][1];
                else if (k == 2) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][2];
                Card++;
            }
        });
        reserveButton.addActionListener(e -> {
            reserve1[j0] = Cards.cardsButtons[h][k];
            j0++;
            if (Card >= 6 && Card <= 14){
                if (k == 0) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][0];
                else if (k == 1) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][1];
                else if (k == 2) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][2];
                Card++;
            }
        });

        player2(Card,k);
    }

    public void player2(int h,int k) {
        JRadioButton purchaseButton;
        JRadioButton reserveButton;
        purchaseButton = new JRadioButton("Buy a Card");
        reserveButton = new JRadioButton("Reserve a Card");

        ButtonGroup group = new ButtonGroup();
        group.add(purchaseButton);
        group.add(reserveButton);

        purchaseButton.addActionListener(e -> {
            buttons2[i] = Cards.cardsButtons[h][k];
            i++;
            if (Card >= 6 && Card <= 14){
                if (k == 0) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][0];
                else if (k == 1) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][1];
                else if (k == 2) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][2];
                Card++;
            }
        });

        reserveButton.addActionListener(e -> {
            reserve2[j] = Cards.cardsButtons[h][k];
            j++;
            if (Card >= 6 && Card <= 14){
                if (k == 0) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][0];
                else if (k == 1) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][1];
                else if (k == 2) Cards.cardsButtons[h][k] = Cards.cardsButtons[Card][2];
                Card++;
            }
        });
        player1(Card,k);
    }
}
