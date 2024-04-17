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
            int height = (int)file.length();
            char[] buffer = new char[height*4];
            while (reader.ready()){
                reader.read(buffer);
            }

            for (int i = 0; i <buffer.length ; i++) {
                buffer[i]= (char) (buffer[i]+7);
            }

            writer.write(buffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void SelectDocumentUser(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            EncryptFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            SelectDocumentUser();
        }
    }

}
