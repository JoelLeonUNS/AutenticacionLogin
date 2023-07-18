package App;

import aplicacion.PresentadorLogin;
import dominio.Usuario;
import persistencia.DAO;
import persistencia.UsuarioDAO;
import presentacion.VistaLogin;

public class Main {

    public static void main(String[] args) {
        poblarUsuario();       
        VistaLogin vLogin = new VistaLogin();
        PresentadorLogin pLogin = new PresentadorLogin(vLogin);
        vLogin.setPresentador(pLogin);
        
        vLogin.iniciar();
    }
    
    public static void poblarUsuario() {
        DAO<Usuario> uDAO = new UsuarioDAO();
        uDAO.create(new Usuario("DazaV", "123"));
        uDAO.create(new Usuario("Alex", "123"));
        uDAO.create(new Usuario("Joel", "123"));
    }
}
