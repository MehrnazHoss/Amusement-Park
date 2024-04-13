import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Cards extends JFrame{
    final int countOfChildrenCards = 15;
    final int countOfYouthCards = 15;
    final int countOfAdultsCards = 15;

    static int i,j,k,colum;

    public static JButton[][] cardsButtons = new JButton[15][3];

    Random random = new Random();
    int childrenCardScore;
    int youthCardScore;
    int adultsCardScore;

    ImageIcon icon1 = new ImageIcon("icon1.png");
    ImageIcon icon2 = new ImageIcon("icon2.png");
    ImageIcon icon3 = new ImageIcon("icon3.png");

    Border childrenCardsBorder = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
    Border youthCardsBorder = BorderFactory.createLineBorder(Color.GRAY,3);
    Border adultsCardsBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY,3);


    public Cards(){
        Main.panel4.setLayout(new GridLayout(3,4,50,5));

        for ( colum = 0 , i = 0; i < countOfChildrenCards; i++) {
             cardsButtons[i][colum] = new JButton("Children");
             cardsButtons[i][colum].setBorder(childrenCardsBorder);
             childrenCardScore = random.nextInt(2);
             cardsButtons[i][colum].setText("Score: " + childrenCardScore);
             cardsButtons[i][colum].setOpaque(true);
             cardsButtons[i][colum].setPreferredSize(new Dimension(80, 90));
             cardsButtons[i][colum].setHorizontalAlignment(SwingConstants.CENTER);
             cardsButtons[i][colum].setBackground(Color.WHITE);
             cardsButtons[i][colum].setIcon(icon1);
             cardsButtons[i][colum].setHorizontalTextPosition(JLabel.CENTER);
             cardsButtons[i][colum].setVerticalTextPosition(JLabel.NORTH);
             cardsButtons[i][colum].setFocusable(false);
             cardsButtons[i][colum].addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent actionEvent) {
                     Players players = new Players();
                     players.player1(i, colum);
                 }
             });
             if (i < 4) {
                 Main.panel4.add(cardsButtons[i][colum]);
             }
        }

        for (colum = 1 , j = 0; j < countOfYouthCards; j++) {
            cardsButtons[j][colum] = new JButton("Youth");
            cardsButtons[j][colum].setBorder(youthCardsBorder);
            youthCardScore = random.nextInt(3)+2;
            cardsButtons[j][colum].setText("Score: " + youthCardScore);
            cardsButtons[j][colum].setOpaque(true);
            cardsButtons[j][colum].setPreferredSize(new Dimension(80, 90));
            cardsButtons[j][colum].setHorizontalAlignment(SwingConstants.CENTER);
            cardsButtons[j][colum].setBackground(Color.WHITE);
            cardsButtons[j][colum].setIcon(icon2);
            cardsButtons[j][colum].setHorizontalTextPosition(JLabel.CENTER);
            cardsButtons[j][colum].setVerticalTextPosition(JLabel.NORTH);
            cardsButtons[j][colum].setFocusable(false);
            cardsButtons[j][colum].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    Players players = new Players();
                    players.player1(j, colum);
                }
            });
            if ( j < 4 ) {
                Main.panel4.add(cardsButtons[j][colum]);
            }
        }

        for (colum = 2 , k = 0; k < countOfAdultsCards; k++) {
            cardsButtons[k][colum] = new JButton("Adults");
            cardsButtons[k][colum].setBorder(adultsCardsBorder);
            adultsCardScore = random.nextInt(3)+3;
            cardsButtons[k][colum].setText("Score: " + adultsCardScore);
            cardsButtons[k][colum].setOpaque(true);
            cardsButtons[k][colum].setPreferredSize(new Dimension(80, 90));
            cardsButtons[k][colum].setHorizontalAlignment(SwingConstants.CENTER);
            cardsButtons[k][colum].setBackground(Color.WHITE);
            cardsButtons[k][colum].setIcon(icon3);
            cardsButtons[k][colum].setHorizontalTextPosition(JLabel.CENTER);
            cardsButtons[k][colum].setVerticalTextPosition(JLabel.NORTH);
            cardsButtons[k][colum].setFocusable(false);
            cardsButtons[k][colum].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    Players players = new Players();
                    players.player1(k, colum);
                }
            });
            if ( k < 4 ) {
                Main.panel4.add(cardsButtons[k][colum]);
            }
        }
    }
}