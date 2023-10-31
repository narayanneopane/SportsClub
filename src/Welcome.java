public class Welcome extends javax.swing.JFrame {    
    public Welcome() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gmm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/welcome.png"))); // NOI18N

        gmm.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        gmm.setText("GO TO MAIN MENU");
        gmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(gmm)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmm))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmmActionPerformed
        new Main_Menu().setVisible(true);
        setVisible(false);
}//GEN-LAST:event_gmmActionPerformed


       public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gmm;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
