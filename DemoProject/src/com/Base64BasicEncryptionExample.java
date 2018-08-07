package com;

import java.util.Arrays;
import java.util.Base64;  
public class Base64BasicEncryptionExample {  
    public static void main(String[] args) {  
        // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        // Creating byte array  
        byte byteArr[] = {1,2};  
        System.out.println("Before:::Encoded byte array: "+byteArr);
        // encoding byte array  
        byte byteArr2[] = encoder.encode(byteArr);  
        
        System.out.println("Encoded byte array: "+byteArr2);  
        byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes  
        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written  
        System.out.println("Encoded byte array written to another array: "+byteArr3);  
        System.out.println("Number of bytes written: "+x);  
      
        // Encoding string  
        String str = encoder.encodeToString("JavaTpoint".getBytes());  
        System.out.println("Encoded string: "+str);  
        // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
       
        
        String[] str3= {"rama","aman","teja","dheepthi","rukku"}; 
         
        // Iterating array elements  
        for (String i : str3) {  
            System.out.print(i+" ");  
        }  
        // Sorting array elements parallel  
        Arrays.parallelSort(str3);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (String i : str3) {  
            System.out.print(i+" ");  
        }  
        
    }  
}  