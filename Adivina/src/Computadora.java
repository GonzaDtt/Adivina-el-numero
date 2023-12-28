

/**
 * Clase Computadora (Ejercicio 3.27)
 * @author Luis
 */
public class Computadora {
    private int numero;
    private int intentos;
    
    public void piensoNumero(){
        numero = (int)Math.floor(Math.random()*100+1);
    }
    
    public int seraEl(int num){
        intentos++;
        
        if(numero == num){
            return 0;
        }
        else if (numero < num){
            return -1;
        }
        else{
            return 1;
        }
    }

    public int getIntentos() {
        return intentos;
    }
    
    
}
