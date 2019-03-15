package code;

/**
 * 
 * @author IFC
 *@class MinimoComunMultiplo
 *@brief 
 */
public class MinimoComunMultiplo {
  public MinimoComunMultiplo() {}
/**
 * 
 * @param args es un array de enteros.
 * @brief se introduce un array de enteros. Si su longitud es menor de 2, devuelve un error ya que necesita al menos 2 enteros mas. Luego llama al metodo algunoEsCero para comprobar si algun elemento del array es 0. Si alguno lo es, devuelve un error ya que no pueden ser 0. Despues calcula el valor absoluto, el valor maximo del array y si el minimo comun multiplo es correcto, devuelve lo siguiente.
 * @return si el numero d es minimoComunMultiplo, devuelve d.
 */
  public int candidatosMcM(int[] args) {
    if (args.length < 2) {
      throw new IllegalArgumentException(
        "Hacen falta dos o más números"
      );
    }

    if (algunoEsCero(args)) {
      throw new IllegalArgumentException(
        "Los números no pueden ser cero"
      );
    }

    args = abs(args);

    int max = max(args);
    int d = max;

    while (true) {
      if (esMinimoComunMultiplo(d, args)) {
        return d;
      }

      d += max;
    }
  }
/**
 * 
 * @param ints un array de enteros
 * @brief recorre el array entero y si alguno de sus numeros es 0 devuelve true, sino false.
 * @return si alguno de los numeros es 0, devuelve true. Sino devuelve false.
 */


  public static boolean algunoEsCero(int[] ints) {

    for (int d : ints) {
      if (d == 0) {
        return true;
      }
    }

    return false;
  }
/**
 * 
 * @param ints es un array de enteros.
 * @brief crea un nuevo array de enteros de la longitud del pasado como parametro. 
 * @return devuelve el valor absoluto.
 */
  private static int[] abs(int[] ints) {
    int[] abs = new int[ints.length];

    for (int i = 0; i < ints.length; i += 1) {
      abs[i] = Math.abs(ints[i]);
    }

    return abs;
  }
  

/**
 * 
 * @param ints es un array de enteros.
 * @return mediante el metodo max, devuelve el numero mayor del array que le hemos pasado como parametro.
 */


  public static int max(int[] ints) {

    int max = ints[0];

    for (int i = 1; i < ints.length; i += 1) {
      max = Math.max(max, ints[i]);
    }

    return max;
  }
  

/**
 * 
 * @param d es un entero
 * @param ints es un array de enteros
 * @return si el numero d no es minimo comun multiplo del array ints devuelve false(resto distinto de 0). En caso contrario devuelve true.
 */


  public boolean esMinimoComunMultiplo(int d, int[] ints) {
    for (int i = 0; i < ints.length; i += 1) {
      if (d % ints[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
