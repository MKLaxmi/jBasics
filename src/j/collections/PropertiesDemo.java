package j.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\marad\\IdeaProjects\\JBasics\\out\\production\\JBasics\\j\\collections\\abc.properties");
        p.load(fis);
        System.out.println(p);
        p.setProperty("code","2323");
        System.out.println(p);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\marad\\IdeaProjects\\JBasics\\out\\production\\JBasics\\j\\collections\\abc.properties");
        p.store(fos,"Updated by Laxmi");
        System.out.println(p);


    }
}
