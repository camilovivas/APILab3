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
		lector = new Scanner(System.in);
		
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
				if(relacion.roomFree() == true){
					//registro cliente
				
					System.out.println("ingrese nombre cliente:");
					String name =  lector.next();
				
					System.out.println("ingrese id cliente");
					int id =  lector.nextInt();
				
					System.out.println("ingrese direccion cliente:");
					String address =  lector.next();
				
					System.out.println("ingrese numero celular cliente");
					String phone =  lector.next();
				
					relacion.addClient();
				
					//regisgtro mascota
					System.out.println("ingrese nombre mascota");
					String phone =  lector.next();
				
					System.out.println("ingrese el tipo de animal:"+"\n"+"cat =1"+"\n"+"dog = 2"+"\n"+"bird = 3"+"\n"+"otro = 4");
					int typeAnimal =  lector.nextInt();
				
					System.out.println("ingrese la edad de la mascota");
					int age =  lector.nextInt();
					
					System.out.println("ingrese el peso de la mascota");
					double id =  lector.nextDouble();
				}
				else{
					System.out.println("no hay cuartos disponibles");
				}
				
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
				
				relacion.showNameForAllPetsHospi();
				System.out.println("ingrese el numero del cuarto en que se encuentra la mascota, para mostrar los datos de contacto de su dueño");
				int num =  lector.nextInt();
				relacion.dateContac();
				break;
				
				case 4:
				System.out.println("ingrese el nombre de la mascota hozpitalizada");
				String name =  lector.next();
				
				
				System.out.println("ingrese el numero de dias que estuvo hospitalizada la mascota");
				int day =  lector.nextInt();
				
				break;
				
				case 5:
				System.out.println("las mascotas hospitalizadas son:");// estas son las que hay, seleccione la que quiere ver
				
				
				System.out.println("ingrese el numero de la mascota que quiere dar de alta");
				
				break;
				
				case 6:
				System.out.println("los ingresos por hospitalizacion son:");
				
				break;
				
				case 7:
				System.out.println("las mascotas hospitalizadas son:");// los nombres de las mascotas hospitalizadas
				
				
				//System.out.println("ingrese el numero de la mascota que quiere ver los datos de contacto del dueño");
				//int day =  lector.nextInt();
				
				
				System.out.println("ingrrese el nombre de la mascota abuscar...");
				String nameFind = lector.next();
			
				relacion.showPetsHosp(String nameFind);
			
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
		Date d1 = new Date(1,1,2019);
		
		ClinicHistory ch1= new ClinicHistory(true, "virosis", "vomito", d1, p1);
		ClinicHistory ch2= new ClinicHistory(true, "virosis", "diarrea", d1, p2);
		
		
		Pet p1 = new Pet ("Michi", 1, 2, 4.5, cl1);
		Pet p2 = new Pet ("luci", 1, 3, 4.6, cl1);
		owner.add(p1);
		owner.add(p2);
		ClientHuman cl1 = new ClientHuman( "Camilo", 1006015105, "cra 46C #52-15", "3024453593");
		service.add(cl1);
		
		Medicine m1 = new Medicine( "acetominofem", 1.2+"cm", 4.000, 6+"horas");
		cure.add(m1);
		
		
		Room miniRoom1 = new Room(true, 1);
		Room miniRoom2 = new Room(true, 2);
		Room miniRoom3 = new Room(true, 3);
		Room miniRoom4 = new Room(false, 4);
		Room miniRoom5 = new Room(true, 5);
		Room miniRoom6 = new Room(false, 6);
		Room miniRoom7 = new Room(true, 7);
		Room miniRoom8 = new Room(true, 8);
		Room[] allRooms = {miniRoom1, miniRoom2, miniRoom3, miniRoom4, miniRoom5, miniRoom6, miniRoom7, miniRoom8};
		relacion = new Veterinary("mi pequeña mascota", "Cali");
	}
	
	//menu bonito
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