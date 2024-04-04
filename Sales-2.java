/*
 * Cesar Reyna
 * COSC 1430.001
 * Lab 5
 * 12/1/2022
 * the program calls creates a class with 6 property fields and two methods.
 * in the main I utilize the methods to give a result and print the required data.
 * 
 */

package one;

public class Sales {
	/*
	 * Property fields
	 */
	int sold = 1, bulkQ = 10;
	double cost = 4.99;
	double sales = 1.0, disc = 1.0, bulkD = 1.0;

	/*
	 * methods
	 */
	
	
	/*
	 * Method regsterSale
	 * records the sale of n items. If n is larger than the bulk quantity, the cost
	 * per item will be reduced by the bulk discount
	 */
	public double regsterSale(int n, int q, double m, double r) {
		double result = 0.0;
		System.out.println("calling reg sales ");
		if (n > q) {
			double disca;
			disca = m * r;
			result = m - disca;
		} else {
			result = m;
		}
		return result;
		

	}
			
	
	/*
	 * Method displaysales
	 * display the number sold, the total sales, and total discount.
	 */
	public void displaySales(int a, double s, double d) {
		System.out.println("Calling displaysales ");
		System.out.println("Sold " + a);
		System.out.println("Total Sales " + s);
		System.out.println("Total Discount " + d);
		
	}

	/*
	 * Main
	 * Creates an object from the class and makes use of it's methods.
	 */
	public static void main(String[] args) {
		double total = 0.0, totala = 0.0;
		Sales test = new Sales();
		test.sold = 20;
		test.bulkD = .10;
		test.cost = 5.00;
		test.sales = test.sold * test.cost;
		total = test.regsterSale(test.sold, test.bulkQ, test.sales, test.bulkD);
		totala = test.sold * test.cost;
		/*
		 * this section determines the discount in the main body to send the
		 * data to method displaySales
		 * 
		 */
		double disca = 0.0;
		if (test.sold > test.bulkQ) {
			disca = (test.sold*test.cost*test.bulkD);
		} else
			disca = 0.0;

		test.displaySales(test.sold, totala, disca);
		System.out.println("Total: " + total);

	}

}
