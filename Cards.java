import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Cards extends JFrame {
    public JLabel label61; //children
    public JLabel label62; //youth
    public JLabel label63; //adults
    int countOfChildrenCards = 15;
    int countOfYouthCards = 15;
    int countOfAdultsCards = 15;

    Random random = new Random();
    int childrenCardScore = random.nextInt(2);
    int youthCardScore = random.nextInt(3)+2;
    int adultsCardScore = random.nextInt(3)+3;

    public Cards(){
        label61 = new JLabel("Children");
        label61.setText("Number: " + countOfChildrenCards + "Score: " + childrenCardScore);
        label61.setOpaque(true);
        label61.setPreferredSize(new Dimension(100,150));
        label61.setHorizontalAlignment(SwingConstants.CENTER);
        label61.setBackground(Color.WHITE);
        Main.panel6.add(label61);

        label62 = new JLabel("Youth");
        label62.setText("Number: " + countOfYouthCards + "Score: " + youthCardScore);
        label62.setOpaque(true);
        label62.setPreferredSize(new Dimension(100,150));
        label62.setHorizontalAlignment(SwingConstants.CENTER);
        label62.setBackground(Color.WHITE);
        Main.panel6.add(label62);

        label63 = new JLabel("Adults");
        label63.setText("Number: " + countOfAdultsCards + "Score: " + adultsCardScore);
        label63.setOpaque(true);
        label63.setPreferredSize(new Dimension(100,150));
        label63.setHorizontalAlignment(SwingConstants.CENTER);
        label63.setBackground(Color.WHITE);
        Main.panel6.add(label63);
    }
}