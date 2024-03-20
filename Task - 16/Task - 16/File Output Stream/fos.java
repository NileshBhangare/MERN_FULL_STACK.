import java.io.FileOutputStream;
public class fos {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("E:\\Download\\Task - 16\\Task - 16\\File Output Stream\\test.txt");
            String s = "Hello, World!";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
