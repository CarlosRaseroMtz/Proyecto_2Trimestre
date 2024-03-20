package juego_app;

import java.util.Random;

//Clase Habilidad
public class Habilidad {
 private String nombre;
 private int poder;
 private int penalizacionDefensa;
 private double probabilidadCritico; // Probabilidad de un golpe crítico (0 a 1)

 public Habilidad(String nombre, int poder, int penalizacionDefensa, double probabilidadCritico) {
     this.nombre = nombre;
     this.poder = poder;
     this.penalizacionDefensa = penalizacionDefensa;
     this.probabilidadCritico = probabilidadCritico;
 }

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public int getPoder() {
     return poder;
 }

 public void setPoder(int poder) {
     this.poder = poder;
 }

 public int getPenalizacionDefensa() {
     return penalizacionDefensa;
 }

 public void setPenalizacionDefensa(int penalizacionDefensa) {
     this.penalizacionDefensa = penalizacionDefensa;
 }

 public double getProbabilidadCritico() {
     return probabilidadCritico;
 }

 public void setProbabilidadCritico(double probabilidadCritico) {
     this.probabilidadCritico = probabilidadCritico;
 }

 // Método para aplicar el efecto de la habilidad
 public void aplicarEfecto(Jugador atacante, Jugador objetivo) {
     Random random = new Random();
     double probabilidad = random.nextDouble(); // Generar un número aleatorio entre 0 y 1
     if (probabilidad <= probabilidadCritico) { // Si el número está dentro de la probabilidad de crítico
         // Golpe crítico: incrementar el poder del ataque
         objetivo.setVida(objetivo.getVida() - this.poder * 2); // Doble de daño
         System.out.println("¡Golpe crítico!");
     } else {
         // Ataque normal
         objetivo.setVida(objetivo.getVida() - this.poder);
     }
     objetivo.setDefensa(objetivo.getDefensa() + this.penalizacionDefensa);
     if (objetivo.getVida() <= 0) {
         System.out.println(objetivo.getNombre() + " ha sido derrotado.");
     }
 }
}