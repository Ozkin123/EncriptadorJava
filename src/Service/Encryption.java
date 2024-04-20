package Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import Service.ManageFile;

public class Encryption {

    public static void EncryptFile(String document) {
        File file = new File(document);
        try(FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter("Encriptado.txt")){
            int length = (int)file.length();
            char[] buffer = new char[length];
            reader.read(buffer);

            for (int i = 0; i <buffer.length ; i++) {
                buffer[i]= (char) (buffer[i]+7);
            }

            writer.write(buffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
