//Cesar A. Reyna
//COSC 1430.001
//Project2
//9/26/2022

package one;

import java.io.*;
import java.util.Scanner;

public class DegreeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value;
		Scanner scan = new Scanner( System.in );
	    System.out.print("Enter a temperatuer in Farenheit: ");
	    value = scan.nextFloat();
	    double output = (5.00*(value-32))/9.00;
	    //string.format("",) used from https://java2blog.com/format-double-to-2-decimal-places-java/#:~:text=You%20can%20also%20use%20String%E2%80%99s%20static%20method%20format,method%20to%20format%20double%20to%202%20decimal%20places.
	    //utilized casting learned on 9/14/22 to display double as an integer. The formating for the double to
	    //two decimal places was used from an example on the webpage shown above.
	    System.out.println((int)value +" degrees Fahrenheit is " +String.format("%.1f",output) +" degree Celsius");
	    
        
       
	}

}
