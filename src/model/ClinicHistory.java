/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClinicHistory{
	
	//atributos
	
	private boolean status;
	private String diagnosis;
	private String symptom;
	private ArrayList<Medicine> cure;

	//relaciones
	private Date entry;
	private Date out;
	private Pet chp;
	
/**
*Description This is the build of class ClinicHistory
*/
	public ClinicHistory (boolean status, String diagnosis, String symptom, Date entry, Date out, Pet chp){
		this.status = status;
		this.diagnosis = diagnosis;
		this.symptom = symptom;
		this.chp = chp;
		cure = new ArrayList<Medicine>();
		this.entry = entry;
		this.out = out;
		
	}
	
	
	//get y set
/**
*
*
*/	
	public boolean getStatus (){
		return status;
	}
/**
*
*
*/	
	public void setStatus (boolean status){
		this.status = status;
	}
	
/**
*
*
*/	
	public String getDiagnosis (){
		return diagnosis;
	}
/**
*
*
*/	
	public void setDiagnosis (String diagnosis){
		this.diagnosis = diagnosis;
	}
	
/**
*
*
*/
	public String getSymptom (){
		return symptom;
	}
/**
*
*
*/
	public void setSymptom (String symptom){
		this.symptom = symptom;
	}
	
/**
*
*
*/	
	public Date getEntry(){
		return entry;
	}
/**
*
*
*/	
	public void setEntry (Date entry){
		this.entry = entry;
	}
	
/**
*
*
*/	
	public Date getOut(){
		return out;
	}
	
/**
*
*
*/	
	public Pet getChp(){
		return chp;
	}
/**
*
*
*/	
	public void setChp(Pet chp){
		this.chp = chp;
	}
	
/**
*
*
*/	
	public ArrayList<Medicine>  getCure(){
		return cure;
	}
/**
*
*
*/	
	public void setCure (ArrayList<Medicine> cure){
		this.cure = cure;
	}
	
	
	//metodos	
/**
*
*
*/
	public String status(){
		String msj;
		if(status == true){
			msj = "abierta";
		}
		else{
			msj = "cerrada";
		}
		return msj;
	}
	
/**
*
*
*/	
	public String toString(){
		
		String msj;
		msj = "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		msj += "|||                   HISTORIA CLINICA                  |||";
		msj += "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		msj += "el estado de la historia clinica es:"+status();
		msj += "+-----------------------+---------------------------------+";
		msj += "Datos de la mascota:"+"\n"+chp;
		msj += "+-----------------------+---------------------------------+";
		msj += "Datos del dueño:"+"\n"+chp.dateOwner();
		msj += "+-----------------------+---------------------------------+";
		msj += "El diagnostico es:"+getDiagnosis()+"\n";
		msj += "+-----------------------+---------------------------------+";
		msj += "Los sintomas que presentaba la mascota:"+getSymptom()+"\n";
		msj += "+-----------------------+---------------------------------+";
		msj += "los medicamentos recetados:";
		for(int i = 0; i<cure.size(); i++){
		msj += "\n"+cure.get(i);
		}
		msj += "+-----------------------+---------------------------------+";
		msj += "fecha de entrada:"+entry;
		msj += "+-----------------------+---------------------------------+";
		msj += "fecha de salida:";
		if(out == null){
			msj += "no se ha dado de alta al animal";
		}
		else{
			msj += "es"+out;
		}
		msj += "+-----------------------+---------------------------------+";
		msj += "costo de la hozpitalizacion"+costHospitalization();
		msj += "+-----------------------+---------------------------------+";
		msj += "costo de total de los medicamentos"+calculateCostMedicine();
		msj += "+-----------------------+---------------------------------+";
		msj += "TOTAL"+calculateEarnings()+"$";
		msj += "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		
		return msj;
	}
/**
*
*
*/
	//calcula el costo de todas los medicamentos
	public double calculateCostMedicine(){
		double cost = 0.0;
		for(int k = 0; k<cure.size(); k++){
			cost += cure.get(k).costMedicine();
			
		}
		return cost;
	}
	
/**
*
*
*/	
	//preguntar al profe para ver con cual multiplico el costo
	public long daysOfHosp(){
		long days;
		if(out ==null){
			days = 1;
		}
		else{
			LocalDate ld1 = LocalDate.of(entry.getYear(), entry.getMonth(), entry.getDay());
			LocalDate ld2 = LocalDate.of(out.getYear(), out.getMonth(), out.getDay());
		
			days= ld1.until(ld2, ChronoUnit.DAYS);
		}
		return days;
	}
	
/**
*
*
*/
	//calcular costo segun el tipo
	public double costHospitalization(){
		double cost = 0.0;
		if(chp.getTypeAnimal() ==1){
			if (chp.getWeight() >= 1 || chp.getWeight()<=3){
				cost = 10.000;
			}
			else if(chp.getWeight() >= 3.1 || chp.getWeight()<=10){
				cost =12.000;
			}
			else if (chp.getWeight() >= 10.1 || chp.getWeight()<=20){
				cost =15.000;
			}
			else{
				cost=20.000;
			}
		}
		
		else if(chp.getTypeAnimal() ==2){
			if (chp.getWeight() >= 1 || chp.getWeight()<=3){
				cost = 15.000;
			}
			else if(chp.getWeight() >= 3.1 || chp.getWeight()<=10){
				cost =17.000;
			}
			else if (chp.getWeight() >= 10.1 || chp.getWeight()<=20){
				cost =20.000;
			}
			else{
				cost=25.000;
			}
		
		}
		
		else if(chp.getTypeAnimal() ==3){
			if  (chp.getWeight() >= 1 || chp.getWeight()<=3){
				cost = 10.000;
			}
			else if(chp.getWeight() >= 3.1 || chp.getWeight()<=10){
				cost =12.000;
			}
			else if (chp.getWeight() >= 10.1 || chp.getWeight()<=20){
				cost =20.000;
			}
			else{
				cost=25.000;
			}
		}
		
		else{
			if (chp.getWeight() >= 1 || chp.getWeight()<=3){
				cost = 10.000;
			}
			else if(chp.getWeight() >= 3.1 || chp.getWeight()<=10){
				cost =17.000;
			}
			else if (chp.getWeight() >= 10.1 || chp.getWeight()<=20){
				cost =30.000;
			}
			else{
				cost=33.000;
			}
		}
		return cost;
	
	}
/**
*
*
*/	
	//calcula las ganancias por hospitalizacion mas las de la medicina
	public double calculateEarnings(){
		return calculateCostMedicine()+costHospitalization();
	}
/**
*
*
*/	
	//trae los datos de contacto del dueño de la mascota
	public String dateOwnerPet(){
		return chp.dateContac();
	}
/**
*
*
*/	
	//ver la mascota con el toString
	public Pet showPet(){
		return getChp();
	}
/**
*
*
*/	
	//ver solo nombre de la mascota
	public String showNamePet(){
		return chp.getName();
	}
/**
*
*
*/	
	public void addcure(Medicine m1){
		cure.add(m1);
	}
/**
*
*
*/	
	public void addDateEntry(int day, int month, int year){
		Date entry = new Date (day, month, year);
	}
/**
*
*
*/	
	//crea fecha de salida y se pone el el set de out
	public void addDateOut(int day, int month, int year){
		Date out = new Date (day, month, year);
		setOut(out);
	}
/**
*
*
*/	
	public void setOut(Date out){
		this.out = out;
	}
	
}