
import java.sql.*;
import javax.swing.JOptionPane;
public class Fee_Entry extends javax.swing.JFrame {    
    public Fee_Entry() {
        initComponents();
        {try {
                     Class.forName("java.sql.Driver");
                     String sq2="select membercode from member_file;";
                     Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement S=C.createStatement();
                    int i;
                    ResultSet R=S.executeQuery(sq2);
                    while(R.next())
                    { i=R.getInt(1);
                     mc.addItem(i);     }
                    S.close();     C.close();  }
                 catch(Exception E)  {
                   JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); }  }  }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        dj = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        mj = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        yj = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        Insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        mc = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entry of Fees");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Entry Of Fees</font></h1>");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Member Code");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel4.setText("Date of submission");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel5.setText("Amount");

        am.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        dj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel11.setText("Date");

        mj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        mj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel12.setText("Month");

        yj.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        yj.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel13.setText("Year");

        Insert.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        mc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)))
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mc, 0, 258, Short.MAX_VALUE)
                    .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
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
                                .addComponent(jLabel13)))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(Insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(back))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
         {try
                 {String sq1,c,d,a,djd;
                  int yoj,moj,doj,dos,yos,mos;
                  c=""+mc.getSelectedItem();
                  int x=0,cd=Integer.parseInt(c);
                  a=am.getText();
                  d="\""+yj.getSelectedItem()+"-"+mj.getSelectedItem()+"-"+dj.getSelectedItem()+"\"";
                  sq1="insert into Fees_File values("+c+","+d+","+a+");";
                     Class.forName("java.sql.Driver");
                     Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement S=C.createStatement();
                     ResultSet dtj=S.executeQuery("select Date_Of_Joining from member_file where membercode = "+c+";");
                     dtj.next();
                     djd=""+dtj.getDate(1);
                     yoj=Integer.parseInt(djd.substring(0, 4));
                     moj=Integer.parseInt(djd.substring(5, 7));
                     doj=Integer.parseInt(djd.substring(8, 10));
                     yos=Integer.parseInt(""+yj.getSelectedItem());
                     mos=Integer.parseInt(""+mj.getSelectedItem());
                     dos=Integer.parseInt(""+dj.getSelectedItem());
                     boolean bln=false;
                     if(yoj>yos) bln=false;
                     else if(yoj<yos) bln=true;
                     else  if(yoj==yos)
                     {if(moj>mos) bln=false;
                     else if(moj<mos) bln=true;
                     else  if(moj==mos){
                     if(doj>dos) bln=false;
                     else if(doj<=dos) bln=true;
                     } }
                                  if (bln==false)
                                  { JOptionPane.showMessageDialog(null,"Date Of Fees Submission Should Be \n Greater Than Date of Joining........ ");}
                                  else{
                     ResultSet r=S.executeQuery("select * from fees_file;");
             while(r.next())
                     {if(r.getInt(1)==cd)
                     x++;}
             if(x==1)   JOptionPane.showMessageDialog(null,"Fee Details of This Member Is Already Inserted...........");

             else{ boolean b=S.execute(sq1);
                    if(b==false){JOptionPane.showMessageDialog(null,"Fee Details Inserted Successfully........");}}}
                    S.close();
                    C.close();    x=0;   }
                 catch(Exception E)  {
                   JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");   }  }
    }//GEN-LAST:event_InsertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Fee_Processing_Unit().setVisible(true);
        setVisible(false);
}//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fee_Entry().setVisible(true); } }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JTextField am;
    private javax.swing.JButton back;
    private javax.swing.JComboBox dj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox mc;
    private javax.swing.JComboBox mj;
    private javax.swing.JComboBox yj;
    // End of variables declaration//GEN-END:variables

}
