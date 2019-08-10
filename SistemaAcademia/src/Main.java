import java.util.*; 

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int input = -1;
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
	
		System.out.println("\nBem-vindo!\nDigite a operação desejada:\n"
				+ " 1 - Adicionar cliente\n 2 - Adicionar equipamento\n 3 - Adicionar funcionário\n 0 - Sair\n");
		
		while(input != 0) {
			
			try {
				
				input = scanner.nextInt();
				scanner.nextLine();
				
				if(input == 0) {
					System.out.println("\nPrograma encerrado\n");
					break;
				}
				
				switch(input) {
				
				case 1:
					
					Cliente cliente = new Cliente();
					
					cliente.addCliente(clientes, cliente);
					
					System.out.println("\nCliente adicionado com sucesso!\n");
					
					break;
					
				case 2:
					
					System.out.println("Nome completo:\n");
					String nome = scanner.nextLine();
					
					System.out.println("CPF:\n");
					String cpf = scanner.nextLine();
					
					System.out.println("E-mail:\n");
					String email = scanner.nextLine();
					
					System.out.println("Cargo exercido:\n");
					String cargo = scanner.nextLine();
					
					System.out.println("Informe o salário do funcionário:\n");
					float salario = scanner.nextFloat();
					
					Funcionario funcionario = new Funcionario(nome, cpf, email, cargo, salario, false);
					
					funcionarios.add(funcionario);
					
					System.out.println("Funcionário adicionado!\n");
					
					break;
					
				case 3:
					

				
				}
				
				
			}
			
			catch(Exception e) {
				scanner.nextLine();
				System.out.println("\nOps! Parece que aconteceu um erro!\n");
				System.out.println("\nDigite a operação desejada:\n"
					+ " 1 - Adicionar cliente\n 2 - Adicionar equipamento\n 3 - Adicionar funcionário\n 0 - Sair\n");

			}
			
			
		}
		
	}
}
