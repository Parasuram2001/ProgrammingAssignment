package questions19;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
		int number = i;
		int number1 = number;
		int number2 = number;
		int count = 0;
		int sum = 0;
		while(number1!=0)
		{
			number1=number1/10;
			count++;
		}
		while(number2!=0)
		{
			int remainder = number2%10;
			sum = sum + (int)Math.pow(remainder, count);
			number2 = number2/10;
		}
		if(number == sum)
		{
			System.out.println(number + " Given number is armstrong number");
		}
		else {
			System.out.println(number + " Not a armstrong number ");
		}
		
	}

}
}
