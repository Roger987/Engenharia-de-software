/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Aldemir Filho
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Relatório");

        jMenuItem18.setText("Equipamentos");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setText("Clientes");
        jMenu1.add(jMenuItem19);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Editar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Remover");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Buscar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Funcionários");

        jMenuItem5.setText("Cadastrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Editar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Remover");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Buscar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Equipamentos");

        jMenuItem9.setText("Cadastrar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Editar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Remover");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Buscar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Treino");

        jMenuItem13.setText("Editar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setText("Excluir");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Pagamento");

        jMenuItem15.setText("Efetuar pagamento");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem16.setText("Receber pagamento");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem17.setText("Gerar folha");
        jMenu6.add(jMenuItem17);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        TelaCadUser telacaduser = new TelaCadUser();
        telacaduser.setClientes(clientes);
        jDesktopPane1.add(telacaduser);
        telacaduser.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        TelaCadFunc telacadfunc = new TelaCadFunc();
        telacadfunc.setFuncionarios(funcionarios);
        jDesktopPane1.add(telacadfunc);
        telacadfunc.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        TelaCadEquip telacadequip = new TelaCadEquip();
        telacadequip.setEquipamentos(equipamentos);
        jDesktopPane1.add(telacadequip);
        telacadequip.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        TelaCriarTreino telacriartreino = new TelaCriarTreino();
        jDesktopPane1.add(telacriartreino);
        telacriartreino.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
    
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
    
    public void atualizarclientes() throws FileNotFoundException, IOException {
        String currentline, currentline2;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");
        //Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");

        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader cpf1 = new BufferedReader(fileReader); //leitor temporario
        
        String nome = null, cpf = null, email = null, peso = null, altura = null, treino = null, pagamento = null;
        while ((currentline = cpf1.readLine()) != null) {
            File filetxt2 = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + currentline + ".txt");
            //Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + currentline + ".txt");

            FileReader fileReader2 = new FileReader(filetxt2); //leitor de arq
            BufferedReader cpf2 = new BufferedReader(fileReader2); //leitor temporario
            
            while ((currentline2 = cpf2.readLine()) != null) {
                if(currentline2.contains("Nome: ")){
                   nome = currentline2.substring(6);
                   //System.out.println(nome);
                }
                if(currentline2.contains("cpf: ")){
                   cpf = currentline2.substring(5);
                   //System.out.println(cpf);
                }
                if(currentline2.contains("Email: ")){
                   email = currentline2.substring(7);
                   //System.out.println(email);
                }
                if(currentline2.contains("Peso: ")){
                   peso = currentline2.substring(6);
                   //System.out.println(peso);
                }
                if(currentline2.contains("Altura: ")){
                   altura = currentline2.substring(8);
                   //System.out.println(altura);
                }
                if(currentline2.contains("Treino: ")){
                   treino = currentline2.substring(8);
                   //System.out.println(treino);
                }
                if(currentline2.contains("Pagamento: ")){
                   pagamento = currentline2.substring(11);
                   //System.out.println(pagamento);
                }
            }
            Cliente cliente = new Cliente(nome, cpf, email, Float.parseFloat(peso), Float.parseFloat(altura), treino, Integer.parseInt(pagamento));
            clientes.add(cliente);
        }/*
        if(clientes.size() != 0){
            int i;
            for(i = 0; i < clientes.size(); i++){
                System.out.println(clientes.get(i).getNome());
            }
        }*/
    }
    
    public void atualizarfuncionarios() throws FileNotFoundException, IOException {
        String currentline, currentline2;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\Funcionarios.txt");
        //Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");

        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader cpf1 = new BufferedReader(fileReader); //leitor temporario
        
        String nome = null, cpf = null, email = null, cargo = null, salario = null, pagamento = null;
        while ((currentline = cpf1.readLine()) != null) {
            File filetxt2 = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Funcionarios\\" + currentline + ".txt");
            //Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + currentline + ".txt");

            FileReader fileReader2 = new FileReader(filetxt2); //leitor de arq
            BufferedReader cpf2 = new BufferedReader(fileReader2); //leitor temporario
            
            while ((currentline2 = cpf2.readLine()) != null) {
                if(currentline2.contains("Nome: ")){
                   nome = currentline2.substring(6);
                  // System.out.println(nome);
                }
                if(currentline2.contains("cpf: ")){
                   cpf = currentline2.substring(5);
                   //System.out.println(cpf);
                }
                if(currentline2.contains("Email: ")){
                   email = currentline2.substring(7);
                   //System.out.println(email);
                }
                if(currentline2.contains("Cargo: ")){
                   cargo = currentline2.substring(7);
                   //System.out.println(cargo);
                }
                if(currentline2.contains("Salario: ")){
                   salario = currentline2.substring(9);
                   //System.out.println(salario);
                }
                if(currentline2.contains("Pagamento: ")){
                   pagamento = currentline2.substring(11);
                   //System.out.println(pagamento);
                }
            }
            Funcionario func = new Funcionario(nome, cpf, email, cargo, Float.parseFloat(salario), Integer.parseInt(pagamento));
            funcionarios.add(func);
        }/*
        if(funcionarios.size() != 0){
            int i;
            for(i = 0; i < funcionarios.size(); i++){
                System.out.println(funcionarios.get(i).getNome());
            }
        }*/
    }
    
    public void atualizarequipamentos() throws FileNotFoundException, IOException {
        String currentline, currentline2;
        File filetxt = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\Equipamentos.txt");
        //Path caminho = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\Clientes.txt");

        FileReader fileReader = new FileReader(filetxt); //leitor de arq
        BufferedReader codigo1 = new BufferedReader(fileReader); //leitor temporario
        
        String codigo = null, descricao = null, disponibilidade = null;
        while ((currentline = codigo1.readLine()) != null) {
            File filetxt2 = new File("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Equipamentos\\" + currentline + ".txt");
            //Path caminho2 = Paths.get("C:\\Users\\Aldemir Filho\\Documents\\NetBeansProjects\\ProjetoP4\\dados\\Clientes\\" + currentline + ".txt");

            FileReader fileReader2 = new FileReader(filetxt2); //leitor de arq
            BufferedReader codigo2 = new BufferedReader(fileReader2); //leitor temporario
            
            while ((currentline2 = codigo2.readLine()) != null) {
                if(currentline2.contains("Código do equipamento: ")){
                   codigo = currentline2.substring(23);
                   //System.out.println(codigo);
                }
                if(currentline2.contains("Especificações do equipamento: ")){
                   descricao = currentline2.substring(31);
                   //System.out.println(descricao);
                }
                if(currentline2.contains("Disponibilidade: ")){
                   disponibilidade = currentline2.substring(17);
                   //System.out.println(disponibilidade);
                }
            }
            Equipamento equip = new Equipamento(Integer.parseInt(codigo), descricao, Integer.parseInt(disponibilidade));
            equipamentos.add(equip);
        }/*
        if(equipamentos.size() != 0){
            int i;
            for(i = 0; i < equipamentos.size(); i++){
                System.out.println(equipamentos.get(i).getCodigo());
            }
        }*/
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    
}
