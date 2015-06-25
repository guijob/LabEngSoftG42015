package exemplo.main;

import java.util.Date;
import java.util.List;

import exemplo.dao.UsuarioDAO;
import exemplo.model.Usuario;

public class ChamadaDAOThread implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 200; i++){
			System.out.println("Iniciando thread " + i);
			(new Thread(new ChamadaDAOThread())).start();
		}

	}

	public void run() {
		try{
			
			System.out.println("Listando todos os itens utilizando JDBC simples...");
			long inicio = new Date().getTime();
			
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> usuarios = dao.listarTodos();
			
			//Thread.sleep(10000);
			long fim = new Date().getTime();
			
			
			System.out.println(usuarios.size() + " foram encontrador em " + ((fim - inicio)) + " milisegundos.");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
