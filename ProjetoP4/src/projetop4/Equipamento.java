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

public class Equipamento {

    private int codigo;
    public String descricao;
    private int disponibilidade;

    public Equipamento(int codigo, String descricao, int disponibilidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.disponibilidade = 1;
    }
    
    public void addEquipamento(ArrayList<Equipamento> equipamentos, Equipamento equipamento) throws FileNotFoundException, IOException {
        
        String currentline;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\Equipamentos.txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\Equipamentos.txt");
        
        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader codigo = new BufferedReader(fileReader); //leitor temporario
        
        ArrayList<String> dados = new ArrayList<>();
        while ((currentline = codigo.readLine()) != null) {
            dados.add(currentline);
        }
        dados.add(Integer.toString(equipamento.getCodigo()));
        Files.write(caminho, dados);
        
        ArrayList<String> dados1 = new ArrayList<>();
        dados1.add("Código do equipamento: " + equipamento.codigo);
        dados1.add("Especificações do equipamento: " + equipamento.descricao);
        dados1.add("Disponibilidade: " + equipamento.getDisponibilidade());
 
        Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\" + equipamento.codigo + ".txt");
        try {
            Files.write(caminho2, dados1);
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filetxt + "'");
        }
        equipamentos.add(equipamento);
        JOptionPane.showMessageDialog(null, "         Equipamento cadastrado com sucessso!");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    
}
