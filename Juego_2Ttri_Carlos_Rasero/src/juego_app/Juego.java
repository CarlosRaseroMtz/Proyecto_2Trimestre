package juego_app;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Juego {

	// Colores ANSI
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";

	public static void main(String[] args) {

		// Array de tamaño 10
		Jugador[] profesoresDisponibles = new Profesor[10];
		Jugador[] alumnosDisponibles = new Alumno[20];
		Jugador[] padresDisponibles = new Padre[10];
		int opPrincipal = 0;
		int opSubMenu = 0;
		int opSubMenuModificar = 0;
		int opSubMenuEliminar = 0;
		int opSubMenuAgregar = 0;
		int opSubMenuSalida = 0;
		Scanner sc = new Scanner(System.in);

		// Profesores ya predefinidos

		profesoresDisponibles[0] = new Profesor("Angélica", 150, 30, 50);
		profesoresDisponibles[1] = new Profesor("Gema", 130, 50, 40);
		profesoresDisponibles[2] = new Profesor("laDeFol", 120, 25, 35);
		profesoresDisponibles[3] = crearProfesorAleatorio("ElQueNosDeProgEn2");
		profesoresDisponibles[4] = crearProfesorAleatorio("LaQueOsDeEmpresaEn2");

		// Alumnos ya predefinidos

		alumnosDisponibles[0] = new Alumno("Carlos", 140, 40, 40);
		alumnosDisponibles[1] = new Alumno("Ale el `chasca` ", 50, 100, 30);
		alumnosDisponibles[2] = crearAlumnoAleatorio("Manuel Alto");
		alumnosDisponibles[3] = crearAlumnoAleatorio("Manuel Bajo");
		alumnosDisponibles[4] = crearAlumnoAleatorio("Maria delegah");
		alumnosDisponibles[5] = crearAlumnoAleatorio("Jaime teclado");
		alumnosDisponibles[6] = crearAlumnoAleatorio("Jaime no pesado");
		alumnosDisponibles[7] = crearAlumnoAleatorio("Hugo CSS");
		alumnosDisponibles[8] = crearAlumnoAleatorio("Javi preguntas");
		alumnosDisponibles[9] = crearAlumnoAleatorio("Pedro Sevillista");
		alumnosDisponibles[10] = crearAlumnoAleatorio("Ruben Responsable");
		alumnosDisponibles[11] = crearAlumnoAleatorio("Ricardo NoFaltes");
		alumnosDisponibles[12] = crearAlumnoAleatorio("Pablo camelLargo");
		alumnosDisponibles[13] = crearAlumnoAleatorio("Leyenda desaparecida Pablo");
		alumnosDisponibles[14] = crearAlumnoAleatorio("Leyenda desaparecida Alberto");
		alumnosDisponibles[15] = crearAlumnoAleatorio("Leyenda desaparecida Francisco");
		alumnosDisponibles[16] = crearAlumnoAleatorio("Leyenda desaparecida la chica esta de alante");

		// Padres ya predefinidos

		padresDisponibles[0] = crearPadreAleatorio("Padre guapo");
		padresDisponibles[1] = crearPadreAleatorio("Madre guapa");
		padresDisponibles[2] = crearPadreAleatorio("Padre");
		padresDisponibles[3] = crearPadreAleatorio("Madre");
		padresDisponibles[4] = crearPadreAleatorio("Padre default");
		padresDisponibles[5] = crearPadreAleatorio("Madre default");

		do {
			System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
			System.out.println(CYAN + "------------------------------MENU----------------------------");
			System.out.println("1. Jugar");
			System.out.println("2. Ver Personajes disponibles");
			System.out.println("3. Modificar Personaje");
			System.out.println("4. Eliminar Personaje");
			System.out.println("5. Crear Personaje");
			System.out.println("6. Salir del juego" + RESET);
			System.out.println(BLUE + "--------------------------------------------------------------" + RESET);

			opPrincipal = sc.nextInt();

			switch (opPrincipal) {
			case 1:
				do {
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					System.out.println(CYAN + "------------------------------MENU----------------------------");
					System.out.println("Por favor, escoja una dificultad");
					System.out.println("1. NIVEL DE DIFICULTAD: Fácil");
					System.out.println("2. NIVEL DE DIFICULTAD: Medio");
					System.out.println("3. NIVEL DE DIFICULTAD: Difícil");
					System.out.println("4. NIVEL DE DIFICULTAD: Jugador de Pokemon");
					System.out.println("5. Volver al menú principal" + RESET);
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					opSubMenu = sc.nextInt();

					switch (opSubMenu) {
					case 1:
						System.out.println(CYAN + "Esto es un combate aleatorio entre un alumno y un profesor");
						System.out.println("¡Comienza el combate!");
						System.out.println("");
						System.out.println("Se enfrentarán el alumno: " + RESET);
						System.out.println("───────▄▀▀▀▀▀▀▀▀▀▀▄▄\r\n" + "────▄▀▀░░░░░░░░░░░░░▀▄\r\n"
								+ "──▄▀░░░░░░░░░░░░░░░░░░▀▄\r\n" + "──█░░░░░░░░░░░░░░░░░░░░░▀▄\r\n"
								+ "─▐▌░░░░░░░░▄▄▄▄▄▄▄░░░░░░░▐▌\r\n" + "─█░░░░░░░░░░░▄▄▄▄░░▀▀▀▀▀░░█\r\n"
								+ "▐▌░░░░░░░▀▀▀▀░░░░░▀▀▀▀▀░░░▐▌\r\n" + "█░░░░░░░░░▄▄▀▀▀▀▀░░░░▀▀▀▀▄░█\r\n"
								+ "█░░░░░░░░░░░░░░░░▀░░░▐░░░░░▐▌\r\n" + "▐▌░░░░░░░░░▐▀▀██▄░░░░░░▄▄▄░▐▌\r\n"
								+ "─█░░░░░░░░░░░▀▀▀░░░░░░▀▀██░░█\r\n" + "─▐▌░░░░▄░░░░░░░░░░░░░▌░░░░░░█\r\n"
								+ "──▐▌░░▐░░░░░░░░░░░░░░▀▄░░░░░█\r\n" + "───█░░░▌░░░░░░░░▐▀░░░░▄▀░░░▐▌\r\n"
								+ "───▐▌░░▀▄░░░░░░░░▀░▀░▀▀░░░▄▀\r\n" + "───▐▌░░▐▀▄░░░░░░░░░░░░░░░░█\r\n"
								+ "───▐▌░░░▌░▀▄░░░░▀▀▀▀▀▀░░░█\r\n" + "───█░░░▀░░░░▀▄░░░░░░░░░░▄▀\r\n"
								+ "──▐▌░░░░░░░░░░▀▄░░░░░░▄▀\r\n" + "─▄▀░░░▄▀░░░░░░░░▀▀▀▀█▀\r\n"
								+ "▀░░░▄▀░░░░░░░░░░▀░░░▀▀▀▀▄▄▄▄▄\r\n" + "");
						System.out.println();
						System.out.println();
						System.out.println(CYAN + "Contra el profesor: " + RESET);
						System.out.println("──────────────────────────────────\r\n"
								+ "─────────▄██████████████████▄─────\r\n" + "────────██▀░░░░░░░░░░░░░░░░▀██▄───\r\n"
								+ "───────█▌░░▄░░░░░░░▀▄▄▀░░░░░░▀█───\r\n" + "──────█▌░░░▀███▄░░▀▄▄▄▄▀░░░░░░▀█──\r\n"
								+ "─────█▌░░░░█▀──▀▄░░░░░░░░░▄▄█▀░▐█─\r\n" + "────█▌░░░░░█─────█░▄▄▄░░▄▀▀▀▀▄░░▐█\r\n"
								+ "───█▌░░░░░░█──█──█░░░░░█─────█░░░█\r\n" + "──█▌░░░░░░░░▀▄▄▄▀░░░░░░█──█──█░░░█\r\n"
								+ "─█▌░░░░░░░░░░░░░░▄░░▄░░░▀▄▄▄▀░░░░█\r\n" + "█▌░░░░▄▀▀▄░░░░░▀▀░░░░▀▀░░░░░░░░░░█\r\n"
								+ "█░░░░░▀▄░░░░░░░▄▀░▀▄░░░░░▄▀▀▄░░░░█\r\n" + "█░▐░░░░░▀▀▀▀▀▀▀░░░░░▀▀▄▄▄▄▄▄▀░░▌░█\r\n"
								+ "█░░▌▄░░░░░░▄█▀▀█▀▀█▀▄░░░░░░░▄░▐░░█\r\n" + "█░░▌█▀█▀▀█▀─█──█──█──█▀▀█▀▀██░▐░░█\r\n"
								+ "█░▐░█▄█▄▄█▄▄█▄▄█▄▄█▄▄█▄▄█▄██░░▐░░█\r\n" + "█░░░███████████████████████░░░░▌░█\r\n"
								+ "█░░░█▄─█──█──█──█──█──█──█▀░░░░░░█\r\n" + "█░░░░▀██▄▄█▄▄█▄▄█▄▄█▄▄█▄█▀░░░░░░▐█\r\n"
								+ "█▌░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█▀\r\n" + "─█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█──\r\n"
								+ "──█▄░░░░░░░▀▄▄▄▄▄▄▄▀░░░░░░░░░▄█───\r\n" + "───██▄░░░░░░░░░░░░░░░░░░░░░▄██────\r\n"
								+ "────▀██▄░░░░░░░░░░░░░░░░░▄██▀─────\r\n" + "──────▀███████████████████▀───────\r\n"
								+ "");

						boolean seleccionValida = false;
						while (!seleccionValida) {
							try {
								// Escoge un profesor al azar
								Random rand = new Random();
								Profesor profesorAleatorio = (Profesor) profesoresDisponibles[rand
										.nextInt(profesoresDisponibles.length)];
								// Escoge un alumno al azar
								Alumno alumnoAleatorio = (Alumno) alumnosDisponibles[rand
										.nextInt(alumnosDisponibles.length)];

								// Verifica si los elementos seleccionados son nulos
								if (profesorAleatorio != null && alumnoAleatorio != null) {
									// Inicia el combate
									jugarCombate(profesorAleatorio, alumnoAleatorio);
									seleccionValida = true;
								} else {
									throw new NullPointerException(
											RED + "Se ha seleccionado un profesor o un alumno nulo." + RESET);
								}
							} catch (NullPointerException e) {
								System.out.println(RED + "Se ha producido un error: " + e.getMessage());
								System.out.println(RED + "¿Quieres intentarlo de nuevo?" + RESET + " (s/n)" + RESET);
								String respuesta = sc.next();
								if (!respuesta.equalsIgnoreCase("s")) {
									seleccionValida = true;
								}
							}
						}
						break;

					case 2:
						System.out.println(CYAN
								+ "Lo sentimos pero actualmente no tenemos la función de dificultad disponible, próximamente "
								+ "los desarrolladores lanzarán una nueva actualización con LootBoxes y microtransacciones, "
								+ "muchas gracias por entendernos. STUDIOS JAVALAND SL");
						System.out.println("");
						System.out.println("Esto es un combate aleatorio entre un padre y un alumno");

						System.out.println("¡Comienza el combate!");
						System.out.println("Se enfrentará el padre: " + RESET);
						System.out.println("░░░░░░░░███████████████░░░░░░░░\r\n" + "░░░░░█████████████████████░░░░░\r\n"
								+ "░░░░████████████████████████░░░\r\n" + "░░░██████████████████████████░░\r\n"
								+ "░░█████████████████████████████\r\n" + "░░███████████▀░░░░░░░░░████████\r\n"
								+ "░░███████████░░░░░░░░░░░░░░░███\r\n" + "░████████████░░░░░░░░░░░░░░░░██\r\n"
								+ "░█░░███████░░░░░░░░░░░▄▄░░░░░██\r\n" + "█░░░░█████░░░░░░▄███████░░██░░█\r\n"
								+ "█░░█░░░███░░░░░██▀▀░░░░░░░░██░█\r\n" + "█░░░█░░░░░░░░░░░░▄██▄░░░░░░░███\r\n"
								+ "█░░▄█░░░░░░░░░░░░░░░░░░█▀▀█▄░██\r\n" + "█░░░░░░░░░░░░░░░░░░░░░░█░░░░██░\r\n"
								+ "░███░░░░░░░░░░░░░░░░░░░█░░░░█░░\r\n" + "░░█░█░░░░░░░█░░░░░██▀▄░▄██░░░█░\r\n"
								+ "░░█░█░░░░░░█░░░░░░░░░░░░░░░░░█░\r\n" + "░░░██░░░░░░█░░░░▄▄▄▄▄▄░░░░░░█░░\r\n"
								+ "░░░██░░░░░░░█░░█▄▄▄▄░▀▀██░░█░░░\r\n" + "░░░██░░░░░░░█░░▀████████░░█░░░░\r\n"
								+ "░░█░░█░░░░░░░█░░▀▄▄▄▄██░░█░░░░░\r\n" + "░░█░░░█░░░░░░░█░░░░░░░░░█░░░░░░\r\n"
								+ "░█░░░░░█░░░░░░░░░░░░░░░░█░░░░░░\r\n" + "░░░░░░░░█░░░░░░█░░░░░░░░█░░░░░░\r\n"
								+ "░░░░░░░░░░░░░░░░████████░░░░░░░\r\n" + "");
						System.out.println("");
						System.out.println("");
						System.out.println(CYAN + "Contra el alumno: " + RESET);
						System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░█▄\r\n" + "░▄▄▄▄▄▄░░░░░░░░░░░░░▄▄▄▄▄░░█▄\r\n"
								+ "░▀▀▀▀▀███▄░░░░░░░▄███▀▀▀▀░░░█▄\r\n" + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\r\n"
								+ "░▄▀▀▀▀▀▄░░░░░░░░░░▄▀▀▀▀▀▄░░░░█\r\n" + "█▄████▄░▀▄░░░░░░▄█░▄████▄▀▄░░█▄\r\n"
								+ "████▀▀██░▀▄░░░░▄▀▄██▀█▄▄█░█▄░░█\r\n" + "██▀██████░█░░░░█░████▀█▀██░█░░█\r\n"
								+ "████▀▄▀█▀░█░░░░█░█████▄██▀▄▀░░█\r\n" + "███████▀░█░░░░░░█░█████▀░▄▀░░░█\r\n"
								+ "░▀▄▄▄▄▄▀▀░░░░░░░░▀▀▄▄▄▄▀▀░░░░░█\r\n" + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\r\n"
								+ "░░▓▓▓▓▓▓▓░░░░░░░░░░▓▓▓▓▓▓▓░░░░█\r\n" + "░░░▓▓▓▓▓░░░░░░░░░░░░▓▓▓▓▓░░░░░█\r\n"
								+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\r\n" + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▀\r\n"
								+ "░░░░░░░░░▄▄███████▄▄░░░░░░░░░█\r\n" + "░░░░░░░░█████████████░░░░░░░█▀\r\n"
								+ "░░░░░░░░░▀█████████▀░░░░░░░█▀\r\n" + "░░░░░░░░░░░░░░░░░░░░░░░░░░█▀\r\n"
								+ "░░░░░░░░░░░░░░░░░░░░░░░░░█▀\r\n" + "");
						boolean seleccionValida2 = false;
						while (!seleccionValida2) {
							try {
								// Escoge un profesor al azar
								Random rand = new Random();
								Padre padreAleatorio = (Padre) padresDisponibles[rand
										.nextInt(padresDisponibles.length)];
								// Escoge un alumno al azar
								Alumno alumnoAleatorio = (Alumno) alumnosDisponibles[rand
										.nextInt(alumnosDisponibles.length)];

								// Verifica si los elementos seleccionados son nulos
								if (padreAleatorio != null && alumnoAleatorio != null) {
									// Inicia el combate
									jugarCombate(padreAleatorio, alumnoAleatorio);
									seleccionValida2 = true;
								} else {
									throw new NullPointerException(
											RED + "Se ha seleccionado un padre o un alumno nulo." + RESET);
								}
							} catch (NullPointerException e) {
								System.out.println(RED + "Se ha producido un error: " + e.getMessage());
								System.out.println("¿Quieres intentarlo de nuevo? (s/n)" + RESET);
								String respuesta2 = sc.next();
								if (!respuesta2.equalsIgnoreCase("s")) {
									seleccionValida2 = true;
								}
							}
						}
						break;

					case 3:
						System.out.println(CYAN + "Esto es un combate aleatorio entre un profesor y un padre");
						System.out.println("¡Comienza el combate!");
						System.out.println("");
						System.out.println("Se enfentrará el padre: " + RESET);
						System.out.println("░░░░░▄▄▄▀▀▀▀▀▀▀▀▀▄▄▄░░░░░░░░░\r\n" + "░░░▄▀░░░░░░░░░░░░░░░▀▀▄▄░░░░░\r\n"
								+ "░░▄▀░░░░░░░░░░░░░░░░░░░░▀▄░░░\r\n" + "░▄▀░░░░░░░░░░░░░░░░░░░░░░░█░░\r\n"
								+ "░█░░░░░░░░░░░░░░░░░░░░░░░░░█░\r\n" + "▐░░░░░░░░░░░░░░░░░░░░░░░░░░░█\r\n"
								+ "█░░░░▀▀█▄▄▄░░░▄▌░░░░░░░░░░░░▐\r\n" + "▌░░░░░▌░██▀█▀▀░░░▄▄▄▄▄░░░░▌░▐\r\n"
								+ "▌░░░░░▀▄▄▄▀░░░░░░▌░▀███▄▄▀░░▐\r\n" + "▌░░░░░░░░░░░░░░░░░▀▄▄▄▄▀░░░▄▌\r\n"
								+ "▐░░░░▐▀░░░░░░░░░░░░░░░░░░░▄▀░\r\n" + "░█░░░▌░░▄▀▀▀▄▄▄░░░░░░░░░░▄▀░░\r\n"
								+ "░░█░░▀░░░░▄▄▄▄░▀▀▌░░▌░░░█░░░░\r\n" + "░░░▀▄░░░░░░░░░▀░░░▄▀░░▄▀░░░░░\r\n"
								+ "░░░░░▀▄▄▄░░░░░░░░░▄▄▀▀░░░░░░░\r\n" + "░░░░░░░░▐▀▀▀▀▀▀▀▀▀░░░░░░░░░░░\r\n" + "");
						System.out.println("");
						System.out.println("");
						System.out.println(CYAN + "Contra el profesor: " + RESET);
						System.out.println("░░░░░░░░░░░░▄▄▄█▀▀▀▀▀▀▀▀█▄▄▄░░░░░░░░░░░░\r\n"
								+ "░░░░░░░░▄▄█▀▀░░░░░░░░░░░░░░▀▀█▄▄░░░░░░░░\r\n"
								+ "░░░░░░▄█▀░░░░▄▄▄▄▄▄▄░░░░░░░░░░░▀█▄░░░░░░\r\n"
								+ "░░░░▄█▀░░░▄██▄▄▄▄▄▄▄██▄░░░░▄█▀▀▀▀██▄░░░░\r\n"
								+ "░░░█▀░░░░█▀▀▀░░▄██░░▄▄█░░░██▀▀▀███▄██░░░\r\n"
								+ "░░█░░░░░░▀█▀▀▀▀▀▀▀▀▀██▀░░░▀█▀▀▀▀███▄▄█░░\r\n"
								+ "░█░░░░░░░░░▀▀█▄▄██▀▀░░░░░░░░▀▄▄▄░░░▄▄▀█░\r\n"
								+ "█▀░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀▀▀▀▀░░▀█\r\n"
								+ "█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄░░░░█\r\n"
								+ "█░░░░░░░░░░░░░░░░░░░░░░░░▄▄▄▄▄██░░▀█░░░█\r\n"
								+ "█░░░░░░░░░░░░░░█░░░▄▄▄█▀▀▀░░░▄█▀░░░░░░░█\r\n"
								+ "█░░░░░░░░░░░░░░░░░░▀░░░░░░░░█▀░░░░░░░░░█\r\n"
								+ "█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█\r\n"
								+ "░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░\r\n"
								+ "░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█░░\r\n"
								+ "░░░█▄░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄█░░░\r\n"
								+ "░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░\r\n"
								+ "░░░░░░▀█▄░░░░░░░░░░░░░░░░░░░░░░▄█▀░░░░░░\r\n" + "");

						boolean seleccionValida3 = false;
						while (!seleccionValida3) {
							try {
								// Escoge un profesor al azar
								Random rand = new Random();
								Profesor profesorAleatorio3 = (Profesor) profesoresDisponibles[rand
										.nextInt(profesoresDisponibles.length)];
								// Escoge un alumno al azar
								Padre padreAleatorio3 = (Padre) padresDisponibles[rand
										.nextInt(padresDisponibles.length)];

								// Verifica si los elementos seleccionados son nulos
								if (profesorAleatorio3 != null && padreAleatorio3 != null) {
									// Inicia el combate
									jugarCombate(profesorAleatorio3, padreAleatorio3);
									seleccionValida3 = true;
								} else {
									throw new NullPointerException(
											RED + "Se ha seleccionado un profesor o un padre nulo." + RESET);
								}
							} catch (NullPointerException e) {
								System.out.println(RED + "Se ha producido un error: " + e.getMessage());
								System.out.println("¿Quieres intentarlo de nuevo? (s/n)" + RESET);
								String respuesta3 = sc.next();
								if (!respuesta3.equalsIgnoreCase("s")) {
									seleccionValida3 = true;
								}
							}
						}
						break;

					case 4:
						System.out.println(CYAN
								+ "Lo sentimos pero actualmente no tenemos la función de dificultad disponible, próximamente "
								+ "los desarrolladores lanzarán una nueva actualización con LootBoxes y microtransacciones, "
								+ "muchas gracias por entendernos. STUDIOS JAVALAND SL");
						System.out.println("¡Comienza el combate!");
						System.out.println("");
						System.out.println("Este combate no será aleatorio");
						System.out.println("Elige un Alumno por " + RESET + PURPLE + "POSICIÓN" + RESET);
						System.out.println(
								CYAN + "Si no te acuerdas, " + RESET + PURPLE + " vuelve y mira la lista" + RESET);
						try {
							int posAlumno = sc.nextInt();
							if (posAlumno < 0 || posAlumno >= alumnosDisponibles.length) {
								throw new ArrayIndexOutOfBoundsException("Posición de alumno inválida.");
							}
							System.out.println(CYAN + "Elige un Profesor por " + RESET + PURPLE + "POSICIÓN" + RESET);
							System.out.println(CYAN + "Si no te acuerdas, vuelve y mira la lista" + RESET);
							int posProfesor = sc.nextInt();
							if (posProfesor < 0 || posProfesor >= profesoresDisponibles.length) {
								throw new ArrayIndexOutOfBoundsException("Posición de profesor inválida.");
							}
							jugarCombate(profesoresDisponibles[posProfesor], alumnosDisponibles[posAlumno]);
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("Error: " + e.getMessage());
						}
						break;

					case 5:
						System.out.println(CYAN + "Volviendo al menú principal");
						break;

					default:
						System.out.println("¡Vaya, parece que se ha equivocado..! Otra vez." + RESET);
						break;
					}
				} while (opSubMenu != 5);
				break;
			case 2:
				System.out.println(BLUE + "-------------------------------------------------------" + RESET);
				System.out.println(CYAN + "PERSONAJES DISPONIBLES" + RESET);
				System.out.println(BLUE + "-------------------------------------------------------" + RESET);
				mostrarAlumnosDisponibles((Alumno[]) alumnosDisponibles);
				mostrarProfesoresDisponibles((Profesor[]) profesoresDisponibles);
				mostrarPadresDisponibles((Padre[]) padresDisponibles);
				break;
			case 3:
				do {
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					System.out.println(CYAN + "------------------------------MENU----------------------------");
					System.out.println("1. Modificar Alumno");
					System.out.println("2. Modificar Profesor");
					System.out.println("3. Modificar Padre");
					System.out.println("4. Ir a la sección de ELIMINAR" + RESET);
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					opSubMenuModificar = sc.nextInt();

					switch (opSubMenuModificar) {
					case 1:
						System.out.println(BLUE + "SELECCIONÓ ALUMNO" + RESET);
						System.out.println(CYAN + "Diga el nombre del alumno/a que desea modificar");
						String nombreLeerA = sc.next();
						System.out.println("Diga el nuevo valor de vida (HP)");
						int vidaLeerA = sc.nextInt();
						System.out.println("Diga el nuevo valor de defensa (DFE)");
						int defensaLeerA = sc.nextInt();
						System.out.println("Diga el nuevo valor de ataque (ATK)" + RESET);
						int ataqueLeerA = sc.nextInt();
						modificarAlumno((Alumno[]) alumnosDisponibles, nombreLeerA, vidaLeerA, defensaLeerA,
								ataqueLeerA);
						break;

					case 2:
						System.out.println(BLUE + "SELECCIONÓ PROFESOR" + RESET);
						System.out.println(CYAN + "Diga el nombre del profesor/a que desea modificar");
						String nombreLeerPr = sc.next();
						System.out.println("Diga el nuevo valor de vida (HP)");
						int vidaLeerPr = sc.nextInt();
						System.out.println("Diga el nuevo valor de defensa (DFE)");
						int defensaLeerPr = sc.nextInt();
						System.out.println("Diga el nuevo valor de ataque (ATK)" + RESET);
						int ataqueLeerPr = sc.nextInt();
						modificarProfesor((Profesor[]) profesoresDisponibles, nombreLeerPr, vidaLeerPr, defensaLeerPr,
								ataqueLeerPr);
						break;

					case 3:
						System.out.println(BLUE + "SELECCIONÓ PADRE" + RESET);
						System.out.println(CYAN + "Diga el nombre del padre/madre que desea modificar");
						String nombreLeerPa = sc.next();
						System.out.println("Diga el nuevo valor de vida (HP)");
						int vidaLeerPa = sc.nextInt();
						System.out.println("Diga el nuevo valor de defensa (DFE)");
						int defensaLeerPa = sc.nextInt();
						System.out.println("Diga el nuevo valor de ataque (ATK)");
						int ataqueLeerPa = sc.nextInt();
						modificarPadre((Padre[]) padresDisponibles, nombreLeerPa, vidaLeerPa, defensaLeerPa,
								ataqueLeerPa);
						break;

					case 4:
						System.out.println("Saliendo del submenú: Modificar Personajes");
						break;

					default:
						System.out.println("Te has equivocado de opción" + RESET);
						break;
					}
				} while (opSubMenuModificar != 4);
				opPrincipal = 0;
			case 4:
				do {
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					System.out.println(CYAN + "------------------------------MENU----------------------------");
					System.out.println("1. Eliminar Alumno");
					System.out.println("2. Eliminar Profesor");
					System.out.println("3. Eliminar Padre");
					System.out.println("4. Ir a la sección AGREGAR" + RESET);
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					opSubMenuEliminar = sc.nextInt();

					switch (opSubMenuEliminar) {
					case 1:
						System.out.println(BLUE + "SELECCIONÓ ALUMNO" + RESET);
						System.out.println(CYAN + "Diga el nombre del alumno/a que desea eliminar" + RESET);
						String eliminarLeerA = sc.next();
						eliminarAlumnoPorNombre((Alumno[]) alumnosDisponibles, eliminarLeerA);
						break;

					case 2:
						System.out.println(BLUE + "SELECCIONÓ PROFESOR" + RESET);
						System.out.println(CYAN + "Diga el nombre del profesor/a que desea eliminar" + RESET);
						String eliminarLeerPr = sc.next();
						eliminarProfesorPorNombre((Profesor[]) profesoresDisponibles, eliminarLeerPr);
						break;

					case 3:
						System.out.println(BLUE + "SELECCIONÓ PADRE" + RESET);
						System.out.println(CYAN + "Diga el nombre del padre/madre que desea eliminar");
						String eliminarLeerPa = sc.next();
						eliminarPadrePorNombre((Padre[]) padresDisponibles, eliminarLeerPa);
						break;

					case 4:
						System.out.println("Saliendo del submenú: Eliminar Personajes");
						break;

					default:
						System.out.println("Te has equivocado de opción" + RESET);
						break;
					}
				} while (opSubMenuEliminar != 4);
				opPrincipal = 0;

			case 5:
				do {
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					System.out.println(CYAN + "------------------------------MENU----------------------------");
					System.out.println("1. Agregar Alumno");
					System.out.println("2. Agregar Profesor");
					System.out.println("3. Agregar Padre");
					System.out.println("4. Volver al menú principal" + RESET);
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					opSubMenuAgregar = sc.nextInt();

					switch (opSubMenuAgregar) {
					case 1:
						System.out.println(BLUE + "SELECCIONÓ ALUMNO" + RESET);
						System.out.println(CYAN + "Diga el nombre del alumno/a que desea agregar");
						String agregarNombreA = sc.next();
						System.out.println("Seleccione una vida para el alumno (Entre 90 y 120 aprox)");
						int agregarVidaA = sc.nextInt();
						System.out.println("Seleccione una defensa para el alumno (Entre 10 y 25 aprox)");
						int agregarDefensaA = sc.nextInt();
						System.out.println("Seleccione un ataque para el alumno (Entre 15 y 35 aprox)" + RESET);
						int agregarAtaqueA = sc.nextInt();

						agregarAlumno((Alumno[]) alumnosDisponibles, agregarNombreA, agregarVidaA, agregarDefensaA,
								agregarAtaqueA);
						break;

					case 2:
						System.out.println(BLUE + "SELECCIONÓ PROFESOR" + RESET);
						System.out.println(CYAN + "Diga el nombre del profesor/a que desea agregar");
						String agregarNombrePr = sc.next();
						System.out.println("Seleccione una vida para el profesor (Entre 90 y 120 aprox)");
						int agregarVidaPr = sc.nextInt();
						System.out.println("Seleccione una defensa para el profesor (Entre 10 y 25 aprox)");
						int agregarDefensaPr = sc.nextInt();
						System.out.println("Seleccione un ataque para el profesor (Entre 15 y 35 aprox)" + CYAN);
						int agregarAtaquePr = sc.nextInt();

						agregarProfesor((Profesor[]) profesoresDisponibles, agregarNombrePr, agregarVidaPr,
								agregarDefensaPr, agregarAtaquePr);
						break;

					case 3:
						System.out.println(BLUE + "SELECCIONÓ PADRE" + RESET);
						System.out.println(CYAN + "Diga el nombre del padre/madre que desea agregar");
						String agregarNombrePa = sc.next();
						System.out.println("Seleccione una vida para el alumno (Entre 90 y 120 aprox)");
						int agregarVidaPa = sc.nextInt();
						System.out.println("Seleccione una defensa para el alumno (Entre 10 y 25 aprox)");
						int agregarDefensaPa = sc.nextInt();
						System.out.println("Seleccione un ataque para el alumno (Entre 15 y 35 aprox)");
						int agregarAtaquePa = sc.nextInt();

						agregarPadre((Padre[]) padresDisponibles, agregarNombrePa, agregarVidaPa, agregarDefensaPa,
								agregarAtaquePa);
						break;

					case 4:
						System.out.println("Saliendo del submenú: Agregar Personajes");
						break;

					default:
						System.out.println("Te has equivocado de opción" + RESET);
						break;
					}
				} while (opSubMenuAgregar != 4);
				opPrincipal = 0;

				break;
			case 6:
				do {
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					System.out.println(CYAN + "------------------------------MENU----------------------------");
					System.out.println("¿ESTAS SEGURO DE QUE DESEAS SALIR?");
					System.out.println("1. Si.");
					System.out.println("2. NOOOO JODER, ESTABA PROBANDO EL PROGRAMA." + RESET);
					System.out.println(BLUE + "--------------------------------------------------------------" + RESET);
					opSubMenuSalida = sc.nextInt();

					switch (opSubMenuSalida) {
					case 1:
						System.out.println(CYAN + "Saliendo del juego... (Sleep 3)" + RESET);
						break;

					case 2:
						System.out.println(CYAN + "Sabíamos que estaba de broma, volviendo al menú principal" + RESET);

						break;
					}
				} while (opSubMenuSalida != 2);
				opPrincipal = 0;
				break;

			default:
				System.out.println("Vaya! Espero que " + "estes probando el programa y "
						+ "no que te hayas equivocado, jaja " + "seguro que es eso no..." + RESET);
				break;
			}

		} while (opPrincipal != 6);

		sc.close();

	}
	////////////////////////////
	/////////////////////////////////////
	/////////////////////////////////////////////
	/////// ////////
