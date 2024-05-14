package Ej12;

import java.util.Random;

public class GeneradorIp {
	/**
	 * Genera un número entre dos límites dados
	 * 
	 * @param min El límite inferior(si es mayor que el superior, lo iguala al
	 *            superior)
	 * @param max El límite superior
	 * @return Retorna el número generado, un Integer
	 */
	public int generarNumero(int min, int max) {
		if (min > max) {
			min = max;
		}
		return (new Random()).nextInt(max - min + 1) + min;
	}

	/**
	 * Genera una IP aleatoria
	 * 
	 * @return Devuelve un String con la IP
	 */
	public String generarIp() {
		return "" + generarNumero(1, 254) + generarNumero(1, 254) + generarNumero(1, 254) + generarNumero(1, 254);
	}

}
