import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Activity_Details extends javax.swing.JFrame {
String a;    
public Activity_Details()
{   initComponents();
a  =JOptionPane.showInputDialog(null,"Enter Your Facility Code Whose Details You Want To Know");
{try   {
int y=0,x=0,cd=Integer.parseInt(a);
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
ResultSet r=S.executeQuery("select * from facility_file;");
while(r.next())
{if(r.getInt(1)==cd)
x++;}
if(x==1) {
y=JOptionPane.showConfirmDialog(null,"The Activity is present. Do You Want To Know The Details?");
if(y==0){setVisible(true);}  }
else{JOptionPane.showMessageDialog(null,"Sorry The Activity Code You Are Searching For Is Not Present.......");}
S.close();   r.close();  C.close();  }
catch(Exception E) {
JOptionPane.showMessageDialog (null,"ERROR IN THE PROGRAM");  }  } }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        al = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        Show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Activity Details Of Members");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Activitywise Member List</font></h1>");

        al.setBackground(new java.awt.Color(255, 204, 255));
        al.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        al.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        al.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Activity", "MemberCode", "MemberName"
            }
        ));
        al.setGridColor(new java.awt.Color(51, 255, 255));
        jScrollPane1.setViewportView(al);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Date");

        dt.setEditable(false);
        dt.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        dt.setText("dd/mm/yyyy");

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Show.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Show.setText("Show Activities");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(Show)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(88, 88, 88))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new Reporting_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
DefaultTableModel z=(DefaultTableModel)al.getModel();String f;
{try {
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
String sq2,sq1;
sq2="Select membercode,membername from member_file where facility_code_1 ="+a+" or facility_code_2 ="+a+" or facility_code_3 ="+a+";";
sq1="select facility from facility_file where facility_code = "+a+";";
ResultSet x=S.executeQuery(sq1);
x.next();
f=x.getString(1);x.close();
ResultSet r=S.executeQuery(sq2);
while(r.next())
{z.addRow (new Object[ ]  {f,   r.getInt(1),   r.getString(2)});}r.close();
ResultSet drt=S.executeQuery("select curdate();");
drt.next();
dt.setText(""+drt.getDate(1));
S.close();  C.close();  }
 catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); }   }
}//GEN-LAST:event_ShowActionPerformed
public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
 new Activity_Details().setVisible(true); }  }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private javax.swing.JTable al;
    private javax.swing.JButton back;
    private javax.swing.JTextField dt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
