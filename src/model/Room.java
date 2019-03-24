package model;
import java.util.ArrayList;


public class Room {
	
	//atributos
	private boolean status;
	private int num;
	private Pet hospitalization1;
	private Pet hospitalization2;
	private Pet hospitalization3;
	private Pet hospitalization4;
	private Pet hospitalization5;
	private Pet hospitalization6;
	private Pet hospitalization7;
	private Pet hospitalization8;
	//relaciones
	
	
	//metodos
	public Room (boolean status, int num, Pet hospitalization1,Pet hospitalization2,Pet hospitalization3,Pet hospitalization4,Pet hospitalization5,Pet hospitalization6,Pet hospitalization7,Pet hospitalization8){
		this.status = status;
		this.num = num;
		this.hospitalization1 = hospitalization1;
		this.hospitalization2 = hospitalization2;
		this.hospitalization3 = hospitalization3;
		this.hospitalization4 = hospitalization4;
		this.hospitalization5 = hospitalization5;
		this.hospitalization6 = hospitalization6;
		this.hospitalization7 = hospitalization7;
		this.hospitalization8 = hospitalization8;
	}
	
	public String getNum(){
		String msj;
		
		msj += "el numero del cuarto es:"+num;
		
		return msj;
	}
	
	public void initPets(){
		
		
	}
	
}