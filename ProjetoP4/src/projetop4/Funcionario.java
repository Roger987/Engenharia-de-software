package projetop4;
import java.util.*;
import java.io.File;
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
    private boolean pagamento;

    public Funcionario(String nome, String cpf, String email, String cargo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        this.pagamento = false;
    }
    
    public void addFuncionario(ArrayList<Funcionario> funcionarios, Funcionario func) {
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\" + func.getCpf() + ".txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\" + func.getCpf() + ".txt");

        ArrayList<String> dados = new ArrayList<>();
        dados.add("Nome: " + func.getNome());
        dados.add("cpf: " + func.getCpf());
        dados.add("Email: " + func.getEmail());
        dados.add("Cargo: " + func.getCargo());
        dados.add("Salario: " + func.getSalario());

        try {
            Files.write(caminho, dados);
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

    public boolean isPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }
    
}
