package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65;
        int weeklyHours = 40;
        int SalaryBeforeTax= hourlyRate*weeklyHours*52;
        double stateTax = SalaryBeforeTax*0/100;
        double federalTax = SalaryBeforeTax*26.2/100;
        double totalTax = stateTax+federalTax;
        double salaryAftertax= SalaryBeforeTax-totalTax;

        System.out.println("Gross pay is:"+" $"+SalaryBeforeTax);
        System.out.println("Federal tax is:"+" $"+federalTax);
        System.out.println("State tax is:"+" $"+stateTax);
        System.out.println("Total tax is:"+" $"+totalTax);
        System.out.println("Net income is:"+" $"+salaryAftertax);


    }
}

/*


	3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */