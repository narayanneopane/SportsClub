import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Facility_Details extends javax.swing.JFrame {
public Facility_Details() {
initComponents();  }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fd = new javax.swing.JTable();
        back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facility Details");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Facility Details</font></h1>");

        show.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        show.setText("Show Tables");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        fd.setBackground(new java.awt.Color(255, 255, 232));
        fd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 62, 252), 2));
        fd.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        fd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facility Code", "Facility"
            }
        ));
        jScrollPane2.setViewportView(fd);

        back1.setBackground(new java.awt.Color(255, 204, 204));
        back1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back1.setText("Back To Facility Processing Menu");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(show)
                        .addGap(56, 56, 56)
                        .addComponent(back1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
DefaultTableModel z=(DefaultTableModel)fd.getModel();
{try {
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
ResultSet r=S.executeQuery("select * from facility_file;");
while(r.next()) {
z.addRow(new Object[ ]  {r.getInt(1),   r.getString(2)});  }
S.close();   C.close();   }
catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); }  }
}//GEN-LAST:event_showActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
new Facility_Processing_Menu().setVisible(true);
setVisible(false);
}//GEN-LAST:event_back1ActionPerformed

    
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Facility_Details().setVisible(true); }   });   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JTable fd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables

}
