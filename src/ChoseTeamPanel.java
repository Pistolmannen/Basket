import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoseTeamPanel extends JPanel implements ActionListener {
    private Dimension panelSize = new Dimension(200, 300);
    private ChoseTeam1 homeTeam = new ChoseTeam1();
    private ChoseTeam2 awayTeam = new ChoseTeam2();
    private JButton loadHomeTeam = new JButton("Välj hemmalag!"); // Creates home team button
    private JButton loadAwayTeam = new JButton("Välj bortalag!"); // Creates away team button

    public ChoseTeamPanel(){
        // Sets the dimensions on the panels
        homeTeam.setPreferredSize(panelSize);
        awayTeam.setPreferredSize(panelSize);

        // Adds the panels
        this.add(homeTeam, BorderLayout.WEST);
        this.add(awayTeam, BorderLayout.EAST);

        // Adds action listeners
        loadHomeTeam.addActionListener(this);
        loadAwayTeam.addActionListener(this);

        // Adds the buttons
        homeTeam.add(loadHomeTeam);
        awayTeam.add(loadAwayTeam);
    }

    // Listens to when a button is pressed
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadHomeTeam) { // Clicked on "Välj hemmalag!"
            System.out.println("Hemmalag!");
        } else if (e.getSource() == loadAwayTeam){ // Clicked on "Välj bortlag!"
            System.out.println("Bortalag!");
        }
    }
}
