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
public class GUI_GerenciarPedidoCompra extends javax.swing.JFrame {

    /**
     * Creates new form GUI_CriarPedidoCompra
     */
    public GUI_GerenciarPedidoCompra() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIDCotacaoVencedora = new javax.swing.JTextField();
        btnPesquisarCotacaoVencedora = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDMaterial = new javax.swing.JTextField();
        txtNomeMaterial = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValorFinal = new javax.swing.JTextField();
        btnConsultarPedidosCompra = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAlterarPedidoCompra = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbStatusPedidoCompra = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Pedido de Compra");
        setAlwaysOnTop(true);

        jLabel2.setText("ID Cotação Vencedora");

        btnPesquisarCotacaoVencedora.setText("Pesquisar");

        jLabel3.setText("Dados Fornecedor");

        jLabel4.setText("CNPJ");

        txtCNPJ.setEditable(false);
        txtCNPJ.setEnabled(false);

        jLabel5.setText("Nome");

        txtNomeFornecedor.setEditable(false);
        txtNomeFornecedor.setEnabled(false);

        jLabel6.setText("E-Mail");

        txtEmail.setEditable(false);
        txtEmail.setEnabled(false);

        jLabel7.setText("Telefone");

        txtTelefone.setEditable(false);
        txtTelefone.setEnabled(false);

        jLabel8.setText("Dados do Material");

        jLabel9.setText("ID");

        jLabel10.setText("Nome");

        jLabel11.setText("Quantidade");

        jLabel12.setText("Valor Final");

        txtIDMaterial.setEditable(false);
        txtIDMaterial.setEnabled(false);

        txtNomeMaterial.setEditable(false);
        txtNomeMaterial.setEnabled(false);

        txtQuantidade.setEditable(false);
        txtQuantidade.setEnabled(false);

        txtValorFinal.setEditable(false);
        txtValorFinal.setEnabled(false);

        btnConsultarPedidosCompra.setText("Consultar Pedidos de Compras");

        jLabel13.setText("Dados do Pedido de Compra");

        jLabel14.setText("Status");

        btnAlterarPedidoCompra.setText("Alterar Status do Pedido de Compra");

        jLabel15.setText("Se o status estiver \"Aguardando Aprovação da Gerencia\" sera necessario aguardar a aprovacao devido ao valor da compra");

        jLabel16.setText("Se o status estiver \"Aguardando Contato com o Fornecedor\" significa que ja pode ser feito o contato com o fornecedor");

        jLabel17.setText("e que após oficializar a compra com o fornecedor o Status do pedido de compra pode ser Alterado para Concluído");

        jLabel18.setText("Se o Status estiver \"Concluído\" significa que a compra ja foi realizada");

        jLabel19.setText("Se o Status estiver \"Negado\" significa que a gerencia nao aprovou essa compra");

        cmbStatusPedidoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguardando Aprovação da Gerencia", "Aguardando Contato com Fornecedor", "Concluído", "Negado" }));

        jLabel20.setText("Se o contato com o Fornecedor ja foi realizado e a compra de TODOS OS MATERIAIS da Requisicao de Compra");

        btnFinalizarCompra.setText("Finalizar Compra");

        jLabel21.setText("foram oficializados clique em Finalizar Compra ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterarPedidoCompra)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultarPedidosCompra))
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStatusPedidoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addComponent(btnFinalizarCompra)
                            .addComponent(jLabel21))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIDCotacaoVencedora))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCNPJ))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(txtNomeFornecedor))))
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarCotacaoVencedora)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtIDMaterial))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeMaterial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCotacaoVencedora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbStatusPedidoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarPedidoCompra)
                    .addComponent(btnConsultarPedidosCompra))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizarCompra)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_GerenciarPedidoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_GerenciarPedidoCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPedidoCompra;
    private javax.swing.JButton btnConsultarPedidosCompra;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnPesquisarCotacaoVencedora;
    private javax.swing.JComboBox<String> cmbStatusPedidoCompra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDCotacaoVencedora;
    private javax.swing.JTextField txtIDMaterial;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNomeMaterial;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValorFinal;
    // End of variables declaration//GEN-END:variables
}
