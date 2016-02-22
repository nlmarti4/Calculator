package cse360assign3;

/** This class contains a integer total
 * methods which operate on total and
 * display the history of total. 
 * 
 * 	@author Nicholas Martinez PIN 601
 *  @version 2/21/16
 */
public class Calculator {

	private int total;
	String history = "0";
	
	/** Initializes value of total
	 * 
	 * @param None
	 * @return None
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Returns value of total
	 * 
	 * @param None
	 * @return total	Value of total
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds value to total and updates history
	 * 
	 * @param value	Value to be added to total
	 * @return None
	 */
	public void add (int value) {
		total = total + value;
		history += " ";
		history += "+";
		history += " ";
		history += value;	
	}
	
	/** Subtracts value from total and updates history
	 * 
	 * @param value	Value to be subtracted from total
	 * @return None
	 */
	public void subtract (int value) {
		total = total - value;
		history += " ";
		history += "-";
		history += " ";
		history += value;
	}
	
	/** Multiplies total by value and updates history
	 * 
	 * @param value	Value to be multiply by
	 * @return None
	 */
	public void multiply (int value) {
		total = total * value;
		history += " ";
		history += "*";
		history += " ";
		history += value;
	}
	
	/** Divides total by value and updates history
	 * If dividing by zero, set total to 0
	 * 
	 * @param value	Value to be divide by
	 * @return None
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
			history += " ";
			history += "/";
			history += " ";
			history += value;
		}
		else
		{
			total = total / value;
			history += " ";
			history += "/";
			history += " ";
			history += value;
		}			
	}
	
	/** Returns string that represents history of total
	 * 
	 * @param None
	 * @return history	String that represents history of total
	 */
	public String getHistory () {
		return history;
	}
}