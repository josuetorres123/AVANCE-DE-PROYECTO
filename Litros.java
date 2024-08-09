import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Litros{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scan = new Scanner(System.in);
        float litros = 0.0f;
        float precio  = 0.0f;
        float  total = 0.0f;
		float  galon = 0.0f;
       
        
        System.out.print("ingrese el precio del galon: ");
        precio = scan.nextFloat();
		
		System.out.print("ingrese los litros de leche: ");
        litros = scan.nextFloat();
       
        
        galon =(float) (litros / 3.785);
        total = galon * precio ;
        
          System.out.print("El total a pagar es de : " + total);
    }
    
}