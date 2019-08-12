package projetop4;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Cliente {

    private String nome;
    private String cpf;
    public String email;
    private String treino;
    private float peso;
    private float altura;
    private boolean pagamento;

    public Cliente(String nome, String cpf, String email, float peso, float altura, String treino) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.peso = peso;
        this.altura = altura;
        this.treino = treino;
        this.pagamento = false;
    }
    
    public void addCliente(ArrayList<Cliente> clientes, Cliente cliente) {
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + cliente.getCpf() + ".txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + cliente.getCpf() + ".txt");

        ArrayList<String> dados = new ArrayList<>();
        dados.add("Nome: " + cliente.getNome());
        dados.add("cpf: " + cliente.getCpf());
        dados.add("Email: " + cliente.getNome());
        dados.add("Peso: " + cliente.getPeso());
        dados.add("Altura: " + cliente.getAltura());
        dados.add("Treino: " + cliente.getTreino());

        try {
            Files.write(caminho, dados);
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filetxt + "'");
        }
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "         Cliente cadastrado com sucessso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }
}
