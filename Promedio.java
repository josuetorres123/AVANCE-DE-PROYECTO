

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scan = new Scanner(System.in);
        float primer_examen = 0.0f;
        float segundo_examen = 0.0f;
        float tercer_examen = 0.0f;
        float cuarto_examen = 0.0f;
        float promedio = 0.0f;
        
        System.out.print("Ingrese el primer examen: ");
        primer_examen = scan.nextFloat();
        System.out.print("Ingrese el segundo examen: ");
        segundo_examen = scan.nextFloat();
        System.out.print("Ingrese el tercer examen: ");
        tercer_examen = scan.nextFloat();
        System.out.print("Ingrese el cuarto examen: ");
        cuarto_examen = scan.nextFloat();
        
        
        promedio = primer_examen + segundo_examen + tercer_examen + cuarto_examen / 4 ;
        
          System.out.print("El promedio es de : " + promedio);
    }
    
}
