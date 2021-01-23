class bmi
{
	public static void main(String args[])
	{
		float height = 1.793f;
		float weight = 80.4f;
		bmi b = new bmi();
		float bmi = b.calculate(height, weight);
		System.out.println("BMI : " + bmi);
		b.inference(bmi);
	}
	void inference(float a)
	{
		if (a < 18)
			System.out.println("Underweight.");
		else if (a >= 18 && a <= 25)
			System.out.println("Normal.");
		else if (a > 25)
			System.out.println("Overweight.");
	}
	float calculate(float h, float w)
	{
		return w/(h * h);
	}
}	
