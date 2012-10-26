package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Part3Question2 {

	
	public static void main(String[] args) throws IOException { 
		try{
			System.out.println("Enter List Number : ");
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String s = bufferRead.readLine();
		    s = s.replaceAll(" ", "");
		    
		    ArrayList<Integer> a = initArray(s);
		    
		    System.out.println("Enter Expected minimum number : ");
		    bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String s1 = bufferRead.readLine();
		    
		    int min = Integer.parseInt(s1);
		    
		    for (int i =0;i<min;i++){
		    	Collections.sort(a);
		    	if (i == 0 ){
		    		System.out.print(a.get(0));
		    	}else{
		    		System.out.print("," + a.get(0));
		    	}
		    	a.remove(0);		    	
		    }
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Integer> initArray(String a){
		ArrayList<Integer> retobj = new ArrayList<Integer>();
		boolean loop = true;
		if (a.equals("")){
			loop = false;
		}
		
		while (loop) {
			if (a.indexOf(",") != -1){
				retobj.add(Integer.parseInt( a.substring(0, a.indexOf(","))));
				a=a.substring(a.indexOf(",")+1,a.length());				
			}else{
				retobj.add(Integer.parseInt(a));
				loop = false;
			}
		}		
		return retobj;
	}
}
