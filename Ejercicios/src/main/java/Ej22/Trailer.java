package Ej22;

import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte {
	Vector<Paquete> envio = new Vector<Paquete>();

	public void incluirPaquete(Paquete paquete) {
		envio.add(paquete);
	}

	/**
	 * Devuelve el peso total del envío
	 */
	public float pesoTotal() {
		float peso = 0;
		for (Paquete p : envio) {
			peso += p.getPeso();
		}
		return peso;
	}

	/**
	 * Devuelve una distancia recorrida aleatoria entre 270 y 300
	 */
	public int recorrerDistancia() {
		return (new Random()).nextInt(31) + 270;
	}
}
