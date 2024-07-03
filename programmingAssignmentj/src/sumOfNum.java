
public class sumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sr = -97;
		int er = 50;
		int x = isSmallPrime(sr,er);
		int y = isLargePrime(sr,er);
		int sum = x + y;
		System.out.println("sum of x and y is "+ sum);
	}
	public static int isSmallPrime(int sr,int er)
	{
		for (int i = sr; i <= er; i++) {
			if(isPrime(i))
			{
				return i;
			}
		}
		return -1;
	}
	public static int isLargePrime(int sr,int er)
	{
		for (int i = er; i >= sr; i--) {
			if(isPrime(i))
			{
				return i;
			}
		}
		return -1;
	}
	public static boolean isPrime(int no)
	{
		for(int i = 2; i<no;i++)
		{
			if(i%2==0)
			{
				return false;
			}
		}
		return true;
	}

}
