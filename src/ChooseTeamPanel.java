import javax.swing.*;
import java.awt.*;

public class ChooseTeamPanel extends JPanel {
    private Dimension panelSize = new Dimension(200, 300);
    private DisplayTextFilePanel homeTeam = new DisplayTextFilePanel("Välj hemmalag!", Color.GREEN);
    private DisplayTextFilePanel awayTeam = new DisplayTextFilePanel("Välj bortalag!", Color.RED);

    public ChooseTeamPanel(){
        // Sets the dimensions on the panels
        homeTeam.setPreferredSize(panelSize);
        awayTeam.setPreferredSize(panelSize);

        // Adds the panels
        this.add(homeTeam, BorderLayout.WEST);
        this.add(awayTeam, BorderLayout.EAST);


    }

}
