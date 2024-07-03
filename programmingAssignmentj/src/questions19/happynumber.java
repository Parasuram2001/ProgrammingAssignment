package questions19;

public class happynumber {
	static int numSum(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 23;
		while(number>9)
		{
			number=numSum(number);
		}
		if(number>1&&number<7)
		{
			System.out.println("Happy Number");
		}
		else {
			System.out.println("Not a Happy Number");
		}
	}

}
