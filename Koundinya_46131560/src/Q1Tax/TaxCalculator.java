package Q1Tax;
public class TaxCalculator 
{
	public static double taxableAmount(double monthlySalary)
	{
		double annualIncome= monthlySalary*12;
		if(annualIncome<=0)
			System.out.println("invalid input");
		if(annualIncome>0 && annualIncome < 250000)
		{
			System.out.println("no tax applicable");
		}
		if(annualIncome>250000 && annualIncome<=500000)
		{
			double amount= annualIncome-250000;
			double y=amount*0.1; 
			return y;
		}
		else if(annualIncome>500001 && annualIncome<=1000000)
		{
			double amount= annualIncome-250000; 
			double amount1=amount-250000; 
			double y= 250000*0.1+ amount1*0.2;
			return y;
		}
		else 
		{
			double amount= annualIncome-250000;
			double amount1=amount-250000; 
			double amount2= (amount1-500000); 
			double y= 25000 + amount1*0.2+ amount2*0.3;
			return y;               
		}		
	}
}
