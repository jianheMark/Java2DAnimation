import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel myPanel;
    MyFrame() {
        this.setTitle("Java 2D Animation");
        myPanel = new MyPanel();
        this.add(myPanel);
        this.pack();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
