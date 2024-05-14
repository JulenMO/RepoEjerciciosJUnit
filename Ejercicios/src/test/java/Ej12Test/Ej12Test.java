package Ej12Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ej12.GeneradorIp;

class Ej12Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		GeneradorIp gen = new GeneradorIp();
		int expected = 0;
		int actual = gen.generarNumero(0, 0);
		assertEquals(expected, actual, "Numero no generado correctamente");
		expected = 254;
		actual = gen.generarNumero(254, 254);
		assertEquals(expected, actual, "Numero no generado correctamente");
	}

	@Test
	void testGenerarIp() {
		GeneradorIp gen = new GeneradorIp();
		boolean expected = false;
		boolean actual = gen.generarIp().startsWith("0");
		assertEquals(expected, actual, "Empieza con cero");
		actual = gen.generarIp().endsWith("0");
		assertEquals(expected, actual, "Termina con cero");
	}

}
