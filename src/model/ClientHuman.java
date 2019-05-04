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
	/**
	*Description This method get the identification
	*@return the identification
	*/	
	public String getId(){
		return id;
	}
	/**
	*Description this method set the identification
	*@param id the identification
	*/	
	public void setId (String id){
		this.id = id;
	}
	/**
	*Description This method get the address
	*@return the address 
	*/	
	public String getAddress(){
		return address;
	}
	/**
	*Description this method set the address
	*@param address the address from house
	*/	
	public void setAddress (String address){
		this. address = address;
	}
	/**
	*Description This method  get the phone
	*@return the phone 
	*/	
	public String getPhone(){
		return phone;
	}
	/**
	*Description This method set the phone
	*@param phone the phone of client
	*/	
	public void setPhone(String phone){
		this.phone = phone;
	}
	/**
	*Description This method get the pets
	*@return the pets of client
	*/	
	public ArrayList<Pet> getOwnerC(){
		
		return ownerC;
	}
	/**
	*Description This method set the pets
	*@param ownerC the pet of client
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
	public void addPet(String name, int typeAnimal, int age, double weight, double height, ClientHuman ownerP){
		
		Pet nuevo = new Pet(name, typeAnimal, age, weight, height, ownerP);
		ownerC.add(nuevo);
		
	}
	/**
	*Description This method add a pet to ArrayList
	*post: has been add the pet
	*/	
	public void addPets(Pet p1){
		ownerC.add(p1);
	}
	
	/**
	*Description This method show information of this class
	*@return String whit information of this class
	*/	
	public String toString(){
		String msj;
		msj = "Nombre:"+"\n"+getName();
		msj += "Identificado por el numero:"+"\n"+getId();
		msj += "La direccion es:"+"\n"+getAddress();
		msj += "Numero celular:"+"\n"+getPhone();
		
		return msj;
		
	}

}