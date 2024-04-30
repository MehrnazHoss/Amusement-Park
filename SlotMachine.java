import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotMachine extends JFrame {
    public static JButton button31; //green
    public static JButton button32; //white
    public static JButton button33; //black
    public static JButton button34; //blue
    public static JButton button35; //red
    public static JButton button36; //gold

    public static ImageIcon greenIcon = new ImageIcon("green.jpg");
    public static ImageIcon whiteIcon = new ImageIcon("white.jpg");
    public static ImageIcon blackIcon = new ImageIcon("black.jpg");
    public static ImageIcon blueIcon = new ImageIcon("blue.jpg");
    public static ImageIcon redIcon = new ImageIcon("red.jpg");


    Border greenBorder = BorderFactory.createLineBorder(new Color(50, 150, 50), 5);
    Border whiteBorder = BorderFactory.createLineBorder(new Color(0, 0, 0), 5);
    Border blackBorder = BorderFactory.createLineBorder(new Color(255, 255, 255), 5);
    Border blueBorder = BorderFactory.createLineBorder(new Color(0, 0, 200), 5);
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
        button31.setHorizontalTextPosition(JLabel.CENTER);
        button31.setVerticalTextPosition(JLabel.CENTER);
        button31.setForeground(new Color(255, 255, 255));
        button31.setFont(new Font("MV Boli", Font.BOLD, 18));
        button31.setOpaque(true);
        button31.setPreferredSize(new Dimension(150, 200));
        button31.setHorizontalAlignment(SwingConstants.CENTER);
        button31.setBackground(Color.GREEN);
        button31.setIcon(greenIcon);
        button31.setFocusable(false);
        Main.panel3.add(button31);

        button32 = new JButton();
        button32.setBorder(whiteBorder);
        button32.setText("White coins: " + counterOfWhiteCoins);
        button32.setHorizontalTextPosition(JLabel.CENTER);
        button32.setVerticalTextPosition(JLabel.CENTER);
        button32.setFont(new Font("MV Boli", Font.BOLD, 18));
        button32.setOpaque(true);
        button32.setPreferredSize(new Dimension(150, 200));
        button32.setHorizontalAlignment(SwingConstants.CENTER);
        button32.setBackground(Color.WHITE);
        button32.setIcon(whiteIcon);
        button32.setFocusable(false);
        Main.panel3.add(button32);

        button33 = new JButton();
        button33.setBorder(blackBorder);
        button33.setText("Black coins: " + counterOfBlackCoins);
        button33.setHorizontalTextPosition(JLabel.CENTER);
        button33.setVerticalTextPosition(JLabel.CENTER);
        button33.setForeground(new Color(255, 255, 255));
        button33.setFont(new Font("MV Boli", Font.BOLD, 18));
        button33.setOpaque(true);
        button33.setPreferredSize(new Dimension(150, 200));
        button33.setHorizontalAlignment(SwingConstants.CENTER);
        button33.setBackground(Color.BLACK);
        button33.setIcon(blackIcon);
        button33.setFocusable(false);
        Main.panel31.add(button33);

        button34 = new JButton();
        button34.setBorder(blueBorder);
        button34.setText("Blue coins: " + counterOfBlueCoins);
        button34.setHorizontalTextPosition(JLabel.CENTER);
        button34.setVerticalTextPosition(JLabel.CENTER);
        button34.setForeground(new Color(255, 255, 255));
        button34.setFont(new Font("MV Boli", Font.BOLD, 18));
        button34.setOpaque(true);
        button34.setPreferredSize(new Dimension(150, 200));
        button34.setHorizontalAlignment(SwingConstants.CENTER);
        button34.setBackground(Color.CYAN);
        button34.setIcon(blueIcon);
        button34.setFocusable(false);
        Main.panel31.add(button34);

        button35 = new JButton();
        button35.setBorder(redBorder);
        button35.setText("Red coins: " + counterOfRedCoins);
        button35.setHorizontalTextPosition(JLabel.CENTER);
        button35.setVerticalTextPosition(JLabel.CENTER);
        button35.setForeground(new Color(255, 255, 255));
        button35.setFont(new Font("MV Boli", Font.BOLD, 18));
        button35.setOpaque(true);
        button35.setPreferredSize(new Dimension(150, 200));
        button35.setHorizontalAlignment(SwingConstants.CENTER);
        button35.setBackground(Color.RED);
        button35.setIcon(redIcon);
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

    public static void functionOfSlot(int play){
        button31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame buyButton31 = new JFrame();
                buyButton31.setLayout(new FlowLayout());

                JRadioButton oneCoin;
                JRadioButton twoCoin;
                oneCoin = new JRadioButton("1 Coin");
                oneCoin.setFocusable(false);
                twoCoin = new JRadioButton("2 Coins");
                twoCoin.setFocusable(false);

                ButtonGroup group = new ButtonGroup();
                group.add(oneCoin);
                group.add(twoCoin);

                buyButton31.add(oneCoin);
                buyButton31.add(twoCoin);
                buyButton31.pack();
                buyButton31.setVisible(true);

                oneCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button31,1,"green",-1,-1);
                        else if (play == 2) Players.player2(null,null,button31,1,"green",-1,-1);
                    }
                });

                twoCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button31,2,"green",-1,-1);
                        else if (play == 2) Players.player2(null,null,button31,2,"green",-1,-1);
                    }
                });
            }
        });

        button32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame buyButton32 = new JFrame();
                buyButton32.setLayout(new FlowLayout());

                JRadioButton oneCoin;
                JRadioButton twoCoin;
                oneCoin = new JRadioButton("1 Coin");
                oneCoin.setFocusable(false);
                twoCoin = new JRadioButton("2 Coins");
                twoCoin.setFocusable(false);

                ButtonGroup group = new ButtonGroup();
                group.add(oneCoin);
                group.add(twoCoin);

                buyButton32.add(oneCoin);
                buyButton32.add(twoCoin);
                buyButton32.pack();
                buyButton32.setVisible(true);

                oneCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button32,1,"white",-1,-1);
                        else if (play == 2) Players.player2(null,null,button32,1,"white",-1,-1);
                    }
                });

                twoCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button32,2,"white",-1,-1);
                        else if (play == 2) Players.player2(null,null,button32,2,"white",-1,-1);
                    }
                });
            }
        });

        button33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame buyButton33 = new JFrame();
                buyButton33.setLayout(new FlowLayout());

                JRadioButton oneCoin;
                JRadioButton twoCoin;
                oneCoin = new JRadioButton("1 Coin");
                oneCoin.setFocusable(false);
                twoCoin = new JRadioButton("2 Coins");
                twoCoin.setFocusable(false);

                ButtonGroup group = new ButtonGroup();
                group.add(oneCoin);
                group.add(twoCoin);

                buyButton33.add(oneCoin);
                buyButton33.add(twoCoin);
                buyButton33.pack();
                buyButton33.setVisible(true);

                oneCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button33,1,"black",-1,-1);
                        else if (play == 2) Players.player2(null,null,button33,1,"black",-1,-1);
                    }
                });

                twoCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button33,2,"black",-1,-1);
                        else if (play == 2) Players.player2(null,null,button33,2,"black",-1,-1);
                    }
                });
            }
        });

        button34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame buyButton34 = new JFrame();
                buyButton34.setLayout(new FlowLayout());

                JRadioButton oneCoin;
                JRadioButton twoCoin;
                oneCoin = new JRadioButton("1 Coin");
                oneCoin.setFocusable(false);
                twoCoin = new JRadioButton("2 Coins");
                twoCoin.setFocusable(false);

                ButtonGroup group = new ButtonGroup();
                group.add(oneCoin);
                group.add(twoCoin);

                buyButton34.add(oneCoin);
                buyButton34.add(twoCoin);
                buyButton34.pack();
                buyButton34.setVisible(true);

                oneCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button34,1,"blue",-1,-1);
                        else if (play == 2) Players.player2(null,null,button34,1,"blue",-1,-1);
                    }
                });

                twoCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button34,2,"blue",-1,-1);
                        else if (play == 2) Players.player2(null,null,button34,2,"blue",-1,-1);
                    }
                });
            }
        });

        button35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame buyButton35 = new JFrame();
                buyButton35.setLayout(new FlowLayout());

                JRadioButton oneCoin;
                JRadioButton twoCoin;
                oneCoin = new JRadioButton("1 Coin");
                oneCoin.setFocusable(false);
                twoCoin = new JRadioButton("2 Coins");
                twoCoin.setFocusable(false);

                ButtonGroup group = new ButtonGroup();
                group.add(oneCoin);
                group.add(twoCoin);

                buyButton35.add(oneCoin);
                buyButton35.add(twoCoin);
                buyButton35.pack();
                buyButton35.setVisible(true);

                oneCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button35,1,"red",-1,-1);
                        else if (play == 2) Players.player2(null,null,button35,1,"red",-1,-1);
                    }
                });

                twoCoin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (play == 1) Players.player1(null,null,button35,2,"red",-1,-1);
                        else if (play == 2) Players.player2(null,null,button35,2,"red",-1,-1);
                    }
                });
            }
        });
    }
}