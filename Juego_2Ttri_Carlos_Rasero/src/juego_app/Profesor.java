package juego_app;

public class Profesor extends Jugador implements ImovesProfesor {

	// Constructor con todo
	public Profesor(String nombre, int vida, int defensa, int ataque) {
		super(nombre, vida, defensa, ataque);

	}

	@Override
	public void usarExamenSorpresa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tomarCafe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void darDisgustos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salvarAlumno() {
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
		final String RESET = "\u001B[0m";
		final String BLACK = "\u001B[30m";
		final String RED = "\u001B[31m";
		final String GREEN = "\u001B[32m";
		final String YELLOW = "\u001B[33m";
		final String BLUE = "\u001B[34m";
		final String PURPLE = "\u001B[35m";
		final String CYAN = "\u001B[36m";
		final String WHITE = "\u001B[37m";
		habilidades[0] = new Habilidad(GREEN+"Poner Examen Sorpresa"+RESET, 30, -10, 0.20); // 20% probabilidad de crítico
		habilidades[1] = new Habilidad(GREEN+"Enfado"+RESET, 26, 0, 0.5); // 50% probabilidad de crítico
		habilidades[2] = new Habilidad(GREEN+"Beber Café"+RESET, 10, 10, 0.70); // 70% probabilidad de crítico
		habilidades[3] = new Habilidad(GREEN+"Salvar"+RESET, 5, 20, 0.30); // 30% probabilidad de crítico
	}

}
