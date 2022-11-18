// Demonstrate the use the JDBC connectivity using MySQL/Oracle
// 1. Create a table in Ms-access/Oracle named author with three attributes
// fnamevarchar(15)
// lnamevarchar(15)
// ISBN number(5), Specify ISBN as Primary Key. COMMAND TO CREATE THE TABLE :
// CREATE TABLE AUTHOR(fnamevarchar(20) PRIMARY KEY, lnamevarchar(20), ISBN
// number(5));
// 2. Insert at least 3 records into author relation. COMMAND TO INSERT THERECORD INTO THE TABLE:INSERT INTO AUTHOR
// VALUES(‘Herbert”,”Schildt’,101);
// 3. Create the System DSN (eg., mydatabase) selecting the driver Microsoft Oracle for ODBC
// Go to Control Panel, select System and Security, then Administrative tools, select data
// Sources(ODBC) then choose system DSN, Click on ADD, select Microsoft ODBC for Oracle and
// create DSN name(mydatabase).


import java.sql.*;
public class jdbcConn {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(" jdbc:odbc ://localhost/database1", "root", "");
        Statement stmt = con.createStatement();
        String query = "SELECT fname,lname,isbn from author";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("FnameLname ISBN");
        while (rs.next()) {
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            int isbn = rs.getInt("isbn");
            System.out.println(fname + " " + lname + " " + isbn);
            System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
        }
        con.close();
        System.out.println();
        System.out.println();
    }
}