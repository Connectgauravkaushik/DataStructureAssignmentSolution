package com.greatlearning.ConstructBuilding;
import java.util.*;
public class ConstructFloor {
	
	 public static void main(String[]args) {
		 
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the total number floors in the building");
		   int floorsize = sc.nextInt();
		   
		   int arr[]=new int[floorsize+1];
		   for(int i=1; i<floorsize+1; i++) {
			   System.out.println("Enter the floor size given on Day : " +i);
			   int m = sc.nextInt();
			   arr[m]=i;
		  } 
		   
		   int j=floorsize;
		   boolean flag;
		   System.out.println("The order of Construction is as Follows:");
		   
		   for(int i=1; i<=floorsize;i++) {
			   flag=false;
			   System.out.println("Day : " +i);
			   while(j>=1 && arr[j]<=i) {
				   flag=true;
				   System.out.print(j+" ");
				   j--;
			   }
			   if(flag==true) {
				   System.out.println();
			   }
		   }
	   }
	}
