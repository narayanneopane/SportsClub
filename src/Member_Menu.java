public class Member_Menu extends javax.swing.JFrame {    
    public Member_Menu() {
        initComponents();    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nmr = new javax.swing.JButton();
        mim = new javax.swing.JButton();
        md = new javax.swing.JButton();
        mdt = new javax.swing.JButton();
        rmm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member Menu");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Member Menu</font></h1>");

        nmr.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        nmr.setText("New Member Registration");
        nmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmrActionPerformed(evt);
            }
        });

        mim.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mim.setText("Member Information Modification");
        mim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimActionPerformed(evt);
            }
        });

        md.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        md.setText("Member Deletion");
        md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdActionPerformed(evt);
            }
        });

        mdt.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mdt.setText("Member Details");
        mdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdtActionPerformed(evt);
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(md, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nmr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(nmr)
                .addGap(37, 37, 37)
                .addComponent(mim)
                .addGap(30, 30, 30)
                .addComponent(md)
                .addGap(29, 29, 29)
                .addComponent(mdt)
                .addGap(33, 33, 33)
                .addComponent(rmm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmmActionPerformed
      
      new Main_Menu().setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_rmmActionPerformed

    private void nmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmrActionPerformed
        
        new New_Member().setVisible(true);
        setVisible(false);
}//GEN-LAST:event_nmrActionPerformed

    private void mimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimActionPerformed
        
        new Update_Information().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mimActionPerformed

    private void mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdActionPerformed
       
        new Delete_Member().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mdActionPerformed

    private void mdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdtActionPerformed
        
        new Member_Details().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mdtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton md;
    private javax.swing.JButton mdt;
    private javax.swing.JButton mim;
    private javax.swing.JButton nmr;
    private javax.swing.JButton rmm;
    // End of variables declaration//GEN-END:variables

}
