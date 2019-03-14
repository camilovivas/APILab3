package model;

public class ClinicHistory{
	
	//atributos
	
	private String status;
	private String diagnosis;
	private String symptom;
	
	//metodos
	public ClinicHistory (String status, String diagnosis, String symptom){
		this.status = status;
		this.diagnosis = diagnosis;
		this.symptom = symptom;
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
}