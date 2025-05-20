package swing;

import javax.swing.*;     // For JFrame, JPanel, JTabbedPane, SwingUtilities
import java.awt.*;        // For Color

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {
        setTitle("Color Tabbed Pane");     // Set the window title
        setSize(400, 300);                 // Set window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);       // Center the window

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create and add Cyan tab
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        // Create and add Magenta tab
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        // Create and add Yellow tab
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbedPane to the JFrame
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ColorTabbedPane frame = new ColorTabbedPane();
                frame.setVisible(true); // Show the frame
            }
        });
    }
}
