import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Datewise_Fee_Details extends javax.swing.JFrame {
String a;
public Datewise_Fee_Details()
{
initComponents();
a  =JOptionPane.showInputDialog(null,"Enter The date in  yyyy-mm-dd whose transactions you want to know");
{try   {
int y=0,x=0;
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
ResultSet r=S.executeQuery("select * from fees_file;");
while(r.next())
{if((""+r.getDate(2)).equals(a))
x++;}
if(x!=0)  {
y=JOptionPane.showConfirmDialog(null,"The Date is present. Do You Want To Know The Details?");
if(y==0){setVisible(true);} }
else{JOptionPane.showMessageDialog(null,"Sorry No Member Submitted Fees On This Date.....");new Reporting_Menu().setVisible(true);}
S.close();      r.close();      C.close();  }
catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE CONSTRUCTOR");}  } }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dfd = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        dt = new javax.swing.JTextField();
        Details = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datewise Fee Details");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Datewise Fee Details</font></h1>");

        dfd.setBackground(new java.awt.Color(255, 255, 232));
        dfd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 62, 252), 2));
        dfd.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dfd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Date", "Member Code", "Member Name", "Amount"
            }
        ));
        jScrollPane1.setViewportView(dfd);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Date");

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        dt.setEditable(false);
        dt.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dt.setText("yyyy/mm/dd");

        Details.setBackground(new java.awt.Color(255, 204, 204));
        Details.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        Details.setText("Show Details");
        Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(150, 150, 150)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(59, 59, 59)
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Details)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new Reporting_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsActionPerformed
DefaultTableModel z=(DefaultTableModel)dfd.getModel();
 {try {
 Class.forName("java.sql.Driver");
 Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
String sq2;
sq2="Select fees_file.*,membername from fees_file,member_file where  Date_Of_Submission = \'"+a+"\' and fees_file.membercode = member_file.membercode;";
ResultSet x=S.executeQuery(sq2);
while(x.next()) {
z.addRow (new Object[ ]  { x.getDate(2), x.getInt(1), x.getString(4)  ,   x.getFloat(3)   } );  }
ResultSet drt=S.executeQuery("select curdate();");
drt.next();
dt.setText(""+drt.getDate(1));            
S.close(); C.close(); }
catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");  }  }
}//GEN-LAST:event_DetailsActionPerformed
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Datewise_Fee_Details().setVisible(true);
}  });  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Details;
    private javax.swing.JButton back;
    private javax.swing.JTable dfd;
    private javax.swing.JTextField dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
