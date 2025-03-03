package ttn.bootcamp.scopes;

import java.sql.Connection;
import java.sql.DriverManager;

public class RuntimeScopeDemo {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
            System.out.println("Database Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
