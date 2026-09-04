import java.io.FileOutputStream;
import java.util.Properties;
public class Properties2 {
    public static void main(String[] args) throws Exception {
        // Create Properties object
        Properties p = new Properties();
        // Add properties
        p.setProperty("name", "Jahnavi");
        p.setProperty("course", "Java");
        p.setProperty("city", "Hyderabad");
        // Create and store the file
        FileOutputStream fos = new FileOutputStream("student.properties");
        p.store(fos, "Student Details");
        fos.close();
        System.out.println("Properties file created successfully!");
    }
}