import javax.swing.*;
import java.awt.*;

public class Player extends JPanel {

    private String info;
    private JLabel label = new JLabel();
    private JButton chosePlayer = new JButton();
    private JPanel center = new JPanel();

    public Player(String info) {
        this.info = info;

        this.setBackground(Color.BLUE);
        label.setBackground(Color.BLUE);

        label.setText(info);
        //label.setFont(new Font("Ink Free", Font.BOLD, 10));
        chosePlayer.setText("Choose");

        center.add(label, BorderLayout.EAST);
        center.add(chosePlayer, BorderLayout.WEST);
        add(center);
    }
}

