

public class Main_Menu extends javax.swing.JFrame
{
    public Main_Menu()
    {   initComponents();    
        new Member_Menu().setVisible(false);
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fp = new javax.swing.JButton();
        fcp = new javax.swing.JButton();
        rprt = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        mp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        jLabel1.setText("<html>\n<h1>\n<font face=\"microsoft sans serif\" color=\"blue\"  size=10>Main Menu</font></h1>");

        fp.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        fp.setText("Fee Processing ");
        fp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpActionPerformed(evt);
            }
        });

        fcp.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        fcp.setText("Facility Processing");
        fcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcpActionPerformed(evt);
            }
        });

        rprt.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        rprt.setText("Reporting");
        rprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rprtActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        mp.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mp.setText("Member Processing");
        mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fcp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rprt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(mp)
                .addGap(37, 37, 37)
                .addComponent(fp)
                .addGap(30, 30, 30)
                .addComponent(fcp)
                .addGap(41, 41, 41)
                .addComponent(rprt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpActionPerformed
    new Member_Menu().setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_mpActionPerformed

    private void fpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpActionPerformed
    new Fee_Processing_Unit().setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_fpActionPerformed

    private void fcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcpActionPerformed
     new Facility_Processing_Menu().setVisible(true);
     setVisible(false);
    }//GEN-LAST:event_fcpActionPerformed

    private void rprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rprtActionPerformed
    new Reporting_Menu().setVisible(true);
    setVisible(false);
    }//GEN-LAST:event_rprtActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
   System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton fcp;
    private javax.swing.JButton fp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mp;
    private javax.swing.JButton rprt;
    // End of variables declaration//GEN-END:variables

}
