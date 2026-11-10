import java.io.*;
class FileWriterReader {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");

            fw.write("Welcome to Java Programming");
            fw.close();

            FileReader fr = new FileReader("data.txt");

            int ch;
            System.out.println("File Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
