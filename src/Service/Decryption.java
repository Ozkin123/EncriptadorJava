package Service;

import Repository.DBCommonsWords;

import java.io.*;
import java.util.Scanner;

public class Decryption {


    public static void decryptFile(String document) {
        File file = new File(document);
        try(FileReader reader = new FileReader(file)){
            int length = (int)file.length();
            char[] buffer = new char[length];
            reader.read(buffer);


            for (int i = 0; i <buffer.length ; i++) {
                buffer[i]= (char) (buffer[i]-7);
                System.out.print(buffer[i]);
            }

            String block="";

            for (int i = 0; i < buffer.length; i++) {
                block+=buffer[i];
            }
            String [] wordToCompare = block.split(" ");

            System.out.println(DBCommonsWords.CompareWords(wordToCompare[0],DBCommonsWords.db50MostCommonsWordsSpanish));




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
