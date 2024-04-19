package Service;

import java.io.*;
import java.util.Scanner;

public class ManageFile {

    public static void SelectDocumentByUserToEncrypt(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            Encryption.EncryptFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            SelectDocumentByUserToEncrypt();
        }
    }

    public static void SelectDocumentByUserToDecrypt(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            Decryption.DecryptFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            SelectDocumentByUserToDecrypt();
        }
    }






}
