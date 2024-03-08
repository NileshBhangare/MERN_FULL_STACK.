import java.io.ByteArrayOutputStream;

class BAOS {
  public static void main(String[] args) {

    String data = "This is a Byte Array Output Stream";
try {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      byte[] array = data.getBytes();
      out.write(array);
      String streamData = out.toString();
      System.out.println("Output stream: " + streamData);
out.close();
    }
catch(Exception e) {
      e.getStackTrace();
    }
  }
}
