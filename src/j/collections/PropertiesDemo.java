package j.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\marad\\IdeaProjects\\JBasics\\out\\production\\JBasics\\j\\collections\\abc.properties");
        p.load(fis);
        System.out.println(p);

    }
}
