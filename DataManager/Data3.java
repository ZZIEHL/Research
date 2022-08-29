import java.util.Scanner;
import java.io.*;
/*
 * Written by Zachary Ziehl
 */
public class Data3 {
	private String crosshead;
	private String load;
	private String time;
	private int price;
	public Data3()
	{
		this.crosshead = this.load = this.time= "none";
		
	}
	public Data3(String aCrosshead, String aLoad, String aTime)
	{
		this.setCrosshead(aCrosshead);
		this.setLoad(aLoad);
		this.setTime(aTime);
	}
	/**
	 * this method returns the current Crosshead data
	 * @return
	 */
	public String getCrosshead() {
		return this.crosshead;
	}
	/**
	 * This method takes in a Crosshead data point and sets it
	 * @param aCrosshead = the Crosshead string 
	 */
	public void setCrosshead(String aCrosshead) {
		if(aCrosshead != null)
			this.crosshead = aCrosshead;
		else 
			this.crosshead = "none";
	}
	/**
	 * This method returns the current load data
	 * @return
	 */
	public String getLoad() {
		return this.load;
	}
	/**
	 * This method takes in a data point for load in the form of a string and sets it
	 * @param aLoad = the data point for load
	 */
	public void setLoad(String aLoad) {
		if(aLoad != null)
			this.load = aLoad;
		else 
			this.load = "none";
	}
	/**
	 * This method returns the current time data
	 * @return
	 */
	public String getTime() {
		return this.time;
	}
	/**
	 * This method takes in a time data point and sets it
	 * @param aTime = the time data 
	 */
	public void setTime(String aTime) {
		if(aTime != null)
			this.time = aTime;
		else 
			this.time = "none";
	}
	/**
	 * This method returns the current price data
	 * @return
	 */
	public int getPrice() {
		return this.price;
	}
	/**
	 * This method takes in a time data point and sets it
	 * @param aPrice
	 */
	public void setPrice(int aPrice) {
		if(aPrice >= 0)
			this.price = aPrice;
		else 
			this.price = 0;
	}
	/**
	 * This method returns the string of current data points
	 */
	public String toString()
	{
		return " Crosshead: " + this.crosshead+ " Load: " + this.load + " Time: " + this.time ;
	}
	/**
	 * This method takes in a node of data points and checks if the current one is equal to it
	 * @param aData = the data node being compares
	 * @return
	 */
	public boolean equals(Data aData)
	{
		return aData != null &&
				this.crosshead.equals(aData.getCrosshead())&&
				this.load.equals(aData.getLoad())&&
				this.time.equals(aData.getTime())&&
				this.price == aData.getPrice();
	}
}