////////      MÉTODOS ESTÁTICOS COMUNES    //////////////
///////////                             ///////	
	//////////////////////////////////////////////
	/////////////////////////////////////

	/**
	 * Genera un número aleatorio dentro de un rango específico.
	 * 
	 * @param min El valor mínimo del rango (inclusive).
	 * @param max El valor máximo del rango (inclusive).
	 * @return Un número aleatorio dentro del rango especificado.
	 */
	public static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * Encuentra la siguiente posición libre en el array de profesores.
	 * 
	 * @param profesoresDisponibles El array de profesores en el que se buscará la
	 *                              siguiente posición libre.
	 * @return La siguiente posición libre en el array de profesores. Devuelve -1 si
	 *         no se encuentra ninguna posición libre.
	 */
	public static int siguientePosicionLibre(Profesor[] profesoresDisponibles) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] == null) {
				return i;
			}
		}
		return -1; // Si no se encuentra ninguna posición libre
	}

	/**
	 * Simula un combate entre dos jugadores.
	 * 
	 * @param jugador1 El primer jugador que participa en el combate.
	 * @param jugador2 El segundo jugador que participa en el combate.
	 */
	public static void jugarCombate(Jugador jugador1, Jugador jugador2) {
		// Bucle para simular turnos hasta que uno de los jugadores muera
		while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
			// Turno del jugador 1
			jugador1.atacar(jugador2);
			if (jugador2.getVida() <= 0) {
				System.out.println(jugador1.getNombre() + YELLOW + " ha ganado la partida." + RESET);
				return; // Terminar el juego si el jugador 2 ha perdido
			}

			// Turno del jugador 2
			jugador2.atacar(jugador1);
			if (jugador1.getVida() <= 0) {
				System.out.println(jugador2.getNombre() + YELLOW + " ha ganado la partida." + RESET);
				return; // Terminar el juego si el jugador 1 ha perdido
			}

			// Mostrar estado final de los jugadores con barra de vida
			System.out.println("\nEstado final de los jugadores:");
			mostrarBarraVida(jugador1);
			System.out.println();
			mostrarBarraVida(jugador2);
		}
	}

	/**
	 * Muestra una representación visual de la barra de vida de un jugador.
	 * 
	 * @param jugador El jugador del cual se mostrará la barra de vida.
	 */
	public static void mostrarBarraVida(Jugador jugador) {
		int vidaActual = jugador.getVida();
		int vidaTotal = 50; // Supongamos que la vida total es 100
		int porcentajeVida = vidaActual * 50 / vidaTotal;

		System.out.print(jugador.getNombre() + ": ");
		for (int i = 0; i < porcentajeVida; i++) {
			System.out.print("" + WHITE + "/" + RESET);
		}
		System.out.println(" " + porcentajeVida + "%");
	}

	////////////////////////////
	////////////////////////////////////
