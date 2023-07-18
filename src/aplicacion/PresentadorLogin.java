package aplicacion;

import dominio.ModeloLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentacion.VistaLogin;

public class PresentadorLogin implements ActionListener{
    
    private VistaLogin vLogin;
    private ModeloLogin modelo;

    public PresentadorLogin(VistaLogin vLogin) {
        this.vLogin = vLogin;
        this.modelo = new ModeloLogin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "INICIAR SESION" -> {
                this.setDatosModelo(vLogin.getUsuario(), vLogin.getClave());
                modelo.iniciarSesion();
                if (modelo.isAcceso()) {
                    vLogin.mensaje("Inicio de sesión exitoso.");
                } else {
                    vLogin.mensaje("Datos incorrectos.");
                }
            }
        }
    }
    
    public void setDatosModelo(String usuario, String clave) {
        modelo.getUsuario().setUsuario(usuario);
        modelo.getUsuario().setClave(clave);
    }
    
}
