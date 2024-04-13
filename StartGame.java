import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartGame extends JFrame {
    private JPanel mainPanel;

    public StartGame(){
        setTitle("Start Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500,900);
        ImageIcon image = new ImageIcon("AP.jpg");
        setIconImage(image.getImage());

        JPanel backGroundPanel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                ImageIcon backgroundImage = new ImageIcon("AP.jpg");

                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        JButton startButton = new JButton("Start Game");
        startButton.setFocusable(false);
        startButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel = new JPanel(new Main().getLayout());
                setContentPane(mainPanel);
            }
        });
        backGroundPanel.add(startButton);
        setContentPane(backGroundPanel);
    }
}
