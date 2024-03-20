// File input stream
import java.io.FileInputStream;
public class fis{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\Download\\Task - 16\\Task - 16\\File Input Stream\\test.txt");
            int i = 0;
            while((i = fin.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}