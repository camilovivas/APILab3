package model;
import java.util.ArrayList;


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
		
	//constructor
	public Pet (String name, int typeAnimal, int age, double weight, double height, ClientHuman ownerP){
		this.name = name;
		this.typeAnimal = typeAnimal;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.ownerP = ownerP;
	}
	
	//get y set
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public int getTypeAnimal(){
		return typeAnimal;
	}
	public void setTypeAnimal(int typeAnimal){
		this.typeAnimal = typeAnimal;
	}
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	
	public double getWeight(){
		return weight;
	}
	public void setWeight (double weight){
		this.weight = weight;
	}
	
	
	public double getHeight(){
		return height;
	}
	public void setHeight (double height){
		this.height = height;
	}
	
	
	public ClientHuman getOwnerP(){
		return ownerP;
	}
	public void setOwnerP (ClientHuman ownerP){
		this.ownerP = ownerP;
	}
	
	
	//metodos
	
	//debe leer el to String de client
	public String dateOwner(){
		return ownerP.showDateContac();
	}
	
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
	
	//trae nomas los datos de contacto del dueño
	public String dateContac(){
		return ownerP.showDateContac();
	}
	
	//calcula el indice de masa corporal  (agregar altura)
	public double imc(){
		return weight/Math.pow(height, 2);
	}
	
	
}