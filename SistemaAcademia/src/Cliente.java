
public class Cliente {
	
	public String nome;
	private String cpf;
	public String email;
	private String treino;
	private float peso;
	private float altura;
	private boolean pagamento;
	
	public Cliente(String nome, String cpf, String email, float peso, float altura, String treino, boolean pagamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
		this.treino = treino;
		this.pagamento = pagamento;
	}
	
}
