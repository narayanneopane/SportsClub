import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Delete_Member extends javax.swing.JFrame {    
    public Delete_Member() {
        initComponents();   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mc = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ml = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jTextField1.setText("jTextField1");

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
        setTitle("Delete a Member");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>MEMBER DELETION</font></h1>");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel1.setText("Enter the MemberCode of the Member Whose Record You Want To Delete");

        mc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        Delete.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        ml.setBackground(new java.awt.Color(204, 255, 255));
        ml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        ml.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        ml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Member Code", "Member Name", "Date Of Joining", "Address", "Ph. No.", "Facility 1", "Facility 2", "Facility 3", "No. Of Children"
            }
        ));
        ml.setGridColor(new java.awt.Color(0, 255, 153));
        jScrollPane2.setViewportView(ml);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(76, 76, 76)
                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                DefaultTableModel z=(DefaultTableModel)ml.getModel();
        {try {
             String sq1,sq2,c;
             c=mc.getText();int y=0,x=0,cd=Integer.parseInt(c);
             sq2="Delete from fees_file where memberCode="+c+";";
             sq1="Delete from Member_file where memberCode="+c+";";
             Class.forName("java.sql.Driver");
             Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
             Statement S=C.createStatement();
             ResultSet r=S.executeQuery("select * from member_file;");
             while(r.next())
                     {if(r.getInt(1)==cd)
                     x++;}
             if(x==1)
             { ResultSet b=S.executeQuery("select * from member_file where membercode="+c+";");
                 while(b.next())
                 {z.addRow (new Object[ ]  {b.getInt(1),   b.getString(2),   b.getDate(3),   b.getString(4),   b.getString(5),
                 b.getInt(6),   b.getInt(7),   b.getInt(8),   b.getInt(9)});
                 }
                 y=JOptionPane.showConfirmDialog(null,"The Member is present. Do You Want To Delete The Record?");
             if(y==0){S.execute(sq2);S.execute(sq1);}
                 z.removeRow(1);                 
             }
             else{JOptionPane.showMessageDialog(null,"Sorry The Member Code You Are Searching For Is Not Present.......");}
             
             S.close();
             C.close();
         } catch(Exception E) {
             JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");
         }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        new Member_Menu().setVisible(true);
        setVisible(false);
}//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mc;
    private javax.swing.JTable ml;
    // End of variables declaration//GEN-END:variables

}
