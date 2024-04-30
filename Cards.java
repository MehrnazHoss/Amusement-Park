import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Cards extends JFrame{
    static final int countOfChildrenCards = 15;
    static final int countOfYouthCards = 15;
    static final int countOfAdultsCards = 15;

    static int i,j,k,column;

    public static JButton[][] cardsButtons = new JButton[15][3];

    public static int[] discountCoin1 = new int[15];
    public static int[] discountCoin2 = new int[15];
    public static int[] discountCoin3 = new int[15];

    public static int[] paidCoinRandom1 = new int[15];
    public static int[] paidCoinRandom2 = new int[15];
    public static int[] paidCoinRandom3 = new int[15];

    public static int[] childrenCardScore = new int[15];
    public static int[] youthCardScore = new int[15];
    public static int[] adultsCardScore = new int[15];

    public static ImageIcon icon1 = new ImageIcon("icon1.png");
    public static ImageIcon icon2 = new ImageIcon("icon2.png");
    public static ImageIcon icon3 = new ImageIcon("icon3.png");

    static Border childrenCardsBorder = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
    static Border youthCardsBorder = BorderFactory.createLineBorder(Color.GRAY,3);
    static Border adultsCardsBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY,3);

    public static Coins_Score[] label1 = new Coins_Score[countOfChildrenCards];
    public static Coins_Score[] label2 = new Coins_Score[countOfYouthCards];
    public static Coins_Score[] label3 = new Coins_Score[countOfAdultsCards];


    public Cards(){

    }

    public static void createCards(){
        Main.panel4.setLayout(new GridLayout(3,4,50,5));
        Random random = new Random();
        Random random1 = new Random();
        Random random2 = new Random();
        for ( column = 0 , i = 0; i < countOfChildrenCards; i++) {
            cardsButtons[i][column] = new JButton();
            cardsButtons[i][column].setLayout(new BorderLayout());
            childrenCardScore[i] = random.nextInt(2);
            discountCoin1[i] = random1.nextInt(5) + 1;
            paidCoinRandom1[i] = random2.nextInt(5) + 1;
            label1[i] = new Coins_Score(1, i, discountCoin1[i],paidCoinRandom1[i]);
            cardsButtons[i][column].add(label1[i], BorderLayout.CENTER);
            cardsButtons[i][column].setBorder(childrenCardsBorder);
            cardsButtons[i][column].setOpaque(true);
            cardsButtons[i][column].setPreferredSize(new Dimension(80, 90));
            cardsButtons[i][column].setHorizontalAlignment(SwingConstants.CENTER);
            cardsButtons[i][column].setBackground(new Color(75, 100, 75));
            cardsButtons[i][column].setIcon(icon1);
            cardsButtons[i][column].setFocusable(false);
            if (i < 4) {
                Main.panel4.add(cardsButtons[i][column]);
            }
        }

        for (column = 1 , j = 0; j < countOfYouthCards; j++) {
            cardsButtons[j][column] = new JButton();
            cardsButtons[j][column].setLayout(new BorderLayout());
            youthCardScore[j] = random.nextInt(3) + 2;
            discountCoin2[j] = random1.nextInt(5) + 1;
            paidCoinRandom2[j] = random2.nextInt(5) + 6;
            label2[j] = new Coins_Score(2, j, discountCoin2[j],paidCoinRandom2[j]);
            cardsButtons[j][column].add(label2[j], BorderLayout.CENTER);
            cardsButtons[j][column].setBorder(youthCardsBorder);
            cardsButtons[j][column].setOpaque(true);
            cardsButtons[j][column].setPreferredSize(new Dimension(80, 90));
            cardsButtons[j][column].setHorizontalAlignment(SwingConstants.CENTER);
            cardsButtons[j][column].setBackground(new Color(75, 100, 75));
            cardsButtons[j][column].setIcon(icon2);
            cardsButtons[j][column].setFocusable(false);
            if (j < 4) {
                Main.panel4.add(cardsButtons[j][column]);
            }
        }

        for (column = 2 , k = 0; k < countOfAdultsCards; k++) {
            cardsButtons[k][column] = new JButton();
            cardsButtons[k][column].setLayout(new BorderLayout());
            adultsCardScore[k] = random.nextInt(3) + 3;
            discountCoin3[k] = random1.nextInt(5) + 1;
            paidCoinRandom3[k] = random2.nextInt(5) + 11;
            label3[k] = new Coins_Score(3, k, discountCoin3[k],paidCoinRandom3[k]);
            cardsButtons[k][column].add(label3[k], BorderLayout.CENTER);
            cardsButtons[k][column].setBorder(adultsCardsBorder);
            cardsButtons[k][column].setOpaque(true);
            cardsButtons[k][column].setPreferredSize(new Dimension(80, 90));
            cardsButtons[k][column].setHorizontalAlignment(SwingConstants.CENTER);
            cardsButtons[k][column].setBackground(new Color(75, 100, 75));
            cardsButtons[k][column].setIcon(icon3);
            cardsButtons[k][column].setFocusable(false);
            if (k < 4) {
                Main.panel4.add(cardsButtons[k][column]);
            }
        }
    }

    public static void functionOfCards(int play){

        for (column = 0,i = 0; i < 4; i++){
            cardsButtons[i][column].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JFrame cardFrame1 = new JFrame();
                    cardFrame1.setLayout(new FlowLayout());

                    JRadioButton purchaseButton;
                    JRadioButton reserveButton;
                    purchaseButton = new JRadioButton("Buy a Card");
                    purchaseButton.setFocusable(false);
                    reserveButton = new JRadioButton("Reserve a Card");
                    reserveButton.setFocusable(false);

                    ButtonGroup group = new ButtonGroup();
                    group.add(purchaseButton);
                    group.add(reserveButton);

                    cardFrame1.add(purchaseButton);
                    cardFrame1.add(reserveButton);
                    cardFrame1.pack();
                    cardFrame1.setVisible(true);


                    purchaseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(purchaseButton, null, null,0,null, i, 0);
                            else if (play == 2) Players.player2(purchaseButton, null, null,0,null, i, 0);
                        }
                    });

                    reserveButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(null, reserveButton, null,0,null, i, 0);
                            else if (play == 2) Players.player2(null, reserveButton, null,0,null, i, 0);
                        }
                    });
                }
            });
        }


        for (column = 1,j = 0; j < 4; j++) {
            cardsButtons[j][column].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JFrame cardFrame2 = new JFrame();
                    cardFrame2.setLayout(new FlowLayout());

                    JRadioButton purchaseButton;
                    JRadioButton reserveButton;
                    purchaseButton = new JRadioButton("Buy a Card");
                    purchaseButton.setFocusable(false);
                    reserveButton = new JRadioButton("Reserve a Card");
                    reserveButton.setFocusable(false);

                    ButtonGroup group = new ButtonGroup();
                    group.add(purchaseButton);
                    group.add(reserveButton);

                    cardFrame2.add(purchaseButton);
                    cardFrame2.add(reserveButton);
                    cardFrame2.pack();
                    cardFrame2.setVisible(true);

                    purchaseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(purchaseButton, null, null,0,null, j, 1);
                            else if (play == 2) Players.player2(purchaseButton, null, null,0,null, j, 1);
                        }
                    });
                    reserveButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(null, reserveButton, null,0,null, j, 1);
                            else if (play == 2) Players.player2(null, reserveButton, null,0,null, j, 1);
                        }
                    });
                }
            });
        }

        for (column = 2,k = 0; k < 4; k++) {
            cardsButtons[k][column].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JFrame cardFrame3 = new JFrame();
                    cardFrame3.setLayout(new FlowLayout());

                    JRadioButton purchaseButton;
                    JRadioButton reserveButton;
                    purchaseButton = new JRadioButton("Buy a Card");
                    purchaseButton.setFocusable(false);
                    reserveButton = new JRadioButton("Reserve a Card");
                    reserveButton.setFocusable(false);

                    ButtonGroup group = new ButtonGroup();
                    group.add(purchaseButton);
                    group.add(reserveButton);

                    cardFrame3.add(purchaseButton);
                    cardFrame3.add(reserveButton);
                    cardFrame3.pack();
                    cardFrame3.setVisible(true);

                    purchaseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(purchaseButton, null, null,0,null, k, 2);
                            else if (play == 2) Players.player2(purchaseButton, null, null,0,null, k, 2);
                        }
                    });
                    reserveButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (play == 1) Players.player1(null, reserveButton, null,0,null, k, 2);
                            else if (play == 2) Players.player2(null, reserveButton, null,0,null, k, 2);
                        }
                    });
                }
            });
        }
    }
}