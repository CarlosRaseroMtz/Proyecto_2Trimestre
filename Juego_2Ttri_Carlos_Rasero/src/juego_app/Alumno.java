package juego_app;

public class Alumno extends Jugador implements ImovesAlumno {

	// Constructor con todo
	public Alumno(String nombre, int vida, int defensa, int ataque) {
		super(nombre, vida, defensa, ataque);

	}

	@Override
	public void usarChatGPT() {

	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fumarSigi() {
		// TODO Auto-generated method stub

	}

	@Override
	public void faltarHoras() {
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
		habilidades[0] = new Habilidad("Estudiar", 20, 0, 0.4); // 40% probabilidad de crítico
		habilidades[1] = new Habilidad("Usar ChatGPT", 25, -10, 0.2); // 30% probabilidad de crítico
		habilidades[2] = new Habilidad("Fumar", 15, -5, 0.65); // 65% probabilidad de crítico
		habilidades[3] = new Habilidad("faltar", 50, -20, 0.3); // 20% probabilidad de crítico
	}

}
