package Ej22Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ej22.Camioneta;
import Ej22.Paquete;

class TransporteTest {

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
	void testPesoTotal() {
		Camioneta c = new Camioneta();
		c.incluirPaquete(new Paquete(3));
		c.incluirPaquete(new Paquete(8));
		float expected = 11;
		float actual = c.pesoTotal();
		assertEquals(expected, actual, "Peso calculado incorrectamente");
	}

	@Test
	void testRecorrerDistancia() {
		Camioneta c = new Camioneta();
		boolean expected = true;
		int distGenerada = c.recorrerDistancia();
		boolean actual = (distGenerada >= 70 && distGenerada <= 100);
		assertEquals(expected, actual, "Distancia generada incorrectamente");
	}

}
