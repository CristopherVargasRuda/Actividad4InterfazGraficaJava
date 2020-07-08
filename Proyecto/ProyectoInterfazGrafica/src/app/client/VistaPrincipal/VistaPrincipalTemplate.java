package app.client.VistaPrincipal;

import javax.swing.JFrame;
import app.services.RecursosService;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VistaPrincipalTemplate extends JFrame{
    
    private RecursosService sRecursos;
    
    public VistaPrincipalTemplate(){
    super("Vista Principal");
    
        sRecursos = RecursosService.getService();
    
        getContentPane().setBackground(sRecursos.getColorFondo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}
