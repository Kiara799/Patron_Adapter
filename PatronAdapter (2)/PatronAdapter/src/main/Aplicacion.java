package main;

import java.util.Scanner;
import clases.*;

public class Aplicacion {

	private static Scanner S = new Scanner(System.in);
	private static Motor motor;//Referencia

	private static int preguntarOpcion() {

		System.out.println("\t╔════════════════════════════════════════╗");
		System.out.println("\t║       MENU DE OPCIONES                 ║");
		System.out.println("\t╚════════════════════════════════════════╝");
		System.out.println("\t║   1. Encender motor comun.             ║");
		System.out.println("\t╚════════════════════════════════════════╝");
		System.out.println("\t║   2. Encender motor economico.         ║");
		System.out.println("\t╚════════════════════════════════════════╝");
		System.out.println("\t║   3. Encender motor electrico.         ║");
		System.out.println("\t╚════════════════════════════════════════╝");
		System.out.println("\t║   4. Salir.                            ║");
		System.out.println("\t╚════════════════════════════════════════╝");
		System.out.print("\tDigite su opcion: ");
	
		return Integer.parseInt( S.nextLine() );
	}

	private static void usarMotor() {
		motor.encender();
		motor.acelerar();
		motor.apagar();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("");
		int opcion;
		do{
			opcion = preguntarOpcion();
			switch(opcion) {
			case 1:
				motor = new MotorComun();// instancia de la refrencia Motor 
				usarMotor();
				break;
			case 2:
				motor = new MotorEconomico();//
				usarMotor();
				break;
			case 3:
				motor = new MotorElectricoAdapter();//
				usarMotor();
				break;
			case 4:
				System.out.println("\tCerrando programa");
				break;
			default:
				System.out.println("\tLa opcion ingresada NO es valida.");
			}
			System.out.print("\n\n");
		}while(opcion!=4);
	}	
}
