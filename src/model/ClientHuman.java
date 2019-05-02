/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.ArrayList;

/**
*Description This class have information of all clients in the veterinary
*/
public class ClientHuman {
	//atributos
	private String name;
	private String id;
	private String address;
	private	String phone;
	private ArrayList<Pet> ownerC;
	//relaciones

	
/**
*Description This is the build of date
*@param name the name of client
*@param id the idetification of client 
*@param sddress the address of the client´s house
*@param phone number of phone of client 
*/
	public ClientHuman (String name, String id, String address, String phone){
	
		this.name = name;
		this.id = id;
		this.address  = address;
		this.phone = phone;
		ownerC = new ArrayList<Pet>();
	}
/**
*
*
*/	
	//get y set
	public String getName(){
		return name;
	}
/**
*
*@param
*/
	public void setName (String name){
		this.name = name;
	}
/**
*
*
*/	
	
	public String getId(){
		return id;
	}
/**
*
*@param
*/	
	public void setId (String id){
		this.id = id;
	}
/**
*
*
*/	
	
	public String getAddress(){
		return address;
	}
/**
*
*@param
*/	
	public void setAddress (String address){
		this. address = address;
	}
/**
*
*
*/	
	
	public String getPhone(){
		return phone;
	}
/**
*
*@param
*/	
	public void setPhone(String phone){
		this.phone = phone;
	}
/**
*
*
*/	
	
	public ArrayList<Pet> getownerC(){
		
		return ownerC;
	}
/**
*
*@param
*/	
	public void setOwnerC (ArrayList<Pet> ownerC){
		
		this.ownerC = ownerC;
	}
	
	//metodos
/**
*Description This method show the dates of contact of the client
*pre: the address and phone must be no null
*@return a String that show the dates if contact
*/
	//muestra los datos de contacto
	public String showDateContac(){
		String msj = "los datos de contacto del cliente"+name+"son:\n";
		msj += "-"+address;
		msj += "-"+phone;
	
		return msj;
	}
/**
*Description This method show the pets of the client
*pre: the pet must be no null
*@return a String that show the names of the pets
*/	
	public String showPetsHos(){
		String msj = " ";
		for(int j = 0 ; j<ownerC.size(); j++){
			msj += ownerC.get(j).getName();
			
		}
		
		return msj;
	}
/**
*Description this method add the pets to the arrayList of your owner
*@param name the name of pet
*@param typeAnimal the type animal that belongs
*@param age the age of pet
*@param weight the weight of pet
*@param height the height of pet
*@param ownerP the owner of pet
*post: the pet has been added
*/	
	//agrega las mascotas
	public void addPet(String name, int typeAnimal, int age, double weight, double height, ClientHuman ownerP){
		
		Pet nuevo = new Pet(name, typeAnimal, age, weight, height, ownerP);
		ownerC.add(nuevo);
		
	}
/**
*
*
*/	
	public void addPets(Pet p1){
		ownerC.add(p1);
	}
/**
*
*
*/	
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