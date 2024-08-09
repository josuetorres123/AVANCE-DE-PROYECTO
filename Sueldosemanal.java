import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class SueldoSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float horas_trabajadas = 0.0f;
        float pago_por_hora  = 0.0f;
        float sueldo_semanal  = 0.0f;
        
        System.out.print("Ingrese las horas trabajadas: ");
        horas_trabajadas = scan.nextFloat();
        System.out.print("Ingrese pago por hora: ");
        pago_por_hora = scan.nextFloat();
        
        sueldo_semanal = horas_trabajadas*pago_por_hora;
        
        System.out.print("El sueldo semanal es de : " + sueldo_semanal);
        
    }
    
}