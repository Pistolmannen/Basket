import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoseTeam1 extends JPanel implements ActionListener {

    private JButton loadHomeTeam = new JButton("Välj hemmalag!"); // Creates home team button
    private Color Green = new Color(0, 210, 0);

    public ChoseTeam1(){
        this.setBackground(Green);

        // Adds action listeners
        loadHomeTeam.addActionListener(this);

        // Adds the buttons
        this.add(loadHomeTeam);
    }

    // Listens to when a button is pressed
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadHomeTeam) { // Clicked on "Välj hemmalag!"
            System.out.println("Hemmalag!");
        }
    }
}
