import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayTextFilePanel extends JPanel implements ActionListener {

    private JButton loadTeam = new JButton(); // Creates home team button

    public DisplayTextFilePanel(String buttonTitle, Color color){
        this.setBackground(color);
        loadTeam.setText(buttonTitle);

        // Adds action listeners
        loadTeam.addActionListener(this);

        // Adds the buttons
        this.add(loadTeam);
    }

    // Listens to when a button is pressed
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadTeam) { // Clicked on "Button!"
            JFileChooser chooser = new JFileChooser();
            int choice = chooser.showDialog(this, "Välj");
            if (choice == JFileChooser.APPROVE_OPTION) {
                System.out.println(chooser.getSelectedFile().getAbsolutePath());
//                foreach(name in file) {
//                    new CheckboxPanel(name);
//                    namePanel.add(chebox);
//                }
            }
        }
    }
}
