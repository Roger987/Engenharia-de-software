import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Funcionario {
	
	public String nome;
	private String cpf;
	private String email;
	public String cargo;
	private float salario;
	private boolean pagamento;
	
	public void addFuncionario(ArrayList<Funcionario> funcionarios, Funcionario funcionario) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CPF:\n");
		funcionario.cpf = scanner.nextLine();
		
		File filetxt = new File(funcionario.cpf + ".txt");
		Path caminho = Paths.get(funcionario.cpf + ".txt");
		ArrayList<String> dados = new ArrayList<>();
		
		dados.add("cpf: " + funcionario.cpf);
		
		System.out.println("Nome completo:\n");
		funcionario.nome = scanner.nextLine();
		dados.add("Nome: " + funcionario.nome);
		
		System.out.println("E-mail:\n");
		funcionario.email = scanner.nextLine();
		dados.add("Email: " + funcionario.email);
		
		System.out.println("Cargo:\n");
		funcionario.cargo = scanner.nextLine();
		dados.add("Cargo: " + funcionario.cargo);
		
		System.out.println("Salário:\n");
		funcionario.salario = scanner.nextFloat();
		dados.add("Salário: " + funcionario.salario);
		
		scanner.nextLine();
		
		try {
			Files.write(caminho, dados);
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + filetxt + "'");
		}
		
		funcionarios.add(funcionario);
	}
	
}
