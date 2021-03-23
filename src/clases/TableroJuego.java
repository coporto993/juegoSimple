package clases;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class TableroJuego extends JPanel
{
    public TableroJuego()
    {
        setBackground(Color.CYAN);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.PINK);
        g2.fill(new Rectangle2D.Double(0,0,20,20));
    }
    
}
