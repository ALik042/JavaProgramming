package day08_IfStatement;

public class NumberOfThedays {
    public static void main(String[] args) {
int month = 1;
boolean has28Day = month==2;
boolean has30Day = month==4||month==6||month==9||month==11;
boolean has31Day = !has28Day&&!has30Day;


if (has28Day){// if the month have 28 days
    System.out.println("28 days");
}

if (has30Day){ // if the month have 30 day
    System.out.println("30 Days");
}


if (has31Day) System.out.println("31 Days");

}}
/*


Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */