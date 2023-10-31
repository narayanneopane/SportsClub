import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class Update_Information extends javax.swing.JFrame {    
    public Update_Information() {
        initComponents();
        {try {
                     Class.forName("java.sql.Driver");
                     String sq2="select facility_code from facility_file;";
                     Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement S=C.createStatement();
                    int i;
                    ResultSet R=S.executeQuery(sq2);
                    while(R.next())
                    {  i=R.getInt(1);
                     fc1.addItem(i);
                     fc2.addItem(i);
                     fc3.addItem(i);  }
                    S.close();   C.close();   }
                 catch(Exception E)  {
                   JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); } } }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mn = new javax.swing.JTextField();
        dj = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mj = new javax.swing.JComboBox();
        yj = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        noc = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        mc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        ml = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        fc1 = new javax.swing.JComboBox();
        fc2 = new javax.swing.JComboBox();
        fc3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update a member's Details");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Enter The New Information To Be Inserted After Modifying");
        jLabel3.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel5.setText("Date Of Joining");
        jLabel5.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel4.setText("Member Name");
        jLabel4.setEnabled(false);

        mn.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mn.setEnabled(false);

        dj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dj.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel13.setText("Date");
        jLabel13.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel14.setText("Month");
        jLabel14.setEnabled(false);

        mj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mj.setEnabled(false);

        yj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        yj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        yj.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel15.setText("Year");
        jLabel15.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel12.setText("No Of Children");
        jLabel12.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel10.setText("Facility Code 3");
        jLabel10.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel9.setText("Facility Code 2");
        jLabel9.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel8.setText("Facility Code 1");
        jLabel8.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel7.setText("Phone No.");
        jLabel7.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel6.setText("Address");
        jLabel6.setEnabled(false);

        add.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        add.setEnabled(false);

        pn.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        pn.setEnabled(false);

        noc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        noc.setEnabled(false);

        insert.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        insert.setText("Modify");
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel2.setText("Member Code");

        mc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel11.setText("Enter The MemberCode Of The Member Whose Information You Need To Modify");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Member Information Modification</font></h1>");

        search.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        search.setText("Search For Membercode");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        back1.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
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

        fc1.setEnabled(false);

        fc2.setEnabled(false);

        fc3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(search)
                        .addGap(117, 117, 117)
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(mj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(fc1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fc3, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(yj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel15))))
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(add)
                                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(noc)
                                            .addComponent(fc2, 0, 166, Short.MAX_VALUE))
                                        .addGap(124, 124, 124))))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(back1)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(fc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(fc3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        DefaultTableModel z=(DefaultTableModel)ml.getModel();
        String sq1="",c,n,d,a,p,c1,c2,c3,nc;
        {try {             
             c=mc.getText();
             n="\"" +mn.getText()+"\"";
             d="\""+yj.getSelectedItem()+"-"+mj.getSelectedItem()+"-"+dj.getSelectedItem()+"\"";
             a="\"" +add.getText()+"\"";
             p="\""+pn.getText()+"\"";
             c1=""+fc1.getSelectedItem();
             c2=""+fc2.getSelectedItem();
             c3=""+fc3.getSelectedItem();
             nc=""+noc.getText();
             sq1="update member_file set membername="+n+","+"date_of_joining="+d+","+"address="+a+","+"ph_no="+p+","+"facility_code_1="+c1+","+"facility_code_2="+c2+","
                     +"facility_code_3="+c3+","+"no_of_children="+nc+" where membercode ="+c+";";
             Class.forName("java.sql.Driver");
             Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
             Statement S=C.createStatement();
            boolean b=S.execute(sq1);
             if(b==false) JOptionPane.showMessageDialog(null,"Details Updated Successfully...........");
             S.close();
             C.close();
                      new Member_Menu().setVisible(true);
                    setVisible(false);
         } catch(Exception E) {
             JOptionPane.showMessageDialog(null,""+sq1);
         }
        }
}//GEN-LAST:event_insertActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        DefaultTableModel z=(DefaultTableModel)ml.getModel();
        {try {
             String c;
             c=mc.getText();int y=0,x=0,cd=Integer.parseInt(c);
             Class.forName("java.sql.Driver");
             Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
             Statement S=C.createStatement();
             ResultSet r=S.executeQuery("select * from member_file;");
             while(r.next()) {
                 if(r.getInt(1)==cd)
                     x++;}
             if(x==1) {
                 ResultSet b=S.executeQuery("select * from member_file where membercode="+c+";");
                 while(b.next())
                 {z.addRow (new Object[ ]  {b.getInt(1),   b.getString(2),   b.getDate(3),   b.getString(4),   b.getString(5),
                 b.getInt(6),   b.getInt(7),   b.getInt(8),   b.getInt(9)});
                 }
                 y=JOptionPane.showConfirmDialog(null,"The Member is present. Do You Want To Change The Records?");
                 
                 if(y==0) {
                     jLabel3.setEnabled(true);
                     jLabel4.setEnabled(true);
                     jLabel5.setEnabled(true);
                     jLabel6.setEnabled(true);
                     jLabel7.setEnabled(true);
                     jLabel8.setEnabled(true);
                     jLabel9.setEnabled(true);
                     jLabel10.setEnabled(true);
                     jLabel11.setEnabled(true);
                     jLabel12.setEnabled(true);
                     jLabel13.setEnabled(true);
                     jLabel14.setEnabled(true);
                     jLabel15.setEnabled(true);
                     mn.setEnabled(true);
                     dj.setEnabled(true);
                     mj.setEnabled(true);
                     yj.setEnabled(true);
                     add.setEnabled(true);
                     pn.setEnabled(true);
                     fc1.setEnabled(true);
                     fc2.setEnabled(true);
                     fc3.setEnabled(true);
                     noc.setEnabled(true);
                     insert.setEnabled(true);
                 }
             }} catch(Exception E) {
                 JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");
             }}
        search.setEnabled(false);
}//GEN-LAST:event_searchActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        
        new Member_Menu().setVisible(true);
        setVisible(false);
}//GEN-LAST:event_back1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JButton back1;
    private javax.swing.JComboBox dj;
    private javax.swing.JComboBox fc1;
    private javax.swing.JComboBox fc2;
    private javax.swing.JComboBox fc3;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mc;
    private javax.swing.JComboBox mj;
    private javax.swing.JTable ml;
    private javax.swing.JTextField mn;
    private javax.swing.JTextField noc;
    private javax.swing.JTextField pn;
    private javax.swing.JButton search;
    private javax.swing.JComboBox yj;
    // End of variables declaration//GEN-END:variables

}
