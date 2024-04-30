import javax.swing.*;
import java.awt.*;

public class Coins_Score extends JLabel{
    int score,counter,discountCoin,paidCoin;

    public static int[][] paidCoins1 = {{2,2} , {1,3} , {3,2} , {3,3} , {1,4}};
    public static int[][] paidCoins2 = {{3,2,1} , {3,4} , {3,3} , {3,3,2} , {4,3,1}};
    public static int[][] paidCoins3 = {{4,3} , {2,2,4} , {5,4} , {4,3,3} , {5,2}};
    public static int[][] paidCoins4 = {{4,6} , {5,3,3} , {4,4,4}};


    public Coins_Score(int score,int counter,int discountCoin,int paidCoin){
        this.counter = counter;
        this.score = score;
        this.discountCoin = discountCoin;
        this.paidCoin = paidCoin;
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (score) {
            case 1:
                g.setColor(new Color(75, 100, 75));
                g.fillOval(0, 0, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(Cards.childrenCardScore[counter]), 21 / 2 - 5, 21 / 2 + 2);
                break;
            case 2:
                g.setColor(new Color(75, 100, 75));
                g.fillOval(0, 0, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(Cards.youthCardScore[counter]), 21 / 2 - 5, 21 / 2 + 2);
                break;
            case 3:
                g.setColor(new Color(75, 100, 75));
                g.fillOval(0, 0, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(Cards.adultsCardScore[counter]), 21 / 2 - 5, 21 / 2 + 2);
                break;
            case 4:
                g.setColor(Color.PINK);
                g.fillOval(0, 0, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(PrizeClawCards.prizeClawCardScore[counter]), 21 / 2 - 5, 21 / 2 + 2);
                break;
        }

        switch (discountCoin) {
            case 1:
                g.setColor(Color.WHITE);
                g.fillOval(65,0,15,15);
                break;
            case 2:
                g.setColor(Color.BLACK);
                g.fillOval(65,0,15,15);
                break;
            case 3:
                g.setColor(Color.BLUE);
                g.fillOval(65,0,15,15);
                break;
            case 4:
                g.setColor(Color.RED);
                g.fillOval(65,0,15,15);
                break;
            case 5:
                g.setColor(Color.GREEN);
                g.fillOval(65,0,15,15);
                break;
        }

        switch (paidCoin){
            case 1:
                g.setColor(Color.GREEN);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins1[0][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[0][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 2:
                g.setColor(Color.RED);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[1][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[1][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 3:
                g.setColor(Color.WHITE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins1[2][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[2][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 4:
                g.setColor(Color.BLACK);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[3][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.GREEN);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins1[3][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 5:
                g.setColor(Color.RED);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins1[4][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.WHITE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins1[4][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;


            case 6:
                g.setColor(Color.RED);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[0][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[0][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.WHITE);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[0][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
            case 7:
                g.setColor(Color.BLUE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[1][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.GREEN);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[1][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 8:
                g.setColor(Color.RED);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[2][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[2][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 9:
                g.setColor(Color.WHITE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[3][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.GREEN);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[3][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[3][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
            case 10:
                g.setColor(Color.BLUE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[4][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.RED);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins2[4][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.GREEN);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins2[4][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;


            case 11:
                g.setColor(Color.BLACK);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[0][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.WHITE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins3[0][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 12:
                g.setColor(Color.GREEN);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins3[1][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[1][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.RED);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[1][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
            case 13:
                g.setColor(Color.BLUE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[2][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[2][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 14:
                g.setColor(Color.RED);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[3][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[3][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins3[3][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
            case 15:
                g.setColor(Color.GREEN);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins3[4][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.WHITE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins3[4][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;


            case 16:
                g.setColor(Color.BLUE);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[0][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.WHITE);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins4[0][1]), 21 / 2 + 12, 21 / 2 + 72);
                break;
            case 17:
                g.setColor(Color.GREEN);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(paidCoins4[1][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.BLACK);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[1][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.RED);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[1][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
            case 18:
                g.setColor(Color.BLACK);
                g.fillOval(0, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[2][0]), 21 / 2 - 5, 21 / 2 + 72);

                g.setColor(Color.RED);
                g.fillOval(17, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[2][1]), 21 / 2 + 12, 21 / 2 + 72);

                g.setColor(Color.BLUE);
                g.fillOval(34, 70, 15, 15);
                g.setColor(Color.WHITE);
                g.drawString(String.valueOf(paidCoins4[2][2]), 21 / 2 + 29, 21 / 2 + 72);
                break;
        }
    }
}