/////////////////////////////////////////////
///////                                  ////////
////////    MÉTODOS ESTÁTICOS PROFESOR    //////////////
////////                             ///////	
//////////////////////////////////////////////
	/////////////////////////////////////

	/**
	 * Crea un profesor con estadísticas aleatorias.
	 * 
	 * @param nombre El nombre del profesor a crear.
	 * @return Un nuevo objeto Profesor con estadísticas aleatorias.
	 */
	public static Profesor crearProfesorAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Profesor(nombre, vida, defensa, ataque);
	}

	/**
	 * Muestra el contenido del array de profesores.
	 * 
	 * @param profesoresDisponibles El array de profesores cuyo contenido se
	 *                              mostrará.
	 */
	public static void mostrarProfesoresDisponibles(Profesor[] profesoresDisponibles) {
		System.out.println("\nContenido disponible de profesores:");
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] != null) {
				System.out.println("Profesor " + (i + 1) + ": " + profesoresDisponibles[i].getNombre() + ", Vida: "
						+ profesoresDisponibles[i].getVida() + ", Defensa: " + profesoresDisponibles[i].getDefensa()
						+ ", Ataque: " + profesoresDisponibles[i].getAtaque());
			} else {
				System.out.println("Espacio libre " + (i + 1));
			}
		}
	}

	/**
	 * Agrega un nuevo profesor al array de profesores disponibles.
	 * 
	 * @param profesoresDisponibles El array de profesores al que se agregará el
	 *                              nuevo profesor.
	 * @param nombre                El nombre del nuevo profesor.
	 * @param vida                  La vida del nuevo profesor.
	 * @param defensa               La defensa del nuevo profesor.
	 * @param ataque                El ataque del nuevo profesor.
	 */
	public static void agregarProfesor(Profesor[] profesoresDisponibles, String nombre, int vida, int defensa,
			int ataque) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] == null) {
				profesoresDisponibles[i] = new Profesor(nombre, vida, defensa, ataque); // Crear un nuevo profesor en la
																						// primera posición disponible
				System.out.println("Profesor " + nombre + " agregado correctamente.");
				return;
			}
		}
		System.out.println("No se pudo agregar al profesor " + nombre + ". El array de profesores está lleno.");
	}

	/**
	 * Modifica un profesor en el array de profesores disponibles dado su nombre.
	 * 
	 * @param profesoresDisponibles El array de profesores en el que se buscará y
	 *                              modificará el profesor.
	 * @param nombre                El nombre del profesor que se desea modificar.
	 * @param nuevaVida             La nueva vida del profesor.
	 * @param nuevaDefensa          La nueva defensa del profesor.
	 * @param nuevoAtaque           El nuevo ataque del profesor.
	 */
	public static void modificarProfesor(Profesor[] profesoresDisponibles, String nombre, int nuevaVida,
			int nuevaDefensa, int nuevoAtaque) {
		int posicion = buscarProfesor(profesoresDisponibles, nombre);
		if (posicion != -1) {
			profesoresDisponibles[posicion].setVida(nuevaVida);
			profesoresDisponibles[posicion].setDefensa(nuevaDefensa);
			profesoresDisponibles[posicion].setAtaque(nuevoAtaque);
			System.out.println("Se han modificado los atributos del profesor " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún profesor con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	/**
	 * Elimina un profesor del array de profesores disponibles por su nombre.
	 * 
	 * @param profesoresDisponibles El array de profesores del cual se eliminará el
	 *                              profesor.
	 * @param nombre                El nombre del profesor que se desea eliminar.
	 */
	public static void eliminarProfesorPorNombre(Profesor[] profesoresDisponibles, String nombre) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] != null && profesoresDisponibles[i].getNombre().equals(nombre)) {
				profesoresDisponibles[i] = null; // Eliminar el profesor estableciendo su referencia a null
				System.out.println("Profesor " + nombre + " eliminado correctamente.");
				return;
			}
		}
		System.out.println("No se encontró ningún profesor con el nombre " + nombre);
	}

	/**
	 * Busca un profesor en el array de profesores disponibles por su nombre y
	 * devuelve su posición.
	 * 
	 * @param profesoresDisponibles El array de profesores en el que se buscará el
	 *                              profesor.
	 * @param nombre                El nombre del profesor que se desea buscar.
	 * @return La posición del profesor en el array. Retorna -1 si el profesor no se
	 *         encuentra en el array o si no hay posición disponible.
	 */
	private static int buscarProfesor(Profesor[] profesoresDisponibles, String nombre) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] != null && Objects.equals(profesoresDisponibles[i].getNombre(), nombre)) {
				return i;
			}
		}
		return -1; // Retorna -1 si el profesor no se encuentra en el array o si no hay posición
					// disponible
	}

	////////////////////////////
	////////////////////////////////////
	/////////////////////////////////////////////
	/////// ////////
	//////// MÉTODOS ESTÁTICOS ALUMNOS //////////////
	//////// ///////
