public class Reporting_Menu extends javax.swing.JFrame {
public Reporting_Menu() {
initComponents(); }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        md = new javax.swing.JButton();
        ad = new javax.swing.JButton();
        dfd = new javax.swing.JButton();
        mc = new javax.swing.JButton();
        rmm = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporting Menu");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Reporting Menu</font></h1>");

        md.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        md.setText("Member Details");
        md.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdActionPerformed(evt);
            }
        });

        ad.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ad.setText("Activity Details");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        dfd.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        dfd.setText("Datewise Fee Details");
        dfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfdActionPerformed(evt);
            }
        });

        mc.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        mc.setText("Membership Card");
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });

        rmm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
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
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(md, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dfd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rmm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(md)
                .addGap(18, 18, 18)
                .addComponent(ad)
                .addGap(27, 27, 27)
                .addComponent(dfd)
                .addGap(32, 32, 32)
                .addComponent(mc)
                .addGap(30, 30, 30)
                .addComponent(rmm)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdActionPerformed
new Member_Details().setVisible(true);
setVisible(false);
}//GEN-LAST:event_mdActionPerformed

    private void rmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmmActionPerformed
new Main_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_rmmActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
Activity_Details  addt = new Activity_Details();
setVisible(false);
       
    }//GEN-LAST:event_adActionPerformed

    private void dfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfdActionPerformed
Datewise_Fee_Details dateob=new Datewise_Fee_Details();
setVisible(false);
        
    }//GEN-LAST:event_dfdActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
Membership_Card M=new Membership_Card();
setVisible(false);
    }//GEN-LAST:event_mcActionPerformed
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Reporting_Menu().setVisible(true);  }   });  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ad;
    private javax.swing.JButton dfd;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mc;
    private javax.swing.JButton md;
    private javax.swing.JButton rmm;
    // End of variables declaration//GEN-END:variables

}
