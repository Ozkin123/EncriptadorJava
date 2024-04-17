package Service;

import java.util.Scanner;
import Service.ManageFile;

public class Encryption {


    public static void encrypt(){
        Scanner sc = new Scanner(System.in);
        String selectedDocument;
        try {
            selectedDocument = sc.nextLine();
            ManageFile.SelectFile(selectedDocument);
        }catch (Exception e){
            System.out.println("no exixte documento");
            System.out.println("digite nuevamente");
            encrypt();
        }
    }


}
