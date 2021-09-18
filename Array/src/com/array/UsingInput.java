package com.array;
import java.util.Scanner;
public class UsingInput {

	
	
	   public static void main(String args[])
	   {    
		
		Scanner scan =new Scanner(System.in);
	
		String A []=new String[5];//declaration    	 
		System.out.print("Enter Elements to Store in Array :\n");
	        for(int i=0; i<A.length; i++){
	           A[i]= scan.next();
	          
	        }  
	       System.out.print("Elements in Array are :");
	       for(int i=0; i<A.length; i++)
	        {
	          System.out.print(A[i] + " | ");
	       }  
	  }
	}
	
	
	

	
	
