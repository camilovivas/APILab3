package model;
import java.util.ArrayList;


public class ClientHuman {
	//atributos
	private String name;
	private String id;
	private String address;
	private	String phone;
	private ArrayList<Pet> ownerC;
	//relaciones

	
	//constructor
	public ClientHuman (String name, String id, String address, String phone){
	
		this.name = name;
		this.id = id;
		this.address  = address;
		this.phone = phone;
		ownerC = new ArrayList<Pet>();
	}
	
	//get y set
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public String getId(){
		return id;
	}
	public void setId (String id){
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
	
	
	public ArrayList<Pet> getownerC(){
		
		return ownerC;
	}
	public void setOwnerC (ArrayList<Pet> ownerC){
		
		this.ownerC = ownerC;
	}
	
	//metodos
	
	//muestra los datos de contacto
	public String showDateContac(){
		String msj = "los datos de contacto del cliente"+name+"son:\n";
		msj += "-"+address;
		msj += "-"+phone;
	
		return msj;
	}
	
	public String showPetsHos(){
		String msj = " ";
		for(int j = 0 ; j<ownerC.size(); j++){
			msj += ownerC.get(j).getName();
			
		}
		
		return msj;
	}
	//agrega las mascotas
	public void addPet(String name, int typeAnimal, int age, double weight, double height, ClientHuman ownerP){
		
		Pet nuevo = new Pet(name, typeAnimal, age, weight, height, ownerP);
		ownerC.add(nuevo);
		
	}
	public void addPets(Pet p1){
		ownerC.add(p1);
	}
	
	
	//muestra todo el cliente
	public String toString(){
		String msj;
		msj = "Nombre:"+"\n"+getName();
		msj += "Identificado por el numero:"+"\n"+getId();
		msj += "La direccion es:"+"\n"+getAddress();
		msj += "Numero celular:"+"\n"+getPhone();
		
		return msj;
		
	}

}