/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;

public class Date {
	
	//atributos
	
	private int day;
	private int month;
	private int year;
	
/**
*Description This is the build of date
*/
	public Date (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
/**
*Description This metod gets the day
*@return the day
*/
	public int getDay(){
		return day;
	}
/**
*
*
*/
	public void setDay (int day){
		this.day = day;
	}
/**
*Description This metod gets the month
*@return the month
*/
	public int getMonth(){
		return month;
	}
/**
*
*
*/
	public void setMonth (int month){
		this.month = month;
	}
/**
*
*
*/	
	public int getYear(){
		return year;
	}
/**
*Description This method sets the year
*@param  year
*
*/	
	public void setYear (int year){
		this.year = year;
	}
/**
*
*
*/	
	public String toString(){
		return day+"/"+month+"/"+year;	
	}
	
	
}