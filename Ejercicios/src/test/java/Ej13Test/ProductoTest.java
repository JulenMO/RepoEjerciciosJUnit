package Ej13Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ej13.Producto;

class ProductoTest {

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
	void testNuevo() {
		Producto p = new Producto("HOLA", 3, 4);
		String expected1 = "HOLA";
		String actual1 = p.getNombre();
		assertEquals(expected1, actual1, "Nombre generado incorrectamente");
		float expected2 = 3;
		float actual2 = p.getPrecio();
		assertEquals(expected2, actual2, "Precio generado incorrectamente");
		int expected3 = 4;
		int actual3 = p.getCantidad();
		assertEquals(expected3, actual3, "Cantidad generada incorrectamente");
	}

	@Test
	void testPrecioTotal() {
		Producto p = new Producto("", 3, 3);
		float expected = 9;
		float actual = p.precioTotal();
		assertEquals(expected, actual, "Precio total calculado incorrectamente");
	}

}
