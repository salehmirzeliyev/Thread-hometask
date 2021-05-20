package home.task;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("sample3.txt"));
        int lineCount=0;
        int wordsCount=0;
        String line;
        while ((line = bufferedReader.readLine()) != null){
            lineCount++;
            String[] words = line.split(" ");
            wordsCount += words.length;
        } bufferedReader.close();
//        System.out.println("line count " + lineCount);
//        System.out.println("word count " + wordsCount);

        int finalLineCount = lineCount;
        int finalWordsCount = wordsCount;
        Thread thread = new Thread(() -> {
//            while (true){
//                System.out.println("thread starts");
//            }
        });
        System.out.println("line count " + finalLineCount);
        System.out.println("word count " + finalWordsCount);
        thread.start();
        System.out.println("start");
        thread.stop();
        System.out.println("stop");
    }
}
