package projetop4;
import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    private int pagamento;

    public Cliente(String nome, String cpf, String email, float peso, float altura, String treino, int pagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.peso = peso;
        this.altura = altura;
        this.treino = treino;
        this.pagamento = pagamento;
    }
    
    public void addCliente(ArrayList<Cliente> clientes, Cliente cliente) throws FileNotFoundException, IOException {
        String currentline;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");
        
        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader cpf = new BufferedReader(fileReader); //leitor temporario
        
        ArrayList<String> dados = new ArrayList<>();
        while ((currentline = cpf.readLine()) != null) {
            dados.add(currentline);
        }
        dados.add(cliente.getCpf());
        Files.write(caminho, dados);
        
        ArrayList<String> dados1 = new ArrayList<>();
        dados1.add("Nome: " + cliente.getNome());
        dados1.add("cpf: " + cliente.getCpf());
        dados1.add("Email: " + cliente.getEmail());
        dados1.add("Peso: " + cliente.getPeso());
        dados1.add("Altura: " + cliente.getAltura());
        dados1.add("Treino: " + cliente.getTreino());
        dados1.add("Pagamento: " + cliente.getPagamento());

        Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + cliente.getCpf() + ".txt");
        try {
            Files.write(caminho2, dados1);
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

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }
}
