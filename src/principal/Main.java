package principal;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Projeto Java - AULA01 COTI Informática");
		
		
		
		Cliente cliente = new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNome("Cintia Alves");
		cliente.setEmail("cintiaalves.eng@gmail.com");
		cliente.setCpf("110.270.017-77");
		
		System.out.println("\nDados do Cliente\n");
		System.out.println("Id do Cliente...: " + cliente.getIdCliente());
		System.out.println("Nome.....: " + cliente.getNome());
		System.out.println("CPF.....: " + cliente.getCpf());
		System.out.println("Email.....: " + cliente.getEmail());
		
		ClienteRepository clienteRepository = new ClienteRepository();
		
		try {
			
			clienteRepository.exportarDados(cliente);
			
			System.out.println("\nArquivo gravado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
