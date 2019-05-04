/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.ArrayList;
/**
*Description This class have information above the pets of the client
*/

public class Pet{
	
	//atributos
	
	private String name;
	//1 cat 2 dog 3 bird 4otro
	private int typeAnimal;
	private int age;
	private double weight;
	private double height;
	
	//relaciones
	private ClientHuman ownerP;
	
	
	/**
	*Description This is the build of class Pet
	*@param name the name of pet
	*@param typeAnimal the type animal that belongs
	*@param age the age of pet
	*@param weight the weight of pet
	*@param height the height of pet
	*@param ownerP the owner of pet
	*/	
	public Pet (String name, int typeAnimal, int age, double weight, double height, ClientHuman ownerP){
		this.name = name;
		this.typeAnimal = typeAnimal;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.ownerP = ownerP;
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
	
	
	public int getTypeAnimal(){
		return typeAnimal;
	}
	/**
	*Description
	*@param
	*/
	public void setTypeAnimal(int typeAnimal){
		this.typeAnimal = typeAnimal;
	}
	
	
	public int getAge(){
		return age;
	}
	/**
	*Description
	*@param
	*/
	public void setAge(int age){
		this.age = age;
	}
	
	
	public double getWeight(){
		return weight;
	}
	/**
	*Description
	*@param
	*/
	public void setWeight (double weight){
		this.weight = weight;
	}
	
	
	public double getHeight(){
		return height;
	}
	/**
	*Description
	*@param
	*/
	public void setHeight (double height){
		this.height = height;
	}
	
	
	public ClientHuman getOwnerP(){
		return ownerP;
	}
	/**
	*Description
	*@param
	*/
	public void setOwnerP (ClientHuman ownerP){
		this.ownerP = ownerP;
	}
	
	
	//metodos
	
	/**
	*Description this method have the information of owner of the pet
	*pre: owner must be no null
	*@return dates of client
	*/
	public String dateOwner(){
		return ownerP.showDateContac();
	}
	/**
	*Description this method detected the type animal
	*@return String whit type animal(cat, dog, bird or another) 
	*/
	public String detecTypeAnimal(){
		String msj;
		
		if(typeAnimal==1){
			msj= "cat";
		}
		else if(typeAnimal ==2){
			msj = "dog";
		}
		else{
			msj = "bird";
		}
		return msj;
	}
	
	/**
	*Description This method show information of this class
	*@return String whit information of this class
	*/	
	public String toString(){
		String msj;
		msj ="Nombre:"+name+"\n";
		msj +="tipo;"+detecTypeAnimal()+"\n";
		msj +="edad:"+age+"\n";
		msj +="peso:"+weight+"\n";
		msj += "altura:"+height+"\n";
		msj += "IMC:"+imc()+"\n";
		
		return msj;
	}
	
	/**
	*Description This method allows to calculate the body mass index for a pet.
	*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
	*post: The BMI is calculated.
	*@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
	*/
	public double imc(){
		return weight/Math.pow(height, 2);
	}
	
	
}