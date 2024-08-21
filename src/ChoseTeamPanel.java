import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoseTeamPanel extends JPanel {
    private Dimension panelSize = new Dimension(200, 300);
    private ChoseTeam1 homeTeam = new ChoseTeam1();
    private ChoseTeam2 awayTeam = new ChoseTeam2();

    public ChoseTeamPanel(){
        // Sets the dimensions on the panels
        homeTeam.setPreferredSize(panelSize);
        awayTeam.setPreferredSize(panelSize);

        // Adds the panels
        this.add(homeTeam, BorderLayout.WEST);
        this.add(awayTeam, BorderLayout.EAST);


    }

}
