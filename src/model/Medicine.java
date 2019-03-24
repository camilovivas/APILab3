package model;

public class Medicine{
	//atributos
	
	private String name;
	private double dose;
	private double costDose;
	private int frequency;
	
	//relaciones
	
	
	//metodos
	public Medicine (String name, double dose, double costDose, int frequency){
		this.name = name;
		this.dose = dose;
		this.costDose = costDose;
		this.frequency = frequency;
	
	}
	
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public double getDose (){
		return dose;
	}
	public void setDose (double dose){
		this.dose = dose;
	}
	
	
	public double getCostDose(){
		return costDose;
	}
	public void setCostDose (double costDose){
		this.costDose = costDose;
	}
	
	
	public int getFrequency(){
		return frequency ;
	}
	public void setFrequency (int frequency){
		this.frequency = frequency;
	}
	

}