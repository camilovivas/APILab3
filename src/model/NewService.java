/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.*;

public class NewService{
	//constantes
	public static final char BATH_VETERINARY = 'v';
	public static final char BATH_DOMICILE = 'd';
	public static final char NAIL_CUTTING = 'c';
	public static final char DENTAL_PROPHYLAXIS = 'p';
	public static final char VACCINATION = 'a';
	
	//atributos
	private char typeService;
	private double cost;
	private String idWoner;
	private String namePet;
	
	//relacion
	private Date register;
	//constructor
/**
*Description This is the build of class NewService
*/
	public NewService(char typeService){
		this.typeService = typeService;
		this.cost = calculateCost();
		this.idWoner = idWoner;
		this.namePet = namePet;
	
	}
	//get y set
	public char getTypeService(){
		return typeService;
	}
	public double getCost(){
		return cost;
	}
	
	public Date getRegister(){
		return register;	
	}
	
	//metodos
	
	
	public String toString(){
		String msj;
		msj = "el tipo de servicio:"+typeService;
		msj += "el costo:"+cost;
		msj += "ID del cliente"+idWoner;
		msj += "nombre mascota"+namePet;
		msj += "fecha:"+getRegister();
		return msj;
		
	}
	
	public double calculateCost(){
		double cost = 0.0;
		if(typeService == BATH_VETERINARY){
			cost = 20.000;
		}
		else if(typeService == BATH_DOMICILE){
			cost = 30.000;
		}
		else if(typeService == NAIL_CUTTING){
			cost = 8.000;
		}
		else if(typeService == DENTAL_PROPHYLAXIS){
			cost = 12.000;
		}
		else if(typeService == VACCINATION){
			cost = 45.000;
		}
		return cost;
	}
}