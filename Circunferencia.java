

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float radio = 0.0f;
        float area  = 0.0f;
       
        
         System.out.print("Ingrese el radio: ");
        radio = scan.nextFloat();
        
        area = (float) (3.1416 * (radio*radio));
        
          System.out.print("El area es de : " + area);
    }
    
    
}
