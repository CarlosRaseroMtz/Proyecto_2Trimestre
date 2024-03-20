package juego_app;

public class Padre extends Jugador implements ImovesPadre {

	// Constructor con todo
	public Padre(String nombre, int vida, int defensa, int ataque) {
		super(nombre, vida, defensa, ataque);

	}

	@Override
	public void quitarPlay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void regañarConRazon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void serDelAMPA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void justificarCausa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atacar(Jugador oponente) {
		// Seleccionar habilidad aleatoria
		Habilidad habilidad = seleccionarHabilidad();
		System.out.println(nombre + " utiliza la habilidad " + habilidad.getNombre()+" contra "+oponente.getNombre());
		
		habilidad.aplicarEfecto(this, oponente);
	}

	@Override
	protected void inicializarHabilidades() {
		habilidades[0] = new Habilidad("Quitar Play", 20, 10, 0.2); // 20% probabilidad de crítico
		habilidades[1] = new Habilidad("Lanzar Chancla", 25, -5, 0.4); // 40% probabilidad de crítico
		habilidades[2] = new Habilidad("Ser Del AMPA", 15, 15, 0.45); // 45% probabilidad de crítico
		habilidades[3] = new Habilidad("Justificar a mi hijo", 10, -5, 0.6); // 60% probabilidad de crítico
	}

}
