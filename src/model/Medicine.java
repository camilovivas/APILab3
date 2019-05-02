/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
/**
*Description This class have information above the medicines of the pets 
*/
public class Medicine{
	//atributos
	
	private String name;
	private double dose;
	private double costDose;
	private int frequency;
	
	//relaciones
	
	
	//metodos
/**
*Description This is the build of class Medicine
*@param name the name of medicines
*@param dose the quantity 
*@param costDose the cost for dose
*@param frequency times that the medicine should be taken daily
*/
	public Medicine (String name, double dose, double costDose, int frequency){
		this.name = name;
		this.dose = dose;
		this.costDose = costDose;
		this.frequency = frequency;
	
	}
	
	public String getName(){
		return name;
	}
	/**
	*Description
	*@param
	*/
	public void setName (String name){
		this.name = name;
	}
	
	
	public double getDose (){
		return dose;
	}
	/**
	*Description
	*@param
	*/
	public void setDose (double dose){
		this.dose = dose;
	}
	
	
	public double getCostDose(){
		return costDose;
	}
	/**
	*Description
	*@param
	*/
	public void setCostDose (double costDose){
		this.costDose = costDose;
	}
	
	
	public int getFrequency(){
		return frequency ;
	}
	/**
	*Description
	*@param
	*/
	public void setFrequency (int frequency){
		this.frequency = frequency;
	}
	
	//calcula el costo de la medicina
	public double costMedicine(){
		return dose*costDose;	
	}
	
	public String toString(){
		String msj;
		msj = name;
		msj += dose;
		msj += costDose;
		msj += frequency;
		return msj;	
	}
	
}