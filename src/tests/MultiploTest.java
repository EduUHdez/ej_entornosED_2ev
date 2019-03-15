package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import code.MinimoComunMultiplo;
public class MultiploTest {
	int [] numeros=new int [] {1, 2, 3, 4, 5, 0, 9};
	
	@Test
	public void hayCeros() {
		MinimoComunMultiplo metodo=new MinimoComunMultiplo();
		boolean comprobacion=metodo.algunoEsCero(numeros);
		assertFalse(comprobacion);
	}
	
	@Test
	public void minMultiplo() {
		MinimoComunMultiplo metodo=new MinimoComunMultiplo();
		boolean comprobacion2=metodo.esMinimoComunMultiplo(5,numeros);
		assertFalse(comprobacion2);
	}
	
	@Test 
	public void maximo() {
		MinimoComunMultiplo metodo=new MinimoComunMultiplo();
		int maximo=metodo.max(numeros);
		assertEquals(9, maximo);
	}
	
}
