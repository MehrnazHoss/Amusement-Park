import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public static JPanel panel1; //player1
    public static JPanel panel2; //player2
    public static JPanel panel3; //slot machines
    public static JPanel panel4; //slot machines
    public static JPanel panel5; //game board
    public static JPanel panel6; //cards

    public final JLabel label1; //player1
    public final JLabel label2; //player2
    public final JLabel label3; //slot machines
    public final JLabel label5; //game board
    public final JLabel label6; //ticket sales



    public Main(){
        setTitle("\uD83C\uDFA1Amusement Park\uD83C\uDFA0");
        setSize(1400,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel1 (player1)
        panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        label1 = new JLabel("Player 1");
        panel1.add(label1);

        //panel2 (player2)
        panel2 = new JPanel();
        panel2.setBackground(Color.RED);
        label2 = new JLabel("Player 2");
        panel2.add(label2);

        //panel3 (slot machines)
        panel3 = new JPanel();
        panel3.setBackground(Color.ORANGE);
        label3 = new JLabel("\uD83C\uDFB0Slot Machines\uD83C\uDFB0");
        panel3.add(label3);
        //panel4 (slot machines)
        panel4 = new JPanel();
        panel4.setBackground(Color.ORANGE);
        new SlotMachine();

        //panel5 (game board)
        panel5 = new JPanel();
        panel5.setBackground(Color.LIGHT_GRAY);
        label5 = new JLabel("Game Board");
        panel5.add(label5);

        //panel6 (cards)
        panel6 = new JPanel();
        panel6.setBackground(Color.BLACK);
        label6 = new JLabel("Ticket Sales");
        panel6.add(label6);
        new Cards();
        new PrizeClawCards();


        getContentPane().setLayout(new GridLayout(3,2));

        getContentPane().add(panel1);
        getContentPane().add(panel3);
        getContentPane().add(panel5);
        getContentPane().add(panel4);
        getContentPane().add(panel2);
        getContentPane().add(panel6);

        setVisible(true);
    }

    public static void main(String[] args){
        new Main();

    }
}