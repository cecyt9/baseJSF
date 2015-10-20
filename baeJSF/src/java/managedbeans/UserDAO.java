/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

/**
 *
 * @author eoropeza
 */
import java.sql.*;
 
public class UserDAO {      
     public static boolean login(String user, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.getConnection();
            ps = con.prepareStatement(
                    "select usuario, contrasena from persona where usuario= ? and contrasena= ? ");
            ps.setString(1, user);
            ps.setString(2, password);
 
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("usuario"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
            Database.close(con);
        }
    }
}
