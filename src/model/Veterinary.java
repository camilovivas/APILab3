package model;
import java.util.ArrayList;

public class Veterinary{
	public static final int TOTAL_ROOM = 8;
	//atributos
	private String name;
	private String location;	
	private Room[] miniRoom;
	private ArrayList<ClientHuman> service;
	private ArrayList<ClinicHistory> history;

	//constructor
	public Veterinary (String name, String location){
		this.name = name;
		this.location = location;
		miniRoom = new Room[TOTAL_ROOM];
		service =  new ArrayList<ClientHuman>();
		history = new ArrayList<ClinicHistory>();
		initMiniRoom();
		initClienHuman();
	}
	
	public void initMiniRoom(){
		miniRoom[0] = new Room(true, 1, hospitalization1);//relacion
		miniRoom[1] = new Room(true, 2, hospitalization2);
		miniRoom[2] = new Room(true, 3, hospitalization3);
		miniRoom[3] = new Room(true, 4, hospitalization4);
		miniRoom[4] = new Room(false, 5, hospitalization5);
		miniRoom[5] = new Room(true, 6, hospitalization6);
		miniRoom[6] = new Room(false, 7, hospitalization7);
		miniRoom[7] = new Room(true, 8, hospitalization8);
	}
	
	public void initClienHuman(){
		
		ClientHuman cl1 = new ClientHuman( "Camilo", 1006015105, "cra 46C #52-15", "3024453593");
		service.add(cl1);
	}
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public String getLocation(){
		return location;
	}
	public void setLocation (String location){
		this.location = location;
	}
	
	
	public boolean roomFree(){
		boolean free = false;
		for(int i = 0; i<miniRoom.length; i++){
			if(miniRoom[i].getStatus != false){
				free = true;
			}	
		}
	}
	
	
	public String addClient (String name, int id, String address, String phone){
		String msj;
		ClientHuman c1 = buscarClient(id);
		if (c1 != null){
			msj= ("cliente ya existe");
		}
		else{
			msj =("registro exitoso");
			ClientHuman newClient = new ClientHuman(name, id, address, phone);
			service.add(newClient);
		}
		
	}
	
	public ClientHuman buscarCLiente (String Id){
		boolean continuar = true;
		ClientHuman aBuscar = null;
	
		for(int i = 0 ; i<service.size() && !continuar; i++){
			//ClientHuman existente = service.get(i);
			if (service.get(i).getId().equals(id)){
				aBuscar= service.get(i);
				continuar = false;
			
			}
		
		}		
	
		return aBuscar;
	}
	
	// la mascota de todos los cuartos
	public String showPetsHosp(){
		String msj;
		msj = "mascota del cuarto 1 es:"+showpetRoom1()+"\n";
		msj += "mascota del cuarto 2 es:"+showpetRoom2()+"\n";
		msj += "mascota del cuarto 3 es:"+showpetRoom3()+"\n";
		msj += "mascota del cuarto 4 es:"+showpetRoom4()+"\n";
		msj += "mascota del cuarto 5 es:"+showpetRoom5()+"\n";
		msj += "mascota del cuarto 6 es:"+showpetRoom6()+"\n";
		msj += "mascota del cuarto 7 es:"+showpetRoom7()+"\n";
		msj += "mascota del cuarto 8 es:"+showpetRoom8()+"\n";
		
		return msj;
	}
	
	//la mascota de cada cuarto
	public String showpetRoom1(){
		String msj;
		if(miniRoom[0].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[0].showpet1();
		}
		
		return msj;
	}
	public String showpetRoom2(){
		String msj;
		if(miniRoom[1].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[1].showpet2();
		}
		
		return msj;
		
	}
	public String showpetRoom3(){
		String msj;
		if(miniRoom[2].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[2].showpet3();
		}
		
		return msj;
		
	}
	public String showpetRoom4(){
		String msj;
		if(miniRoom[3].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[3].showpet4();
		}
		
		return msj;
		
	}
	public String showpetRoom5(){
		String msj;
		if(miniRoom[4].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[4].showpet5();
		}
		
		return msj;
		
	}
	public String showpetRoom6(){
		String msj;
		if(miniRoom[5].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[5].showpet6();
		}
		
		return msj;
		
	}
	public String showpetRoom7(){
		String msj;
		if(miniRoom[6].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[6].showpet7();
		}
		
		return msj;
		
	}
	public String showpetRoom8(){
		String msj;
		if(miniRoom[7].getStatus != false){
			msj = "El cuarto esta vacio";
		}
		else{
			msj = miniRoom[7].showpet8();
		}
		
		return msj;
		
	}
	
	//el nombre de la mascota de cada cuarto con el idicador
	public String showNamePetsRooms(){
		String msj;
		for(int i = 0 ; i<miniRoom.length ; i++){
			msj += miniRoom[i].showNamePet1()+"\n";
		
		
		}
		return msj;
	}
	public String showNamePetRoom1(){
		return 
	}
	public String showNamePetRoom2(){
		return miniRoom[1].showNamePet1()
	}
	public String showNamePetRoom13(){
		return miniRoom[2].showNamePet1()
	}
	public String showNamePetRoom4(){
		return miniRoom[3].showNamePet1()
	}
	public String showNamePetRoom5(){
		return miniRoom[4].showNamePet1()
	}
	public String showNamePetRoom6(){
		return miniRoom[5].showNamePet1()
	}
	public String showNamePetRoom7(){
		return miniRoom[6].showNamePet1()
	}
	public String showNamePetRoom8(){
		return miniRoom[7].showNamePet1()
	}
	
	public void clinicHistory(int i){
		history.get(i).showClinicHistory();
	}

	//busca el numero de cuarto
	public void showNumRoom(int j){
		miniRoom[j].getNum();
	}
	
	public void showHistRoom1(){
		boolean encontrado = false;
		for(int i = 0; i<history.size() && !encontrado; i++)
		if (history.get(i)== 
		
		
	}
	
	public createPet(int j){
		service.get(j).addPet()
		
	}
	
	public String dateContac(int num){
		
		return miniRoom[num]
	}
}