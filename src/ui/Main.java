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
		
		while(opcionElegida != 8){
			System.out.println("Por favor dijite la opcion que quiere realizar:");
			System.out.println("1.Registrar cliente y mascota");
			System.out.println("2.Ver informe de historias clinicas");
			System.out.println("3.Consultar datos del dueño de una mascota"); //ingrese nombre de animal o nombre del dueño
			System.out.println("4.Calcular costo de hospitalizacion");
			System.out.println("5.Dar de alta a una mascota");
			System.out.println("6.Ver ingresos por conceptos de hospitalizacion");// recorrer las historias e ir sumando el costo
			System.out.println("7.Ver el numero de mini cuarto de una mascota hospitalizada");
			System.out.println("8.Salir");
			
			opcionElegida = lector.nextInt();
			lector.nextLine();
			
			switch (opcionElegida){
				case 1:
				System.out.println("ingrese nombre cliente:");
				String name =  lector.next();
				
				System.out.println("ingrese id cliente");
				int id =  lector.nextInt();
				
				System.out.println("ingrese direccion cliente:");
				String address =  lector.next();
				
				System.out.println("ingrese numero celular cliente");
				String phone =  lector.next();
				
				relacion.addClient();
				break;
				
				case 2:
				System.out.println("la historia clinica de la mascota que esta en el cuarto 1 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 2 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 3 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 4 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 5 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 6 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 7 es:");
				
				System.out.println("la historia clinica de la mascota que esta en el cuarto 8 es:");
				
				break;
				
				case 3:
				System.out.println("ingrese el nombre del dueño de la mascota para ver los datos de contacto");
				String name =  lector.next();
				
				break;
				
				case 4:
				System.out.println("ingrese el nombre de la mascota hozpitalizada");
				String name =  lector.next();
				
				
				System.out.println("ingrese el numero de dias que estuvo hospitalizada la mascota");
				int day =  lector.nextInt();
				
				break;
				
				case 5:
				System.out.println("las mascotas hospitalizadas son:");
				
				System.out.println("ingrese el numero de la mascota que quiere dar de alta");
				
				break;
				
				case 6:
				System.out.println("los ingresos por hospitalizacion son:");
				
				break;
				
				case 7:
				System.out.println("las mascotas hospitalizadas son:");
				
				System.out.println("ingrese el nombre de la mascota a buscar");
				String name =  lector.next();
				
				break;
				
				//el numero de cuarto donde esta hozpitalizada la mascota es:
				
				case 8:
				System.out.println("======================================================================" );
				System.out.println("||||||||||||||||||||||||||||| BYE BYE... |||||||||||||||||||||||||||||");
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

		all.append("******************************************************************\n");
		all.append("**** BIENBENIDO AL MENU DE LA VETERINARIA MI PEQUEÑA MASCOTA *****\n");
		all.append("******************************************************************\n");

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