//////////////////////////////////////////////
/////////////////////////////////////

	/**
	 * Crea un alumno con estadísticas aleatorias.
	 * 
	 * @param nombre El nombre del alumno a crear.
	 * @return Un nuevo objeto Alumno con estadísticas aleatorias.
	 */
	public static Alumno crearAlumnoAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Alumno(nombre, vida, defensa, ataque);
	}

	/**
	 * Muestra el contenido del array de alumnos.
	 * 
	 * @param alumnosDisponibles El array de alumnos cuyo contenido se mostrará.
	 */
	public static void mostrarAlumnosDisponibles(Alumno[] alumnosDisponibles) {
		System.out.println("\nContenido disponible de alumnos:");
		for (int i = 0; i < alumnosDisponibles.length; i++) {
			if (alumnosDisponibles[i] != null) {
				System.out.println("Alumno " + (i + 1) + ": " + alumnosDisponibles[i].getNombre() + ", Vida: "
						+ alumnosDisponibles[i].getVida() + ", Defensa: " + alumnosDisponibles[i].getDefensa()
						+ ", Ataque: " + alumnosDisponibles[i].getAtaque());
			} else {
				System.out.println("Espacio libre " + (i + 1));
			}
		}
	}

	/**
	 * Agrega un nuevo alumno al array de alumnos disponibles.
	 * 
	 * @param alumnosDisponibles El array de alumnos al que se agregará el nuevo
	 *                           alumno.
	 * @param nombre             El nombre del nuevo alumno.
	 * @param vida               La vida del nuevo alumno.
	 * @param defensa            La defensa del nuevo alumno.
	 * @param ataque             El ataque del nuevo alumno.
	 */
	public static void agregarAlumno(Alumno[] alumnosDisponibles, String nombre, int vida, int defensa, int ataque) {
		for (int i = 0; i < alumnosDisponibles.length; i++) {
			if (alumnosDisponibles[i] == null) {
				alumnosDisponibles[i] = new Alumno(nombre, vida, defensa, ataque); // Crear un nuevo alumno en la
																					// primera posición disponible
				System.out.println("Alumno " + nombre + " agregado correctamente.");
				return;
			}
		}
		System.out.println("No se pudo agregar al alumno " + nombre + ". El array de alumnos está lleno.");
	}

	/**
	 * Modifica un alumno en el array de alumnos dado su nombre.
	 * 
	 * @param alumnos      El array de alumnos en el que se buscará y modificará el
	 *                     alumno.
	 * @param nombre       El nombre del alumno que se desea modificar.
	 * @param nuevaVida    La nueva vida del alumno.
	 * @param nuevaDefensa La nueva defensa del alumno.
	 * @param nuevoAtaque  El nuevo ataque del alumno.
	 */
	public static void modificarAlumno(Alumno[] alumnos, String nombre, int nuevaVida, int nuevaDefensa,
			int nuevoAtaque) {
		int posicion = buscarAlumno(alumnos, nombre);
		if (posicion != -1) {
			alumnos[posicion].setVida(nuevaVida);
			alumnos[posicion].setDefensa(nuevaDefensa);
			alumnos[posicion].setAtaque(nuevoAtaque);
			System.out.println("Se han modificado los atributos del alumno " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún alumno con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	/**
	 * Elimina un alumno del array de alumnos disponibles por su nombre.
	 * 
	 * @param alumnosDisponibles El array de alumnos del cual se eliminará el
	 *                           alumno.
	 * @param nombre             El nombre del alumno que se desea eliminar.
	 */
	public static void eliminarAlumnoPorNombre(Alumno[] alumnosDisponibles, String nombre) {
		for (int i = 0; i < alumnosDisponibles.length; i++) {
			if (alumnosDisponibles[i] != null && alumnosDisponibles[i].getNombre().equals(nombre)) {
				alumnosDisponibles[i] = null; // Eliminar el alumno estableciendo su referencia a null
				System.out.println("Alumno " + nombre + " eliminado correctamente.");
				return;
			}
		}
		System.out.println("No se encontró ningún alumno con el nombre " + nombre);
	}

	/**
	 * Busca un alumno en el array de alumnos dado su nombre y devuelve su posición.
	 * 
	 * @param alumnos El array de alumnos en el que se buscará el alumno.
	 * @param nombre  El nombre del alumno que se desea buscar.
	 * @return La posición del alumno en el array. Retorna -1 si el alumno no se
	 *         encuentra en el array o si no hay posición disponible.
	 */
	private static int buscarAlumno(Alumno[] alumnos, String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && Objects.equals(alumnos[i].getNombre(), nombre)) {
				return i;
			}
		}
		return -1; // Retorna -1 si el alumno no se encuentra en el array o si no hay posición
					// disponible
	}

	////////////////////////////
	////////////////////////////////////
	/////////////////////////////////////////////
	/////// ////////
////////    MÉTODOS ESTÁTICOS PADRES    //////////////
	//////// ///////
	//////////////////////////////////////////
	////////////////////////////////////

	/**
	 * Crea un padre con estadísticas aleatorias.
	 * 
	 * @param nombre El nombre del padre a crear.
	 * @return Un nuevo objeto Padre con estadísticas aleatorias.
	 */
	public static Padre crearPadreAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Padre(nombre, vida, defensa, ataque);
	}

	/**
	 * Muestra el contenido del array de padres.
	 * 
	 * @param padresDisponibles El array de padres cuyo contenido se mostrará.
	 */
	public static void mostrarPadresDisponibles(Padre[] padresDisponibles) {
		System.out.println("\nContenido disponible de padres:");
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] != null) {
				System.out.println("Padre " + (i + 1) + ": " + padresDisponibles[i].getNombre() + ", Vida: "
						+ padresDisponibles[i].getVida() + ", Defensa: " + padresDisponibles[i].getDefensa()
						+ ", Ataque: " + padresDisponibles[i].getAtaque());
			} else {
				System.out.println("Espacio libre " + (i + 1));
			}
		}
	}

	/**
	 * Agrega un nuevo padre al array de padres disponibles.
	 * 
	 * @param padresDisponibles El array de padres al que se agregará el nuevo
	 *                          padre.
	 * @param nombre            El nombre del nuevo padre.
	 * @param vida              La vida del nuevo padre.
	 * @param defensa           La defensa del nuevo padre.
	 * @param ataque            El ataque del nuevo padre.
	 */
	public static void agregarPadre(Padre[] padresDisponibles, String nombre, int vida, int defensa, int ataque) {
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] == null) {
				padresDisponibles[i] = new Padre(nombre, vida, defensa, ataque); // Crear un nuevo padre en la primera
																					// posición disponible
				System.out.println("Padre/Madre " + nombre + " agregado correctamente.");
				return;
			}
		}
		System.out.println("No se pudo agregar al padre/madre " + nombre + ". El array de padres está lleno.");
	}

	/**
	 * Modifica un padre en el array de padres dados su nombre.
	 * 
	 * @param padresDisponibles El array de padres en el que se buscará y modificará
	 *                          el padre.
	 * @param nombre            El nombre del padre que se desea modificar.
	 * @param nuevaVida         La nueva vida del padre.
	 * @param nuevaDefensa      La nueva defensa del padre.
	 * @param nuevoAtaque       El nuevo ataque del padre.
	 */
	public static void modificarPadre(Padre[] padresDisponibles, String nombre, int nuevaVida, int nuevaDefensa,
			int nuevoAtaque) {
		int posicion = buscarPadre(padresDisponibles, nombre);
		if (posicion != -1) {
			padresDisponibles[posicion].setVida(nuevaVida);
			padresDisponibles[posicion].setDefensa(nuevaDefensa);
			padresDisponibles[posicion].setAtaque(nuevoAtaque);
			System.out.println("Se han modificado los atributos del padre/madre " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún padre/madre con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	/**
	 * Elimina un padre del array de padres disponibles por su nombre.
	 * 
	 * @param padresDisponibles El array de padres del cual se eliminará el padre.
	 * @param nombre            El nombre del padre que se desea eliminar.
	 */
	public static void eliminarPadrePorNombre(Padre[] padresDisponibles, String nombre) {
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] != null && padresDisponibles[i].getNombre().equals(nombre)) {
				padresDisponibles[i] = null; // Eliminar el padre estableciendo su referencia a null
				System.out.println("Padre/Madre " + nombre + " eliminado correctamente.");
				return;
			}
		}
		System.out.println("No se encontró ningún padre/madre con el nombre " + nombre);
	}

	/**
	 * Busca un padre en el array de padres dado su nombre y devuelve su posición.
	 * 
	 * @param padresDisponibles El array de padres en el que se buscará el padre.
	 * @param nombre            El nombre del padre que se desea buscar.
	 * @return La posición del padre en el array. Retorna -1 si el padre no se
	 *         encuentra en el array o si no hay posición disponible.
	 */
	private static int buscarPadre(Padre[] padresDisponibles, String nombre) {
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] != null && Objects.equals(padresDisponibles[i].getNombre(), nombre)) {
				return i;
			}
		}
		return -1; // Retorna -1 si el padre no se encuentra en el array o si no hay posición
					// disponible
	}

}
