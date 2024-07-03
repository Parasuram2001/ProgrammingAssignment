package programmingAssignment;

public class inttoRoman {
	static int intToNumber(String str)
	{
		int sum = 0,x = 0,y=0;
		for(int i = str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(ch=='I') {
				x = 1;
			}
			if(ch=='V') {
				x = 5;
			}
			if(ch=='X') {
				x = 10;
			}
			if(ch=='L') {
				x = 50;
			}
			if(ch=='C') {
				x = 100;
			}
			if(ch=='D') {
				x = 500;
			}
			if(ch=='H') {
				x = 1000;
			}
			else if(x>=y)
			{
				sum = sum+x;
				y=x;
			}
			else if(y>x)
			{
				sum = sum-x;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LX";
		System.out.println(intToNumber(str));
	}

}
