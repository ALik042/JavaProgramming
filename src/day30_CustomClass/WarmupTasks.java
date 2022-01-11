package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
                      // collection type
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        System.out.println("-------------------------------------");

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);
        int size = list.size();

        list.removeIf(p -> p==0);

        int newSize =list.size();
        int totalNumberOfZeros =size-newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i <totalNumberOfZeros ; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("--------------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
           chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p -> !Character.isLetter(p)); // Lampda

        System.out.println("Letters = "+letters);

        ArrayList<Character> digits= new ArrayList<>(chars);

        digits.removeIf(p -> !Character.isDigit(p)); // Lampda


        System.out.println("digits = " + digits);

        ArrayList<Character> ch= new ArrayList<>(chars);

        ch.removeAll(letters);
        ch.removeAll(digits);
        System.out.println("ch = " + ch);
    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */