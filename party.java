import java.awt.*;
import java.awt.event.*;

public class party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Party at Tim's");
        Button b = new Button("You bet");
        Button c = new Button("Shoot me");
        Panel p = new Panel();

        p.add(l);
        p.add(b); // Add the buttons to the panel
        p.add(c);

        f.add(p); // Add the panel to the frame

        f.setSize(300, 200); // Set the size of the frame
        f.setVisible(true); // Make the frame visible

        // Optional: Add a window listener to close the window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });

        // Optional: Add action listeners to the buttons
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You bet button clicked");
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Shoot me button clicked");
            }
        });
    }

    public static void main(String[] args) {
        party party = new party();
        party.buildInvite();
    }
}
