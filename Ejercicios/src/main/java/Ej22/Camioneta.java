package Ej22;

import java.util.ArrayList;
import java.util.Random;

public class Camioneta implements Transporte {
	ArrayList<Paquete> envio = new ArrayList<Paquete>();

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
		return (new Random()).nextInt(31) + 70;
	}

}
