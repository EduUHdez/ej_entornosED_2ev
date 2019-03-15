import code.MinimoComunMultiplo;
import code.VerificaNumerosAmigos;
/**
 * 
 * @author IFC
 *@brief es una clase para recoger los dos metodos creados en las otras clases y poder utilizarlos.
 */
public class demo {
/**
 * 
 * @param args es un array de string.
 * @brief se llama al metodo numeroAmigos y al minimoComunMultiplo.
 * 
 */
		public static void main (String[] args) {
			
			numerosAmigos();
			minimoComunMultiplo();
			
		}

		public static void numerosAmigos() {
			VerificaNumerosAmigos vf = new VerificaNumerosAmigos();
			vf.verificador();
		}

		public static void minimoComunMultiplo() {
			MinimoComunMultiplo mcm = new MinimoComunMultiplo();
			int[] candidatos = {17, 23};
			int resultado = mcm.candidatosMcM(candidatos);
			System.out.println("el mínimo común múltiplo de los candidatos es: "+resultado);
		}
}
