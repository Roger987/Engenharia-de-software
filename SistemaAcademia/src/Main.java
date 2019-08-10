import java.util.*; 

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int input = -1;
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
	
		System.out.println("\nBem-vindo!\nDigite a operação desejada:\n"
				+ " 1 - Adicionar cliente\n 2 - Adicionar funcionário\n 3 - Adicionar equipamento\n 0 - Sair\n");
		
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
					
					Funcionario funcionario = new Funcionario();
					
					funcionario.addFuncionario(funcionarios, funcionario);
					
					System.out.println("Funcionário adicionado!\n");
					
					break;
					
				case 3:
					
					Equipamento equipamento = new Equipamento();
					
					equipamento.addEquipamento(equipamentos, equipamento);
					
					System.out.println("Equipamento adicionado!");
					
					break;
				
				}
				
				
			}
			
			catch(Exception e) {
				scanner.nextLine();
				System.out.println("\nOps! Parece que aconteceu um erro!\n");
				System.out.println("\nDigite a operação desejada:\n"
					+ " 1 - Adicionar cliente\n 2 - Adicionar funcionário\n 3 - Adicionar equipamento\n 0 - Sair\n");

			}
			
			
		}
		
	}
}
