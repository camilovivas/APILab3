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
	
	//numero del cuarto
	public String Num(){
		
		return "el numero del cuarto es:"+getNum;
		
	}
	
	
	//reporte de animal
	public String report(){
		String msj;
		
		msj = getNum+"\n";
		msj += hospitalization.reportPet();
		
		return msj;
	}
	
	//ddadtos del dueño
	public String dateContacOwner(){
		return hospitalization.dateContac();
	}
	
	//ver los detalles de la mascota que etsa en el cuarto
	public String showPetinRoom(){
	return hospitalization.showPet();
	}
	
	//nombre del animal que esta en el cuarto
	public String namePet(){
		return hospitalization.getName();
	}
	
	//para cambiar el estado de la historia clinica cuando se de de alta al animal 
	public void statusHist(boolean status){
		hospitalization.statusHis(status);
	}
	
}