package juego_app;

public class Alumno extends Jugador implements ImovesAlumno{

	//Constructor con todo
	public Alumno(String nombre, int vida, int defensa, int ataque) {
		super(nombre, vida, defensa, ataque);
		
	}

	@Override
	public void usarChatGPT() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
        System.out.println(nombre + " ataca a " + oponente.nombre + " con su sabiduría de vida.");
        oponente.recibirAtaque(ataque);
	}

	
}
