import javax.swing.*;
import java.awt.*;

public class ChoseTeamPanel extends JPanel {

    private Dimension panelSize = new Dimension(200, 300);
    private ChoseTeam1 panel1 = new ChoseTeam1();
    private ChoseTeam2 panel2 = new ChoseTeam2();

    public ChoseTeamPanel(){

        panel1.setPreferredSize(panelSize);
        panel2.setPreferredSize(panelSize);

        this.add(panel1, BorderLayout.WEST);
        this.add(panel2, BorderLayout.EAST);
    }
}
