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
        chosePlayer.setText("Choose");

        center.add(label, BorderLayout.EAST);
        center.add(chosePlayer, BorderLayout.WEST);
        add(center);
    }
}

