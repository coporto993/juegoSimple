
package clases;

import java.awt.geom.Rectangle2D;


public class Pelota 
{
    private int x;
    private int y;
    private final int ANCHO = 15;
    private final int ALTO = 15;
    private int dx = 1;
    private int dy = 1;
    
    public Pelota(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Rectangle2D getPelota()
    {
        return new Rectangle2D.Double(x,y, ANCHO, ALTO);
    }
    public void mover(Rectangle2D limites)
    {
        x+=dx;
        y+=dy;
        if(x>limites.getMaxX())
        {
            dx=-dx;
        }
        if(y>limites.getMaxY())
        {
            dy=-dy;
        }
        if(x<0)
        {
            dx=-dx;
        }
        if(y<0)
        {
            dy=-dy;
        }
    }
}
