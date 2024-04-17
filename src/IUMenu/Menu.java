package IUMenu;



import Service.Desecnryption;
import Service.Encryption;
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
                  Encryption.SelectDocumentUser();
              break;
              case 2:
                  System.out.println("Digite texto a desencriptar");
                  Desecnryption.SelectDocumentUserDes();


          }





      }while (option!=3);



  }

}
