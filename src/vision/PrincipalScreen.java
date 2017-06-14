/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vision;

/**
 *
 * @author Leandro Max
 */
public class PrincipalScreen extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalScreen
     */
    public PrincipalScreen() {
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

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tela Principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(302, 109, 62, 14);

        jInternalFrameBemVindo.setTitle("Bem Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.jpg"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 260, 256);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jInternalFrameBemVindo.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 600, 200);

        jButtonFecharBemVindo.setText("Fechar");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(500, 10, 65, 23);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(10, 90, 590, 270);

        jMenuFile.setText("File");

        jMenuItem1.setText("Cadastrar Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItem1);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuEdit);

        jMenuExit.setText("Exit");

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenuExit.add(jMenuItemExit);

        jMenuBar1.add(jMenuExit);

        jMenu2.setText("Navegação");

        jMenuItem2.setText("Tela da Lixeira");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(626, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroUsuarioScreen cadastroUsuarioScreen = new CadastroUsuarioScreen();
        cadastroUsuarioScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        PrincipalScreen principalScreen = new PrincipalScreen();
        principalScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LixeiraScreen telaLixeira = new LixeiraScreen();
        telaLixeira.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
