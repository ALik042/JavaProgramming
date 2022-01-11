package day20_Arrays;

public class Uniqe_Element_nestedLoop {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "c#", "Python", "Python"};


        for (int j = 0; j < words.length; j++) {
            String element= words[j]; // "Java"
            int count =0;
            for (int i = 0; i < words.length; i++) { //each element first element
                if (words[i].equals(element)){
                    count++;
                }
            }

            if(count==1){
                System.out.println(element);
            }


        }



     /*   String element= words[0]; // "Java"
        int count =0;
        for (int i = 0; i < words.length; i++) { //each element first element
            if (words[i].equals(element)){
                count++;
            }
        }

       */


    }
}
