import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements  ActionListener{
    final int PanelWidth = 500;
    final int PanelHeight = 500;
    Image image;
    Image backGroundImage;
    Timer timer;
    Double xVelocity= 2.0d;
    Double yVelocity = 1.3;
    double x = 0;
    double y= 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PanelWidth,PanelHeight));
        this.setBackground(Color.BLACK);
        image = new ImageIcon(MyPanel.class.getResource("images/rocket.png")).getImage();
        backGroundImage = new ImageIcon(MyPanel.class.getResource("images/universe.png")).getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawImage(backGroundImage,0,0,null);
        graphics2D.drawImage(image,(int)x,(int) y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x>=PanelWidth - image.getWidth(null) || x<0) {xVelocity= xVelocity *-1;}

        x = x + xVelocity;
            repaint();

        if (y>=PanelHeight - image.getHeight(null) || x<0) {yVelocity= yVelocity *-1;}
            y = y + yVelocity;repaint();
    }
}
