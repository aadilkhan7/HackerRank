import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Aadil_Weighted_String {
	
	public static void main(String args[])
	{
		
	
	int i,weight;
	String letters = "abcdefghijklmnopqrstuvwxyz";
	Scanner in = new Scanner(System.in);
	String inputString = in.next();
	int nQ = in.nextInt();
	
	int queries[]= new int[nQ];
	for(i=0;i<nQ;i++)
	{
		queries[i] = in.nextInt();
	}
	ArrayList<Integer> weights = new ArrayList<Integer>();
	for(i=0; i< inputString.length(); i++)
	{
		weight = 1+ letters.indexOf(inputString.charAt(i));
		if(weights.contains(weight))
		{
		weights.add(weights.get(i-1)+weight);
		}
		else
		{
			weights.add(weight);		
		}
	}
	System.out.println(weights);
	for(i=0;i<nQ;i++)
	{
		if(weights.contains(queries[i]))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	
}
	
	
}