//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;

public class Main {

    private JFrame frame = new JFrame("Basket lag");
    private JLabel name = new JLabel();


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Main application = new Main(); // instantiates Main

        application.execute();

    }

    public void execute(){

        frame.add(name, BorderLayout.NORTH);
        frame.add(new ChoseTeamPanel(), BorderLayout.CENTER);

        name.setText("Basket");
        name.setFont(new Font("Ink Free", Font.BOLD, 60));

        frame.setBounds(100, 100, 900, 700); // Sets the size of the frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}