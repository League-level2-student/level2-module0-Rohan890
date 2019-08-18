package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		strings[0] = "one";
		strings[1] ="two";
		strings[2] = "three";
		strings[3] = "four";
		strings[4] = "five";
		//2. print the third element in the array
		System.out.println(strings[3]);
		//3. set the third element to a different value
		strings[3] = "blue";
		//4. print the third element again
		System.out.println(strings[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[] ints = new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			Random rand = new Random(); 
			int value = rand.nextInt(50);
		System.out.println(ints[i] = value);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
