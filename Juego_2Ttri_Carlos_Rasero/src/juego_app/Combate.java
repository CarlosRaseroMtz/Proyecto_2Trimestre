package juego_app;

import java.util.Random;

public class Combate {
	private Jugador jugador1;
	private Jugador jugador2;

	public Combate(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public void iniciarCombate() {
		System.out.println("Comienza el combate entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");

		while (jugador1.estaVivo() && jugador2.estaVivo()) {
			realizarTurno(jugador1, jugador2);
			if (!jugador2.estaVivo()) {
				break;
			}
			realizarTurno(jugador2, jugador1);
		}

		System.out.println("\nFin del combate!");
		if (jugador1.estaVivo()) {
			System.out.println(jugador1.getNombre() + " ha ganado!");
		} else {
			System.out.println(jugador2.getNombre() + " ha ganado!");
		}
	}

	private void realizarTurno(Jugador atacante, Jugador objetivo) {
		System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre() + "!");
		atacante.atacar(objetivo);
		mostrarEstado();
	}

	private void mostrarEstado() {
		System.out.println(jugador1.getNombre() + ": Vida " + jugador1.getVida());
		System.out.println(jugador2.getNombre() + ": Vida " + jugador2.getVida() + "\n");
	}
}
