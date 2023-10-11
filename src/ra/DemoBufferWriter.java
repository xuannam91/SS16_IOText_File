package ra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("hello.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        char[] c = {'H', 'e', 'l', 'l', 'o'};
        writer.write(c);
        writer.newLine();
        writer.write("RikkeiAcademy");
        writer.close();
    }
}
