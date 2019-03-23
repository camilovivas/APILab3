package model;
import java.util.ArrayList;


public class Room {
	
	//atributos
	private boolean status;
	private int num;
	private ArrayList<Pet> hospitalization;
	//relaciones
	
	
	//metodos
	public Room (boolean status, int num){
		this.status = status;
		this.num = num;
		hospitalization = new ArrayList<Pet>();
	}
	
	public string getNum(){
		String msj;
		
		msj += "el numero del cuarto es:"+num;
		
		return msj;
	}
	
	
}