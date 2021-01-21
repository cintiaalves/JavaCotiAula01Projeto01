package repositories;

import java.io.FileWriter;


import entities.Cliente;

public class ClienteRepository {

	private static final String PATH_ARQUIVO = "c:\\temp\\cliente.txt";

	public void exportarDados(Cliente cliente) throws Exception {

		FileWriter fileWriter = new FileWriter(PATH_ARQUIVO);

		fileWriter.write("\nId do Cliente: " + cliente.getIdCliente());
		fileWriter.write("\nNome:....: " + cliente.getNome());
		fileWriter.write("\nCPF.....: " + cliente.getCpf());
		fileWriter.write("\nEmail.....: " + cliente.getEmail());

		fileWriter.flush();
		fileWriter.close();

	}

}
