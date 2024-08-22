import javax.swing.*;
import java.awt.*;

public class ChooseTeamPanel extends JPanel {
    private Dimension panelSize = new Dimension(200, 300); // Sets the dimensions on the panels

    // Creates the team buttons
    private DisplayTextFilePanel homeTeam = new DisplayTextFilePanel("Choose hometeam!", Color.GREEN);
    private DisplayTextFilePanel awayTeam = new DisplayTextFilePanel("Choose awayteam!", Color.RED);

    public ChooseTeamPanel(){
        // Adds the dimensions to the panels
        homeTeam.setPreferredSize(panelSize);
        awayTeam.setPreferredSize(panelSize);

        // Adds the panels
        this.add(homeTeam, BorderLayout.WEST);
        this.add(awayTeam, BorderLayout.EAST);
    }
}