import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame frame = new JFrame("Basketball"); // Creates a frame and sets a title
    private JLabel label = new JLabel(); // Creates a label

    public static void main(String[] args) {
        Main application = new Main(); // Instantiates Main
        application.execute(); // Runs the constructor
    }

    public void execute(){
        frame.add(label, BorderLayout.NORTH); // Adds the label to the frame
        frame.add(new ChooseTeamPanel(), BorderLayout.CENTER); // Adds the panel that holds the teams to the frame
        frame.setBounds(100, 100, 900, 700); // Sets the size of the frame
        //frame.pack(); // Sets the window to match a certain size
        frame.setVisible(true); // Sets the window to be visible and in focus
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits the program when closed

        // Creates rubric and sets a font
        label.setText("Basket");
        label.setFont(new Font("Ink Free", Font.BOLD, 50));
    }
}