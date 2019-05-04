/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
*Description This is the main class, have information of all veterynary 
*/
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
/**
*Description This is the build of class Veterinary
*@param name the name of the veterynary
*@param location the locationn of th veterynary
*/	
	public Veterinary (String name, String location){
		this.name = name;
		this.location = location;
		miniRooms = new Room[TOTAL_ROOM];
		service =  new ArrayList<ClientHuman>();
		history = new ArrayList<ClinicHistory>();
		otherServices = new ArrayList<NewService>();
		
	}
	
	
	//get y set
	/**
	*Description This method get the name
	*@return the name 
	*/
	public String getName(){
		return name;
	}
	/**
	*Description This method set the name
	*@param name the name
	*/
	public void setName (String name){
		this.name = name;
	}
	
	
	public String getLocation(){
		return location;
	}
	/**
	*Description
	*@param
	*/
	public void setLocation (String location){
		this.location = location;
	}
	
	
	public Room[] getminiRooms(){
		
		return miniRooms;
	}
	/**
	*Description
	*@param
	*/
	public void setRoom (Room[] miniRooms){
		
		this.miniRooms = miniRooms;
	}
	
	
	public ArrayList<ClientHuman> getService(){
		
		return service;
	}
	/**
	*Description
	*@param
	*/
	public void setService (ArrayList<ClientHuman> service){
		
		this.service = service;
	}
	
	
	public ArrayList<ClinicHistory> getHistory(){
		return history;
	}
	/**
	*Description
	*@param
	*/
	public void setHistory (ArrayList<ClinicHistory> history){
		this.history = history;
	}
	
	
	public ArrayList<NewService> getOtherServices(){
		return otherServices;
	}
	/**
	*Description
	*@param
	*/
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
	
	public void addPet(String id, String name, int typeAnimal, int age, double weight, double height){
		ClientHuman temp = findCliente(id);
		if (temp != null){
			Pet p1 = new Pet(name, typeAnimal, age, weight, height, temp);
			temp.addPets(p1);
		}
		
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
	
	//actualiza los datos de un cliente
	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	*pre: The client was created before.
	*post: The address and /or phone number of the client is updated.
	*@param The new address of the client. This param could be empty.
	*@param The new phone number of the client. This param could be empty.
	*/
	public void update (String id, String phone, String address){
		boolean continuar = true;
			
		for(int i = 0 ; i<service.size() && !continuar; i++){
			if (service.get(i).getId() == id){
				continuar = false;
				service.get(i).setAddress(address);
				service.get(i).setPhone(phone);
			}
		
		}		
	
	}
	
	
	//ver el numero del cuarto en que se encuentra la mascota
	public String showPetsHosp(String name){
		boolean esta = false;
		String msj= " ";
		
		for(int k = 0;k<TOTAL_ROOM && !esta; k++){
			
			if(miniRooms[k].namePet().equals(name)){
				msj = miniRooms[k].Num();
				esta = true;
			}
			else{
				
				msj = "la mascota no esta hospitalizada";
				
			}
			
		}
		return msj;
	}
	
	
	public void clinicHistory(int i){
		history.get(i);
	}
	
	//reporte del animal hospitalizado con historia clinica
	/**
	*Description This method show the pet inside the room
	*@return String whit information from pet hospitalized
	*/
	public String report(int j){
		String msj = " ";
		if(miniRooms[j].getStatus() == false){
			msj += miniRooms[j].report();
		}
				
		else{
				
			msj += "en el cuarto "+i+" no hay mascotas hospitalizadas";
		}
		
		return msj;
		
	}
	
	
	//busca el numero de cuarto(eliminar)
	public void showNumRoom(int j){
		miniRooms[j].Num();
	}
	
	
	//tiene los datos de contacto del dueño de cada mascota que hay hospitalizada
	/**
	*Description This method show the date contact of owner of the pet hospitalized
	*@param num the number of room
	*@return String whit dates contact of owner
	*/
	public String dateContac(int num){
		
		return miniRooms[num-1].dateContacOwner();
	}
	
	
	//al dar de alta se óne el cuarto disponibre
	/**
	*Description This method changes the status from room when discharged from the hospital
	*@param num the number of room
	*post: has been changes the status from room
	*/
	public void setRoomFree(int num){
		miniRooms[num-1].setStatus(true);
		
	}
	
	
	//cambiar el estado de la historia clinica
	/**
	*Description This method changes the status from clinic history when discharged from the hospital
	*@param num the number of room
	*@param status the new status 
	*post: has been changes the status from clinic history
	*/
	public void setStatusHis(int num, boolean status){
		
		miniRooms[num-1].statusHist(status);
	}
	
	//muestra los numbres de las mascotas hospiitalizadas con el numero de cuarto
	/**
	*Description this method show the pets that are hospitalized whit room number
	*@return all pets hospitalized and room number
	*/
	public String showNameForAllPetsHospi(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "\n"+"en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet();
		}
		return msj;
	}
	
	//muestra los numbres de las mascotas hospiitalizadas sin el numero de cuarto
	/**
	*Description this method show the pets that are hospitalized whitout room number
	*@return all pets hospitalized 
	*/
	public String showNameForAllPetsHospisinNum(){
		String msj;
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "\n"+miniRooms[i].namePet();
		}
		return msj;
	}
	
	//muestra informacion para dar de alta las mascotas
	/**
	*Description this method show the pets hospitalized for the proces of discharged from the hospital
	*@return the pets hospitalized
	*/
	public String showNameForDeleit(){
		String msj = "";
		
		for(int i = 0; i <TOTAL_ROOM; i++){
			msj += "\n"+"en el cuarto "+i+"esta la mascota:"+miniRooms[i].namePet()+"y los datos su dueño son:"+miniRooms[i].dateContacOwner();
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
	
	/**
	*Description This method add date when was discharge to clinic history
	*@param numero the position of room where are the pet
	*@param day the day of month when was discharged from the hospital
	*@param month the month of year when was discharged from the hospital
	*@param year the year when was discharged from the hospital
	*post: has been add the date to clinic history
	*/
	public void addOut(int numero, int day, int month, int year){
		miniRooms[numero-1].addOut(day, month, year);
	}
	
	//ganancias por hospitalizacion
	/**
	*Description This method calculate the earnings from hospitalization
	*@return earnigs from hospitalization
	*/
	public double erningsOfHosp(){
		double cost =0.0;
		for(int i = 0; i<history.size(); i++){
			cost += history.get(i).costHospitalization();
		}
		return cost;
	}
	
	//ganancias por hospitalizacion y medicina de todas las historias
	/**
	*Description This method calculate the earning from hospitalization and medicines
	*@return earnings from hospitalization and medicines
	*/
	public double earningsOfHosAndMed(){
		double cost =0.0;
		for(int k = 0; k<history.size(); k++){
			cost += history.get(k).calculateEarnings();
		}
		return cost;
	}
	
	
	/**
	*Description This method calculate earnings from service of bath veterynary
	*@return the aerning from bath veterynary
	*/
	public double earningforservice1(){
		double cost =0.0;
		for(int i = 0 ; i<otherServices.size(); i++){
			if(otherServices.get(i).getTypeService() == NewService.BATH_VETERINARY);{
				cost += otherServices.get(i).getCost();
				
			}
			return cost;
			
		}
		
	}
	/**
	*Description This method calculate earnings from service of bath domicile
	*@return the aerning from bath domicile
	*/
	public double earningforservice2(){
		double cost =0.0;
		for(int i = 0 ; i<otherServices.size(); i++){
			if(otherServices.get(i).getTypeService() == NewService.BATH_DOMICILE);{
				cost += otherServices.get(i).getCost();
				
			}
			return cost;
			
		}
		
	}
	/**
	*Description This method calculate earnings from service of nail cutting
	*@return the aerning from nail cutting
	*/
	public double earningforservice3(){
		double cost =0.0;
		for(int i = 0 ; i<otherServices.size(); i++){
			if(otherServices.get(i).getTypeService() == NewService.NAIL_CUTTING);{
				cost += otherServices.get(i).getCost();
				
			}
			return cost;
			
		}
		
	}
	/**
	*Description This method calculate earnings from service of dental prophylaxis
	*@return the aerning from dental prophylaxis
	*/
	public double earningforservice4(){
		double cost =0.0;
		for(int i = 0 ; i<otherServices.size(); i++){
			if(otherServices.get(i).getTypeService() == NewService.DENTAL_PROPHYLAXIS);{
				cost += otherServices.get(i).getCost();
				
			}
			return cost;
			
		}
		
	}
	/**
	*Description This method calculate earnings from service of vaccination
	*@return the aerning from vaccination
	*/
	public double earningforservice5(){
		double cost =0.0;
		for(int i = 0 ; i<otherServices.size(); i++){
			if(otherServices.get(i).getTypeService() == NewService.VACCINATION);{
				cost += otherServices.get(i).getCost();
				
			}
			return cost;
			
		}
		
	}
	/**
	*Description This method calculate the earnings from all new services
	*@return earnings from new services
	*/
	public double earningforallservices(){
		return earningforservice1()+earningforservice2()+earningforservice3()+earningforservice4()+earningforservice5();
	}
	
	//ganancias d ela veterinaria
	/**
	*Description This method calculate the earning from all services of the veterinary
	*@return the earnigs of new services, hozpitalition and medicines
	*/
	public double earningsofVeterynary(){
		return earningforallservices()+earningsOfHosAndMed();
	}
	
	//los siguientes metodos 5 calcularan el promedio de ganancias(corregir)
	public double average1(){
		return earningforservice1()/otherServices.size();
	}
	public double average2(){
		return earningforservice2()/otherServices.size();
	}
	public double average3(){
		return earningforservice3()/otherServices.size();
	}
	public double average4(){
		return earningforservice4()/otherServices.size();
	}
	/**
	*Description This method calcula 
	*/
	public double average5(){
		return earningforservice5()/otherServices.size();
	}
	
	/**
	**Description this method calculate the earnings whit date initial and final date
	*@param dayI the day of month of the initial date
	*@param monthI the month of year of the initial date
	*@param yearI year of the initial date
	*@param dayF the day of month of the final date
	*@param monthF the month of the year of the final date
	*@param yearF  year of the final date
	*@return the earnings from that time lapse
	*/
	public double  calculateEarninWeek(int dayI, int monthI, int yearI, int dayF, int monthF, int yearF ){
		Date nI = new Date(dayI, monthI, yearI);//borrar
		Date nF = new Date(dayF, monthF, yearF);//borrar
		
		LocalDate ld1 = LocalDate.of(yearI, monthI, dayI);
		LocalDate ld2 = LocalDate.of(yearF, monthF, dayF);
		LocalDate ld = LocalDate.of(2019, 1, 1);//preguntar al profesor si existe una herramienta para el año actual
		
		long daysI = ld.until(ld1, ChronoUnit.DAYS);
		long daysE = ld.until(ld2, ChronoUnit.DAYS);
		int earning = 0;
		for(int i = 0; i<history.size(); i++){
			LocalDate l = LocalDate.of(history.get(i).getEntry().getYear(), history.get(i).getEntry().getMonth(), history.get(i).getEntry().getDay());
			long daysl = ld.until(l, ChronoUnit.DAYS);
			if(daysl> daysI && daysl <daysE){
				earning += history.get(i).calculateEarnings();
			}
		}
		return earning;
		
	}
	
	/**
	*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New medicines were added to the patient clinic story.
	*@param The medicine name. This param must be not null.
	*@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
	*@param The medicine cost by each dose. This param could be empty.
	*@param The frequency of medicine application. This param could be empty.
	*@return A message that indiques if medicine was added to the patient clinic story
	*/
	public void addNewMedicines()
	
	/**
	*Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: A new symptom were added to the patient clinic story.
	*@param The new symptom presented. This param must be not null.
	*/
	public void addNewSymptom()
	
	/**
	*Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New notes were added to the possible diagnostic in the patient clinic story.
	*@param The notes of possible diagnostic. This param must be not null.
	*/
	public void addNewDiagnostic()
	
	
}