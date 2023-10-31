import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Fee_Details extends javax.swing.JFrame {
public Fee_Details() {
initComponents(); }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fd = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fee Details Of a Member");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Fee Details</font></h1>");

        back1.setBackground(new java.awt.Color(255, 204, 204));
        back1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back1.setText("Back To Fee Processing Menu");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

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
                "Member Code", "Date of Submisssion", "Last Fee Submission Date"
            }
        ));
        jScrollPane2.setViewportView(fd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(back1)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
 new Fee_Processing_Unit().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
DefaultTableModel z=(DefaultTableModel)fd.getModel();
{try {
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
ResultSet r=S.executeQuery("SELECT fees_file.membercode,date_of_submission,(date_of_joining+100) from member_file,fees_file where member_file.membercode=fees_file.membercode;");
while(r.next()) {
String k,s=""+Integer.toString(r.getInt(3));
k=s.substring(0,4)+"-"+s.substring(4,6)+"-"+s.substring(6,8);
z.addRow(new Object[ ]  {r.getInt(1),      r.getDate(2),   k}); }
S.close();   C.close(); }
catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");
 } }
}//GEN-LAST:event_showActionPerformed
public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fee_Details().setVisible(true);
            } });}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JTable fd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables

}
