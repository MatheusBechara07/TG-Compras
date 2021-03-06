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
public class GUI_ConsultarCotacaoVencedora extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ConsultarCotacaoVencedora
     */
    public GUI_ConsultarCotacaoVencedora() {
        initComponents();
        jTableCotacoesVencedoras.setAutoCreateRowSorter(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCotacoesVencedoras = new javax.swing.JTable();
        txtIDCotacaoVencedora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDMaterialCotacao = new javax.swing.JTextField();
        btnBuscarCotacaoVencedora = new javax.swing.JButton();
        btnBuscarMaterialCotacao = new javax.swing.JButton();
        btnCopiarIDCotacaoVencedora = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRequisicaoCompra = new javax.swing.JTextField();
        btnBuscarIDRequisicaoCompra = new javax.swing.JButton();
        rbIDCotacaoVencedora = new javax.swing.JRadioButton();
        rbIDRequisicaoCompra = new javax.swing.JRadioButton();
        rbIDMaterialCotacao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Cotacao Vencedora");
        setAlwaysOnTop(true);

        jLabel1.setText("ID Cotação Vencedora");

        jLabel2.setText("ID Material da Cotação");

        jTableCotacoesVencedoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Cotação Vencedora", "ID Requisição de Compra", "ID Material da Cotação", "Nome do Material", "Fornecedor", "Data"
            }
        ));
        jScrollPane1.setViewportView(jTableCotacoesVencedoras);

        jLabel3.setText("Tabela de Cotações Vencedoras");

        btnBuscarCotacaoVencedora.setText("Buscar");

        btnBuscarMaterialCotacao.setText("Buscar");

        btnCopiarIDCotacaoVencedora.setText("Copiar ID da Cotação Vencedora");

        jLabel4.setText("ID Requisição de Compra");

        btnBuscarIDRequisicaoCompra.setText("Buscar");

        buttonGroup1.add(rbIDCotacaoVencedora);
        rbIDCotacaoVencedora.setText("Pesquisar por ID da Cotação Vencedora");

        buttonGroup1.add(rbIDRequisicaoCompra);
        rbIDRequisicaoCompra.setText("Pesquisar por ID da Requisição de Compra");

        buttonGroup1.add(rbIDMaterialCotacao);
        rbIDMaterialCotacao.setText("Pesquisar por ID do Material da Cotação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnCopiarIDCotacaoVencedora))
                        .addGap(0, 751, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbIDRequisicaoCompra)
                    .addComponent(rbIDCotacaoVencedora, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIDMaterialCotacao, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIDMaterialCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtRequisicaoCompra))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(txtIDCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCotacaoVencedora)
                    .addComponent(btnBuscarIDRequisicaoCompra)
                    .addComponent(btnBuscarMaterialCotacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDCotacaoVencedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCotacaoVencedora)
                    .addComponent(rbIDCotacaoVencedora))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRequisicaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIDRequisicaoCompra)
                    .addComponent(rbIDRequisicaoCompra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDMaterialCotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMaterialCotacao)
                    .addComponent(rbIDMaterialCotacao))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarIDCotacaoVencedora)
                .addGap(11, 11, 11))
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
            java.util.logging.Logger.getLogger(GUI_ConsultarCotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarCotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarCotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ConsultarCotacaoVencedora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ConsultarCotacaoVencedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCotacaoVencedora;
    private javax.swing.JButton btnBuscarIDRequisicaoCompra;
    private javax.swing.JButton btnBuscarMaterialCotacao;
    private javax.swing.JButton btnCopiarIDCotacaoVencedora;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCotacoesVencedoras;
    private javax.swing.JRadioButton rbIDCotacaoVencedora;
    private javax.swing.JRadioButton rbIDMaterialCotacao;
    private javax.swing.JRadioButton rbIDRequisicaoCompra;
    private javax.swing.JTextField txtIDCotacaoVencedora;
    private javax.swing.JTextField txtIDMaterialCotacao;
    private javax.swing.JTextField txtRequisicaoCompra;
    // End of variables declaration//GEN-END:variables
}
