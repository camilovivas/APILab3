package model;
import java.util.ArrayList;

public class Veterinary{
	public static final int TOTAL_ROOM = 8;
	//atributos
	private String name;
	private String location;	
	private Room[] miniRooms;
	private ArrayList<ClientHuman> service;
	private ArrayList<ClinicHistory> history;

	//constructor
	public Veterinary (String name, String location){
		this.name = name;
		this.location = location;
		miniRooms = new Room[TOTAL_ROOM];
		service =  new ArrayList<ClientHuman>();
		history = new ArrayList<ClinicHistory>();
		
	}
	
	
	
	
	//get y set
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
	
	
	public Room[] getminiRooms(){
		
		return miniRooms;
	}
	public void setRoom (Room[] miniRooms){
		
		this.miniRooms = miniRooms;
	}
	
	
	public ArrayList<ClientHuman> getService(){
		
		return service;
	}
	public void setService (ArrayList<ClientHuman> service){
		
		this.service = service;
	}
	
	
	public ArrayList<ClinicHistory> getHistory(){
		return history;
	}
	public void setHistory (ArrayList<ClinicHistory> history){
		this.history = history;
	}
	
	
	// mira si el cuarto esta disponible
	public boolean roomFree(){
		boolean free = false;
		for(int i = 0; i<miniRooms.length && !free; i++){
			if(miniRooms[i].getStatus != false){
				free = true;
			}	
		}
		return free;
	}
	
	//mira la cantidad de cuartos disponibles
	public int roomsTrue(){
		int contador = 0;
		for(int i = 0; i<TOTAL_ROOM; i++){
			if(miniRooms[i].getStatus() == true){
				contador++;
			}
		}
		return contador;
	}
	
	
	//crear historia clinica
	public void addHC(String status, String diagnosis, String symptom, Date entry, Pet chp){
		
		ClinicHistory n = new ClinicHistory (status, diagnosis, symptom, entry, chp);
		history.add(n);
	}
	
	
	//agregar cliente
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
		
		return msj;
	}
	
	
	//eliminar cliente
	public void deleitClient(int id){
		(int i = 0; i<service.size(); i++){
			if(service.get(i).getId().equals(id)){
				servise.remove(i);
			}
		}
	}
	
	
	//buscar cliente
	public ClientHuman findCLiente (String Id){
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
	
	
	//ver el numero del cuarto en que se encuentra la mascota
	public String showPetsHosp(String name){
		boolean esta = false;
		String msj;
		
		for(int k = 0;k<TOTAL_ROOM && !esta; k++){
			
			if(miniRooms[k].namePet().equals(name)){
				msj = miniRooms[k].Num();
				esta = true;
			}
			else{
				
				msj = "la mascota no esta hospitalizada";
				
			}
		return msj;
		}
	}
	
	
	public void clinicHistory(int i){
		history.get(i).showClinicHistory();
	}
	
	//reporte del animal hospitalizado  con historia clinica
	public String report(){
		String msj;
		for(int i = 0; i<TOTAL_ROOM; i++){
			if(miniRooms[i].getStatus() == false){
				msj += rooms[i].report();
			}
				
			else{
					
				msj = "en el cuarto "+i+" no hay mascotas hospitalizadas";
			}
		}
		return msj;
		
	}
	
	
	//busca el numero de cuarto
	public void showNumRoom(int j){
		miniRooms[j].Num();
	}
	
	
	//agregar mascotas
	public void createPet(int j){
	 service.get(j).addPet();
		
	}
	
	//tiene los datos de contacto del dueño de cada mascota que hay hospitalizada
	public String dateContac(int num){
		
		return miniRooms[num-1].dateContacOwner();
	}
	
	
	//al dar de alta se óne el cuarto disponibre
	public void setRoomFree(int num){
		miniRooms[num-1].setStatus = true;
		
	}
	
	
	//cambiar el estado de la historia clinica
	public void setStatusHis(int num, boolean status){
		
		miniRooms[num-1].statusHist(status);
	}
	
	public String showNameForAllPetsHospi(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet();
		}
		return msj;
	}
	
	//muestra informacion para eliminar las mascotas
	public String showNameForDeleit(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj = "en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet()+"y los datos su dueño son:"+miniRooms[i].dateContacOwner();
		}
		return msj;
	}
	
	//mira el historial de historias
	public String reporsHistory(){
		String msj;
		if (history.isEmpty()){
			msj = "no hay historias guardadas";
			
		}
		else{
			for(int i = 0; i<history.size(); i++){
				msj += history.get(i).ShowReportClinicHistory();
			}
			
		}
		return msj;
	}
	
	
	//elimina mascotas 
	public void deleitPet(int id, String name){
		(int i = 0; i<service.size(); i++){
			if(service.get(i).getId().equals(id)){
			
				service.get(i).deleitPet(name);
				setRoomFree();
			}
		}
		
	}
	
	
}