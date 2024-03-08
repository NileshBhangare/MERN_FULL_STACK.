import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DOS {
public static void main(String[] args) throws IOException
{
  String filepath = "C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\text.txt";
   FileOutputStream fos = new FileOutputStream(filepath); 
   DataOutputStream dos = new DataOutputStream(fos);

   dos.writeUTF(" Welcome to My Text file ");

   
   dos.close();
   fos.close();
 FileInputStream fis = new FileInputStream(filepath);
   DataInputStream dis = new DataInputStream(fis);
   
   System.out.println(dis.readUTF()); 
  
   dis.close();
   fis.close();
 }
}