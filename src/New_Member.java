import java.sql.*;
import javax.swing.JOptionPane;
public class New_Member extends javax.swing.JFrame {    
    public New_Member()
    {        initComponents();
        {try
                 {
                     Class.forName("java.sql.Driver");
                     String sq2="select facility_code from facility_file;";
                     Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement S=C.createStatement();
                    int i;
                    ResultSet R=S.executeQuery(sq2);
                    while(R.next())
                    {   i=R.getInt(1);
                     fc1.addItem(i);
                     fc2.addItem(i);
                     fc3.addItem(i);    }
                    S.close();     C.close();  }
                 catch(Exception E)  {
                   JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");
                 }    }   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        noc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        dj = new javax.swing.JComboBox();
        mj = new javax.swing.JComboBox();
        yj = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mn = new javax.swing.JTextField();
        fc1 = new javax.swing.JComboBox();
        fc2 = new javax.swing.JComboBox();
        fc3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Of New Member");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>New Member Registration</font></h1>");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Member Name");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel4.setText("Date Of Joining");

        add.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel5.setText("Address");

        pn.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel6.setText("Phone No.");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel7.setText("Facility Code 1");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel8.setText("Facility Code 2");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel9.setText("Facility Code 3");

        noc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel10.setText("No Of Children");

        insert.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        dj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        yj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel11.setText("Date");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel12.setText("Month");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel13.setText("Year");

        mn.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(355, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(mj, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(yj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel13)))
                                .addGap(84, 84, 84)
                                .addComponent(jLabel6)
                                .addGap(73, 73, 73)
                                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fc3, 0, 192, Short.MAX_VALUE)
                                            .addComponent(fc1, 0, 192, Short.MAX_VALUE))
                                        .addGap(131, 131, 131)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fc2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(4, 4, 4)))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mn, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fc3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
         {try 
                 {String sq1,sq2,n,d,a,p,c1,c2,c3,nc;  int i;
                  n="\"" +mn.getText()+"\"";
                  d="\""+yj.getSelectedItem()+"-"+mj.getSelectedItem()+"-"+dj.getSelectedItem()+"\"";
                  a="\"" +add.getText()+"\"";
                  p="\""+pn.getText()+"\"";
                  c1=""+fc1.getSelectedItem();
                  c2=""+fc2.getSelectedItem();
                  c3=""+fc3.getSelectedItem();
                  nc=noc.getText();
                  sq1="insert into Member_File values("+null+","+n+","+d+","+a+","+p+","+c1+","+c2+","+c3+","+nc+");";
                     Class.forName("java.sql.Driver");
                     sq2="select last_insert_id();";
                     Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement S=C.createStatement();
                     S.execute(sq1);                    
                    ResultSet R=S.executeQuery(sq2);
                    while(R.next())
                    {i=R.getInt(1);
                     JOptionPane.showMessageDialog(null,"You are Successfully Registered................\n     Remember Your MemberCode is  "+i);
                    }
                    S.close();     C.close();
                    new Member_Menu().setVisible(true);
                    setVisible(false);   }
                 catch(Exception E)     {
                     JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM" );
                 }     }
    }//GEN-LAST:event_insertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         new Member_Menu().setVisible(true);
         setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Member().setVisible(true);
            }  });  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JButton back;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox mj;
    private javax.swing.JTextField mn;
    private javax.swing.JTextField noc;
    private javax.swing.JTextField pn;
    private javax.swing.JComboBox yj;
    // End of variables declaration//GEN-END:variables

}
