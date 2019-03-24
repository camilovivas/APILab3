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
	}
	
	public void initMiniRoom(){
		miniRoom[0] = new Room(true, 1, hospitalization1);//relacion
		miniRoom[1] = new Room(true, 2, hospitalization2);
		miniRoom[2] = new Room(true, 3, hospitalization3);
		miniRoom[3] = new Room(true, 4, hospitalization4);
		miniRoom[4] = new Room(true, 5, hospitalization5);
		miniRoom[5] = new Room(true, 6, hospitalization6);
		miniRoom[6] = new Room(true, 7, hospitalization7);
		miniRoom[7] = new Room(true, 8, hospitalization8);
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
	
	
	
	
	public String addClient (String name, int id, String address, String phone){
		String msj;
		ClientHuman c1 = buscar(id);
		if (c1 != null){
			msj= ("cliente ya existe");
		}
		else{
			msj =("registro exitoso");
			ClientHuman c1 = new ClientHuman(name, id, address, phone);
			service.add(c1);
		}
		
	}
	
	public ClientHuman buscarCLiente (String Id){
		boolean continuar = true;
		ClientHuman aBuscar = null;
	
		for(int i = 0 ; i<service.size()&&continuar; i++){
			ClientHuman existente = service.get(i);
			if (existente.getId().equals(aBuscar(id))){
				aBuscar=existente;
				continuar = false;
			
			}
		
		}		
	
		return aBuscar;
	}
	
	
	public void clinicHistory(int i){
		history.get(i).showClinicHistory();
	}

	
	public void showNumRoom(int j){
		miniRoom[j].getNum();
	}
	
	
}