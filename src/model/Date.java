/**
*Universidad Icesi (Cali-Colombia)
*laboratorio 4 APO I
*@autor: Camilo Vivas <camilo-152000@hotmail.com>
*Date:
*/
package model;
/**
*Description this class have information about the dates of the other class
*/
public class Date {
	
	//atributos
	
	private int day;
	private int month;
	private int year;
	
	/**
	*Description This is the build of date
	*@param day the days of month
	*@param month the month of year
	*@param year the current year 
	*/
	public Date (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	/**
	*Description This method gets the day
	*@return the day
	*/
	public int getDay(){
		return day;
	}
	/**
	*Description This method set the day
	*@param day the day of month
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
	*Description This method set the month
	*@param month the month of year
	*/
	public void setMonth (int month){
		this.month = month;
	}
	/**
	*Description This method getv the year
	*@return the year
	*/	
	public int getYear(){
		return year;
	}
	/**
	*Description This method sets the year
	*@param year the year 
	*/	
	public void setYear (int year){
		this.year = year;
	}
	/**
	*Description This method show information of this class
	*@return String whit information of this class
	*/	
	public String toString(){
		return day+"/"+month+"/"+year;	
	}
	
	
}