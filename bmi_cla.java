// BMI calculation using command-line arguements 

class bmi_cla
{
	public static void main (String args[]) throws Exception
	{
		float height = Float.parseFloat(args[0]);
		float weight = Float.parseFloat(args[1]);
		double bmi = weight/(height * height);
		System.out.println("Your BMI is : " + bmi);
		if (bmi > 25)
		System.out.println("Overweight");
		else if (bmi < 18)
		System.out.println("Underweight");
		else
		System.out.println("Normal");
	}
}
