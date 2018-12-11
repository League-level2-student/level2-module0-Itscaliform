package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fruit = new String [6];
		fruit[0]="apple";
		fruit[1]="bannana";
		fruit[2]="DragonFruit";
		fruit[3]="Pineapple";
		fruit[4]="tomato";
		//2. print the third element in the array
		System.out.println(fruit[3]);
		//3. set the third element to a different value
		fruit[3]="chom chom";
		//4. print the third element again
		System.out.println(fruit[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i =1;fruit.length-i>1; i++ ) {
			System.out.println(fruit[i]);
		}
		
		//6. make an array of 50 integers
		String[] num = new String[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random(50);
		for(int i=0;i<50; i++) {
			int r=randy.nextInt();
			String rob=r+"";
	      num[i]=rob;
			
		}
		int du=3;
		int rumbes=0;
		for(int i=0;i<num.length; i++) {
			int robert = Integer.parseInt(num[i]);
			int r=randy.nextInt(50);
		if(r<du){
			
			System.out.println(r);
		}
		
		}
		//8. without printing the entire array, print only the smallest number in the array
	
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<num.length; i++) {
		System.out.println(num.length);
		}
		//10. print the largest number in the array.
	}
}
