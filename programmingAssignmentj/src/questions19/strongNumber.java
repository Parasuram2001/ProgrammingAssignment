package questions19;

public class strongNumber {
	static int factorial(int number)
	{
		int factNumber = 1;
		for(int i=number;i>=1;i--)
		{
			factNumber = factNumber*i;
		}
		return factNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
		int number = i;
		int sum = 0;
		int copiedNumber = number;
		while(number!=0)
		{
			int remainder = number%10;
			sum = sum + factorial(remainder);
			number = number/10;
		}
		if(copiedNumber == sum)
		{
			System.out.println("Strong Number " + sum);
		}
		else {
			System.out.println("Not a strong number " + sum);
		}

	}

}
}
