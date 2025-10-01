package Lesson40Practice.Evisi1;

import java.io.*;

public class Task5{
    void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // checked exception
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        Task5 obj = new Task5();
        try {
            obj.readFile();
        } catch (IOException e) {
            System.out.println("IOException handle edildi: " + e.getMessage());
        }
    }
}

