package random;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		int input;
        int[] arraylist = new int[500]; // Create array object.
 
        random(arraylist); // Create random numbers.
        arraySort(arraylist); // Sort random numbers.
 
        do{
            System.out.print("Please enter a number between 1 and 500: ");
            Scanner sc = new Scanner(System.in);
            input   = sc.nextInt();                 
        }while(input < 1 || input > 500);
 
        // random numbers to string.
        String result ="";
            for (int j = 0; j < arraylist.length; j++) {
                result += " " + arraylist[j];
            }
 
        // Print all random number.
        System.out.println("The Numbers are" + result);
 
        // Print user input nth number.
        if(input == 1){
            System.out.println("The " + input + "st number is " + findNthSmallestNumber(input,arraylist) + ".");
        }else if(input == 2){
            System.out.println("The " + input + "nd number is " + findNthSmallestNumber(input,arraylist) + ".");
        }else if(input == 3){
            System.out.println("The " + input + "rd number is " + findNthSmallestNumber(input,arraylist) + ".");
        }else{
            System.out.println("The " + input + "th number is " + findNthSmallestNumber(input,arraylist) + ".");
        }   

	}
	 public static void random(int[] arraylist){
	        for(int i=0; i < arraylist.length; i++){
	            arraylist[i]    = (int) (Math.random() * 100);  
	        }
	    } // End of random
	 /** Array sort method */
	    public static void arraySort(int [] arraylist){
	        int temp;   
	        for (int i=1; i<arraylist.length; i++){
	            for(int j=0; j < arraylist.length-i; j++){
	                if (arraylist[j] > arraylist [j+1]){
	                    temp = arraylist [j];
	                    arraylist [j] = arraylist [j+1];
	                    arraylist [j+1] = temp;
	                }
	            }
	        }
	    } // End of arraySort method.
	    /** find nth smallest method. */
	    public static int findNthSmallestNumber(int n, int[] numbers){
	        return numbers[n-1];
	    } // End of findNthSmallesNumber method.
}
