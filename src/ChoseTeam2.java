import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoseTeam2 extends JPanel implements ActionListener {

    private JButton loadAwayTeam = new JButton("Välj bortalag!"); // Creates away team button
    private Color Red = new Color(210, 0, 0);

    public ChoseTeam2(){
        this.setBackground(Red);

        // Adds action listeners
        loadAwayTeam.addActionListener(this);

        // Adds the buttons
        this.add(loadAwayTeam);
    }

    // Listens to when a button is pressed
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadAwayTeam){ // Clicked on "Välj bortlag!"
            System.out.println("Bortalag!");
        }
    }
}
