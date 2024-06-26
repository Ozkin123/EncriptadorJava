package Service;

import java.io.*;
import java.util.Scanner;

public class ManageFile {

    public static void selectDocumentByUserToEncrypt(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        int password;
        try {
            selectedDocument = sc.nextLine();
            password= ManageFile.passwordSelectedByUser();
            Encryption.encryptFile(selectedDocument,password);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            selectDocumentByUserToEncrypt();
        }
    }

    public static void selectDocumentByUserToDecrypt(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        int password;
        try {
            selectedDocument = sc.nextLine();
            password=passwordSelectedByUser();
            Decryption.decryptFile(selectedDocument,password);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            selectDocumentByUserToDecrypt();
        }
    }

    public static void selectDocumentByUserToDecryptByForceBrute(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            Decryption.decryptByBruteForce(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            selectDocumentByUserToDecryptByForceBrute();
        }
    }



    public static int passwordSelectedByUser(){
        System.out.println("digite una clave del 1 al 9 para encriptar");
        Scanner scanner = new Scanner(System.in);
        int password=1;
        try {
            password = scanner.nextInt();
            if(password<1||password>9){
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
