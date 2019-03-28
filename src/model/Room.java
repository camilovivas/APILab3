package model;
import java.util.ArrayList;


public class Room {
	
	//atributos
	private boolean status;
	private int num;
	
	//relaciones
	private Pet hospitalization;
	
	//constructor
	public Room (boolean status, int num, Pet hospitalization){
		this.status = status;
		this.num = num;
		this.hospitalization = hospitalization;
	}
	
	//get y set
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public int getNum(){
		return num;
	}
	public void setNum (int num){
		this.num = num;
	}
	
	public Pet getHospitalization(){
		return hospitalization;
		
	}
	public void setHospitalization(Pet hospitalization){
		this.hospitalization = hospitalization;
	}
	
	public String Num(){
		String msj;
		
		msj += "el numero del cuarto es:"+getNum;
		
		return msj;
	}
	
	
	
	public String report(){
		String msj;
		
		msj = getNum+"\n";
		msj += hospitalization.reportPet();
		
		return msj;
	}
	public String dateContacOwner(){
		return hospitalization.dateContac();
	}
	
	public String showPetinRoom(){
	return hospitalization.showPet();
	}
	
	public String namePet(){
		return hospitalization.getName();
	}
	
}