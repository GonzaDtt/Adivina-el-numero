
import java.util.Scanner;



/**
 * Juego del numero secreto (Ejercicio 3.27)
 * @author Luis
 */
public class Juego {
    public static void main(String[] args) {
        Computadora comp1 = new Computadora();
        Scanner lector = new Scanner(System.in);
        int num, respuesta;
        
        comp1.piensoNumero();
        
        do{
            System.out.println("Adivine el número que pensé: ");
            num = lector.nextInt();
            respuesta = comp1.seraEl(num);
            
            if (respuesta==0){
                System.out.println("¡HA ACERTADO!");
                System.out.println("Lo logró en "+comp1.getIntentos()+" intentos");
            }
            else if (respuesta == 1){
                System.out.println("¡LO SIENTO! Mi número es mayor");
            }
            else{
                System.out.println("¡LO SIENTO! Mi número es menor");
            }
        }while(respuesta != 0);
    }
}
