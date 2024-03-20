package juego_app;

import java.util.Random;

public abstract class Jugador {

	// Atributos
	protected String nombre;
	protected int vida;
	protected int defensa;
	protected int ataque;
	
	//Lista de habilidades
	protected Habilidad[] habilidades;

	// Constructor con todo
	public Jugador(String nombre, int vida, int defensa, int ataque) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.ataque = ataque;
		this.habilidades = new Habilidad[4];
		inicializarHabilidades();
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

	/**
	 * Realiza un ataque al oponente.
	 * 
	 * @param oponente El jugador al que se va a atacar.
	 */
	public abstract void atacar(Jugador oponente);

	
	
	//Método para inicializar habilidades
	protected abstract void inicializarHabilidades();

    // Método para seleccionar una habilidad aleatoria
    public Habilidad seleccionarHabilidad() {
        Random random = new Random();
        int indice = random.nextInt(habilidades.length);
        return habilidades[indice];
    }

}


