package com;

import java.util.Arrays;

public class SecondDayPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="5 9 2 8\n" + 
				"9 4 7 3\n" + 
				"3 8 6 5";
		   
		  
				String[] subStr=str.split("\n");
				
		        //int checkSum=0;
				for(String a:subStr) {
					System.out.println("main::"+a);
					  String[] finalStr=a.split(" ");
					  
					  int[] arrInt=new int[finalStr.length];
					  int i=0;
					 
					  for(String s:finalStr)  {
						  System.out.println("elementString::"+s);
					  arrInt[i]=Integer.parseInt(s);
					  System.out.println("elementString::"+arrInt[i]);
					  
					  if(i+1<arrInt.length&&arrInt[i]%arrInt[i+1]==0)
						 {
							 System.out.println("first::"+arrInt[i]+"second::"+arrInt[i+1]);
						 }		  					  					  
					  i++;
					    
		      		    }
					  }
					 
					 
					
						    
				
				}
	}


