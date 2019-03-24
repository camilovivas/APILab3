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
	public ClinicHistory (String status, String diagnosis, String symptom, Date entry, Pet chp){
		this.status = status;
		this.diagnosis = diagnosis;
		this.symptom = symptom;
		this.chp = chp;
		this.cure = new ArrayList<Medicine>();
		this.entry = entry;
		initMedicine();
		initDate();
		
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
	public void initMedicine(){
		Medicine m1 = new Medicine( "acetominofem", 1.2+"cm", 4.000, 6+"horas");
		cure.add(m1);
	}
	
	public String showClinicHistory(){
		String msj;
		
		msj = "el estado de la hisroria clinoica es:"+status+"\n";
		msj += "el diagnostico es:"+diagnosis+"\n";
		msj += "los sintomas son:"+symptom+"\n";
		msj += "la fecha ingreso:"+entry.showDate();
		
		return msj;
	}
	
	public void initDate(){

		Date d1 = new Date(1,1,2019);
	
	}
}