package model;
import java.util.ArrayList;


public class Pet{
	
	//atributos
	
	private String name;
	//1 cat 2 dog 3 bird 4otro
	private int typeAnimal;
	private int age;
	private double weight;
	
	//relaciones
	private ClientHuman ownerP;
	private ClinicHistory report;
	
	//constructor
	public Pet (String name, int typeAnimal, int age, double weight, ClientHuman ownerP, ClinicHistory report){
		this.name = name;
		this.typeAnimal = typeAnimal;
		this.age = age;
		this.weight = weight;
		this.ownerP = ownerP;
		this.report = report;
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
	
	
	public ClientHuman getOwnerP(){
		return ownerP;
	}
	public void setOwnerP (ClientHuman ownerP){
		this.ownerP = ownerP;
	}
	
	public ClinicHistory getReport(){
		return report;
	}
	public void setReport(ClinicHistory report){
		this.report = report;
	}		
	
	//metodos
	
	//hacer relacion con el dueño ppara poder traer el nombre
	public String dateOwner(){
		String msj = ownerP.showClient();
		
		return msj;
	}
	
	public String detecTypeAnimal(int typeAnimal){
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
	
	
	public String showPet(){
		String msj = "Nombre:"+getName()+"\n";
		
		msj +="tipo"+detecTypeAnimal()+"\n";
		msj +="edad"+getAge()+"\n";
		msj +="peso"+getWeight()+"\n";
		
		return msj;
	}
	
	//calcular costo por dia de gato
	public double costHospitalizationCat(){
		
		double cost = 0.0;
		if (typeAnimal ==1 && weight >= 1 || weight<=3){
			cost = 10.000;
		}
		else if(typeAnimal ==1 && weight >= 3.1 || weight<=10){
			cost =12.000;
		}
		else if (typeAnimal ==1 && weight >= 10.1 || weight<=20){
			cost =15.000;
		}
		else{
			cost=20.000;
		}
		
		return cost;
	}
	
	//calcular costo por dia de perro
	public double costHospitalizationDog(){
		double cost = 0.0;
		if (typeAnimal ==2 && weight >= 1 || weight<=3){
			cost = 15.000;
		}
		else if(typeAnimal ==2 && weight >= 3.1 || weight<=10){
			cost =17.000;
		}
		else if (typeAnimal ==2 && weight >= 10.1 || weight<=20){
			cost =20.000;
		}
		else{
			cost=25.000;
		}
		
		return cost;
	}
	
	//calcular costo por dia de ave
	public double costHospitalizationBird(){
		double cost = 0.0;
		if (typeAnimal ==3 && weight >= 1 || weight<=3){
			cost = 10.000;
		}
		else if(typeAnimal ==3 && weight >= 3.1 || weight<=10){
			cost =12.000;
		}
		else if (typeAnimal ==3 && weight >= 10.1 || weight<=20){
			cost =20.000;
		}
		else{
			cost=25.000;
		}
		
		return cost;
		
	}
	//calcular costo por dia de otro
	public double costHospitalizationOter(){
		double cost = 0.0;
		if (typeAnimal != 3 && weight >= 1 || weight<=3){
			cost = 10.000;
		}
		else if(typeAnimal !=3 && weight >= 3.1 || weight<=10){
			cost =17.000;
		}
		else if (typeAnimal !=3 && weight >= 10.1 || weight<=20){
			cost =30.000;
		}
		else{
			cost=33.000;
		}
	
		return cost;
	}
	
	public void calCostForAll(){
		
		costHospitalizationBird();
		costHospitalizationCat();
		costHospitalizationDog();
		costHospitalizationOter();
	}
	
	public String dateContac(){
	return ownerP.showDateContac();
	}
	
	//tiene los datos enla historia clinica
	public String reportPet(){
		
		return report.showClinicHistory();
	}
}