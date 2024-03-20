import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class bos {
    public static void main(String[] args) {
        try{
            // To the console
            BufferedOutputStream bos = new BufferedOutputStream(System.out);
            // To a file
            File file = new File("E:\\Download\\Task - 16\\Task - 16\\Buffered Output Stream\\test.txt");
            BufferedOutputStream bosf = new BufferedOutputStream(new FileOutputStream(file));
            bos.write("Hello, World!".getBytes());
            bosf.write("Hello, World!".getBytes());
            bos.flush();
            bos.close();
            bosf.flush();
            bosf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}
