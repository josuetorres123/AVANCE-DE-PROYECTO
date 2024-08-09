import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Energia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float kw = 0.0f;
        float precio  = 0.0f;
        float total = 0.0f;
        
        System.out.print("Ingrese los kilowatts consumidos: ");
        kw = scan.nextFloat();
        System.out.print("Ingrese el precio del kilowatts: ");
        precio = scan.nextFloat();
        
        total =  kw * precio;
        
        System.out.print("El total a pagar es de   : " + total);
                
    }
    
}