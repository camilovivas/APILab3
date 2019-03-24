package model;
import java.util.ArrayList;


public class ClientHuman {
	//atributos
	private String name;
	private int id;
	private String address;
	private	String phone;
	private ArrayList<Pet> owner;
	//relaciones

	
	//metodos

	public ClientHuman (String name, int id, String address, String phone){
	
		this.name = name;
		this.id = id;
		this.address  = address;
		this.phone = phone;
		owner = new ArrayList<Pet>();
	}
	
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public int getId(){
		return id;
	}
	public void setId (int id){
		this.id = id;
	}
	
	
	public String getAddress(){
		return address;
	}
	public void setAddress (String address){
		this. address = address;
	}
	
	
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String showDateContac(){
		String msj = "los datos de contacto del cliente"+ name+"son:\n";
		msj += "-"+address;
		msj += "-"+phone;
	
		return msj;
	}
	public String showPetsHos(){
		String msj = " ";
		for(int j = 0 ; j<owner.size(); j++){
			msj += owner.get(j).getName();
			
		}
		
		return msj;
	}
	
	public void addPet(String name, int typeAnimal, int age, double weight){
		
		Pet nuevo = new Pet(name, typeAnimal, age, weight);
		owner.add(nuevo);
		
	}

}