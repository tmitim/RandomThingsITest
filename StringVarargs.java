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
	
	public static void testWithParam(String title, String ...strings) {
		System.out.println("Title - " + title);
		for (String temp: strings) {
			System.out.print(temp + " ");
		}
		System.out.println();
	}
	
//	Doesn't work - vararg must be last
//	public static void testWithParamBack(String ...strings, String title) {
//		System.out.println("Title - " + title);
//		for (String temp: strings) {
//			System.out.print(temp + " ");
//		}
//		System.out.println();
//	}


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
		
		// String with String varargs
		testWithParam("title", "1", "2", "3" );		
		testWithParam("title");
		testWithParam("title", "1");
		
		System.out.println("[te]st".replaceAll("\\[te\\]", "bea"));
		for(String temp : "temp,temp2".split(",") ){
			System.out.println(temp);
		}
	}

}
