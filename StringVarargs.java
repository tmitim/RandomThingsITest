package RandomThingsITest;

import java.util.*;

/**
 * Just testing how Varargs work
 * @author tmitim
 * @since February 13, 2015
 *
 */
public class StringVarargs {
	public static void testVarags(String ...strings) {
		for (String temp: strings) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Empty
		testVarags();
		
		// Single String
		testVarags("test");
		
		// Separated by comma
		testVarags("test", "test2");
		
		// made Array
		String [] testArray = {"test", "test2"};
		testVarags(testArray);
		
		// Arraylist - doesn't work
		// List<String> arrayTest = new ArrayList<String>();
		// testVarags(arrayTest);
		
		//String Split
		String testSplit = "test;test2;test3;";
		testVarags(testSplit.split(";"));
	}

}
