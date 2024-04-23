package Service;

import Repository.DBCommonsWords;
import static Repository.DBCommonsWords.dbMostCommonsWordsSpanish;

import java.io.*;


public class Decryption {


    public static void decryptFile(String document, int password) {
        File file = new File(document);
        try (FileReader reader = new FileReader(file)) {
            int length = (int) file.length();
            char[] buffer = new char[length];
            reader.read(buffer);

            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = (char) ((buffer[i]) - password);
            }

            System.out.println(String.valueOf(buffer));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void decryptByBruteForce(String document) {
        File file = new File(document);
        try (FileReader reader = new FileReader(file)) {
            int iteratorBruteForce=1;
            int length = (int) file.length();
            char[] buffer = new char[length];
            reader.read(buffer);
            boolean flag = true;
            String block ="";

            while (flag){
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (char) ((buffer[i]) - iteratorBruteForce);
                    block+=buffer[i];
                }

                String [] blocktoCompare=block.split(" ");
                for (int i = 0; i <blocktoCompare.length ; i++) {
                    if(DBCommonsWords.CompareWords(blocktoCompare[i],dbMostCommonsWordsSpanish)){
                        flag=false;
                    }
                }


            }



            System.out.println(String.valueOf(buffer));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
