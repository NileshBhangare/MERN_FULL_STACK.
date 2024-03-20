import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class bis {
    public static void main(String[] args) {
        File file = new File("E:\\Download\\Task - 16\\Task - 16\\Buffered Input Stream\\test.txt");
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            int i;
            while((i = bis.read()) != -1){
                System.out.print((char)i);
            }
            bis.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }    
}
