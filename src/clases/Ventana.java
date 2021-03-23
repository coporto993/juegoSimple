package clases;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

public class Ventana extends JFrame
{
    private final int ancho = 800;
    private final int alto = 500;
    private TableroJuego lamina;
    
    public Ventana()
    {
        setTitle("Pong");
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new TableroJuego();
        add(lamina);
        
    }
}
