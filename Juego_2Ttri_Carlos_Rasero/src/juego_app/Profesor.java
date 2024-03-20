package juego_app;

public class Profesor extends Jugador implements ImovesProfesor{

	//Constructor con todo
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
		// TODO Auto-generated method stub
        System.out.println(nombre + " ataca a " + oponente.nombre + " con su sabiduría de vida.");
        oponente.recibirAtaque(ataque);
	}
	


}
