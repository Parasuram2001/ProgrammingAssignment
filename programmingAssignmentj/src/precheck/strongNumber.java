package precheck;

public class strongNumber {
	static int fact(int no)
	{
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=456;int sum=0;int no1=no;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		if(no1==sum)
		{
			System.out.println("it is a strong number");
		}
		else {
			System.out.println("it is not a strong number");
		}
		

	}

}
