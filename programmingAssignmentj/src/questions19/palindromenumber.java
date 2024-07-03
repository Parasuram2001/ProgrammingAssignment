package questions19;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 256;
		int copiedNumber=no;
		int reverse=0;
		while(no!=0)
		{
			int rem=no%10;
			reverse=reverse*10+rem;
			no=no/10;
		}
		if(copiedNumber==reverse)
		{
			System.out.println("Given number is palindrome ");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
