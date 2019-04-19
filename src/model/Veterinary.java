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
	private ArrayList<NewService> otherServices;

	//constructor
	public Veterinary (String name, String location){
		this.name = name;
		this.location = location;
		miniRooms = new Room[TOTAL_ROOM];
		service =  new ArrayList<ClientHuman>();
		history = new ArrayList<ClinicHistory>();
		otherServices = new ArrayList<NewService>();
		
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
	
	
	public ArrayList<NewService> getOtherServices(){
		return otherServices;
	}
	public void setOtherServices(ArrayList<NewService> otherServices){
		this.otherServices = otherServices;
	}
	
	
	//metodos
	
	// mira si el cuarto esta disponible
	public boolean roomFree(){
		boolean free = false;
		for(int i = 0; i<miniRooms.length && !free; i++){
			if(miniRooms[i].getStatus() != false){
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
	
	
	//cagregar historia clinica
	public void addHC(ClinicHistory ch1){
		history.add(ch1);
	}
	
	
	//agregar cliente
	public String addClient (String name, String id, String address, String phone){
		String msj;
		ClientHuman c1 = findCliente(id);
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
	public void deleitClient(String id){
		for(int i = 0; i<service.size(); i++){
			if(service.get(i).getId().equals(id)){
				service.remove(i);
			}
		}
	}
	
	
	//buscar cliente
	public ClientHuman findCliente (String id){
		boolean continuar = true;
		ClientHuman aBuscar = null;
	
		for(int i = 0 ; i<service.size() && !continuar; i++){
			if (service.get(i).getId() == id){
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
		history.get(i);
	}
	
	//reporte del animal hospitalizado  con historia clinica
	public String report(){
		String msj;
		for(int i = 0; i<TOTAL_ROOM; i++){
			if(miniRooms[i].getStatus() == false){
				msj += miniRooms[i].report();
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
	
	
	//agregar mascotas al ultimo cliente, ya que siempre se agrega el nuevo cliente en la ultima casilla
	public void createPet(String name, int typeAnimal, int age, double weight,ClientHuman ownerP){
	 service.size().addPet(name, typeAnimal, age, weight, ownerP);
		
	}
	
	//tiene los datos de contacto del dueño de cada mascota que hay hospitalizada
	public String dateContac(int num){
		
		return miniRooms[num-1].dateContacOwner();
	}
	
	
	//al dar de alta se óne el cuarto disponibre
	public void setRoomFree(int num){
		miniRooms[num-1].setStatus(true);
		
	}
	
	
	//cambiar el estado de la historia clinica
	public void setStatusHis(int num, boolean status){
		
		miniRooms[num-1].statusHist(status);
	}
	
	//muestra los numbres de las mascotas hospiitalizadas con el numero de cuarto
	public String showNameForAllPetsHospi(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "\n"+"en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet();
		}
		return msj;
	}
	
	//muestra los numbres de las mascotas hospiitalizadas sin el numero de cuarto
	public String showNameForAllPetsHospisinNum(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "\n"+miniRooms[i].namePet();
		}
		return msj;
	}
	
	//muestra informacion para dar de alta las mascotas
	public String showNameForDeleit(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj = "en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet()+"y los datos su dueño son:"+miniRooms[i].dateContacOwner();
		}
		return msj;
	}
	
	//mira el historial de historias (fue eliminado)
	public String reporsHistory(){
		String msj;
		if (history.isEmpty()){
			msj = "no hay historias guardadas";
			
		}
		else{
			for(int i = 0; i<history.size(); i++){
				msj += history.get(i); //lee el toString
			}
			
		}
		return msj;
	}
	
	//elimina mascotas 
	public void deleitPet(int id, String name){
		for(int i = 0; i<service.size(); i++){
			if(service.get(i).getId().equals(id)){
			
				service.get(i).deleitPet(name);
			}
		}
		
	}
	
	
	public void addOut(int numero, int day, int month, int year){
		miniRooms[numero-1].addOut(day, month, year);
	}
	
	//ganancias por hospitalizacion
	public double erningsOfHosp(){
		double cost =0.0;
		for(int i = 0; i<history.size(); i++){
			cost += history.get(i).costHospitalization();
		}
		return cost;
	}
	
	//modifica el numeoro de telefono y direccion
	public void modify(int num, String phone, String address){
		service.get(num).setAddress(address),setPhone(phone);
		
	}
	
	
	
}