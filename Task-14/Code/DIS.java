import java.io.*;
class DIS{
    public static void main(String[] args)throws IOException {

        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter your name");
        
        String str = in.readLine();
        System.out.println("Your name is " + str);
    }
}