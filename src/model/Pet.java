package model;

public class Pet{
	
	//atributos
	
	private String name;
	private int typeAnimal;
	private int age;
	private double weight;
	
	//metodos
	
	public Pet (String name, int typeAnimal, int age, double weight){
		this.name = name;
		this.typeAnimal = typeAnimal;
		this.age = age;
		this.weight = weight;
		
		
	}
	
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
}