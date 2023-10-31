import java.sql.*;
import javax.swing.JOptionPane;
public class Membership_Card extends javax.swing.JFrame {
String a;  
public Membership_Card() {
initComponents();        
a  =JOptionPane.showInputDialog(null,"Enter Your MemberCode Whose Membership Card You Want To Print");
{try {
int y=0,x=0,cd=Integer.parseInt(a);
Class.forName("java.sql.Driver");
Connection C=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement S=C.createStatement();
ResultSet r=S.executeQuery("select * from member_file;");
while(r.next())
{if(r.getInt(1)==cd)  x++;}
if(x==1)
{y=JOptionPane.showConfirmDialog(null,"The Member is present. Do You Want To Print The Membership Card?");
if(y==0){setVisible(true);}  }
else{JOptionPane.showMessageDialog(null,"Sorry The Member Code You Are Searching For Is Not Present.......");new Reporting_Menu().setVisible(true);}
S.close();  r.close();   C.close();  }
catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");}   }  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        mc = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        noc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fa = new javax.swing.JTextField();
        doj = new javax.swing.JTextField();
        Print = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Membership Card");

        jLabel1.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>SPORTS CLUB</font></h1>");

        jLabel2.setText("<html> <h1> <font face=\"microsoft sans serif\" color=\"blue\"  size=10>Membership Card</font></h1>");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel4.setText("Name   :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel7.setText("Facilities Availed  :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel8.setText("No. Of Children Allowed  :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel3.setText("Member Code  :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel5.setText("Address  :");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel6.setText("Phone  :");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setText("Date");

        dt.setEditable(false);
        dt.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        dt.setText("dd/mm/yyyy");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setText("Date Of Joining  :");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel9.setText("This card is valid for 2 years from date of joining after that it should be renewed.");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign.jpg"))); // NOI18N

        back.setBackground(new java.awt.Color(255, 204, 204));
        back.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        mc.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        nm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        add.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        pn.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        noc.setFont(new java.awt.Font("Comic Sans MS", 0, 18));

        fa.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        doj.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        Print.setBackground(new java.awt.Color(255, 204, 204));
        Print.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel14.setText("<html> \tAuthorised Signatory\t. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(51, 51, 51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noc, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addComponent(nm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(mc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(fa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(noc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(479, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back)
                        .addComponent(Print)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new Reporting_Menu().setVisible(true);
setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
int cd=Integer.parseInt(a);
try{
int d=0,e=0,g=0,f=0;Object dte = "";String x="",y="",f1="",f2="",f3="",c="";
Class.forName("java.sql.Driver");
Connection Cn=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
Statement St=Cn.createStatement();
ResultSet rs=St.executeQuery("select * from member_file where membercode="+cd+";");
rs.next();
x=rs.getString(2);  dte=rs.getDate(3);   y=rs.getString(4);  c=rs.getString(5);
d=rs.getInt(6);  e=rs.getInt(7);  f=rs.getInt(8);   g=rs.getInt(9);
rs.close();
ResultSet t=St.executeQuery("select * from facility_file where facility_code=2;");
t.next();f1=t.getString("facility");t.close();
ResultSet u=St.executeQuery("select facility from facility_file where facility_code="+e+";");
u.next(); f2=u.getString("facility");u.close();
ResultSet v=St.executeQuery("select facility from facility_file where facility_code="+f+";");
v.next(); f3=v.getString("facility");v.close();
mc.setText(""+cd);      nm.setText(x);
add.setText(y);           pn.setText(""+c);
fa.setText(""+f1+" ,"+f2+" ,"+f3+" ");
noc.setText(""+g);      doj.setText(""+dte);
ResultSet drt=St.executeQuery("select curdate();");
drt.next();             
dt.setText(""+drt.getDate(1));
St.close();       Cn.close();
} catch(Exception E) {
JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM"); }
}//GEN-LAST:event_PrintActionPerformed
public  static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Membership_Card().setVisible(true); }  }); }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JTextField add;
    private javax.swing.JButton back;
    private javax.swing.JTextField doj;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField fa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mc;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField noc;
    private javax.swing.JTextField pn;
    // End of variables declaration//GEN-END:variables

}
