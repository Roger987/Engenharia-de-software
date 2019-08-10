import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Cliente {
	
	public String nome;
	private String cpf;
	public String email;
	private String treino;
	private float peso;
	private float altura;
	private boolean pagamento;
	
	public void addCliente(ArrayList<Cliente> clientes, Cliente cliente) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CPF:\n");
		cliente.cpf = scanner.nextLine();
		
		File filetxt = new File(cliente.cpf + ".txt");
		Path caminho = Paths.get(cliente.cpf + ".txt");
		ArrayList<String> dados = new ArrayList<>();
		
		dados.add("cpf: " + cliente.cpf);
		
		System.out.println("Nome completo:\n");
		cliente.nome = scanner.nextLine();
		dados.add("Nome: " + cliente.nome);
		
		System.out.println("E-mail:\n");
		cliente.email = scanner.nextLine();
		dados.add("Email: " + cliente.email);
		
		System.out.println("Peso:\n");
		cliente.peso = scanner.nextFloat();
		dados.add("Peso: " + cliente.peso);
		
		System.out.println("Altura:\n");
		cliente.altura = scanner.nextFloat();
		dados.add("Altura: " + cliente.altura);
		
		scanner.nextLine();
		
		System.out.println("Informe a rotina do cliente:\n");
		cliente.treino = scanner.nextLine();
		dados.add("Treino: " + cliente.treino);
		
		try {
			Files.write(caminho, dados);
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + filetxt + "'");
		}
		
		clientes.add(cliente);
	}
	
}
