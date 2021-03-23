package clases;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableroJuego extends JPanel
{
    Pelota pelota = new Pelota(0,0);
    
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
        dibujar(g2);
        actualizar();
    }
    
    public void dibujar(Graphics2D g)
    {
        g.fill(pelota.getPelota());
    }
    
    public void actualizar()
    {
        pelota.mover(getBounds());
    }
    
    public void iterarJuego()
    {
        while(true)
        {
            repaint();
            try {
                Thread.sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(TableroJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
