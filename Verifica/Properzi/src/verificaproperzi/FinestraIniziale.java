/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaproperzi;

/**
 *
 * @author studente
 */
public class FinestraIniziale extends javax.swing.JFrame {

    /**
     * Creates new form FinestraIniziale
     */
    public FinestraIniziale() {
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

        RettaNelPiano = new javax.swing.JLabel();
        ImmagineRetta = new javax.swing.JLabel();
        AvviaProgramma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verifica Properzi - 4INB -  23/03/17");

        RettaNelPiano.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RettaNelPiano.setText("Retta nel piano");

        ImmagineRetta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificaproperzi/immagine.png"))); // NOI18N

        AvviaProgramma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AvviaProgramma.setText("AVVIA PROGRAMMA");
        AvviaProgramma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvviaProgrammaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImmagineRetta)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(AvviaProgramma)))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(RettaNelPiano)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RettaNelPiano)
                .addGap(36, 36, 36)
                .addComponent(ImmagineRetta)
                .addGap(55, 55, 55)
                .addComponent(AvviaProgramma)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvviaProgrammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvviaProgrammaActionPerformed
        FinestraRetta f = new FinestraRetta();
        f.setVisible(true);
        f.setTitle("Retta nel piano");
    }//GEN-LAST:event_AvviaProgrammaActionPerformed

    
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
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraIniziale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvviaProgramma;
    private javax.swing.JLabel ImmagineRetta;
    private javax.swing.JLabel RettaNelPiano;
    // End of variables declaration//GEN-END:variables
}
