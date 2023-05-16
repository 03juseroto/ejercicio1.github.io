
/**
 * Write a description of class venta_gorras here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class venta_gorras
{
public static void main (String[] args){
    Scanner sc = new Scanner ( System.in);
    String id="";
    String nombre="";
    String telefono="";
    int  opc, marca, cantidad, valor, puma=0, nike=0, adidas=0, valpu, valni, valadi,total;
    boolean salir = false;
    
    System.out.println("Digite el ID del cliente : ");
           id = sc.next();
    System.out.println("Digite el nombre del cliente : ");
           nombre = sc.next();
    System.out.println("Digite el telefono del cliente : ");
           telefono = sc.next();  
  do{         
          
    System.out.println("Digite la marca que desea comprar: ");
    System.out.println("-------------1. puma $2000-------------: ");
    System.out.println("-------------2. nike $3000-------------: ");
    System.out.println("-------------3. adidas $4000-----------: ");
     marca = sc.nextInt();
     
     switch(marca){
               case 1:
                   System.out.println("Digite la cantidad de gorras puma");
                   puma = sc.nextInt();
                   break;
               case 2:
                   System.out.println("Digite la cantidad de gorras nike");
                   nike = sc.nextInt();
                   break;
                case 3:
                   System.out.println("Digite la cantidad de gorras adidas");
                   adidas = sc.nextInt();
                   break;

           }
   System.out.println("Desea agregar otra marca a su compra?");
   System.out.println("1. SI  2. NO");
                   opc = sc.nextInt();
   
  
 }while (opc == 1);  
 
 valpu = (puma * 2000);
 valni = (nike *3000);
 valadi = (adidas *4000);
 total = (valpu+valni+valadi);
 
 System.out.println("LOS DETALLES DE SU COMPRA SON:");
 System.out.println("-------------------------------------------------");
 System.out.println("NOMBRE :"+ nombre + " IDENTIFICACION :"+ id + " TELEFONO :"+ telefono);
 System.out.println("------------------------------------------------:");
 System.out.println(puma+"- PUMA : $"+valpu);
 System.out.println(nike+"- NIKE : $"+valni);
 System.out.println(adidas+"- ADIDAS : $"+valadi);
 System.out.println("EL VALOR TOTAL DE SU COMPRA ES:");
 System.out.println("$"+total+"...GRACIAS POR SU COMPRA");
 
 
 
}
}
