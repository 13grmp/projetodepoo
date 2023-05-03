package br.gov.cesarschool.poo.fidelidade.cliente.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;
fazer
public class ClienteDAO {
	private static final String FILE_SEP = System.getProperty("file.separator");
	private static final String DIR_BASE = "." + FILE_SEP + "banco" + FILE_SEP 
			+ "cliente" + FILE_SEP; 
	private static final String EXT = ".dat";
	public ClienteDAO() {
		File diretorio = new File(DIR_BASE);
		if (!diretorio.exists()) {
			diretorio.mkdir();
		}
	}
	private File getArquivo(String cpf) {
		String nomeArq = DIR_BASE + cpf + EXT;
		return new File(nomeArq);		
	}
	private void incluirAux(Cliente cliente, File arq) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(arq);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(cliente);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao incluir correntista");
		} finally {
			try {
				oos.close();
			} catch (Exception e) {}
			try {
				fos.close();
			} catch (Exception e) {}			
		} 		
	}
	
	boolean incluir(Cliente cliente) {
		return false;
	}
	boolean alterar(Cliente cliente) {
		return false;
	}
	Cliente buscar(String cpf) {
		return null;
	}
}
