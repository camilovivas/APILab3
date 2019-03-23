package ui;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;


public class Main {
	
	//relacion
	private Veterinary relacion;
	private Scanner lector;
	
	public Main () {
		
		init();
		
	}
	
	public static void main(String[] args){
		
		Main m = new Main();
		m.mostrarBanner();
		m.showMenu(); 
	}

	public void showMenu(){
		
		int opcionElegida = 0;
		
		while(opcionElegida != 7){
			System.out.println("Por favor dijite la opcion que quiere realizar:");
			System.out.println("1.Ver informe de historias clinicas");
			System.out.println("2.Consultar datos del dueño de una mascota"); //ingrese nombre de animal o nombre del dueño
			System.out.println("3.Calcular costo de hospitalizacion");
			System.out.println("4.Dar de alta a una mascota");
			System.out.println("5.Ver ingresos por conceptos de hospitalizacion");// recorrer las historias e ir sumando el costo
			System.out.println("6.Ver el numero de mini cuarto de una mascota hospitalizada");
			System.out.println("7.Salir");
			
			opcionElegida = lector.nextInt();
			lector.nextLine();
			
			switch (opcionElegida){
				case 1:
				
				
				case 2:
				
				
				
				case 3:
				
				
				
				case 4:
				
				
				
				case 5:
				
				
				
				case 6:
				
				
				
				case 7:
				System.out.println("======================================================================" );
				System.out.println("                             BYE BYE...");
				System.out.println("======================================================================\n\n" );
				break;
				
				default:
				System.out.println("___________________________________________________");
				System.out.println("        !!la opcion ingresada no es valida!!       ");
				System.out.println("___________________________________________________\n\n");
			}
		}
		
	}
	
	public void init(){
		lector = new Scanner(System.in);
	}
	
	public void mostrarBanner() {
		StringBuilder all = new StringBuilder();
		all.append("\n");
		int ancho = 17;
		for (int a = 1; a <= 4; a++) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadSlashes = (ancho - a) * 2;
			int cantidadDeBackSlashes = (a - 1) * 2;
			pegarCaracteres(all, '*', cantidadAsteriscos);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '/', cantidadSlashes);
			pegarCaracteres(all, '\\', cantidadDeBackSlashes);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '*', cantidadAsteriscos);
			all.append("\n");
		}

		all.append("*******************************************************************\n");
		all.append("***** BIENBENIDO AL MENU DE LA VETERINARIA MI PEQUEÑA MASCOTA *****\n");
		all.append("*******************************************************************\n");

		for (int a = 4; a >= 1; a--) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadDeBackSlashes = (ancho - a) * 2;
			int cantidadSlashes = (a - 1) * 2;
			pegarCaracteres(all, '*', cantidadAsteriscos);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '/', cantidadSlashes);
			pegarCaracteres(all, '\\', cantidadDeBackSlashes);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '*', cantidadAsteriscos);
			all.append("\n");
		}
		all.append("\n");
		System.out.println(all.toString());
	}

	static void pegarCaracteres(StringBuilder sb, char c, int count) {
		for(int i = 0; i < count; i++) {
			sb.append(c);
		}
	}
}