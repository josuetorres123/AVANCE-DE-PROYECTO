import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Pulgadas {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double metros = 0.0d;
        double pulgadas  = 0.0d;
        
        System.out.print("Ingrese la cantidad de metros de tela requerida: ");
        metros = scan.nextFloat();
        
        pulgadas = (float) ((1/0.0254) * metros);
        
        System.out.print("Necesitara la cantidad de tela en pulgadas es : " + pulgadas);
    }
    
}