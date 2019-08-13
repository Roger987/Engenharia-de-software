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

public class Funcionario {

    public String nome;
    private String cpf;
    private String email;
    public String cargo;
    private float salario;
    private int pagamento;

    public Funcionario(String nome, String cpf, String email, String cargo, float salario, int pagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        this.pagamento = 0;
    }
    
    public void addFuncionario(ArrayList<Funcionario> funcionarios, Funcionario func) throws FileNotFoundException, IOException {
        String currentline;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\Funcionarios.txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\Funcionarios.txt");
        
        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader cpf = new BufferedReader(fileReader); //leitor temporario
        
        ArrayList<String> dados = new ArrayList<>();
        while ((currentline = cpf.readLine()) != null) {
            dados.add(currentline);
        }
        dados.add(func.getCpf());
        Files.write(caminho, dados);
        
        ArrayList<String> dados1 = new ArrayList<>();
        dados1.add("Nome: " + func.getNome());
        dados1.add("cpf: " + func.getCpf());
        dados1.add("Email: " + func.getEmail());
        dados1.add("Cargo: " + func.getCargo());
        dados1.add("Salario: " + func.getSalario());
        dados1.add("Pagamento: " + func.getPagamento());

        Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\" + func.getCpf() + ".txt");
        try {
            Files.write(caminho2, dados1);
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filetxt + "'");
        }
        funcionarios.add(func);
        JOptionPane.showMessageDialog(null, "         Funcionário cadastrado com sucessso!");
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }
    
}
