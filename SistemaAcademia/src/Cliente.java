
public class Cliente {
	
	public String nome;
	private String cpf;
	public String email;
	private String treino;
	private boolean pagamento;
	
	public Cliente(String nome, String cpf, String email, String treino, boolean pagamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.treino = treino;
		this.pagamento = pagamento;
	}
	
}
