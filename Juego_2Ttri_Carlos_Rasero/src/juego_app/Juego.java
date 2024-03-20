package juego_app;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Juego {

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
			System.out.println("--------------------------------------------------------------");
			System.out.println("------------------------------MENU----------------------------");
			System.out.println("1. Jugar");
			System.out.println("2. Ver Personajes disponibles");
			System.out.println("3. Modificar Personaje");
			System.out.println("4. Eliminar Personaje");
			System.out.println("5. Crear Personaje");
			System.out.println("6. Salir del juego");
			System.out.println("--------------------------------------------------------------");

			opPrincipal = sc.nextInt();

			switch (opPrincipal) {
			case 1:
				do {
					System.out.println("--------------------------------------------------------------");
					System.out.println("------------------------------MENU----------------------------");
					System.out.println("Por favor, escoja una dificultad");
					System.out.println("1. NIVEL DE DIFICULTAD: Fácil");
					System.out.println("2. NIVEL DE DIFICULTAD: Medio");
					System.out.println("3. NIVEL DE DIFICULTAD: Difícil");
					System.out.println("4. NIVEL DE DIFICULTAD: Jugador de Pokemon");
					System.out.println("5. Volver al menú principal");
					System.out.println("--------------------------------------------------------------");
					opSubMenu = sc.nextInt();

					switch (opSubMenu) {
					case 1:
					    System.out.println("Esto es un combate aleatorio entre un alumno y un profesor");
					    System.out.println("¡Comienza el combate!");
					    System.out.println("");

					    boolean seleccionValida = false;
					    while (!seleccionValida) {
					        try {
					            // Escoge un profesor al azar
					            Random rand = new Random();
					            Profesor profesorAleatorio = (Profesor) profesoresDisponibles[rand.nextInt(profesoresDisponibles.length)];
					            // Escoge un alumno al azar
					            Alumno alumnoAleatorio = (Alumno) alumnosDisponibles[rand.nextInt(alumnosDisponibles.length)];
					            
					            // Verifica si los elementos seleccionados son nulos
					            if (profesorAleatorio != null && alumnoAleatorio != null) {
					                // Inicia el combate
					                jugarCombate(profesorAleatorio, alumnoAleatorio);
					                seleccionValida = true;
					            } else {
					                throw new NullPointerException("Se ha seleccionado un profesor o un alumno nulo.");
					            }
					        } catch (NullPointerException e) {
					            System.out.println("Se ha producido un error: " + e.getMessage());
					            System.out.println("¿Quieres intentarlo de nuevo? (s/n)");
					            String respuesta = sc.next();
					            if (!respuesta.equalsIgnoreCase("s")) {
					                seleccionValida = true;
					            }
					        }
					    }
					    break;

					case 2:
						System.out.println(
								"Lo sentimos pero actualmente no tenemos la función de dificultad disponible, próximamente "
										+ "los desarrolladores lanzarán una nueva actualización con LootBoxes y microtransacciones, "
										+ "muchas gracias por entendernos. STUDIOS JAVALAND SL");
						System.out.println("");
						System.out.println("Esto es un combate aleatorio entre un padre y un alumno");

						System.out.println("¡Comienza el combate!");
						System.out.println("");
						// Escoge un profesor al azar
						Random rand2 = new Random();
						Padre padreAleatorio2 = (Padre) padresDisponibles[rand2.nextInt(padresDisponibles.length)];
						// Escoge un alumno al azar
						Alumno alumnoAleatorio2 = (Alumno) alumnosDisponibles[rand2.nextInt(alumnosDisponibles.length)];
						// Inicia el combate
						jugarCombate(padreAleatorio2, alumnoAleatorio2);
						break;

					case 3:
						System.out.println("Esto es un combate aleatorio entre un profesor y un padre");
						System.out.println("¡Comienza el combate!");
						System.out.println("");

						// Escoge un profesor al azar
						Random rand3 = new Random();
						try {
							Padre padreAleatorio3 = (Padre) padresDisponibles[rand3.nextInt(padresDisponibles.length)];
							// Escoge un alumno al azar
							Profesor profesorAleatorio3 = (Profesor) profesoresDisponibles[rand3
									.nextInt(profesoresDisponibles.length)];
							// Inicia el combate
							jugarCombate(padreAleatorio3, profesorAleatorio3);
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("Error: " + e.getMessage());
						}
						break;

					case 4:
						System.out.println(
								"Lo sentimos pero actualmente no tenemos la función de dificultad disponible, próximamente "
										+ "los desarrolladores lanzarán una nueva actualización con LootBoxes y microtransacciones, "
										+ "muchas gracias por entendernos. STUDIOS JAVALAND SL");
						System.out.println("¡Comienza el combate!");
						System.out.println("");
						System.out.println("Este combate no será aleatorio");
						System.out.println("Elige un Alumno por POSICIÓN");
						System.out.println("Si no te acuerdas, vuelve y mira la lista");
						try {
							int posAlumno = sc.nextInt();
							if (posAlumno < 0 || posAlumno >= alumnosDisponibles.length) {
								throw new ArrayIndexOutOfBoundsException("Posición de alumno inválida.");
							}
							System.out.println("Elige un Profesor por POSICIÓN");
							System.out.println("Si no te acuerdas, vuelve y mira la lista");
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
						System.out.println("Volviendo al menú principal");
						break;

					default:
						System.out.println("¡Vaya, parece que se ha equivocado..! Otra vez.");
						break;
					}
				} while (opSubMenu != 5);
				break;
			case 2:
				System.out.println("-------------------------------------------------------");
				System.out.println("PERSONAJES DISPONIBLES");
				System.out.println("-------------------------------------------------------");
				mostrarAlumnosDisponibles((Alumno[]) alumnosDisponibles);
				mostrarProfesoresDisponibles((Profesor[]) profesoresDisponibles);
				mostrarPadresDisponibles((Padre[]) padresDisponibles);
				break;
			case 3:
				do {
					System.out.println("--------------------------------------------------------------");
					System.out.println("------------------------------MENU----------------------------");
					System.out.println("1. Modificar Alumno");
					System.out.println("2. Modificar Profesor");
					System.out.println("3. Modificar Padre");
					System.out.println("4. Ir a la sección de ELIMINAR");
					System.out.println("--------------------------------------------------------------");
					opSubMenuModificar = sc.nextInt();

					switch (opSubMenuModificar) {
					case 1:
						System.out.println("SELECCIONÓ ALUMNO");
						System.out.println("Diga el nombre del alumno/a que desea modificar");
						String nombreLeerA = sc.next();
						System.out.println("Diga el nuevo valor de vida (HP)");
						int vidaLeerA = sc.nextInt();
						System.out.println("Diga el nuevo valor de defensa (DFE)");
						int defensaLeerA = sc.nextInt();
						System.out.println("Diga el nuevo valor de ataque (ATK)");
						int ataqueLeerA = sc.nextInt();
						modificarAlumno((Alumno[]) alumnosDisponibles, nombreLeerA, vidaLeerA, defensaLeerA,
								ataqueLeerA);
						break;

					case 2:
						System.out.println("SELECCIONÓ PROFESOR");
						System.out.println("Diga el nombre del profesor/a que desea modificar");
						String nombreLeerPr = sc.next();
						System.out.println("Diga el nuevo valor de vida (HP)");
						int vidaLeerPr = sc.nextInt();
						System.out.println("Diga el nuevo valor de defensa (DFE)");
						int defensaLeerPr = sc.nextInt();
						System.out.println("Diga el nuevo valor de ataque (ATK)");
						int ataqueLeerPr = sc.nextInt();
						modificarProfesor((Profesor[]) profesoresDisponibles, nombreLeerPr, vidaLeerPr, defensaLeerPr,
								ataqueLeerPr);
						break;

					case 3:
						System.out.println("SELECCIONÓ PADRE");
						System.out.println("Diga el nombre del padre/madre que desea modificar");
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
						System.out.println("Te has equivocado de opción");
						break;
					}
				} while (opSubMenuModificar != 4);
				opPrincipal = 0;
			case 4:
				do {
					System.out.println("--------------------------------------------------------------");
					System.out.println("------------------------------MENU----------------------------");
					System.out.println("1. Eliminar Alumno");
					System.out.println("2. Eliminar Profesor");
					System.out.println("3. Eliminar Padre");
					System.out.println("4. Ir a la sección AGREGAR");
					System.out.println("--------------------------------------------------------------");
					opSubMenuEliminar = sc.nextInt();

					switch (opSubMenuEliminar) {
					case 1:
						System.out.println("SELECCIONÓ ALUMNO");
						System.out.println("Diga el nombre del alumno/a que desea eliminar");
						String eliminarLeerA = sc.next();
						eliminarAlumnoPorNombre((Alumno[]) alumnosDisponibles, eliminarLeerA);
						break;

					case 2:
						System.out.println("SELECCIONÓ PROFESOR");
						System.out.println("Diga el nombre del profesor/a que desea eliminar");
						String eliminarLeerPr = sc.next();
						eliminarProfesorPorNombre((Profesor[]) profesoresDisponibles, eliminarLeerPr);
						break;

					case 3:
						System.out.println("SELECCIONÓ PADRE");
						System.out.println("Diga el nombre del padre/madre que desea eliminar");
						String eliminarLeerPa = sc.next();
						eliminarPadrePorNombre((Padre[]) padresDisponibles, eliminarLeerPa);
						break;

					case 4:
						System.out.println("Saliendo del submenú: Eliminar Personajes");
						break;

					default:
						System.out.println("Te has equivocado de opción");
						break;
					}
				} while (opSubMenuEliminar != 4);
				opPrincipal = 0;

			case 5:
				do {
					System.out.println("--------------------------------------------------------------");
					System.out.println("------------------------------MENU----------------------------");
					System.out.println("1. Agregar Alumno");
					System.out.println("2. Agregar Profesor");
					System.out.println("3. Agregar Padre");
					System.out.println("4. Volver al menú principal");
					System.out.println("--------------------------------------------------------------");
					opSubMenuAgregar = sc.nextInt();

					switch (opSubMenuAgregar) {
					case 1:
						System.out.println("SELECCIONÓ ALUMNO");
						System.out.println("Diga el nombre del alumno/a que desea agregar");
						String agregarNombreA = sc.next();
						System.out.println("Seleccione una vida para el alumno (Entre 90 y 120 aprox)");
						int agregarVidaA = sc.nextInt();
						System.out.println("Seleccione una defensa para el alumno (Entre 10 y 25 aprox)");
						int agregarDefensaA = sc.nextInt();
						System.out.println("Seleccione un ataque para el alumno (Entre 15 y 35 aprox)");
						int agregarAtaqueA = sc.nextInt();

						agregarAlumno((Alumno[]) alumnosDisponibles, agregarNombreA, agregarVidaA, agregarDefensaA,
								agregarAtaqueA);
						break;

					case 2:
						System.out.println("SELECCIONÓ PROFESOR");
						System.out.println("Diga el nombre del profesor/a que desea agregar");
						String agregarNombrePr = sc.next();
						System.out.println("Seleccione una vida para el profesor (Entre 90 y 120 aprox)");
						int agregarVidaPr = sc.nextInt();
						System.out.println("Seleccione una defensa para el profesor (Entre 10 y 25 aprox)");
						int agregarDefensaPr = sc.nextInt();
						System.out.println("Seleccione un ataque para el profesor (Entre 15 y 35 aprox)");
						int agregarAtaquePr = sc.nextInt();

						agregarProfesor((Profesor[]) profesoresDisponibles, agregarNombrePr, agregarVidaPr,
								agregarDefensaPr, agregarAtaquePr);
						break;

					case 3:
						System.out.println("SELECCIONÓ PADRE");
						System.out.println("Diga el nombre del padre/madre que desea agregar");
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
						System.out.println("Te has equivocado de opción");
						break;
					}
				} while (opSubMenuAgregar != 4);
				opPrincipal = 0;

				break;
			case 6:
				do {
					System.out.println("--------------------------------------------------------------");
					System.out.println("------------------------------MENU----------------------------");
					System.out.println("¿ESTAS SEGURO DE QUE DESEAS SALIR?");
					System.out.println("1. Si.");
					System.out.println("2. NOOOO JODER, ESTABA PROBANDO EL PROGRAMA.");
					System.out.println("--------------------------------------------------------------");
					opSubMenuSalida = sc.nextInt();

					switch (opSubMenuSalida) {
					case 1:
						System.out.println("Saliendo del juego... (Sleep 3)");
						break;

					case 2:
						System.out.println("Sabíamos que estaba de broma, volviendo al menú principal");

						break;
					}
				} while (opSubMenuSalida != 2);
				opPrincipal = 0;
				break;

			default:
				System.out.println("Vaya! Espero que " + "estes probando el programa y "
						+ "no que te hayas equivocado, jaja " + "seguro que es eso no...");
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

	// Método para generar un número aleatorio en un rango específico
	public static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	// Método para encontrar la siguiente posición libre en el array de profesores
	public static int siguientePosicionLibre(Profesor[] profesoresDisponibles) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] == null) {
				return i;
			}
		}
		return -1; // Si no se encuentra ninguna posición libre

	}

	public static void jugarCombate(Jugador jugador1, Jugador jugador2) {
		// Bucle para simular turnos hasta que uno de los jugadores muera
		while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
			// Turno del jugador 1
			jugador1.atacar(jugador2);
			if (jugador2.getVida() <= 0) {
				System.out.println(jugador1.getNombre() + " ha ganado la partida.");
				return; // Terminar el juego si el jugador 2 ha perdido
			}

			// Turno del jugador 2
			jugador2.atacar(jugador1);
			if (jugador1.getVida() <= 0) {
				System.out.println(jugador2.getNombre() + " ha ganado la partida.");
				return; // Terminar el juego si el jugador 1 ha perdido
			}

			// Mostrar estado final de los jugadores con barra de vida
			System.out.println("\nEstado final de los jugadores:");
			mostrarBarraVida(jugador1);
			System.out.println();
			mostrarBarraVida(jugador2);
		}

	}

	public static void mostrarBarraVida(Jugador jugador) {
		int vidaActual = jugador.getVida();
		int vidaTotal = 50; // Supongamos que la vida total es 100
		int porcentajeVida = vidaActual * 50 / vidaTotal;

		System.out.print(jugador.getNombre() + ": ");
		for (int i = 0; i < porcentajeVida; i++) {
			System.out.print("/");
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

	// Método para crear un profesor con estadísticas aleatorias
	public static Profesor crearProfesorAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Profesor(nombre, vida, defensa, ataque);
	}

	// Mostrar el contenido del array
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

	// Método estático para agregar un nuevo profesor al array
	public static void agregarProfesor(Profesor[] profesoresDisponibles, String nombre, int vida, int defensa,
			int ataque) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] == null) {
				profesoresDisponibles[i] = new Profesor(nombre, vida, defensa, ataque); // Crear un nuevo alumno en la
				// primera posición disponible
				System.out.println("Profesor " + nombre + " agregado correctamente.");
				return;
			}
		}
		System.out.println("No se pudo agregar al profesor " + nombre + ". El array de alumnos está lleno.");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Método estático para modificar un alumno dado su nombre
	public static void modificarProfesor(Profesor[] profesoresDisponibles, String nombre, int nuevaVida,
			int nuevaDefensa, int nuevoAtaque) {
		int posicion = buscarProfesor(profesoresDisponibles, nombre);
		if (posicion != -1) {
			profesoresDisponibles[posicion].vida = nuevaVida;
			profesoresDisponibles[posicion].defensa = nuevaDefensa;
			profesoresDisponibles[posicion].ataque = nuevoAtaque;
			System.out.println("Se han modificado los atributos del profesor " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún profesor con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	// Método estático para eliminar un profesor del array por nombre
	public static void eliminarProfesorPorNombre(Profesor[] profesoresDisponibles, String nombre) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] != null && profesoresDisponibles[i].getNombre().equals(nombre)) {
				profesoresDisponibles[i] = null; // Eliminar el alumno estableciendo su referencia a null
				System.out.println("Profesor " + nombre + " eliminado correctamente.");
				return;
			}
		}
		System.out.println("No se encontró ningún profesor con el nombre " + nombre);
	}

	// Método auxiliar para buscar un alumno dado su nombre y devolver su posición
	// en el array
	private static int buscarProfesor(Profesor[] profesoresDisponibles, String nombre) {
		for (int i = 0; i < profesoresDisponibles.length; i++) {
			if (profesoresDisponibles[i] != null && Objects.equals(profesoresDisponibles[i].nombre, nombre)) {
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
	//////// MÉTODOS ESTÁTICOS ALUMNOS //////////////
	//////// ///////
//////////////////////////////////////////////
/////////////////////////////////////

	// Método para crear un alumno con estadísticas aleatorias
	public static Alumno crearAlumnoAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Alumno(nombre, vida, defensa, ataque);
	}

	// Mostrar el contenido del array
	public static void mostrarAlumnosDisponibles(Alumno[] alumnosDisponibles) {
		System.out.println("\nContenido disponible de alumnos:");
		for (int i = 0; i < alumnosDisponibles.length; i++) {
			if (alumnosDisponibles[i] != null) {
				System.out.println("Profesor " + (i + 1) + ": " + alumnosDisponibles[i].getNombre() + ", Vida: "
						+ alumnosDisponibles[i].getVida() + ", Defensa: " + alumnosDisponibles[i].getDefensa()
						+ ", Ataque: " + alumnosDisponibles[i].getAtaque());
			} else {
				System.out.println("Espacio libre " + (i + 1));
			}
		}
	}

	// Método estático para agregar un nuevo alumno al array
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

	// Método estático para modificar un alumno dado su nombre
	public static void modificarAlumno(Alumno[] alumnos, String nombre, int nuevaVida, int nuevaDefensa,
			int nuevoAtaque) {
		int posicion = buscarAlumno(alumnos, nombre);
		if (posicion != -1) {
			alumnos[posicion].vida = nuevaVida;
			alumnos[posicion].defensa = nuevaDefensa;
			alumnos[posicion].ataque = nuevoAtaque;
			System.out.println("Se han modificado los atributos del alumno " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún alumno con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	// Método estático para eliminar un alumno del array por nombre
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

	// Método auxiliar para buscar un alumno dado su nombre y devolver su posición
	// en el array
	private static int buscarAlumno(Alumno[] alumnos, String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && Objects.equals(alumnos[i].nombre, nombre)) {
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

	// Método para crear un padre con estadísticas aleatorias
	public static Padre crearPadreAleatorio(String nombre) {
		int vida = generarNumeroAleatorio(80, 120);
		int defensa = generarNumeroAleatorio(15, 25);
		int ataque = generarNumeroAleatorio(20, 35);
		return new Padre(nombre, vida, defensa, ataque);
	}

	// Mostrar el contenido del array
	public static void mostrarPadresDisponibles(Padre[] padresDisponibles) {
		System.out.println("\nContenido disponible de padres:");
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] != null) {
				System.out.println("Profesor " + (i + 1) + ": " + padresDisponibles[i].getNombre() + ", Vida: "
						+ padresDisponibles[i].getVida() + ", Defensa: " + padresDisponibles[i].getDefensa()
						+ ", Ataque: " + padresDisponibles[i].getAtaque());
			} else {
				System.out.println("Espacio libre " + (i + 1));
			}
		}
	}

	// Método estático para agregar un nuevo padre al array
	public static void agregarPadre(Padre[] padresDisponibles, String nombre, int vida, int defensa, int ataque) {
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] == null) {
				padresDisponibles[i] = new Padre(nombre, vida, defensa, ataque); // Crear un nuevo alumno en la
																					// primera posición disponible
				System.out.println("Padre/Madre " + nombre + " agregado correctamente.");
				return;
			}
		}
		System.out.println("No se pudo agregar al alumno " + nombre + ". El array de alumnos está lleno.");
	}

	// Método estático para modificar un alumno dado su nombre
	public static void modificarPadre(Padre[] padresDisponibles, String nombre, int nuevaVida, int nuevaDefensa,
			int nuevoAtaque) {
		int posicion = buscarPadre(padresDisponibles, nombre);
		if (posicion != -1) {
			padresDisponibles[posicion].vida = nuevaVida;
			padresDisponibles[posicion].defensa = nuevaDefensa;
			padresDisponibles[posicion].ataque = nuevoAtaque;
			System.out.println("Se han modificado los atributos del padre/madre " + nombre);
		} else {
			System.out.println(
					"No se ha encontrado ningún padre/madre con el nombre proporcionado o no hay posición disponible en el array.");
		}
	}

	// Método estático para eliminar un padre del array por nombre
	public static void eliminarPadrePorNombre(Padre[] padresDisponibles, String nombre) {
		for (int i = 0; i < padresDisponibles.length; i++) {
			if (padresDisponibles[i] != null && padresDisponibles[i].getNombre().equals(nombre)) {
				padresDisponibles[i] = null; // Eliminar el alumno estableciendo su referencia a null
				System.out.println("Padre/Madre " + nombre + " eliminado correctamente.");
				return;
			}
		}
		System.out.println("No se encontró ningún profesor con el nombre " + nombre);
	}

	// Método auxiliar para buscar un alumno dado su nombre y devolver su posición
	// en el array
	private static int buscarPadre(Padre[] alumnosDisponibles, String nombre) {
		for (int i = 0; i < alumnosDisponibles.length; i++) {
			if (alumnosDisponibles[i] != null && Objects.equals(alumnosDisponibles[i].nombre, nombre)) {
				return i;
			}
		}
		return -1; // Retorna -1 si el alumno no se encuentra en el array o si no hay posición
					// disponible
	}
}
