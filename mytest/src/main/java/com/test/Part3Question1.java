package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Part3Question1 {


	public static void main(String[] args) throws IOException {
		System.out.println("Enter MaxNumber : ");

		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();

			/*int a = getRow(Integer.parseInt(s));
		    System.out.println(a);*/
			combination(Integer.parseInt(s));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

	public static void combination(int MaxNumber){
		ArrayList<Integer> keepPos = new ArrayList<Integer>();
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = MaxNumber ; i > 0 ; i--){
			for (int j = MaxNumber ; j > 0 ; j--){
				if (i>j) {
					keepPos = initArray(MaxNumber) ;
					Arr = initArray(MaxNumber) ;

					keepPos.remove(i-1);
					keepPos.remove(j-1);
					if (keepPos.size()==0){

						for (int m = 0; m < Arr.size(); m++) {
							if (m == 0) {
								System.out.print(Arr.get(m));
							} else {
								System.out.print("," + Arr.get(m));
							}
						}
						System.out.println();
						Collections.swap(Arr, Arr.size()-1, Arr.size()-2);
						for (int m = 0; m < Arr.size(); m++) {
							if (m == 0) {
								System.out.print(Arr.get(m));
							} else {
								System.out.print("," + Arr.get(m));
							}
						}
						System.out.println();


					}else{

						for (int k = 0; k < keepPos.size(); k++) {
							keepPos.get(k);
							/*if (keepPos.size()==2){
								for (int z = 1;z<keepPos.get(k);z++){
									Collections.rotate(keepPos, -1);
								}
							}else{								
								for (int n = 1;n<keepPos.size();n++){
									for (int z = 1;z<keepPos.size();z++){
										Collections.swap(keepPos, n-1,z-1);
									}
								}							
							}*/
							
							for (int z = 1;z<keepPos.get(k);z++){
							Collections.rotate(keepPos, -1);
							}
							
							Arr.removeAll(keepPos);
							Arr.addAll(0, keepPos);

							for (int m = 0; m < Arr.size(); m++) {
								if (m == 0) {
									System.out.print(Arr.get(m));
								} else {
									System.out.print("," + Arr.get(m));
								}
							}
							System.out.println();
							Collections.swap(Arr, Arr.size()-1, Arr.size()-2);
							for (int m = 0; m < Arr.size(); m++) {
								if (m == 0) {
									System.out.print(Arr.get(m));
								} else {
									System.out.print("," + Arr.get(m));
								}
							}
							System.out.println();
							Collections.swap(Arr, Arr.size()-1, Arr.size()-2);
						}						
					}					
				}
			}		
		}
	}

	public static int getRow(int number){
		int row =1;
		for (int i= number ; i > 0 ; i--){
			row = row * i;
		}
		return row;
	}

	public static ArrayList<Integer> initArray (int number){
		ArrayList<Integer> obj = new ArrayList<Integer>();
		for (int i = 1 ; i<= number; i++){
			obj.add(i);
		}
		return obj;
	}
}

