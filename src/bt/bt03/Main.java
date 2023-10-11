package bt.bt03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File text3 = new File("src/bt/bt03/text3.txt");
        text3.createNewFile();
        FileWriter writerfile3 = new FileWriter("src/bt/bt03/text3.txt");
        BufferedWriter writertext3 = new BufferedWriter(writerfile3);
        writertext3.write("Bài tập: đếm số lượng từ trong file\n" +
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
        writertext3.close();

        FileReader readerFile3 = new FileReader("src/bt/bt03/text3.txt");
        BufferedReader readerText3 = new BufferedReader(readerFile3);

        String line = readerText3.readLine();
        String content = "";
        while (line != null) {
            System.out.println(line);
            content += line + " ";
            line = readerText3.readLine();
        }
        readerText3.close();
            String[] lineWords = content.split(" "); // Tách các từ bằng khoảng trắng

        // Khởi tạo một danh sách để lưu trữ các từ trùng lặp
        List<String> duplicateWords = new ArrayList<>();
        for (int i = 0; i < lineWords.length-1; i++) {
            for (int j = i+1; j < lineWords.length; j++) {
                if(lineWords[i].equalsIgnoreCase(lineWords[j]) && !duplicateWords.contains(lineWords[i])){
                    duplicateWords.add(lineWords[i]);
                }
            }
        }
        for (String result: duplicateWords) {
            System.out.println("Các từ trùng lặp trong file:" + result);
        }


    }
}
