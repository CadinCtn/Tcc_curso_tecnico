/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototypes;

/**
 *
 * @author Lenovo
 */
public class Tela_inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_inicial
     */
    public Tela_inicial() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraVerde = new javax.swing.JPanel();
        menuBtnEstoque = new javax.swing.JButton();
        menuBtnOp = new javax.swing.JButton();
        menuBtnPedidos = new javax.swing.JButton();
        menuBtnCad = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 102));

        barraVerde.setBackground(new java.awt.Color(0, 212, 41));

        menuBtnEstoque.setBackground(new java.awt.Color(0, 101, 59));
        menuBtnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        menuBtnEstoque.setText("Estoque");
        menuBtnEstoque.setBorder(null);
        menuBtnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnEstoqueActionPerformed(evt);
            }
        });

        menuBtnOp.setBackground(new java.awt.Color(0, 101, 59));
        menuBtnOp.setForeground(new java.awt.Color(255, 255, 255));
        menuBtnOp.setText("Ordem de Produção");
        menuBtnOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnOpActionPerformed(evt);
            }
        });

        menuBtnPedidos.setBackground(new java.awt.Color(0, 101, 59));
        menuBtnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        menuBtnPedidos.setText("Pedidos");
        menuBtnPedidos.setBorder(null);
        menuBtnPedidos.setBorderPainted(false);
        menuBtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnPedidosActionPerformed(evt);
            }
        });

        menuBtnCad.setBackground(new java.awt.Color(0, 101, 59));
        menuBtnCad.setForeground(new java.awt.Color(255, 255, 255));
        menuBtnCad.setText("Cadastrar Produto");
        menuBtnCad.setBorder(null);
        menuBtnCad.setBorderPainted(false);

        javax.swing.GroupLayout barraVerdeLayout = new javax.swing.GroupLayout(barraVerde);
        barraVerde.setLayout(barraVerdeLayout);
        barraVerdeLayout.setHorizontalGroup(
            barraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraVerdeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuBtnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBtnOp, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(menuBtnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBtnCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barraVerdeLayout.setVerticalGroup(
            barraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraVerdeLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(menuBtnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtnOp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuBtnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnPedidosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_pedidos().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuBtnPedidosActionPerformed

    private void menuBtnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnEstoqueActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_estoque().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuBtnEstoqueActionPerformed

    private void menuBtnOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnOpActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordem_producao().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuBtnOpActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraVerde;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menuBtnCad;
    private javax.swing.JButton menuBtnEstoque;
    private javax.swing.JButton menuBtnOp;
    private javax.swing.JButton menuBtnPedidos;
    // End of variables declaration//GEN-END:variables
}
