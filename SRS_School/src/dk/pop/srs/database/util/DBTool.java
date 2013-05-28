package dk.pop.srs.database.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Kann
 */
public class DBTool {

    private static Connection instance = null;

    private DBTool() {
    }

    public static Connection getInstance() {
        if (instance == null) {
            makeInstance();
            return instance;
        } else {
            return instance;
        }
    }

    private static void makeInstance() {
        String FILENAME = "dbconfig.properties"; // Indikates where config file is
        Properties dbProp = new Properties(); // Creates a properties type object
        FileInputStream in = null;

        try {
            in = new FileInputStream(FILENAME); // Creates a fileinputstream and loads the config file
            dbProp.load(in); // Loads the config file into our properties object (to hold the config in memory to use)
            in.close(); // closes the fileinputstream (we dont need anymore)
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), FILENAME + " was not found", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String dbUser = dbProp.getProperty("dbUser"); // Gets the dbUser from the properties object
        String dbPass = dbProp.getProperty("dbPass"); // Gets the dbPass from the properties object
        String dbURL = dbProp.getProperty("dbURL"); // Gets the dbURL from the properies object

        System.out.println(dbUser + " " + dbPass + " " + dbURL);
        try {
            instance = DriverManager.getConnection(dbURL, dbUser, dbPass); // Creates and gets the MySQL connection and saves it to the instance variable
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Could not connect to database", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(0);
        }
    }
}
