package exceptionHandiling;

//Checked Exceptions, SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main_12 {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "password"
            );

            System.out.println("Database connected");

            con.close();

        } catch (SQLException e) {

            System.out.println("Database connection failed");

        }
    }
}
