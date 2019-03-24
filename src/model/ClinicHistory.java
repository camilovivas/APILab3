package model;
import java.util.ArrayList;


public class ClinicHistory{
	
	//atributos
	
	private String status;
	private String diagnosis;
	private String symptom;
	private Pet chp;
	private ArrayList<Medicine> cure;

	//relaciones
	private Date entry;
	
	
	//metodos
	public ClinicHistory (String status, String diagnosis, String symptom, Date entry, Medicine cure, Pet chp){
		this.status = status;
		this.diagnosis = diagnosis;
		this.symptom = symptom;
		this.chp = chp;
		this.cure = new ArrayList<Medicine>();
		this.entry = entry;
		
	}
	
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
	
	public String ShowClinicHistory(){
		
		String msj;
		
	}
	
	public String showClinicHistory(){
		String msj;
		
		msj = "el estado de la hisroria clinoica es:"+status+"\n";
		msj += "el diagnostico es:"+diagnosis+"\n";
		msj += "los sintomas son:"+symptom+"\n";
		msj += "la fecha ingreso:"+entry.showDate();
		
		return msj;
	}
	
}