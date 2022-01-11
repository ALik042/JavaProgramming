package Practice_01_05_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class array{
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s="";

        for (int i =0; i < nums.size(); i++){
            if(i==2 || i == 5 || i ==9 ){
                continue;
            }
            if(nums.get(i)==2 || nums.get(i)%3 == 0){
                s +="1";
            } else { s += "0";}


        }



        System.out.println(s);



    }

        }
