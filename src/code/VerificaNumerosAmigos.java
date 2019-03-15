package code;
import javax.swing.JOptionPane;

/**
 * 
 * @author IFC
 *@class VerificaNumerosAmigos
 *@brief esta clase VerificaNumerosAmigos nos comprueba si dos variables enteras son numeros amigos. Lo hace aplicando el metodo comprobarSiAmigo y este metodo lo aplica en el verificador.
 *
 */

public class VerificaNumerosAmigos {

	/*
	 * Dos números son amigos cuando la suma de los divisores de uno da como resultado el otro y viceversa.
	 * Por ejemplo: 220 y 284 son amigos.
	 * */
	
	/**
	 * @brief entrada es una variable string que nos recoge la informacion que introducimos por teclado. Esta informacion la recogen primero la variable entera x y luego la variable entera y.
	 *@verificador es el metodo encargado de aplicar el metodo comprobarSiAmigos a las variables enteras x e y.
	 *
	 */
    public void verificador() {
        String entrada;

        entrada = JOptionPane.showInputDialog("Introducir 1er número");
        int x = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Introducir 2º número");
        int y = Integer.parseInt(entrada);
        
        if (this.comprobarSiAmigos(x,y)) {
            JOptionPane.showMessageDialog(null, x + " es amigo de " + y);
        } else {
            JOptionPane.showMessageDialog(null, x + " no es amigo de " + y);
        }        
    }
    /**
     * 
     * @param x es uno de los numeros introducidos que se compara 
     * @param y es el otro numero que se compara con el primero
     * @brief se le introducen dos numeros y lo que hace es crear dos variables enteras nuevas y las iguala a 0. Luego cuando i vale 1 y es menor que la variable x, hace que si el resto de x entre i es 0, la variable z sea la suma de z e i.
     * @brief despues si z es igual a y, iguala z a 0 y comienza un bucle en el que si i iguala a 1 es menor que y, y el resto entre y e i es 0, z es igual a la suma de z+i.
     *   
     * @return si despues de este proceso la variable z es igual a la variable x, el return es que si son amigos(devuelve true). Si no no lo son y devuelve false 
     */
   public boolean comprobarSiAmigos(int x, int y) {
    	int i, z = 0;
    	
    	for (i = 1; i < x; i++) {
            if (x % i == 0) {
                z = z + i;
            }
        }

        if (z == y) {
            z = 0;
            for (i = 1; i < y; i++) {
                if (y % i == 0) {
                    z = z + i;
                }
            }

            if (z == x) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
