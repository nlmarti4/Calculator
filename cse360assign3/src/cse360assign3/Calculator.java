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
	
	/** Adds value to total
	 * 
	 * @param value	Value to be added to total
	 * @return None
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** Subtracts value from total
	 * 
	 * @param value	Value to be subtracted from total
	 * @return None
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** Multiplies total by value
	 * 
	 * @param value	Value to be multiply by
	 * @return None
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/** Divides total by value
	 * 
	 * @param value	Value to be divide by
	 * @return None
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}			
	}
	
	/** Returns string that represents history of total
	 * 
	 * @param None
	 * @return string	String that represents history of total
	 */
	public String getHistory () {
		return "";
	}
}