package week3.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
	
	//Remove duplicate character from given string
	public static String removeDuplicate (String input) {
		
		char [] arrChar = input.toCharArray();
		String sOutput = null;
	
		Set <Character> uniqueChar = new TreeSet <Character>();
		
		for (int i=0;i<arrChar.length;i++) {			
			uniqueChar.add(arrChar[i]);			
		}		
		sOutput = uniqueChar.toString();
		return sOutput;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sInput = "Malayalam";
		String sOutput = removeDuplicate (sInput);
		System.out.println("Actual Text- "+sInput);
		System.out.println("Text After Removing Duplicate "+ sOutput);
			
	}

}
