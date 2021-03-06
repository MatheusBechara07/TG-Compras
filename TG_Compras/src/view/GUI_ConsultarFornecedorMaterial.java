/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Gabriel Pilan
 */
public class GUI_ConsultarFornecedorMaterial extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PesquisarFornecedorMaterial
     */
    public GUI_ConsultarFornecedorMaterial() {
        initComponents();
        jTableFornecedoresDisponiveis.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoMaterial = new javax.swing.JTextField();
        cmbNomeMaterial = new javax.swing.JComboBox<>();
        btnPesquisarFornecedores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedoresDisponiveis = new javax.swing.JTable();
        btnPesquisarMaterial = new javax.swing.JButton();
        btnCopiarCNPJ = new javax.swing.JButton();
        rbPesquisaPorCodigo = new javax.swing.JRadioButton();
        rbPesquisarPorNome = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Fornecedor de Material");
        setAlwaysOnTop(true);

        jLabel1.setText("Codigo do Material");

        jLabel2.setText("Nome do Material");

        cmbNomeMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNomeMaterial.setEnabled(false);

        btnPesquisarFornecedores.setText("Pesquisar Fornecedores Disponíveis");

        jLabel3.setText("Tabela de Fornecedores Disponíveis");

        jTableFornecedoresDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CNPJ", "Nome Fornecedor", "Nota do Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(jTableFornecedoresDisponiveis);

        btnPesquisarMaterial.setText("Pesquisar Material");
        btnPesquisarMaterial.setEnabled(false);

        btnCopiarCNPJ.setText("Copiar CNPJ do Fornecedor Selecionado");

        buttonGroup1.add(rbPesquisaPorCodigo);
        rbPesquisaPorCodigo.setText("Pesquisar material pelo codigo");
        rbPesquisaPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisaPorCodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPesquisarPorNome);
        rbPesquisarPorNome.setText("Pesquisar material por nome");
        rbPesquisarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesquisarPorNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Selecione uma opção de pesquisa do material");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarMaterial))
                            .addComponent(rbPesquisaPorCodigo))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbPesquisarPorNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(btnPesquisarFornecedores)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopiarCNPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPesquisaPorCodigo)
                    .addComponent(rbPesquisarPorNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarMaterial)
                    .addComponent(jLabel2)
                    .addComponent(cmbNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnPesquisarFornecedores)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarCNPJ)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPesquisaPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisaPorCodigoActionPerformed
        if(rbPesquisaPorCodigo.isSelected()){
            txtCodigoMaterial.setEnabled(true);
            btnPesquisarMaterial.setEnabled(true);
            cmbNomeMaterial.setEnabled(false);
        }else{
            txtCodigoMaterial.setEnabled(false);
            btnPesquisarMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesquisaPorCodigoActionPerformed

    private void rbPesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesquisarPorNomeActionPerformed
        if(rbPesquisarPorNome.isSelected()){
            cmbNomeMaterial.setEnabled(true);
            txtCodigoMaterial.setEnabled(false);
            btnPesquisarMaterial.setEnabled(false);
            
        }else{
            cmbNomeMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_rbPesquisarPorNomeActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_ConsultarFornecedorMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarFornecedorMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarFornecedorMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarFornecedorMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ConsultarFornecedorMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiarCNPJ;
    private javax.swing.JButton btnPesquisarFornecedores;
    private javax.swing.JButton btnPesquisarMaterial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbNomeMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedoresDisponiveis;
    private javax.swing.JRadioButton rbPesquisaPorCodigo;
    private javax.swing.JRadioButton rbPesquisarPorNome;
    private javax.swing.JTextField txtCodigoMaterial;
    // End of variables declaration//GEN-END:variables
}
