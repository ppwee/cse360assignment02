/**
* Lamanh Ngo
* 10/5/2020
* CSE360
* Assignment 2
*/
package cse360assignment02;

public class AddingMachine {
	private int total;
	StringBuffer str1;

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		str1 = new StringBuffer("0");
	}
	  
	/**
	 * return the total
	 */
	public int getTotal () {
		return total;
	}
	/**
	* add 
	*/	  
	public void add (int value) {
		total += value;
		str1.append(" + " + value);
	}
	/**
	* subtract
	*/	
	public void subtract (int value) {
		total -= value;
		str1.append(" - " + value);
	}
	/**
	* toString to display the operations made
	*/
	public String toString () {
		return str1.toString();
	}
	/**
	* clear the total
	*/
	public void clear() {
		total = 0;
	}
}

