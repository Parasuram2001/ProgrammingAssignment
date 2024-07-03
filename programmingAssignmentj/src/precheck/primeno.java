package precheck;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			int no=i;boolean flag=true;
			for(int j=2;j<no;j++)
			{
				if(no%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(no+" it is prime number");
			}
			
		}

	}

}
