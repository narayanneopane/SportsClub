import java.sql.*;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        {try
                 {String sq1,sq2,sq3;int x=0,y=0,z=0;
                  sq1="create table Member_File(MemberCode int Primary Key auto_increment,MemberName text," +
                          "Date_Of_Joining date,Address text,Ph_No text,Facility_Code_1 int,Facility_Code_2 int,Facility_Code_3 int,No_Of_Children int, " +
                          "FOREIGN KEY(Facility_Code_1) REFERENCES Facility_File(Facility_Code), " +
                          "FOREIGN KEY(Facility_Code_2) REFERENCES Facility_File(Facility_Code), " +
                          "FOREIGN KEY(Facility_Code_3) REFERENCES Facility_File(Facility_Code))auto_increment=1000;";

                  sq2="create table Fees_File(MemberCode int primary key,Date_Of_Submission date,Amount float,FOREIGN KEY(MemberCode) REFERENCES Member_File(MemberCode));";
                  
                  sq3="create table Facility_File(Facility_Code int primary key,Facility text);";
                     Class.forName("java.sql.Driver");
                     Connection c=DriverManager.getConnection("jdbc:mysql://localhost/sports_club","root","scott");
                     Statement s=c.createStatement();
                    ResultSet r=s.executeQuery("show tables;");
                     while(r.next())
                     {if(r.getString(1).equalsIgnoreCase("Member_File"))
                     x++;
                     if(r.getString(1).equalsIgnoreCase("Fees_File"))
                     y++;
                     if(r.getString(1).equalsIgnoreCase("Facility_File"))
                     z++;
                     }
                    if(z==0)  s.execute(""+sq3);
                     if(x==0)  s.execute(""+sq1);
                     if(y==0)  s.execute(""+sq2);
                     
                 }
                 catch(Exception E)
                 {
                   JOptionPane.showMessageDialog(null,"ERROR IN THE PROGRAM");
                 }
                }
        new Welcome().setVisible(true);
    }
}
