package IUMenu;

import Service.Decryption;
import Service.ManageFile;

import java.util.Scanner;

public class Menu {


  public static void showMenu(){
      int option=0;
      Scanner scanner = new Scanner(System.in);
      do {
          System.out.println("Bienvenido al proyecto");
          System.out.println("Digite una opcion");
          System.out.println("1. Encriptar");
          System.out.println("2. Desencriptar");
          System.out.println("3. Salir");


          try {
              option = scanner.nextInt();
          }catch (Exception e){
              System.out.println("***********************");
              System.out.println("Elige una opcion valida");
              System.out.println("***********************");
              showMenu();
          }
          switch (option){
              case 1:
                  System.out.println("Digite texto a encriptar");
                  ManageFile.selectDocumentByUserToEncrypt();
                  System.out.println("Operacion realizada gracias");
                  option =3;
                  break;

              case 2:
                  showMenuDecrypt();
                  option=3;
                  break;
          }

      }while (option!=3);
  }

  public static void showMenuDecrypt(){
      int option=0;
      Scanner scanner = new Scanner(System.in);
      do {
          System.out.println("Digite una opcion");
          System.out.println("1. Desencriptar con password");
          System.out.println("2. Desencriptar por fuerzaBruta");
          System.out.println("3. Salir");


          try {
              option = scanner.nextInt();
          }catch (Exception e){
              System.out.println("***********************");
              System.out.println("Elige una opcion valida");
              System.out.println("***********************");
              showMenu();
          }
          switch (option){
              case 1:
                  System.out.println("Digite texto a desencriptar");
                  ManageFile.selectDocumentByUserToDecrypt();
                  System.out.println();
                  System.out.println();
                  System.out.println("Operacion realizada gracias");

                  option =4;
                  break;

              case 2:
                  System.out.println("Digite texto a desencriptar");
                  ManageFile.selectDocumentByUserToDecryptByForceBrute();
                  System.out.println();
                  System.out.println();
                  System.out.println("Operacion realizada gracias");

                  option=4;
                  break;

              case 3:
                  showMenu();

                  option=4;
                  break;
          }

      }while (option!=4);
  }

}
