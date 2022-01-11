package day17_While_doWhile;

public class FrequencyOfWord_whileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency =0;

        while (str.contains("Java")){
            str=str.replaceFirst("Java","");
            frequency++;

        }
        System.out.println(frequency);
    }
}
