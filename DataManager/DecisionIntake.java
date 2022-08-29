/*
 * written by Zachary Ziehl
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; 
public class DecisionIntake {
	private static Scanner keyboard = new Scanner(System.in);
	private static DataManager dataManager = new DataManager();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method sub0
		boolean cont= true;
		while(cont)
		{
			//dataManager.readOriginal();
		System.out.println("how would you like to filter your results? Choose Crosshead, Load"
				+ ", Time, Extensometer, or if you would like to quit, then type quit");
		String decision = keyboard.nextLine();
		if(decision.equalsIgnoreCase("Crosshead"))
		{
			System.out.println("how would you like to filter your Crosshead results? Choose greater than, less than, or equal to");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("Greater Than"))
			{
				dataManager.filterCrossGreaterThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Less Than"))
			{
				dataManager.filterCrossLessThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Equal To"))
			{
				dataManager.filterCrossEqualTo(dataManager.inputStatement());
				dataManager.printData();
			}
		
		}
		else if(decision.equalsIgnoreCase("Load"))
		{
			System.out.println("how would you like to filter your Load results? Choose greater than, less than, or equal to");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("Greater Than"))
			{
				dataManager.filterLoadGreaterThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Less Than"))
			{
				dataManager.filterLoadLessThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Equal To"))
			{
				dataManager.filterLoadEqualTo(dataManager.inputStatement());
				dataManager.printData();
			}
		}
		else if(decision.equalsIgnoreCase("Time"))
		{
			System.out.println("how would you like to filter your Time results? Choose greater than, less than, or equal to");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("Greater Than"))
			{
				dataManager.filterTimeGreaterThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Less Than"))
			{
				dataManager.filterTimeLessThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Equal To"))
			{
				dataManager.filterTimeEqualTo(dataManager.inputStatement());
				dataManager.printData();
			}
		}
		else if(decision.equalsIgnoreCase("Extensometer"))
		{
			System.out.println("how would you like to filter your Extensometer results? Choose greater than, less than, or equal to");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("Greater Than"))
			{
				dataManager.filterExtensometerGreaterThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Less Than"))
			{
				dataManager.filterExtensometerLessThan(dataManager.inputStatement());
				dataManager.printData();
			}
			else if(answer.equalsIgnoreCase("Equal To"))
			{
				dataManager.filterExtensometerEqualTo(dataManager.inputStatement());
				dataManager.printData();
			}
		}
		else if(decision.equalsIgnoreCase("quit"))
		{
			System.out.println("you have chosen to quit the program");
			cont = false;
		}
		else
		{
			System.out.println("please try again");
		}
		dataManager.deleteAllData();
		
			
			/*System.out.println("what Crosshead input would you like to test/validate?");
			double input = keyboard.nextDouble();
			dataManager.validateCrossData(input);
			dataManager.printData();*/
			
		
		}
		  }
		

	}


