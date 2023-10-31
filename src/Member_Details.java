import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Member_Details extends javax.swing.JFrame { 
    public Member_Details() {
        initComponents(); }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ml = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        show = new javax.swing.JButton();
        back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Details of a Member");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>MEMBER LIST</font></h1>");

        ml.setBackground(new java.awt.Color(204, 255, 255));
        ml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        ml.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        ml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member Code", "Member Name", "Date Of Joining", "Address", "Ph. No.", "Facility 1", "Facility 2", "Facility 3", "No. Of Children"
            }
        ));
        ml.setGridColor(new java.awt.Color(0, 255, 153));
        jScrollPane1.setViewportView(ml);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Date");

        dt.setEditable(false);
        dt.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dt.setText("dd/mm/yyyy");

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back To Reporting Menu");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        show.setText("Show Tables");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(255, 204, 204));
        back1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back1.setText("Back To Member Menu");
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
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(show)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(back1)
                                    .addComponent(back))
                                .addGap(59, 59, 59))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(382, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(back1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Reporting_Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        DefaultTableModel z=(DefaultTableModel)ml.getModel();
 {try {
             Class.forName("java.sql.Driver");
             Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
             Statement S=C.createStatement();
             ResultSet r=S.executeQuery("select * from member_file;");
             while(r.next())
                 {z.addRow (new Object[ ]  {r.getInt(1),   r.getString(2),   r.getDate(3),   r.getString(4),  r.getString(5),
                 r.getInt(6),   r.getInt(7),   r.getInt(8),   r.getInt(9)});    }
             ResultSet drt=S.executeQuery("select curdate();");
             drt.next();
             dt.setText(""+drt.getDate(1));
             S.close();  C.close();
         } catch(Exception E) {
             JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); }}
    }//GEN-LAST:event_showActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new Member_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Details().setVisible(true);
               } }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JTextField dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ml;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables

}
