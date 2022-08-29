/*
 * Written by Zachary Ziehl
 */
import java.util.Scanner;



import java.io.*;

public class DataManager3 {
	public static final String DELIM = "\t";
	public static final String ENDLINE = "\n"; 
	public static final int BODY = 3;
	private static Scanner keyboard = new Scanner(System.in);
	private GenLL<Data3> dataSet;
	public DataManager3()
	{
		dataSet = new GenLL<Data3>();
	}
	/**
	 * This method adds a data point
	 * @param aData the data point
	 */
	public void addData(Data3 aData)
	{
		dataSet.add(aData);
	}
	/**
	 * This method removes the current data point
	 * @param aData the data point
	 */
	public void removeData(Data aData)
	{
		dataSet.removeCurrent();
	}
	/**
	 * This method prints the dataSet 
	 */
	public void printData()
	{
		dataSet.print();
	}
	/**
	 * This method writes the data to the data file
	 */
	public void writeDataFile()
	{
		try
		{
			FileWriter fileWriter = new FileWriter("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Written Data");
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    
			dataSet.reset();
			while(dataSet.hasMore())
			{
				Data3 aData = dataSet.getCurrent();
				printWriter.println(aData.getCrosshead()+ DELIM+aData.getLoad()+DELIM+aData.getTime()+ENDLINE);//+DELIM+aGame.getPrice());
				dataSet.gotoNext();
			}
			printWriter.close();
		}
		catch(Exception e)
			{
			e.printStackTrace();
			
			}
		
		} 
	/**
	 * This method deletes all data
	 */
	public void deleteAllData()
	{
		dataSet.reset();
		while(dataSet.hasMore())
		{
			
				dataSet.removeCurrent();
		}
	}
	
	/**
	 * This method Reads in the file being searched
	 */
	public void fileListReader()
	{
		try
		{
			Scanner fileScanner = new Scanner(new File("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Data Set"));			
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == BODY)
				{
					String crosshead = splitLines[0];
					String load = splitLines[1];
					String time = splitLines[2];
					Data3 aData = new Data3(crosshead, load, time);
					this.addData(aData);
				}
				

			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * This method searches the CrossHead Data
	 * @param search = the data entered being searched
	 * @throws IOException
	 */
	public void searchCrossDat(String search) throws IOException
	{
		 if(search == null)
			 return;
		 try {
				Scanner readFile = new Scanner(new File("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Data Set"));			
				while(readFile.hasNextLine())
				{
					String fileLine = readFile.nextLine();
					String[] splitLines = fileLine.split(DELIM);
					if(splitLines.length == BODY)
					{
						String crosshead = splitLines[0];
						String load = splitLines[1];
						String time = splitLines[2];
						if(crosshead.toUpperCase().contains(search.toUpperCase()))
						 {
							Data3 aData = new Data3(crosshead, load, time);
							this.addData(aData);
							System.out.println(fileLine);
						 }
					
					}
				}
				readFile.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	/**
	 * This method searches the load data
	 * @param search = teh string being entered to be searched
	 */
	public void searchLoadDat(String search)
	{
		if(search == null)
			 return;
		 try {
				Scanner readFile = new Scanner(new File("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Data Set"));			
				while(readFile.hasNextLine())
				{
					String fileLine = readFile.nextLine();
					String[] splitLines = fileLine.split(DELIM);
					if(splitLines.length == BODY)
					{
						String crosshead = splitLines[0];
						String load = splitLines[1];
						String time = splitLines[2];
						if(load.toUpperCase().contains(search.toUpperCase()))
						 {
							Data3 aData = new Data3(crosshead, load, time);
							this.addData(aData);
							System.out.println(fileLine);
						 }
					
					}
				}
				readFile.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	/**
	 * This method searches the time data
	 * @param search = the string being entered to be searched
	 */
	public void searchTimeDat(String search)//list. looks for characters in the file. breaks them down with delims. looks in th console section
	{
		if(search == null)
			 return;
		 try {
				Scanner readFile = new Scanner(new File("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Data Set"));			
				while(readFile.hasNextLine())
				{
					String fileLine = readFile.nextLine();
					String[] splitLines = fileLine.split(DELIM);
					if(splitLines.length == BODY)
					{
						String crosshead = splitLines[0];
						String load = splitLines[1];
						String time = splitLines[2];
						if(time.toUpperCase().contains(search.toUpperCase()))
						 {
							Data3 aData = new Data3(crosshead, load, time);
							this.addData(aData);
							System.out.println(fileLine);
						 }
					
					}
				}
				readFile.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	/**
	 * This method searches all the data
	 * @param search = the string being searched
	 */
	public void searchData(String search) 
	{
		 if(search == null)
			 return;
		 try
		 {
			 Scanner readFile = new Scanner( new File("C:\\Users\\oracl\\eclipse-workspace\\Decision Making\\src\\Data Set"));
			 while(readFile.hasNextLine())
				 {
				 String fileLine = readFile.nextLine();
					String[] splitLines = fileLine.split(DELIM);
					if(splitLines.length == BODY)
					{
						String crosshead = splitLines[0];
						String load = splitLines[1];
						String time = splitLines[2];
						if(crosshead.toUpperCase().contains(search.toUpperCase()) || 
								load.toUpperCase().contains(search.toUpperCase())||
								time.toUpperCase().contains(search.toUpperCase())
								)
						 {
							Data3 aData = new Data3(crosshead, load, time);
							this.addData(aData);
							System.out.println(fileLine);
						 }
				 }
			 }
			 readFile.close();
			 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	}
	
}
