public class Facility_Processing_Menu extends javax.swing.JFrame {   
public Facility_Processing_Menu() {
initComponents();}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nf = new javax.swing.JButton();
        fd = new javax.swing.JButton();
        rmm = new javax.swing.JButton();

        setTitle("Facility Menu");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Facility Processing Menu</font></h1>");

        nf.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        nf.setText("New Facility");
        nf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfActionPerformed(evt);
            }
        });

        fd.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        fd.setText("Facility Details ");
        fd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdActionPerformed(evt);
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
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nf, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(rmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nf)
                .addGap(31, 31, 31)
                .addComponent(fd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(rmm)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfActionPerformed
new New_Facility().setVisible(true);
setVisible(false);
}//GEN-LAST:event_nfActionPerformed

    private void rmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmmActionPerformed
new Main_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_rmmActionPerformed

    private void fdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdActionPerformed
new Facility_Details().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_fdActionPerformed

public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Facility_Processing_Menu().setVisible(true); }  }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nf;
    private javax.swing.JButton rmm;
    // End of variables declaration//GEN-END:variables

}
