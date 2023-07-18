package aplicacion;

import dominio.ModeloLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PresentadorLogin implements ActionListener{

    private ModeloLogin modelo;

    public PresentadorLogin() {
        this.modelo = new ModeloLogin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "INICIAR SESION" -> {
                
            }
        }
    }
    
}
