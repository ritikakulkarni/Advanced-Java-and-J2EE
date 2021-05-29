package database;
 
import java.sql.*;
public class JDBCAccess
 {
 
    public static void main(String[] args)
 {
         
        String databaseURL = "jdbc:ucanaccess://e://Java//JavaSE//MsAccess//employee.accdb";
         
        try (Connection connection = DriverManager.getConnection(databaseURL))
 {
            String sql = "INSERT INTO Contacts (EmployeID,Name,Address) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Avl9");
            preparedStatement.setString(2, "Ritika");
            preparedStatement.setString(3, "Bagalkot");
            int row = preparedStatement.executeUpdate();
            if (row > 0)
 {
                System.out.println("A row has been inserted successfully.");
 }
            sql = "SELECT * FROM employee";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next())
 {
                int EmplyeeId = result.getInt("EmployeeID");
                String Name = result.getString("Name");
                String Address = result.getString("Address");
            	System.out.println(EmplyeeId + ", " + Name + ", " + address + ");
 }    
 } 
catch (SQLException ex)
 {
            ex.printStackTrace();
        }
    }
}