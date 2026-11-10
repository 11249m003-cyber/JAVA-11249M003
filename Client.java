import java.net.*;
import java.io.*;
class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Server!");

            dos.close();
            s.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
