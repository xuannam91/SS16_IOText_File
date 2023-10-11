package ra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("hello.txt");
        BufferedReader reader = new BufferedReader(fileReader); //wrapper
        // đọc từng dòng
        String s = reader.readLine();

        while (s != null) {
            System.out.println(s);
            s = reader.readLine();
        }

        reader.close();
    }
}
