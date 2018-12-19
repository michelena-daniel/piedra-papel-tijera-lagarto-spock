package com.liceolapaz.des.DRM;

import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// escribir menú y pedir opcion
		escribirMenu();
		//leer opcion
		int opcion = leerOpcion();
		// comprobar opcion y realizar tarea
		while(true) {
		switch (opcion) {
		case 1:
			// generar una de las 5 jugadas posibles
			int min = 1;
			int max = 5;
			jugar(min, max);
			int numeroGenerado = jugar(min, max);
			// pedir jugada del jugador
			pedirJugada();
			int opcion2 = leerOpcion();
			mostrarJugada(numeroGenerado, opcion2);
			comprobarGanador(numeroGenerado, opcion2);
			break;
			
		case 0:
			System.out.println("\r\nGracias por jugar.");
			System.exit(0);
			break;
		default:
			System.out.println("\r\nEsa opción no es válida.");
			break;
		}
		}
		
			

	}

	private static void mostrarJugada(int numeroGenerado, int opcion2) {
		if (numeroGenerado == 1) {
			System.out.println("La máquina ha sacado piedra.");
		}else if (numeroGenerado == 2) {
			System.out.println("La máquina ha sacado papel.");
		}else if (numeroGenerado == 3) {
			System.out.println("La máquina ha sacado tijeras.");
		}else if (numeroGenerado == 4) {
			System.out.println("La máquina ha sacado lagarto.");
		}else {
			System.out.println("La máquina ha sacado Spock.");
		}
		
		if (opcion2 == 1) {
			System.out.print("El jugador ha sacado piedra.");
		}else if (opcion2 == 2) {
			System.out.print("El jugador ha sacado papel.");
		}else if (opcion2 == 3) {
			System.out.print("El jugador ha sacado tijeras.");
		}else if (opcion2 == 4) {
			System.out.print("El jugador ha sacado lagarto.");
		}else
			System.out.println("El jugador ha sacado Spock.");		
	}

	private static void comprobarGanador(int numeroGenerado, int opcion2) {
		if(numeroGenerado == opcion2){
			System.out.println("\r\nEmpate.");
		// ordenador saca piedra
		}else if (numeroGenerado == 1 && opcion2 == 2) {
			System.out.println("\r\nPapel tapa a piedra, ¡Victoria!");
			
		}else if (numeroGenerado == 1 && opcion2 == 3) {
			System.out.println("\r\nPiedra aplasta a tijeras, has sido derrotado.");			
		}else if (numeroGenerado == 1 && opcion2 == 4) {
			System.out.println("\r\nPiedra aplasta a lagarto, has sido derrotado.");
		}else if (numeroGenerado == 1 && opcion2 == 5) {
			System.out.println("\r\nSpock vaporiza a piedra, ¡Victoria!");
		// ordenador saca papel
		}else if (numeroGenerado == 2 && opcion2 == 1) {
			System.out.println("\r\nPapel tapa a piedra, has sido derrotado.");			
		}else if (numeroGenerado == 2 && opcion2 == 3) {
			System.out.println("\r\nTijeras cortan papel, ¡Victoria!");
		}else if (numeroGenerado == 2 && opcion2 == 4) {
			System.out.println("\r\nLagarto devora papel, ¡Victoria!");
		}else if (numeroGenerado == 2 && opcion2 == 5) {
			System.out.println("\r\nPapel desautoriza a Spock, has sido derrotado");
		// ordenador saca tijeras
		}else if (numeroGenerado == 3 && opcion2 == 1) {
			System.out.println("\r\nPiedra aplasta a tijeras, ¡Victoria!");
		}else if (numeroGenerado == 3 && opcion2 == 2) {
			System.out.println("\r\nTijeras cortan papel, has sido derrotado.");			
		}else if (numeroGenerado == 3 && opcion2 == 4) {
			System.out.println("\r\nTijeras decapitan lagarto, has sido derrotado.");
		}else if (numeroGenerado == 3 && opcion2 == 5) {
			System.out.println("\r\nSpock rompe tijeras, ¡Victoria!");
		// ordenador saca lagarto
		}else if (numeroGenerado == 4 && opcion2 == 1) {
			System.out.println("\r\nPiedra aplasta a lagarto, ¡Victoria!");
		}else if (numeroGenerado == 4 && opcion2 == 2) {
			System.out.println("\r\nLagarto devora papel, has sido derrotado.");
		}else if (numeroGenerado == 4 && opcion2 == 3) {
			System.out.println("\r\nTijeras decapitan a lagarto, ¡Victoria!");
		}else if (numeroGenerado == 4 && opcion2 == 5) {
			System.out.println("\r\nLagarto envenena a Spock, has sido derrotado.");
		// ordenador saca spock
		}else if (numeroGenerado == 5 && opcion2 == 1) {
			System.out.println("\r\nSpock vaporiza piedra, has sido derrotado.");
		}else if (numeroGenerado == 5 && opcion2 == 2) {
			System.out.println("\r\nPapel desautoriza a Spock, ¡Victoria!");
		}else if (numeroGenerado == 5 && opcion2 == 3) {
			System.out.println("\r\nSpock rompe tijeras, has sido derrotado.");
		}else if (numeroGenerado == 5 && opcion2 == 4) {
			System.out.println("\r\nLagarto envenena a Spock, ¡Victoria!");
		}
		
	}

	private static void pedirJugada() {
		System.out.println("\r\nEscriba su jugada:\r\n1 - Piedra\r\n2 - Papel\r\n3 - Tijeras\r\n4 - Lagarto\r\n5 - Spock");
		
	}

	private static int jugar(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
		
	}

	private static int leerOpcion() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static void escribirMenu() {
		System.out.println("PIEDRA PAPEL TIJERAS LAGARTO SPOCK\r\n" + 
				"1. Jugar\r\n" + 
				"0. Salir\r\n"
				+ "\r\nEscoja una opcion: ");
		
	}

}
