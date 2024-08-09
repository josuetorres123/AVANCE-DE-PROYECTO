import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        float precio_base = 0.0f;
        float descuento  = 0.0f;
        float iva  = 0.0f;
        float precio_con_descuento = 0.0f;
        float precio_final  = 0.0f;
        
         System.out.print("Ingrese el precio base del articulo: ");
        precio_base = scan.nextFloat();
        
        descuento = (float) (precio_base * 0.20);
        precio_con_descuento = precio_base - descuento;
        
        iva = (float) (precio_con_descuento * 0.12);
        precio_final = precio_con_descuento + iva;
        
        System.out.print("El precio con descuento: " + precio_con_descuento);
        System.out.print("El precio final (con iva) : " + precio_final);
        
        
        
    }
    
}