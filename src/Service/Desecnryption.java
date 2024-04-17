package Service;

import java.io.*;
import java.util.Scanner;

public class Desecnryption {


    public static void DesEncryptFile(String document) {
        File file = new File(document);
        try(FileReader reader = new FileReader(file)){
            int height = (int)file.length();
            char[] buffer = new char[height*4];
            while (reader.ready()){
                reader.read(buffer);
            }

            for (int i = 0; i <buffer.length ; i++) {
                buffer[i]= (char) (buffer[i]-7);
            }

            System.out.println(String.valueOf(buffer,0,buffer.length));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void SelectDocumentUserDes(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            DesEncryptFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            SelectDocumentUserDes();
        }
    }
}
