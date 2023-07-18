
package persistencia;

import dominio.Usuario;
import java.util.List;

public class UsuarioDAO extends DAO<Usuario> {

    @Override
    public Usuario create(Usuario obj) {
        BD.getUsuarios().put(BD.IdUsuario(), obj);
        System.out.println("Usuario creado: " + obj.getUsuario());
        return obj;
    }

    @Override
    public Usuario delete(Usuario obj) {
        return null;
    }

    @Override
    public Usuario update(Usuario obj) {
        return null;
    }

    @Override
    public Usuario read(int id) {
        return null;
    }

    @Override
    public List<Usuario> listed() {
        return null;
    }

}
