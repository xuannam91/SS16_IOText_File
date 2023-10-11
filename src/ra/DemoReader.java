package ra;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("hello.txt");
        // đọc từng kí tự
        int c = fileReader.read();
        while (c != -1) {
            System.out.print((char) c);
//            c = fileReader.read();
        }
        fileReader.close();
    }
}
