import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class TiempoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float distancia = 0.0f;
        float velocidad  = 0.0f;
        float tiempo = 0.0f;
        
        System.out.print("Ingrese la distancia entre las ciudades en kilometros: ");
        distancia = scan.nextFloat();
        System.out.print("Ingrese la velocidad en kilometros por hora: ");
        velocidad = scan.nextFloat();
        
        tiempo = distancia / velocidad;
        
        System.out.print("El tiempo estimado de viaje en bicicleta es  : " + tiempo);
                
    }
    
}