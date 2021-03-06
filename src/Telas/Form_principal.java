/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Casa
 */
public class Form_principal extends javax.swing.JFrame {

    /**
     * Creates new form Form_principal
     */
    Cadastro_Clientes cadastro_Clientes = null;
    Cadastro_Usuario cadastro_Usuario = null;
    Cadastro_Materiais cadastro_Materiais = null;
    public Form_principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        menu_admin.setEnabled(false);
        menu_arquivo.setEnabled(false);
        menu_op.setEnabled(false);
        barra_menu.setBackground(new Color(0,153,255));
    }
    public Form_principal(Integer tipo) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        menu_admin.setEnabled(false);
        menu_arquivo.setEnabled(false);
        menu_op.setEnabled(false);
         barra_menu.setBackground(new Color(0,153,255));
        
        
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        barra_menu = new javax.swing.JMenuBar();
        menu_arquivo = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menu_admin = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menu_op = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktop.setLayout(new javax.swing.OverlayLayout(desktop));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        menu_arquivo.setText("Arquivo");
        menu_arquivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem10.setText("Sair");
        menu_arquivo.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem11.setText("Logout");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menu_arquivo.add(jMenuItem11);

        barra_menu.add(menu_arquivo);

        menu_admin.setBackground(new java.awt.Color(0, 153, 255));
        menu_admin.setText("Admin");
        menu_admin.setToolTipText("");
        menu_admin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu3.setBackground(new java.awt.Color(0, 153, 255));
        jMenu3.setText("Cadastros");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-adicionar-grupo-de-usuários-homem-homem-24.png"))); // NOI18N
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-suporte-24.png"))); // NOI18N
        jMenuItem3.setText("Serviços");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-funcionário-homem-24.png"))); // NOI18N
        jMenuItem4.setText("Funcionários");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-produto-novo-24.png"))); // NOI18N
        jMenuItem5.setText("Materiais");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-usuário-de-gênero-neutro-24.png"))); // NOI18N
        jMenu1.setText("Usuários");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-mais-24.png"))); // NOI18N
        jMenuItem7.setText("Cadastrar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-visão-da-página-4-24.png"))); // NOI18N
        jMenuItem12.setText("Editar");
        jMenu1.add(jMenuItem12);

        jMenu3.add(jMenu1);

        menu_admin.add(jMenu3);

        jMenu4.setText("Editar");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Imagens/icons8-usuário-de-gênero-neutro-24.png"))); // NOI18N
        jMenuItem6.setText("Usuários");
        jMenu4.add(jMenuItem6);

        menu_admin.add(jMenu4);

        jMenuItem8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem8.setText("Ordens de Serviços");
        menu_admin.add(jMenuItem8);

        barra_menu.add(menu_admin);

        menu_op.setText("Operador");
        menu_op.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem9.setText("Abrir O.S");
        menu_op.add(jMenuItem9);

        barra_menu.add(menu_op);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        fecharTelas();
        cadastro_Clientes = new Cadastro_Clientes();
        cadastro_Clientes.setVisible(true);
        desktop.add(cadastro_Clientes);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Form_Login form_Login = new Form_Login();
        form_Login.setSize(416, 339);
        form_Login.setVisible(true);
        menu_admin.setEnabled(false);
        menu_arquivo.setEnabled(false);
        menu_op.setEnabled(false);
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Cadastro_Funcionarios cadastro_Funcionarios = new Cadastro_Funcionarios();
        cadastro_Funcionarios.setVisible(true);
        desktop.add(cadastro_Funcionarios);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        fecharTelas();
        cadastro_Materiais = new Cadastro_Materiais();
        cadastro_Materiais.setVisible(true);
        desktop.add(cadastro_Materiais);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        fecharTelas();
        cadastro_Usuario = new Cadastro_Usuario();
        cadastro_Usuario.setSize(274, 339);
        cadastro_Usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    public void fecharTelas(){
    if(cadastro_Clientes != null){
        cadastro_Clientes.setVisible(false);
        cadastro_Clientes = null;
    }
    if(cadastro_Usuario != null){
        cadastro_Usuario.setVisible(false);
        cadastro_Usuario = null;
    }
    if(cadastro_Materiais != null){
        cadastro_Materiais.setVisible(false);
        cadastro_Materiais = null;
    }
    }
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
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JMenu menu_admin;
    public static javax.swing.JMenu menu_arquivo;
    public static javax.swing.JMenu menu_op;
    // End of variables declaration//GEN-END:variables
}
