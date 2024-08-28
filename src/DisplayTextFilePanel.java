import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DisplayTextFilePanel extends JPanel implements ActionListener {

    private JButton loadTeam = new JButton();

    public DisplayTextFilePanel(String buttonTitle, Color color){
        this.setBackground(color); // Sets the background color on the panels
        loadTeam.setText(buttonTitle); // Sets the right title on the buttons
        loadTeam.addActionListener(this); // Adds action listeners on the buttons
        this.add(loadTeam, BorderLayout.NORTH); // Adds the buttons to the panels
    }

    // Listens to when a button is pressed
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadTeam) { // Pressed a team button
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter
                    (".txt", "txt"); // FileDialog starts at ".txt"
            chooser.setFileFilter(filter);
            int choice = chooser.showDialog  // Shows the FileDialog
                    (this, "Choose!");

            // Checks if the file is okay
            if (choice == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " + // Outputs the chosen file
                        chooser.getSelectedFile().getName());
                try {
                    ReadFile file = new ReadFile(chooser.getSelectedFile().getAbsolutePath());
                    String[] arrayLines = file.openFile(); // Saves all the lines from the chosen file
                    PlayerPanel playerPanel = new PlayerPanel(arrayLines);
                    this.add(playerPanel, BorderLayout.CENTER);

                    // Updates the panel with playerPanel
                    this.revalidate();
                    this.repaint();

                }
                catch (IOException a) {
                    System.out.println( a.getMessage() );
                }
//                foreach(name in file) {
//                    new CheckboxPanel(name);
//                    namePanel.add(checkbox);
//                }
            }
        }
    }
}