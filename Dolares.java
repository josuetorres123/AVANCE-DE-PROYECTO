import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Dolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double tasa_cambio = 0.0d;
        double quetzales  = 0.0d;
        
        System.out.print("Ingrese la tasa de cambio (dolares por quetzales): ");
        tasa_cambio = scan.nextFloat();
        System.out.print("Ingrese la cantidad de quetzales): ");
        quetzales = scan.nextFloat();
        
        double dolares = quetzales / tasa_cambio;
        
        System.out.print("La cantidad de dolares es de  : " + dolares);
    }
    
}