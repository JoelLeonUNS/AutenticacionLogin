package App;

import aplicacion.PresentadorLogin;
import presentacion.VistaLogin;

public class Main {

    public static void main(String[] args) {
        PresentadorLogin pLogin = new PresentadorLogin();
        VistaLogin vLogin = new VistaLogin();
        
        vLogin.setPresentador(pLogin);        
        vLogin.iniciar();
    }
}
