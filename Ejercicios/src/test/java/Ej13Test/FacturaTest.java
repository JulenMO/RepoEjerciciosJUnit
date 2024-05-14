package Ej13Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ej13.Factura;
import Ej13.Producto;

class FacturaTest {

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
	void testTotalFactura() {
		Factura f = new Factura();
		f.meterProducto(new Producto("", 3, 2));
		f.meterProducto(new Producto("", 4, 4));
		float expected = 22;
		float actual = f.totalFactura();
		assertEquals(expected, actual, "Factura total calculada incorrectamente");
	}

	@Test
	void testAplicarIva() {
		Factura f = new Factura();
		f.meterProducto(new Producto("", 3, 2));
		f.meterProducto(new Producto("", 4, 4));
		float expected = 33;
		float actual = f.aplicarIva(50);
		assertEquals(expected, actual, "Precio con IVA calculado incorrectamente");
	}

}
