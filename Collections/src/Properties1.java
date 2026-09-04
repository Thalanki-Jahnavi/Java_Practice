import java.io.FileReader;
import java.util.Properties;
public class Properties1{
    public static void main(String[] args) throws Exception {
        // Create Properties object
        Properties p = new Properties();
        // Open properties file
        FileReader reader = new FileReader("config.properties");
        // Load data
        p.load(reader);
        // Read values
        String appName = p.getProperty("app.name");
        String port = p.getProperty("server.port");
        String username = p.getProperty("database.username");
        String password = p.getProperty("database.password");
        // Display
        System.out.println("Application: " + appName);
        System.out.println("Port: " + port);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        reader.close();
    }
}