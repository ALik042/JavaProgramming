package day25_CustomMethod_overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

    }








}


/*
Task2:
		1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}
	    2. create a return method called addDouble that can add a double after the last index of a double array
	    3. create a return method called addString that can add a String after the last index of a String array
	    4. create a return method called addChar that can add a char after last index of a char array
 */