import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame{
    public static JPanel panel1; //player1
    public static JPanel panel11; //player1
    public static JPanel panel2; //player2
    public static JPanel panel21; //player2
    public static JPanel panel3; //slot machines
    public static JPanel panel31; //slot machine
    public static JPanel panel32; //slot machine
    public static JPanel panel4; //game board
    public static JPanel panel41; //game board
    private static ActionEvent click;


    public Main(){
        setTitle("\uD83C\uDFA1Amusement Park\uD83C\uDFA0");
        setSize(1500,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("amusement park.jpg");
        setIconImage(image.getImage());

        //panel1 (player1)
        panel1 = new JPanel();
        panel1.setBackground(new Color(0,100,255));
        panel11 = new JPanel();
        panel11.setBackground(new Color(0,100,255));

        //panel2 (player2)
        panel2 = new JPanel();
        panel2.setBackground(new Color(150,10,30));
        panel21 = new JPanel();
        panel21.setBackground(new Color(150,10,30));

        new Players();


        //panel3 (slot machines)
        panel3 = new JPanel();
        panel3.setBackground(new Color(150,150,255));
        panel31 = new JPanel();
        panel31.setBackground(new Color(150,150,255));
        panel32 = new JPanel();
        panel32.setBackground(new Color(150,150,255));
        new SlotMachine();

        //panel5 (game board)
        panel4 = new JPanel();
        panel4.setBackground(new Color(250,100,90));
        panel41 = new JPanel();
        panel41.setBackground(new Color(250,100,90));

        new Cards();
        new PrizeClawCards();

        setLayout(new GridLayout(3,3));

        add(panel1);
        add(panel11);
        add(panel3);
        add(panel4);
        add(panel41);
        add(panel31);
        add(panel2);
        add(panel21);
        add(panel32);

        setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            StartGame startGame = new StartGame();
            startGame.setVisible(true);
        });
    }
}