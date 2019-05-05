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
	/**
	*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New medicines were added to the patient clinic story.
	*@param The medicine name. This param must be not null.
	*@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
	*@param The medicine cost by each dose. This param could be empty.
	*@param The frequency of medicine application. This param could be empty.
	*@return A String
	*/
	public String addNewMedicines(String name, double dose, double costDose, int frequency){
		String msj = hospitalization.addNewMedicines(name, dose, costDose, frequency);
		return msj;
	}
	
	/**
	*Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: A new symptom were added to the patient clinic story.
	*@param symptomNew This param must be not null.
	*/
	public void addNewSymptom(String symptomNew){
		hospitalization.addNewSymptom(symptomNew);
	}
	
	/**
	*Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New notes were added to the possible diagnostic in the patient clinic story.
	*@param diagnostic. This param must be not null.
	*/
	public void addNewDiagnostic(String diagnostic){
		hospitalization.addNewDiagnostic(diagnostic);
	}
	
}