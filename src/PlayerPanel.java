import javax.swing.*;

public class PlayerPanel extends JPanel {

    public PlayerPanel(String[] info){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for (int i = 0; i < info.length; i++){
            System.out.println(info[i]);
            add(new Player(info[i]));
        }

    }
}
