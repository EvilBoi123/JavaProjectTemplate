import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
 
             FileReader fr = new FileReader("test.txt");
 
 
 
            String str = "";
 
            int i;
 
            while ((i = fr.read()) != -1) {
 
                str += (char)i;
            }
 
            System.out.println(str);
 
            fr.close();
    }
}
