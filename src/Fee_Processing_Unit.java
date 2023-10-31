public class Fee_Processing_Unit extends javax.swing.JFrame {    
public Fee_Processing_Unit() {
initComponents(); }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        eof = new javax.swing.JButton();
        fdm = new javax.swing.JButton();
        rmm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fee Processing Menu");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Fee Processing Menu</font></h1>");

        eof.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        eof.setText("Entry Of Fees");
        eof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eofActionPerformed(evt);
            }
        });

        fdm.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        fdm.setText("Fee Details Of A Member");
        fdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdmActionPerformed(evt);
            }
        });

        rmm.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        rmm.setText("Return To Main Menu");
        rmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fdm)
                            .addComponent(rmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(eof)
                .addGap(40, 40, 40)
                .addComponent(fdm)
                .addGap(42, 42, 42)
                .addComponent(rmm)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmmActionPerformed
new Main_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_rmmActionPerformed

    private void eofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eofActionPerformed
new Fee_Entry().setVisible(true);
setVisible(false);
}//GEN-LAST:event_eofActionPerformed

    private void fdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdmActionPerformed
new Fee_Details().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_fdmActionPerformed

public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
           new Fee_Processing_Unit().setVisible(true);
            }  }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eof;
    private javax.swing.JButton fdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rmm;
    // End of variables declaration//GEN-END:variables

}
