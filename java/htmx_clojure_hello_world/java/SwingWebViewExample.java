package htmx_clojure_hello_world.java;

import javax.swing.*;
import java.awt.*;

public class SwingWebViewExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingWebViewExample::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Swing WebView Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 600));

        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);   // Make it read-only
        editorPane.setContentType("text/html");  // Set the content type to HTML

        // Load some HTML content
        editorPane.setText("<html><body><h1>Hello, World!</h1><p>This is an HTML paragraph in a JEditorPane.</p></body></html>");

        // Add the JEditorPane to a JScrollPane for scrollability
        JScrollPane scrollPane = new JScrollPane(editorPane);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Display the window
        frame.setVisible(true);
    }
}