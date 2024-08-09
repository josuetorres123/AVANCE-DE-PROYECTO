

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Figura{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float H = 0.0f;
        float R  = 0.0f;
		float C = 0.0f;
        float AT = 0.0f;
        float AC  = 0.0f;
		float A = 0.0f;
        
         System.out.print("Ingrese H: ");
         H = scan.nextFloat();
         
		 System.out.print("Ingrese R: ");
         R = scan.nextFloat();
		 
        C = (H*H-R*R);
		AT= (C*C*R)/2;
		AC= (float) (3.1416*R*R)/2;
		A=AT+AC;
        
          System.out.print("El area es de : " + A);
    }
    
    
}