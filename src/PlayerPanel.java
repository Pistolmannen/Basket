import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    private Dimension panelSize = new Dimension(260, 350);
    private JScrollPane scrollpane;

    public PlayerPanel(String[] info){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(panelSize);

        JPanel list = new JPanel();     // creates the panel that everything goes inside
        list.setLayout(new GridLayout(0, 1, 0, 0)); // makes everything go in one colum


        for (int i = 0; i < info.length; i++){
            System.out.println(info[i]);
            list.add(new Player(info[i]));      // goes through and adds every player
        }

        scrollpane = new JScrollPane(list); //puts the panel inside a scroll panel so it is possible to scroll
        this.add(scrollpane);

    }
}
