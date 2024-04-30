import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    JButton userName1;
    JButton userName2;
    JTextField textField1;
    JTextField textField2;
    JFrame submit1;
    JFrame submit2;

    public static int turn = 1;


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
        panel2.setBackground(new Color(200,20,100));
        panel21 = new JPanel();
        panel21.setBackground(new Color(200,20,100));



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

        submit1 = new JFrame();
        submit1.setLayout(new FlowLayout());
        userName1 = new JButton("Submit");
        userName1.setFocusable(false);
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(150,40));
        textField1.setFont(new Font("Consolas",Font.PLAIN,30));
        textField1.setForeground(new Color(0,200,250));
        textField1.setBackground(new Color(10,50,150));
        textField1.setEditable(true);
        submit1.add(userName1);
        submit1.add(textField1);
        submit1.pack();
        submit1.setVisible(true);
        userName1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.getText();
                Players.scoreOfPlayer1.setText(textField1.getText() + " Score: " + Players.totalScore1);
                Players.scoreOfPlayer1.setFont(new Font("Comic Sans",Font.BOLD,30));

                submit2 = new JFrame();
                submit2.setLayout(new FlowLayout());
                userName2 = new JButton("Submit");
                userName2.setFocusable(false);
                textField2 = new JTextField();
                textField2.setPreferredSize(new Dimension(150,40));
                textField2.setFont(new Font("Consolas",Font.PLAIN,30));
                textField2.setForeground(new Color(255,170,255));
                textField2.setBackground(new Color(200,20,150));
                textField2.setEditable(true);
                submit2.add(userName2);
                submit2.add(textField2);
                submit2.pack();
                submit2.setVisible(true);
                userName2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        textField2.getText();
                        Players.scoreOfPlayer2.setText(textField2.getText() + " Score: " + Players.totalScore2);
                        Players.scoreOfPlayer2.setFont(new Font("Comic Sans",Font.BOLD,30));
                    }
                });
            }
        });
        Cards.createCards();
        PrizeClawCards.createPrizeClawCards();
        new Players();

        JButton turnButton = new JButton("1");
        turnButton.setFocusable(false);
        turnButton.setPreferredSize(new Dimension(300,50));
        turnButton.setBackground(Color.ORANGE);
        turnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (turn == 1){
                    Players.player1();
                    turnButton.setText("2");
                    turn = 2;
                }
                else if (turn == 2){
                    Players.player2();
                    turnButton.setText("1");
                    turn = 1;
                }
            }
        });

        panel41.add(turnButton);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            StartGame startGame = new StartGame();
            startGame.setVisible(true);
        });
    }
}