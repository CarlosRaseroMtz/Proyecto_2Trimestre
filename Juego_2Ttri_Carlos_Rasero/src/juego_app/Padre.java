package juego_app;

public class Padre extends Jugador implements ImovesPadre{

	//Constructor con todo
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
		// TODO Auto-generated method stub
        System.out.println(nombre + " ataca a " + oponente.nombre + " con su sabiduría de vida.");
        oponente.recibirAtaque(ataque);
	}

}
