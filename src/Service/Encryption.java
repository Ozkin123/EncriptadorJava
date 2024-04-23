package Service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import Service.ManageFile;

public class Encryption {

    public static void encryptFile(String document, int password) {
        File file = new File(document);
        try(FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter("Encriptado.txt")){
            int length = (int)file.length();
            char[] buffer = new char[length];
            reader.read(buffer);

            for (int i = 0; i <buffer.length ; i++) {
                buffer[i]= (char) ((buffer[i])+password);
            }

            writer.write(buffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static int passwordSelectedByUser(){
        System.out.println("digite una clave del 1 al 100 para encriptar");
        Scanner scanner = new Scanner(System.in);
        int password=1;
        try {
            password = scanner.nextInt();
            if(password<1||password>100){
                System.out.println("digite clave dentro del rango");
                passwordSelectedByUser();
            }
        }catch (RuntimeException e){
            System.out.println("Digite clave valida");
            passwordSelectedByUser();
        }

      return password;
    }



}
