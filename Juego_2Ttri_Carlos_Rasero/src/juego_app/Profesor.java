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
		habilidades[0] = new Habilidad("Poner Examen Sorpresa", 30, -10, 0.20); // 20% probabilidad de crítico
		habilidades[1] = new Habilidad("Enfado", 26, 0, 0.5); // 50% probabilidad de crítico
		habilidades[2] = new Habilidad("Beber Café", 10, 10, 0.70); // 70% probabilidad de crítico
		habilidades[3] = new Habilidad("Salvar", 5, 20, 0.30); // 30% probabilidad de crítico
	}

}
