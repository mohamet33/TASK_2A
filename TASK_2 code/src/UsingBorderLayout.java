import javax.swing.*;
import java.awt.*;
public class UsingBorderLayout {
    public UsingBorderLayout() {
        JFrame frame = new JFrame("Border Layout Frame");
        frame.setLayout(new BorderLayout());
=======

        JLabel title = new JLabel("My Music Genre", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 22));
        frame.add(title, BorderLayout.NORTH);
        JButton rapButton = new JButton("Rap Music");
        frame.add(rapButton, BorderLayout.SOUTH);
        JButton gospelButton = new JButton("Gospel Music");
        frame.add(gospelButton, BorderLayout.WEST);
        JButton balladsButton = new JButton("Ballads Music");
        frame.add(balladsButton, BorderLayout.EAST);

    }
}