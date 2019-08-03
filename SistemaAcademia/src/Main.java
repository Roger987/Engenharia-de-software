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
					
					System.out.println("Nome completo:\n");
					String nome = scanner.nextLine();
					
					System.out.println("CPF:\n");
					String cpf = scanner.nextLine();
					
					System.out.println("E-mail:\n");
					String email = scanner.nextLine();
					
					System.out.println("Informe o treino do cliente:\n");
					String treino = scanner.nextLine();
					
					Cliente cliente = new Cliente(nome, cpf, email, treino, false);
					
					System.out.println("\nCliente adicionado com sucesso!\n");
					
					break;
					
				
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
