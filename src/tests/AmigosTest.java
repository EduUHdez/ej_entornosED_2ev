package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import code.VerificaNumerosAmigos;

public class AmigosTest {
	@Test
	public void testAmigos() {
		VerificaNumerosAmigos comprobarSiAmigos=new VerificaNumerosAmigos();
		boolean test=false;
		test=comprobarSiAmigos.comprobarSiAmigos(1, 2);
		assertTrue(test);
	}
	
	
	
	
}
