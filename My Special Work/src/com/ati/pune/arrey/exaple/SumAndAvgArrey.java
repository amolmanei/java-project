package com.ati.pune.arrey.exaple;

public class SumAndAvgArrey {
//Find the sum of all given elements  and average of an int array?

		public static void main(String[] args) {
			   int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
			                            //0   1   2  3    4    5    6
		       //calculate sum of all array elements
		       int sum = 0;//20  50  75 110
		       for(int i=0; i < numbers.length ; i++)
		         {
		        sum = sum + numbers[i];// sum=50+25=75+35=110
		          }
		        //calculate average value
		        System.out.println("Sum value of the array elements is : " + sum); 
		        double average = sum / numbers.length;
		        System.out.println("Average value of the array elements is : " + average); 
		}
	}
