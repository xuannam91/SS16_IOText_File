package ra;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello Java IO\n");
        String[] strings = {"name1\n", "name2\n", "name3\n"};
        for (String s : strings) {
            fileWriter.write(s);
        }
        fileWriter.close();

        System.out.println("Ghi thành công");
    }
}
