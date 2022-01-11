package Practice_01_05_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class test25 {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>(Arrays.asList("during","storm","rain"));
        ArrayList <Integer> lengths= new ArrayList<>();

        for (String word : words) {
            lengths.add(word.length());
        }
        System.out.println(lengths);;

    }
}
