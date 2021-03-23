package clases;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo extends Thread
{
    TableroJuego lamina;
    
    public Hilo(TableroJuego lamina)
    {
        this.lamina = lamina;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
        }
    }
}
