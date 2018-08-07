package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdDayPart1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in));
		        System.out.println("Enter matrix size");
		        int n = Integer.parseInt(br.readLine());
		        int  endNum=n*n;
//		        System.out.println("Enter end number");
//		        int  endNum = Integer.parseInt(br.readLine());
		        int[][] intArray=new int[n][n];
		        
		        int rMax=n-1;
		        int rMin=0;
		        int cMax=n-1;
		        int cMin=0;
		        int x=0,y=0,f1=0,f2=0;
		        int steps=0;
		        int step1=0;
		        int step2=0;
		        while(endNum>0) { 
		        
		           for(int i=cMax;i>=cMin;i--) {
		            	 
		            	 intArray[rMax][i]=endNum--;
		            	 System.out.println("position1::::"+rMax+" "+i+"=="+intArray[rMax][i]+"\t");
		                      }
		            
		             for(int i=rMax-1;i>rMin;i--) {
            	     
		            	 intArray[i][cMin]=endNum--;
		            	 System.out.println("position2::::"+i+" "+cMin+"=="+intArray[i][cMin]+"\t");
		            	   }
		             
		             for(int i=cMin;i<=cMax;i++) {
	            	     if(endNum!=0) {
		            	 intArray[rMin][i]=endNum--;
		            	 
		            	 System.out.println("position3::::"+rMin+" "+i+"=="+intArray[rMin][i]+"\t");
	            	       } 
	            	     }
		             
                     for(int i=rMin+1;i<=rMax-1;i++) {
	            	     
		            	 intArray[i][cMax]=endNum--;
		            	 System.out.println("position4::::"+(i)+" "+cMax+"=="+intArray[i][cMax]+"\t");
		               }
		        	
                     rMin++;
                     cMin++;
                     rMax--;
                     cMax--;
                  
	      }
	            	     for(int i=0;i<=n-1;i++) {
		            	     for(int j=0;j<=n-1;j++) {
		            	    	 		            	    	 		            	    	 
		            	    	       	    	 System.out.print(intArray[i][j]+"\t");
			            	    	      }
		            	     System.out.println();
		            	     
		            	     } 	 
	            	     
	            	     System.out.println("Enter find number");
		     		  int  findNum = Integer.parseInt(br.readLine());
	            	     for(int i=0;i<=n-1;i++) {
		            	     for(int j=0;j<=n-1;j++) {
		            	    	 		            	    	 		            	    	 
		            	    	       	    	 if(intArray[i][j]==1)
		            	    	       	    	 {
		            	    	       	    		x=i;
		            	    	       	    		y=j;
		            	    	       	    	    }
		            	    	       	    	if(intArray[i][j]==findNum)
		            	    	       	    	 {
		            	    	       	    		f1=i;
		            	    	       	    		f2=j;
		            	    	       	    	    }
		            	    	       	    	}
		            	            } 
	            	     System.out.println("x&y:::"+x+" "+y);  
	            	     System.out.println("f1&f2:::"+f1+" "+f2);
	            	     steps=Math.abs((f1-x))+Math.abs((y-f2));
	                 System.out.println("steps:::"+steps);    
	  }

   }
