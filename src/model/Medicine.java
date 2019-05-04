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
	*Description This method get the dose 
	*@return the dose 
	*/
	public double getDose (){
		return dose;
	}
	/**
	*Description This method set the dose
	*@param dose the quantity
	*/
	public void setDose (double dose){
		this.dose = dose;
	}
	
	/**
	*Description This method  get the cost of each dose
	*@return the cost of each dose
	*/
	public double getCostDose(){
		return costDose;
	}
	/**
	*Description This method set the cost of each dose
	*@param costDose the cost of each dose
	*/
	public void setCostDose (double costDose){
		this.costDose = costDose;
	}
	/**
	*Description This method get the frequency
	*@return times that the medicine should be taken daily
	*/
	public int getFrequency(){
		return frequency ;
	}
	/**
	*Description This method set the frequency
	*@param frequency times that the medicine should be taken daily
	*/
	public void setFrequency (int frequency){
		this.frequency = frequency;
	}
	
	//calcula el costo de la medicina
	/**
	*Description This method calculate the cost of medicine
	*@return the cost of medicine
	*/
	public double costMedicine(){
		return dose*costDose;	
	}
	
	/**
	*Description This method show information of this class
	*@return String whit information of this class
	*/	
	public String toString(){
		String msj;
		msj = name;
		msj += dose;
		msj += costDose;
		msj += frequency;
		return msj;	
	}
	
}