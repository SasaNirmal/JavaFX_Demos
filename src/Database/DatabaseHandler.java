package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Config {
    public Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String ConnectionString = "jdbc:mysql://" + dbHost + ":" + port + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(ConnectionString,dbUser,dbPassword);

        return dbConnection;

    }
}
