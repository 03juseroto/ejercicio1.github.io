
/**
 * Write a description of class gorras_estructurado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class gorras_estructurado
{
    public static void main (String[] args){
    Scanner sc = new Scanner ( System.in);
    ventaPOO ventas = new ventaPOO();
    int valpu;
    int valni;
    int valadi;
    int total;
    boolean salir = false;
    
    System.out.println("Digite el ID del cliente : ");
           ventas.id = sc.next();
    System.out.println("Digite el nombre del cliente : ");
           ventas.nombre = sc.next();
    System.out.println("Digite el telefono del cliente : ");
           ventas.telefono = sc.next();  
  do{         
          
    System.out.println("Digite la marca que desea comprar: ");
    System.out.println("-------------1. puma $2000-------------: ");
    System.out.println("-------------2. nike $3000-------------: ");
    System.out.println("-------------3. adidas $4000-----------: ");
     ventas.marca = sc.nextInt();
     
     switch(ventas.marca){
               case 1:
                   System.out.println("Digite la cantidad de gorras puma");
                   ventas.puma = sc.nextInt();
                   break;
               case 2:
                   System.out.println("Digite la cantidad de gorras nike");
                   ventas.nike = sc.nextInt();
                   break;
                case 3:
                   System.out.println("Digite la cantidad de gorras adidas");
                   ventas.adidas = sc.nextInt();
                   break;

           }
   System.out.println("Desea agregar otra marca a su compra?");
   System.out.println("1. SI  2. NO");
                   ventas.opc = sc.nextInt();
   
  
 }while (ventas.opc == 1);  
 
 valpu = (ventas.puma * 2000);
 valni = (ventas.nike *3000);
 valadi = (ventas.adidas *4000);
 total = (valpu+valni+valadi);
 
 System.out.println("LOS DETALLES DE SU COMPRA SON:");
 System.out.println("-------------------------------------------------");
 System.out.println("NOMBRE :"+ ventas.nombre + " IDENTIFICACION :"+ ventas.id + " TELEFONO :"+ ventas.telefono);
 System.out.println("------------------------------------------------:");
 System.out.println(ventas.puma+"- PUMA : $"+valpu);
 System.out.println(ventas.nike+"- NIKE : $"+valni);
 System.out.println(ventas.adidas+"- ADIDAS : $"+valadi);
 System.out.println("EL VALOR TOTAL DE SU COMPRA ES:");
 System.out.println("$"+total+"...GRACIAS POR SU COMPRA");
 
 
 
}
}
