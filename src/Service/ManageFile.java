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
            password= Encryption.passwordSelectedByUser();
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
        try {
            selectedDocument = sc.nextLine();
            Decryption.decryptFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            selectDocumentByUserToDecrypt();
        }
    }






}
