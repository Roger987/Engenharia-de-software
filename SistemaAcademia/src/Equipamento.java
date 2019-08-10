import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Equipamento {
	
	private int codigo;
	public String descricao;
	private boolean disponibilidade;
	
	public void addEquipamento(ArrayList<Equipamento> equipamentos, Equipamento equipamento) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Código do equipamento:\n");
		equipamento.codigo = scanner.nextInt();
		scanner.nextLine();
		
		File filetxt = new File(equipamento.codigo + ".txt");
		Path caminho = Paths.get(equipamento.codigo + ".txt");
		ArrayList<String> dados = new ArrayList<>();
		
		dados.add("Código do equipamento: " + equipamento.codigo);
		
		System.out.println("Especificações do equipamento:\n");
		equipamento.descricao = scanner.nextLine();
		dados.add("Especificações do equipamento: " + equipamento.descricao);

		try {
			Files.write(caminho, dados);
		}
		
		catch(IOException ex) {
			System.out.println("Error reading file '" + filetxt + "'");
		}
		
		equipamentos.add(equipamento);
	}
	
	
}
