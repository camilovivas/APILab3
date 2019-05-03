/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.ArrayList;
/**
*Description Thhis class have information above the rooms of vererinary and clinic history of the pets hospitalized
*/

public class Room {
	
	//atributos
	private boolean status;
	private int num;
	
	//relaciones
	private ClinicHistory hospitalization;
	
	//constructor
/**
*Description This is the build of class Room
*/	
	public Room (boolean status, int num, ClinicHistory hospitalization){
		this.status = status;
		this.num = num;
		this.hospitalization = hospitalization;
	}
	
	//get y set
	public boolean getStatus(){
		return status;
	}
	/**
	*Description
	*@param
	*/
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public int getNum(){
		return num;
	}
	/**
	*Description
	*@param
	*/
	public void setNum (int num){
		this.num = num;
	}
	
	public ClinicHistory getHospitalization(){
		return hospitalization;
		
	}
	/**
	*Description
	*@param
	*/
	public void setHospitalization(ClinicHistory hospitalization){
		this.hospitalization = hospitalization;
	}
	
	//numero del cuarto
	public String Num(){
		
		return "el numero del cuarto es:"+num;
		
	}
	
	
	//reporte de animal
	/**
	*Description This method show the pet in the room
	*@return String whit number fromm room and information of the pet 
	*/
	public String report(){
		String msj;
		
		msj = num+"\n";
		msj += hospitalization.showPet();
		
		return msj;
	}
	
	//datos del dueño
	public String dateContacOwner(){
		return hospitalization.dateOwnerPet();
	}
	
	//ver los detalles de la mascota que etsa en el cuarto
	public Pet showPetinRoom(){
	return hospitalization.showPet();
	}
	
	//nombre del animal que esta en el cuarto
	public String namePet(){
		return hospitalization.showNamePet();
	}
	
	public void dateOut(Date out){
		hospitalization.setOut(out);
		
	}
	public void addOut(int day, int month, int year){
		hospitalization.addDateOut(day, month, year);
	}
	
	public void statusHist (boolean statusH){
		hospitalization.setStatus(statusH);
	}
	
		
}