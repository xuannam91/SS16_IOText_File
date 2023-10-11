package bt.bt04;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File text4 = new File("src/bt/bt04/text4.txt");
        text4.createNewFile();
        FileWriter writerfile4 = new FileWriter("src/bt/bt04/text4.txt");
        BufferedWriter writertext4 = new BufferedWriter(writerfile4);
        writertext4.write("Bài tập: đếm số lượng từ trong file\n" +
                "\n" +
                "Mục tiêu: luyện tâp đọc file.\n" +
                "\n" +
                "Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.\n" +
                "\n" +
                "Hướng dẫn:\n" +
                "\n" +
                "B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)\n" +
                "\n" +
                "B2: Tạo hàm đọc file trên và trả ra String.\n" +
                "\n" +
                "B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử\n" +
                "\n" +
                "B4: length của mảng trên chính là số lượng từ trong file.");
        writertext4.close();

        FileReader readerFile4 = new FileReader("src/bt/bt04/text4.txt");
        BufferedReader readerText4 = new BufferedReader(readerFile4);
        List<String> arrtext = new ArrayList<>();
        List<String> words = new ArrayList<>();

        String line = readerText4.readLine();
        while (line != null) {
            System.out.println(line);
            arrtext.add(line);
            line = readerText4.readLine();
        }

        for (String line1: arrtext) {
            String[] lineWords = line1.split(" "); // Tách các từ bằng khoảng trắng
            words.addAll(Arrays.asList(lineWords));
        }
//       dùng Collection.sort()
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            System.out.println(word);
        }
        readerText4.close();
    }
}
