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
	}
	
	miniRoom[0] = new Room(true, 1,//relacion);
	miniRoom[1] = new Room(true, 2);
	miniRoom[2] = new Room(true, 3);
	miniRoom[3] = new Room(true, 4);
	miniRoom[4] = new Room(true, 5);
	miniRoom[5] = new Room(true, 6);
	miniRoom[6] = new Room(true, 7);
	miniRoom[7] = new Room(true, 8);
	
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
	
	
	
	
	public String addClient (String name, int id, int address, String phone){
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
	
	public Client buscarCLiente (String Id){
		booblean continuar = true;
		ClientHuman aBuscar = null;
	
		for(int i = 0 ; i<service.size()&&continuar; i++){
			ClientHuman existente = service.get(i);
			if (existente.getid().equals(id)){
				aBuscar=existente;
				continuar = false;
			
			}
		
		}		
	
		return aBuscar;
	}
}