package model;

public class ClientHuman {
	//atributos
	private String name;
	private int id;
	private int address;
	private	int phone;
	
	//metodos

	public ClientHuman (String name, int id, int address, int phone){
	
		this.name = name;
		this.id = id;
		this.address  = address;
		this.phone = phone;
	
	}
	
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name = name;
	}
	
	
	public int getId(){
		return id;
	}
	public void setId (int id){
		this.id = id;
	}
	
	
	public int getAddress(){
		return address;
	}
	public void setAddress (int address){
		this. address = address;
	}
	
	
	public int getPhone(){
		return phone;
	}
	public void setPhone(int phone){
		this.phone = phone;
	}
}