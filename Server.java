import java.net.*;
import java.io.*;
class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server waiting for client...");

            Socket s = ss.accept();

            DataInputStream dis =
                new DataInputStream(s.getInputStream());

            String msg = dis.readUTF();

            System.out.println("Message from Client: " + msg);

            dis.close();
            s.close();
            ss.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
