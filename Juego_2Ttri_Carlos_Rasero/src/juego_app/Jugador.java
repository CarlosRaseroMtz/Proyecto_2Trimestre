package juego_app;

public abstract class Jugador {

	// Atributos
	protected String nombre;
	protected int vida;
	protected int defensa;
	protected int ataque;

	// Constructor con todo
	public Jugador(String nombre, int vida, int defensa, int ataque) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.ataque = ataque;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public abstract void atacar(Jugador oponente);

	public void recibirAtaque(int ataque) {
		int danioRecibido = Math.max(ataque - defensa, 0); // Calcula el daño recibido
		vida -= danioRecibido; // Resta el daño recibido a la vida
		System.out.println(nombre + " recibe " + danioRecibido + " puntos de daño.");
		if (vida <= 0) {
			System.out.println(nombre + " ha sido derrotado.");
		}
	}

	public boolean estaVivo() {
		return vida > 0;
	}

}
