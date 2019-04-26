/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
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
			System.out.println("1.Registrar cliente y mascota");//hozpitalizar, si es nuevo se registra y si no se busca en el array de clientes con su numero de id y se crea una nueva historia clinica con el que ya existe 
			System.out.println("2.Ver historias clinicas de los animales hospitalizados");
			System.out.println("3.Consultar datos del dueño de una mascota"); //ingrese nombre de animal o nombre del dueño
			System.out.println("4.Ver los informes del historial de historias clinicas");
			System.out.println("5.Dar de alta a una mascota");
			System.out.println("6.Ver ingresos por conceptos de hospitalizacion");// recorrer las historias e ir sumando el costo
			System.out.println("7.Ver el numero de mini cuarto de una mascota hospitalizada");
			
			System.out.println("9.actualizar datos de un cliente registrado");//ingrese el id del cliente a actualizar
			System.out.println("10.agregar nuevos medicamento a una historia clinica existente");//recorrer el historiaL yy modificar las medicinas
			System.out.println("11.agregar nuevas notas al diagnostico de una mascota hospitalizada");//me voy a los miniroom y modifico
			System.out.println("12.agregar un nuevo sintoma a una mascota hospitalizada");
			System.out.println("13.Calcular los ingresos por servicios");
			System.out.println("14.Calcular los ingresos totales de la veterinaria");
			System.out.println("15.Agregar al sistema nuevos servicios prestados por la veterinaria, es decir los servicios vendidos no nuevos tipos de servicios");//que registre un servicio existente
			System.out.println("16.Promedio de ingresos por servicio");
			System.out.println("17.Promedio de ingresos de la veterinaria en una semana");
			System.out.println("18.Reporte de servicios prestados dada una fecha inicial y una fecha final");
			System.out.println("19.Salir");
			
			opcionElegida = lector.nextInt();
			lector.nextLine();
			
			switch (opcionElegida){
				case 1:
				caso1();
				break;
				
				case 2:
				System.out.println(relacion.report());
				
				break;
				
				case 3:
				
				System.out.println(relacion.showNameForAllPetsHospi());
				System.out.println("ingrese el numero del cuarto en que se encuentra la mascota, para mostrar los datos de contacto de su dueño");
				int num =  lector.nextInt();
				relacion.dateContac(num);
				break;
				
				case 4:
				System.out.println(relacion.reporsHistory());
				break;
				
				case 5:
				
				break;
				
				case 6:
				System.out.println("los ingresos por hospitalizacion son:"+relacion.erningsOfHosp());
				break;
				
				case 7:
				System.out.println("las mascotas hospitalizadas son:");// los nombres de las mascotas hospitalizadas
				System.out.println(relacion.showNameForAllPetsHospisinNum());
				System.out.println("ingrese el nombre de la mascota abuscar...");
				String nameFind = lector.nextLine();
				relacion.showPetsHosp(nameFind);
			
				break;
				
				case 8
				break;
				
				case 9
				System.out.println("ingrese el id del cliente");
				String id = lector.nextLine();
				System.out.println("ingrese el nuevo numero telefonico");
				String phone = lector.nextLine();
				System.out.println("ingrese la nueva direccion"); 
				String address = lector.nextLine();
				relacion.update(id, phone, address);
				break;
				
				
				case 10
				System.out.println("estas son las mascotas hospitalizadas, ingrese el numero de la cual quiere agregar un medicamento");
				System.out.println(relacion.showNameForAllPetsHospi());
				int option = lector.nextInt();
				System.out.println("ingrese el nombre del nuevo medicamento");
				String name = lector.nextLine();
				System.out.println("ingrese la cantidad en numeros");
				double dose = lector.nextDouble();
				System.out.println("ingrese el costo por dosis");
				double costDose = lector.nextDouble();
				nextDouble();ingrese la frequencia");
				int frequency = lector.nextInt();
				
				break;
				
				case 11
				System.out.println("estas son las mascotas hospitalizadas, ingrese el numero de la cual quiere agregar un diagnostico");
				System.out.println(relacion.showNameForAllPetsHospi());
				int option = lector.nextInt();
				System.out.println("ingrese el diagnostico");
				break;
				
				case 12
				System.out.println("estas son las mascotas hospitalizadas, ingrese el numero de la cual quiere agregar un sintoma");
				System.out.println(relacion.showNameForAllPetsHospi());
				int option = lector.nextInt();
				break;
				
				case 13
				System.out.println("los ingresos por servicio de baño son:");
				relacion.earningforservice1();
				System.out.println("los ingresos por servicio de baño a domicilio son:");
				relacion.earningforservice2();
				System.out.println("los ingresos por servicio de cortar uñas son:");
				relacion.earningforservice3();
				System.out.println("los ingresos por servicio de profilaxis dental son:");
				relacion.earningforservice4();
				System.out.println("los ingresos por servicio de vacunacion son:");
				relacion.earningforservice5();
				System.out.println("los ingresos por todos los servicios son:");
				relacion.earningforallservices();
				
				break;
				
				case 14
				System.out.println("los ingresos de la veterinarya son:");
				System.out.println(relacion.earningsofVeterynary());
				break;
				
				case 15
				break;
				
				case 16
				System.out.println("el promedio de ingresos por servicio de baño son:");
				System.out.println(relacion.average1());
				System.out.println("el promedio de ingresos por servicio de baño a domicilio son:");
				System.out.println(relacion.average2());
				System.out.println("el promedio de ingresos por servicio de cortar uñas son:");
				System.out.println(relacion.average3());
				System.out.println("el promedio de ingresos por servicio de profilaxis dental son:");
				System.out.println(relacion.average4());
				System.out.println("el promedio de ingresos por servicio de vacunacion son:");
				System.out.println(relacion.average5());
				break;
				
				case 17
				System.out.println("el promedio de ingresos en esta semana fue:");
				break;
				
				case 18
				System.out.println("ingrese la fecha inicial");
				System.out.println("ingrese el dia");
				int day =lector.nextInt();
				System.out.println("ingrese el mes");
				int month = lector.nextInt();
				System.out.println("ingrese el año");
 				int year = lector.nextInt();
				
				System.out.println("ingrese la fecha final");
				System.out.println("ingrese el dia");
				int day =lector.nextInt();
				System.out.println("ingrese el mes");
				int month = lector.nextInt();
				System.out.println("ingrese el año");
 				int year = lector.nextInt();
				break;
				break;
				
				case 19:
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
	public void caso5(){
		System.out.println("las mascotas hospitalizadas son:");// estas son las que hay, seleccione la que quiere ver
		System.out.println(relacion.showNameForDeleit());
		
		System.out.println("ingrese el numero del cuarto de la mascota que quiere dar de alta");
		int num = lector.nextInt();
			
		System.out.println("ingrese el dia de salida");
		int day = lector.nextInt();
		System.out.println("ingrese el mes de salida");
		int month = lector.nextInt();
		System.out.println("ingrese el año de salida");
		int year = lector.nextInt();
		relacion.addOut(num, day, month, year);
		relacion.setStatusHis(num, false);
		relacion.addHC(relacion.getminiRooms()[num-1].getHospitalization());
		relacion.setRoomFree(num-1);
		relacion.getminiRooms()[num-1].setHospitalization(null);
		
		System.out.println("se dio de alta al animal con exito");
	}
	
	public void caso1 (){
		if(relacion.roomFree() == true){
			//registro cliente
		
			System.out.println("ingrese nombre cliente:");
			String name =  lector.next();
			System.out.println("ingrese id cliente");
			String id =  lector.nextLine();
			
			System.out.println("ingrese direccion cliente:");
			String address =  lector.nextLine();
			
			System.out.println("ingrese numero celular cliente");
			String phone =  lector.nextLine();
			
			relacion.addClient(name, id, address, phone);
			
			//regisgtro mascota que se repita si tiene mas mascotas
			while(repetidor == 2){
			
				System.out.println("ingrese nombre mascota");
				String name =  lector.nextLine();
				
				System.out.println("ingrese el tipo de animal:"+"\n"+"cat =1"+"\n"+"dog = 2"+"\n"+"bird = 3"+"\n"+"otro = 4");
				int typeAnimal =  lector.nextInt();
				
				System.out.println("ingrese la edad de la mascota");
				int age =  lector.nextInt();
				
				System.out.println("ingrese el peso de la mascota");
				double weight =  lector.nextDouble();
				
				System.out.println("ingrese la altura del animal");
				double height = lector.nextDouble();
				
				relacion.addPet(id, name, typeAnimal, age, weight, height);
				
				System.out.println("¿tiene mas mascotas?"+"\n"+"1. Si"+"\n"+"2. No");
				int repetidor = nextInt();
			}
		}
		else{
			System.out.println("no hay cuartos disponibles");
		}
	}
	
	public void init(){
		Date d1 = new Date(1,1,2019);
		Date d2 = new Date(1,1,2019);
		
		ClinicHistory ch1= new ClinicHistory(true, "virosis", "vomito", d1, null, p1);
		ClinicHistory ch2= new ClinicHistory(true, "virosis", "diarrea", d2, null, p2);
		ch1.addcure(m1);
		ch1.addcure(m2);
		
		Pet p1 = new Pet ("Michi", 1, 2, 4.5, 30.4, cl1);
		Pet p2 = new Pet ("luci", 1, 3, 4.6, 34.0 cl1);
		p1.setOwnerP(cl1);
		p2.setOwnerP(cl1);
	
		ClientHuman cl1 = new ClientHuman( "Camilo", 1006015105, "cra 46C #52-15", "3024453593");
		service.add(cl1);
		cl1.addPet(p1);
		cl1.addPet(p2);
		
		Medicine m1 = new Medicine( "acetominofem", 1.2, 4.000, 6);
		
		
		Medicine m2 = new Medicine( "suero", 1.2, 4.000, 6);
		
		
		Medicine m3 = new Medicine( "dolex", 1.2, 4.000, 6);
		
		
		Medicine m4 = new Medicine( "suero", 1.2, 4.000, 6);
		
		

		Room miniRoom1 = new Room(true, 1, null);
		Room miniRoom2 = new Room(true, 2, null);
		Room miniRoom3 = new Room(true, 3, null);
		Room miniRoom4 = new Room(false, 4, ch2);
		Room miniRoom5 = new Room(true, 5, null);
		Room miniRoom6 = new Room(false, 6, ch1);
		Room miniRoom7 = new Room(true, 7, null);
		Room miniRoom8 = new Room(true, 8, null);
		Room[] allRooms = {miniRoom1, miniRoom2, miniRoom3, miniRoom4, miniRoom5, miniRoom6, miniRoom7, miniRoom8};
		relacion.setRoom(allRooms);
		relacion.addClient(cl1);
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