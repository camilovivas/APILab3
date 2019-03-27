package model;
import java.util.ArrayList;


public class ClinicHistory{
	
	//atributos
	
	private double status;
	private String diagnosis;
	private String symptom;
	private ArrayList<Medicine> cure;

	//relaciones
	private Date entry;
	private Pet chp;
	
	//constructor
	public ClinicHistory (double status, String diagnosis, String symptom, Date entry, Pet chp){
		this.status = status;
		this.diagnosis = diagnosis;
		this.symptom = symptom;
		this.chp = chp;
		cure = new ArrayList<Medicine>();
		this.entry = entry;
		
	}
	
	
	//get y set
	public String getStatus (){
		return status;
	}
	public void setStatus ( String status){
		this.status = status;
	}
	
	
	public String getDiagnosis (){
		return diagnosis;
	}
	public void setDiagnosis (String diagnosis){
		this.diagnosis = diagnosis;
	}
	
	
	public String getSymptom (){
		return symptom;
	}
	public void setSymptom (String symptom){
		this.symptom = symptom;
	}
	
	
	public ArrayList<Medicine>  getCure(){
		
		return cure;
	}
	public void setCure (ArrayList<Medicine> cure){
		this.cure = cure;
	}
	
	
	//metodos	
	public String status(){
		String msj;
		if(status == true){
			msj = abierta;
		}
		else{
			msj = cerrada;
		}
		return msj,
	}
	
	
	public String ShowReportClinicHistory(){
		
		String msj;
		msj += "Datos de la mascota:"+"\n"+chp.showPet();
		msj += "+----------------------+---------------------------------+";
		msj += "Datos del dueño:"+"\n"+chp.dateOwner();
		msj += "+----------------------+---------------------------------+";
		msj += "El diagnostico es:"+getDiagnosis+"\n";
		msj += "+----------------------+---------------------------------+";
		msj += "Los sintomas que presentaba la mascota:"+getSymptom+"\n";
		msj += "+----------------------+---------------------------------+";
		
		
		return msj;
	}
	
	
	public String showClinicHistory(){
		String msj;
		
		msj = "el estado de la hisroria clinica es:"+status+"\n";
		msj += "el diagnostico es:"+diagnosis+"\n";
		msj += "los sintomas son:"+symptom+"\n";
		msj += "la fecha ingreso:"+entry.showDate();
		
		return msj;
	}
	

}