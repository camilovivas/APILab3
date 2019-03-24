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
	
	public void showpet1(){
		hospitalization1.get.showPet();
		
	}
	public void showpet2(){
		hospitalization2.get.showPet();
		
	}
	public void showpet3(){
		hospitalization3.get.showPet();
		
	}
	public void showpet4(){
		hospitalization4.get.showPet();
		
	}
	public void showpet5(){
		hospitalization5.get.showPet();
		
	}
	public void showpet6(){
		hospitalization6.get.showPet();
		
	}
	public void showpet7(){
		hospitalization7.get.showPet();
		
	}
	public void showpet8(){
		hospitalization8.get.showPet();
		
	}
	
	//mostrar los nombres de la mascotas que hay en los cuartos con el numero para que lo identifique en el main
	public String showNamePet1(){
		return "1"+hospitalization1.getName();
	}
	public String showNamePet2(){
		return "2"+hospitalization2.getName();
	}
	public String showNamePet3(){
		return "3"+hospitalization3.getName();
	}
	public String showNamePet4(){
		return "4"+hospitalization4.getName();
	}
	public String showNamePet5(){
		return "5"+hospitalization5.getName();
	}
	public String showNamePet6(){
		return "6"+hospitalization6.getName();
	}
	public String showNamePet7(){
		return "7"+hospitalization7.getName();
	}
	public String showNamePet8(){
		return "8"+hospitalization8.getName();
	}

	
}