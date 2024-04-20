package Service;

import java.io.*;
import java.util.Scanner;

public class Decryption {


    public static void DecryptFile(String document) {
        File file = new File(document);
        try(FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader)){
            int length = (int)file.length();
            char[] buffer = new char[length];
            reader.read(buffer);


            for (int i = 0; i <buffer.length-1 ; i++) {
                buffer[i]= (char) (buffer[i]-7);
                System.out.print(buffer[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
