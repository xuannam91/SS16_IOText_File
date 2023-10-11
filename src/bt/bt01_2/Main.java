package bt.bt01_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File text1 = new File("src/bt/bt01_2/text1.txt");
         text1.createNewFile();
        FileWriter writerfile1 = new FileWriter("src/bt/bt01_2/text1.txt");
        BufferedWriter writertext1 = new BufferedWriter(writerfile1);
        writertext1.write("Bài tập: đếm số lượng từ trong file\n" +
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
        writertext1.close();
        // b2. tạo hàm đọc file
        FileReader readerFile1 = new FileReader("src/bt/bt01_2/text1.txt");
        BufferedReader readerText1 = new BufferedReader(readerFile1);
        List<String> arrtext = new ArrayList<>();
        int count = 0;
        String line = readerText1.readLine();
        while (line != null) {
            System.out.println(line);
            arrtext.add(line);
            line = readerText1.readLine();
        }
        for (String str: arrtext
             ) { count += str.split(" ").length;

        }
        System.out.println("Số từ: " +count);
        System.out.println("Số dòng: " + arrtext.size());
        readerText1.close();






    }
}
