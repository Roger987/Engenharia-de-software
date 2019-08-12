package projetop4;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Equipamento {

    private int codigo;
    public String descricao;
    private boolean disponibilidade;

    public Equipamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.disponibilidade = true;
    }
    
    public void addEquipamento(ArrayList<Equipamento> equipamentos, Equipamento equipamento) {
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\" + equipamento.codigo + ".txt");
        Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\" + equipamento.codigo + ".txt");
        ArrayList<String> dados = new ArrayList<>();

        dados.add("Código do equipamento: " + equipamento.codigo);
        dados.add("Especificações do equipamento: " + equipamento.descricao);

        try {
            Files.write(caminho, dados);
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filetxt + "'");
        }
        equipamentos.add(equipamento);
        JOptionPane.showMessageDialog(null, "         Equipamento cadastrado com sucessso!");
    }

}
