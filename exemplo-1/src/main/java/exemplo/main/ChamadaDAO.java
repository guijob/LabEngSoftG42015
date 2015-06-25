package exemplo.main;

import java.util.List;

import exemplo.dao.UsuarioDAO;
import exemplo.model.Usuario;

public class ChamadaDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Usuario ");

		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> usuarios = dao.listarTodos();

		for (Usuario u : usuarios) {
			System.out.println("Usuario [" + u.getId() + "] = " + u.getNome());
		}

	}
}
