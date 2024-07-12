/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
/* JDBC Connectivity Steps:
Register the driver
Create conn
Create statement
Execute Query
Close Connection
*/
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //no need to write the above the line.since library contains the path.
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Mysql@jun1");
            //create statement
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
