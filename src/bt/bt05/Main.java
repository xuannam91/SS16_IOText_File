package bt.bt05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader readerFile5 = new FileReader("src/bt/bt04/text4.txt");
        BufferedReader readerText5 = new BufferedReader(readerFile5);
        String line5 = readerText5.readLine();
        String content5 = "";
        while (line5 != null){
            System.out.println(line5);
            content5 += line5 + " ";
            line5 = readerText5.readLine();
        }
        readerText5.close();

        String[] lineWords = content5.split("\\s+");
        boolean check = false;
        int max = lineWords[0].length();
        for (int i = 0; i < lineWords.length; i++) {
          if(max < lineWords[i].length()){
                max = lineWords[i].length();
          }
        }

        for (String lengthText: lineWords) {
            if(lengthText.length() == max){
                System.out.println("Các từ có độ dài nhất là bằng " + max +": " + lengthText);
                check = true;
            }
        }

    }
}
